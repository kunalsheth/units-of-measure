package info.kunalsheth.units_of_measure

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

    private val kaptKotlinGeneratedOption = "kapt.kotlin.generated"

    lateinit var generatedDir: File
    lateinit var env: ProcessingEnvironment

    private val connections = HashSet<UomRelation>()
    private val units = HashSet<MetaUom>()

    override fun getSupportedOptions() = setOf(
            kaptKotlinGeneratedOption
    )

    override fun process(types: MutableSet<out TypeElement>, round: RoundEnvironment): Boolean {
        fun Iterable<MetaUom>.genSrc() = this
                .filter { it !in units }
                .onEach {
                    val out = writeKt(generatedDir, it.safeName)
                    out.println(it.src().trim())
                    out.done()
                }
                .forEach { units += it }

        if (round.getElementsAnnotatedWith(CommonUnits::class.java).isNotEmpty())
            commonUnits
                    .values
                    .genSrc()

        (round.getElementsAnnotatedWith(Derivatives::class.java)
                + round.getElementsAnnotatedWith(Differentiate::class.java))
                .map { it.getAnnotationsByType(Differentiate::class.java) }
                .flatMap { it.asIterable() }

                .map { MetaUom(it.x) to MetaUom(it.withRespectTo) }
                .map { it to it.first / it.second }

                .onEach { (i, o) -> connections += UomRelation(i.first, UomRelation.Type.Derivative, i.second, o) }
                .flatMap { (i, o) -> setOf(i.first, i.second, o) }
                .genSrc()

        (round.getElementsAnnotatedWith(Integrals::class.java)
                + round.getElementsAnnotatedWith(Integrate::class.java))
                .map { it.getAnnotationsByType(Integrate::class.java) }
                .flatMap { it.asIterable() }

                .map { MetaUom(it.x) to MetaUom(it.withRespectTo) }
                .map { it to it.first * it.second }

                .onEach { (i, o) -> connections += UomRelation(i.first, UomRelation.Type.Integral, i.second, o) }
                .flatMap { (i, o) -> setOf(i.first, i.second, o) }
                .genSrc()

        if (round.processingOver()) {
            val out = writeKt(generatedDir, "UomLinks")

            out.println(uomBase)

            connections
                    .map { it.src() }
                    .forEach { out.println(it) }

            out.println("// --- typealias abuse ---")

            commonUnits
                    .filterValues { it in units }
                    .filter { (name, unit) -> name != unit.toString() }
                    .map { (name, unit) -> "typealias $name = $unit" }
                    .forEach { out.println(it) }

            units
                    .filter { it.unicodeName != it.toString() }
                    .map { "typealias ${it.unicodeName} = $it" }
                    .forEach { out.println(it) }

            out.done()
        }

        return true
    }

    override fun getCompletions(element: Element, annotation: AnnotationMirror, executable: ExecutableElement, userText: String) = emptySet<Completion>()

    override fun getSupportedSourceVersion() = SourceVersion.latestSupported()!!

    override fun getSupportedAnnotationTypes() = setOf(
            Integrate::class,
            Differentiate::class,
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