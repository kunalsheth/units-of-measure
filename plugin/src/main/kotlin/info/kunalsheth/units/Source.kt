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

private const val underlying = "underlying"
private const val siValue = "siValue"

fun Dimension.src(relations: Set<Relation>, quantities: Set<Quantity>, units: Set<UnitOfMeasure>): String {
    return """
typealias $this = $safeName
/*inline*/ class $safeName(internal val $underlying: Double) : Quan<$this> {
    override val siValue get() = $underlying
    override val abrev get() = "$abbreviation"

    override fun new($siValue: Double) = $this($siValue)

    override operator fun unaryPlus() = $this(+$underlying)
    override operator fun unaryMinus() = $this(-$underlying)

    override operator fun plus(that: $this) = $this(this.$underlying + that.$underlying)
    override operator fun minus(that: $this) = $this(this.$underlying - that.$underlying)
    override operator fun times(that: Number) = $this(this.$underlying * that.toDouble())
    override operator fun div(that: Number) = $this(this.$underlying / that.toDouble())
    override operator fun rem(that: $this) = $this(this.$underlying % that.$underlying)

    override infix fun min(that: $this) = if (this < that) this else that
    override infix fun max(that: $this) = if (this > that) this else that

    override val abs get() = $this(abs($underlying))
    override val signum get() = $underlying.sign
    override val isNegative get() = $underlying < 0
    override val isPositive get() = $underlying > 0

    override fun compareTo(other: $this) = this.$underlying.compareTo(other.$underlying)

    override fun toString() = "${'$'}$underlying ${'$'}abrev"
}
${units.joinToString(separator = "") {
        it.src(quantities
                .takeIf { it.size == 1 }
                ?.run(Set<Quantity>::first)
        )
    }}
${quantities.joinToString(separator = "", transform = Quantity::src)}
${relations.joinToString(separator = "\n", transform = Relation::src)}
"""
}

private fun Relation.src(): String {
    fun jvmName(category: String) = """@JvmName("${a.safeName}_${f.name}_${b.safeName}_$category")"""

    return when (f) {
        Divide -> {
            val logic = "$result(this.$siValue / that.$siValue)"
            """
            ${jvmName("generic")}
            operator fun $a.div(that: Quan<$b>) = $logic
            // ${jvmName("concrete")}
            operator fun $a.div(that: $b) = $logic
            ${jvmName("nonextension")}
            fun div(thiz: Quan<$a>, that: Quan<$b>) = thiz.run { $logic }
        """.trimIndent()
        }
        Multiply -> {
            val logic = "$result(this.$siValue * that.$siValue)"
            """
            ${jvmName("generic")}
            operator fun $a.times(that: Quan<$b>) = $logic
            // ${jvmName("concrete")}
            operator fun $a.times(that: $b) = $logic
            ${jvmName("nonextension")}
            fun times(thiz: Quan<$a>, that: Quan<$b>) = thiz.run { $logic }
        """.trimIndent()
        }
    }
}

private fun Quantity.src() = """
typealias $this = $dimension
"""

private fun UnitOfMeasure.src(quantity: Quantity?) = """
val Number.$this: ${quantity ?: dimension} get() = $dimension(d * $factorToSI)
val $dimension.$this get() = $siValue * ${1 / factorToSI}
object $this : UomConverter<$dimension>,
    Quan<$dimension> by box($dimension($factorToSI)) {
    override val unitName = "$name"
    override fun invoke(x: Number) = x.$this
    override fun invoke(x: $dimension) = x.$this
}
"""