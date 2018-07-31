package info.kunalsheth.units

import info.kunalsheth.units.data.Dimension
import info.kunalsheth.units.data.Quantity
import info.kunalsheth.units.data.Relation
import info.kunalsheth.units.data.RelationType.Divide
import info.kunalsheth.units.data.RelationType.Multiply
import info.kunalsheth.units.data.UnitOfMeasure
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

fun Dimension.src(relations: Set<Relation>, quantities: Set<Quantity>, units: Set<UnitOfMeasure>): String {

    val derivative = relations
            .firstOrNull { it.b == time && it.f == Divide }
            ?.result?.toString()
            ?: nothing
    val integral = relations
            .firstOrNull { it.b == time && it.f == Multiply }
            ?.result?.toString()
            ?: nothing

    val siUnit = units.firstOrNull { it.factorToSI == 1.0 }
    val name = siUnit ?: safeName

    return """
typealias $this = $name
data class $name(override val $siValue: Double) : Quantity<$this, $integral, $derivative> {
    override val $abrev = "$abbreviation"
    override fun new($siValue: Double) = copy($siValue)
    override fun equals(other: Any?) = eq(other)
    override fun hashCode() = ($siValue to $abrev).hashCode()
    override fun toString() = "$$siValue $$abrev"

    override operator fun div(that: Quan<$time>) = ${
    if (derivative != nothing) "$derivative(this.$siValue / that.$siValue)" else "TODO()"}

    override operator fun times(that: Quan<$time>) = ${
    if (integral != nothing) "$integral(this.$siValue * that.$siValue)" else "TODO()"}

    ${if (siUnit != null) """
    companion object : UomConverter<$this>,
        Quantity<$this, $integral, $derivative> by $name(1.0) {
        override val unitName = "${siUnit.name}"
        override fun invoke(x: Number) = x.$siUnit
        override fun invoke(x: $this) = x.$siUnit
    }
    """ else ""}
}
${units.joinToString(separator = "") {
        it.src(integral, derivative, quantities
                .takeIf { it.size == 1 }
                ?.run(Set<Quantity>::first)
        )
    }}
${quantities.joinToString(separator = "", transform = Quantity::src)}
${relations.filter { it.b != time }.joinToString(separator = "\n", transform = Relation::src)}
"""
}

private fun Relation.src() = "@JvmName(\"${a.safeName}_${f.name}_${b.safeName}\") " + when (f) {
    Divide ->
        "operator fun Quan<$a>.div(that: Quan<$b>) = $result(this.$siValue / that.$siValue)"
    Multiply ->
        "operator fun Quan<$a>.times(that: Quan<$b>) = $result(this.$siValue * that.$siValue)"
}

private fun Quantity.src() = """
typealias $this = $dimension
"""

private fun UnitOfMeasure.src(integral: String, derivative: String, quantity: Quantity?) = """
val Number.$this: ${quantity ?: dimension} get() = $dimension(d * $factorToSI)
val $dimension.$this get() = $siValue * ${1 / factorToSI}
${if (factorToSI != 1.0) """
object $this : UomConverter<$dimension>,
    Quantity<$dimension, $integral, $derivative> by $dimension($factorToSI) {
    override val unitName = "$name"
    override fun invoke(x: Number) = x.$this
    override fun invoke(x: $dimension) = x.$this
}
""" else ""}
"""