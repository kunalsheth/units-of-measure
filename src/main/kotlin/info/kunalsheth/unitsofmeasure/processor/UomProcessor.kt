package info.kunalsheth.unitsofmeasure.processor

import info.kunalsheth.unitsofmeasure.annotations.*
import info.kunalsheth.unitsofmeasure.processor.data.MetaRelation
import info.kunalsheth.unitsofmeasure.processor.data.MetaUnitOfMeasure
import info.kunalsheth.unitsofmeasure.processor.data.MetaDimension
import info.kunalsheth.unitsofmeasure.processor.data.MetaQuantity
import java.io.File
import javax.annotation.processing.Completion
import javax.annotation.processing.ProcessingEnvironment
import javax.annotation.processing.Processor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.SourceVersion
import javax.lang.model.element.AnnotationMirror
import javax.lang.model.element.Element
import javax.lang.model.element.ExecutableElement
import javax.lang.model.element.TypeElement

/**
 * Created by kunal on 8/6/17.
 */
class UomProcessor : Processor {

    // kapt's option to generate kotlin instead of java
    private val kaptKotlinGeneratedOption = "kapt.kotlin.generated"

    // directory for generated source files
    lateinit var generatedDir: File
    lateinit var env: ProcessingEnvironment

    var generateCommonUnits: Boolean = false
    var relationships = emptySet<MetaRelation>()
    var quantities = emptySet<MetaQuantity>()
    var unitsOfMeasure = emptySet<MetaUnitOfMeasure>()

    override fun getSupportedOptions() = setOf(kaptKotlinGeneratedOption)

    override fun process(types: MutableSet<out TypeElement>, round: RoundEnvironment) = round.run {
        val schema = getElementsAnnotatedWith(Schema::class.java)
                .map { it.getAnnotationsByType(Schema::class.java) }
                .flatMap(Array<Schema>::asIterable)

        generateCommonUnits = generateCommonUnits || schema
                .any(Schema::generateCommonUnits)

        relationships += schema
                .map(Schema::relationships)
                .flatMap(Array<Relation>::asIterable)
                .flatMap(MetaRelation.Companion::invoke)

        quantities += schema
                .map(Schema::quantities)
                .flatMap(Array<Quantity>::asIterable)
                .map(::MetaQuantity)

        unitsOfMeasure += schema
                .map(Schema::unitsOfMeasure)
                .flatMap(Array<UnitOfMeasure>::asIterable)
                .map(::MetaUnitOfMeasure)

        if (processingOver()) {
            val src = writeKt(generatedDir, "UnitsOfMeasure")
            writeBase(src, env.filer)

            // todo: Generate Common Units ???

            var allDimensions = emptySet<MetaDimension>()
            allDimensions += relationships.flatMap { setOf(it.a, it.b, it.result) }
            allDimensions += quantities.map(MetaQuantity::dimension)
            allDimensions += unitsOfMeasure.map(MetaUnitOfMeasure::dimension)
            allDimensions
                    .map(MetaDimension::src)
                    .forEach(src::println)

            relationships
                    .map(MetaRelation::src)
                    .forEach(src::println)

            quantities
                    .map(MetaQuantity::src)
                    .forEach(src::println)

            unitsOfMeasure
                    .distinctBy(MetaUnitOfMeasure::name)
                    .map(MetaUnitOfMeasure::src)
                    .forEach(src::println)

            src.done()
        }

        true
    }

    override fun getCompletions(element: Element, annotation: AnnotationMirror, executable: ExecutableElement, userText: String) = emptySet<Completion>()

    override fun getSupportedSourceVersion() = SourceVersion.latestSupported()!!

    override fun getSupportedAnnotationTypes() = setOf(
            Relation::class,
            UnitOfMeasure::class,
            Dimension::class, Schema::class
    )
            .map { it.qualifiedName!! }
            .toSet()

    override fun init(env: ProcessingEnvironment) {
        this.env = env
        generatedDir = File(env.options[kaptKotlinGeneratedOption])
        generatedDir.mkdirs()
    }
}