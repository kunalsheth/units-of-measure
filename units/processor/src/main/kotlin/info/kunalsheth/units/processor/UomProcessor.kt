package info.kunalsheth.units.processor

import info.kunalsheth.units.annotations.*
import info.kunalsheth.units.processor.data.MetaDimension
import info.kunalsheth.units.processor.data.MetaQuantity
import info.kunalsheth.units.processor.data.MetaRelation
import info.kunalsheth.units.processor.data.MetaUnitOfMeasure
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

    private val kaptKotlinGeneratedOption = "kapt.kotlin.generated"
    private lateinit var generatedDir: File
    private lateinit var env: ProcessingEnvironment

    private var generateCommonUnits: Boolean = false
    private var relationships = emptySet<MetaRelation>()
    private var quantities = emptySet<MetaQuantity>()
    private var unitsOfMeasure = emptySet<MetaUnitOfMeasure>()

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
            val srcWriter = writeKt(generatedDir, "UnitsOfMeasure")
            writeBase(srcWriter, env.filer)

            if (generateCommonUnits) {
                quantities += commonQuantities
                unitsOfMeasure += commonUnits
            }

            var allDimensions = emptySet<MetaDimension>()
            allDimensions += relationships.flatMap { setOf(it.a, it.b, it.result) }
            allDimensions += quantities.map(MetaQuantity::dimension)
            allDimensions += unitsOfMeasure.map(MetaUnitOfMeasure::dimension)
            allDimensions
                    .map(MetaDimension::src)
                    .forEach(srcWriter::println)

            relationships
                    .map(MetaRelation::src)
                    .forEach(srcWriter::println)

            quantities
                    .map(MetaQuantity::src)
                    .forEach(srcWriter::println)

            unitsOfMeasure
                    .distinctBy(MetaUnitOfMeasure::name)
                    .map(MetaUnitOfMeasure::src)
                    .forEach(srcWriter::println)

            srcWriter.done()
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