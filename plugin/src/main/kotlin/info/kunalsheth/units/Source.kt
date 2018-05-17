package info.kunalsheth.units

import info.kunalsheth.units.data.*
import info.kunalsheth.units.data.RelationType.Divide
import info.kunalsheth.units.data.RelationType.Multiply
import java.io.PrintWriter

/**
 * Created by kunal on 8/5/17.
 */
fun writeBase(printWriter: PrintWriter) = ::UnitsOfMeasurePlugin::class.java
        .getResourceAsStream("/info/kunalsheth/units/generated/Base.kt")
        .bufferedReader()
        .lineSequence()
        .forEach(printWriter::println)

private const val nothing = "Nothing"
private const val siValue = "siValue"
private const val abrev = "abrev"
private val time = Dimension(T = 1)

fun Dimension.src(relations: Set<Relation>): String {

    val theseRelations = relations.filter { it.a == this }

    val derivative = theseRelations
            .firstOrNull { it.b == time && it.f == Divide }?.result
            ?: nothing
    val integral = theseRelations
            .firstOrNull { it.b == time && it.f == Multiply }?.result
            ?: nothing

    return """
class $safeName(override val $siValue: Double) : Quantity<$safeName, $integral, $derivative> {
    override val $abrev = "$metricUnitAbrev"
    override val new = ::$this
    override fun equals(other: Any?) = eq(other)
    override fun hashCode() = ($siValue to $abrev).hashCode()
    override fun toString() = "$$siValue $$abrev"

    override operator fun div(that: $time) = ${
    if (derivative != nothing) "$derivative(this.$siValue / that.$siValue)" else "TODO()"}

    override operator fun times(that: $time) = ${
    if (integral != nothing) "$integral(this.$siValue * that.$siValue)" else "TODO()"}

    ${theseRelations
            .filter { it.b != time }
            .joinToString(
                    separator = "\n    ",
                    prefix = "\n", postfix = "\n"
            ) { it.src() }}
}
typealias $this = $safeName
"""
}

fun Relation.src() = when (f) {
    RelationType.Divide ->
        "operator fun div(that: $b) = $result(this.$siValue / that.$siValue)"
    RelationType.Multiply ->
        "operator fun times(that: $b) = $result(this.$siValue * that.$siValue)"
}

fun Quantity.src() = """
typealias $this = $dimension
"""

fun UnitOfMeasure.src() = """
val Number.$this get() = $dimension(d * $factorToSI)
val $dimension.$this get() = $siValue * ${1 / factorToSI}
typealias $this = $dimension
"""

fun PrintWriter.done() {
    flush()
    close()
}