package info.kunalsheth.unitsofmeasure.processor

import info.kunalsheth.unitsofmeasure.processor.data.MetaUnitOfMeasure
import info.kunalsheth.unitsofmeasure.processor.data.MetaDimension
import info.kunalsheth.unitsofmeasure.processor.data.MetaQuantity
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
        "Quantity.kt"
)
        .openInputStream()
        .bufferedReader()
        .lineSequence()
        .forEach(printWriter::println)

val siValue = "siValue"

fun MetaDimension.src() = """
    data class $safeName(override val $siValue: Double) : Quantity<$safeName>
    typealias $this = $safeName
"""

fun MetaRelation.src() = when (f) {
    Divide -> """
        operator fun $a.div(that: $b) = $result(this.$siValue / that.$siValue)
"""
    Multiply -> """
        operator fun $a.times(that: $b) = $result(this.$siValue * that.$siValue)
"""
}

fun MetaQuantity.src() = """
    typealias $this = $dimension
"""

fun MetaUnitOfMeasure.src() = """
    val Number.$this get() = $dimension(this.toDouble() * $factorToSI)
    val $dimension.$this get() = $siValue / $factorToSI
"""

fun PrintWriter.done() {
    flush()
    close()
}