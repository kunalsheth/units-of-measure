package info.kunalsheth.units

import info.kunalsheth.units.data.*
import java.io.PrintWriter

/**
 * Created by kunal on 8/5/17.
 */
fun writeBase(printWriter: PrintWriter) = ::UnitsOfMeasurePlugin::class.java
        .getResourceAsStream("/info/kunalsheth/units/generated/Base.kt")
        .bufferedReader()
        .lineSequence()
        .forEach(printWriter::println)

private const val siValue = "siValue"

fun Dimension.src(relation: Set<Relation>) = """
class $safeName(override val $siValue: Double) : Quan<$safeName>() {
    override val abrev = "$metricUnitAbrev"
    override val new = ::$this
    override fun equals(other: Any?) = eq(other)
    ${relation
        .filter { it.a == this }
        .joinToString(separator = "") { it.src() }}
}
typealias $this = $safeName
"""

fun Relation.src() = when (f) {
    RelationType.Divide -> """
    operator fun div(that: $b) = $result(this.$siValue / that.$siValue)"""
    RelationType.Multiply -> """
    operator fun times(that: $b) = $result(this.$siValue * that.$siValue)"""
}

fun Quantity.src() = """
typealias $this = $dimension
"""

fun UnitOfMeasure.src() = """
val Number.$this get() = $dimension(d * $factorToSI)
val $dimension.$this get() = $siValue * ${1 / factorToSI}
"""

fun PrintWriter.done() {
    flush()
    close()
}