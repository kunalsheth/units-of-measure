package info.kunalsheth.unitsofmeasure

import info.kunalsheth.unitsofmeasure.data.MetaRelation
import info.kunalsheth.unitsofmeasure.data.MetaUom
import info.kunalsheth.unitsofmeasure.data.RelationType.Divide
import info.kunalsheth.unitsofmeasure.data.RelationType.Multiply
import info.kunalsheth.unitsofmeasure.data.commonUnits
import info.kunalsheth.unitsofmeasure.source.done
import info.kunalsheth.unitsofmeasure.source.uomBase
import info.kunalsheth.unitsofmeasure.source.writeKt
import java.io.File
import java.util.*
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
class UnitsProcessor : Processor {

    // kapt's option to generate kotlin instead of java
    private val kaptKotlinGeneratedOption = "kapt.kotlin.generated"

    // directory for generated source files
    lateinit var generatedDir: File
    lateinit var env: ProcessingEnvironment

    private val allUnits = HashSet<MetaUom>()
    private val allRelations = HashSet<MetaRelation<*>>()

    override fun getSupportedOptions() = setOf(kaptKotlinGeneratedOption)

    override fun process(types: MutableSet<out TypeElement>, round: RoundEnvironment): Boolean {
        if (round.getElementsAnnotatedWith(CommonUnits::class.java).isNotEmpty())
            allUnits += commonUnits.values

        round.run {
            getElementsAnnotatedWith(Relations::class.java) + getElementsAnnotatedWith(Relate::class.java)
        }
                .map { it.getAnnotationsByType(Relate::class.java) }
                .flatMap { it.asIterable() }

                // convert annotation data to data class
                .map { MetaUom(it.a) to MetaUom(it.b) }
                .flatMap { (a, b) ->
                    val aDb = MetaRelation(a, Divide, b)
                    val aMb = MetaRelation(a, Multiply, b)
                    val bDa = MetaRelation(b, Divide, a)
                    val bMa = MetaRelation(b, Multiply, a)

                    val aDbMb = MetaRelation(aDb.result, Multiply, b)
                    val aMbDb = MetaRelation(aMb.result, Divide, b)
                    val aMbDa = MetaRelation(aMb.result, Divide, a)
                    val bDaMa = MetaRelation(bDa.result, Multiply, a)
                    val bMaDa = MetaRelation(bMa.result, Divide, a)
                    val bMaDb = MetaRelation(bMa.result, Divide, b)

                    setOf(
                            aDb, aMb, bDa, bMa,
                            aDbMb, aMbDb, aMbDa, bDaMa, bMaDa, bMaDb
                    )
                }
                .forEach {
                    allRelations += it
                    allUnits += setOf(it.a, it.b, it.result)
                }

        if (round.processingOver()) {
            val src = writeKt(generatedDir, "UnitsOfMeasure")
            // parent class of all UOM classes
            src.println(uomBase)
            // write all UOM implementation classes
            allUnits.forEach(src::println)
            // write all extension operator functions
            allRelations.forEach(src::println)

            // create type aliases for common unit names
            commonUnits
                    .filterValues { it in allUnits }
                    .mapValues { (_, unit) -> unit.safeName }
                    // avoid redeclaration
                    .filter { (name, unit) -> name != unit }

                    .map { (name, unit) -> "typealias $name = $unit" }
                    .forEach(src::println)

            // create type aliases for unicode unit names
            allUnits
                    .map { it.unicodeName to it.safeName }
                    .filter { (u, s) -> u != s }
                    .map { (u, s) -> "typealias $u = $s" }
                    .forEach(src::println)

            src.done()
        }

        return true
    }

    override fun getCompletions(element: Element, annotation: AnnotationMirror, executable: ExecutableElement, userText: String) = emptySet<Completion>()

    override fun getSupportedSourceVersion() = SourceVersion.latestSupported()!!

    override fun getSupportedAnnotationTypes() = setOf(
            Relate::class,
            Relations::class,
            CommonUnits::class
    )
            .map { it.qualifiedName!! }
            .toSet()

    override fun init(env: ProcessingEnvironment) {
        this.env = env
        generatedDir = File(env.options[kaptKotlinGeneratedOption])
        generatedDir.mkdirs()
    }
}