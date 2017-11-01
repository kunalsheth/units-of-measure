package info.kunalsheth.unitsofmeasure.processor

import info.kunalsheth.unitsofmeasure.processor.data.MetaConversion
import info.kunalsheth.unitsofmeasure.processor.data.MetaMeasure
import info.kunalsheth.unitsofmeasure.processor.data.MetaRelation
import info.kunalsheth.unitsofmeasure.processor.data.RelationType.*
import java.io.File
import java.io.PrintWriter

/**
 * Created by kunal on 8/5/17.
 */
fun writeKt(parent: File, simpleName: String): PrintWriter {
    val out = File(parent, "$simpleName.kt").printWriter()
    out.println("package info.kunalsheth.unitsofmeasure.generated")
    return out
}

fun writeBases(printWriter: PrintWriter) = ClassLoader.getSystemClassLoader()
        .getResourceAsStream("info/kunalsheth/unitsofmeasure/generated/Bases.kt")
        .bufferedReader()
        .lineSequence()
        .forEach(printWriter::println)

val siQuantity = "siQuantity"

fun MetaMeasure.src() = """
    data class $this(override val $siQuantity) : Measure<$this>
"""

fun MetaConversion.src() = """
    fun $this(quantity: Double) = $measure(quantity / $ratioToSI)
"""

fun Collection<MetaConversion>.src() = distinctBy(MetaConversion::toString).joinToString {
    it.run {
        "val $measure.$this get() = $siQuantity * $ratioToSI"
    }
}

fun MetaRelation.src() = when (f) {
    Divide -> """
        operator fun $a.div(that: $b) = $result(a.$siQuantity / b.$siQuantity)
"""
    Multiply -> """
        operator fun $a.times(that: $b) = $result(a.$siQuantity * b.$siQuantity)
"""
}

fun PrintWriter.done() {
    flush()
    close()
}