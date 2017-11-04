package info.kunalsheth.unitsofmeasure.processor

import info.kunalsheth.unitsofmeasure.processor.data.MetaConversion
import info.kunalsheth.unitsofmeasure.processor.data.MetaMeasure
import info.kunalsheth.unitsofmeasure.processor.data.MetaRelation
import info.kunalsheth.unitsofmeasure.processor.data.RelationType.*
import java.io.File
import java.io.PrintWriter
import javax.annotation.processing.Filer
import javax.tools.StandardLocation

/**
 * Created by kunal on 8/5/17.
 */
fun writeKt(parent: File, simpleName: String)
        = File(parent, "$simpleName.kt").printWriter()

fun writeBase(printWriter: PrintWriter, filer: Filer) = filer.getResource(
        StandardLocation.ANNOTATION_PROCESSOR_PATH,
        "info.kunalsheth.unitsofmeasure.generated",
        "Base.kt"
)
        .openInputStream()
        .bufferedReader()
        .lineSequence()
        .forEach(printWriter::println)

val siQuantity = "siQuantity"

fun MetaMeasure.src() = """
    data class $safeName(override val $siQuantity: Double) : Base<$safeName>
    typealias $this = $safeName
"""

fun Collection<MetaConversion>.src() = distinctBy(MetaConversion::toString)
        .joinToString(separator = "\n") {
            it.run {
                """
                fun $this(quantity: Double) = $measure(quantity / $ratioToSI)
                val $measure.$this get() = $siQuantity * $ratioToSI
                """
            }
        }

fun MetaRelation.src() = when (f) {
    Divide -> """
        operator fun $a.div(that: $b) = $result(this.$siQuantity / that.$siQuantity)
"""
    Multiply -> """
        operator fun $a.times(that: $b) = $result(this.$siQuantity * that.$siQuantity)
"""
}

fun PrintWriter.done() {
    flush()
    close()
}