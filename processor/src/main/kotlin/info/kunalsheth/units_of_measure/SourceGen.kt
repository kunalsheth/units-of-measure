package info.kunalsheth.units_of_measure

import java.io.File
import java.io.PrintWriter

/**
 * Created by kunal on 8/5/17.
 */
fun MetaUom.src() = """
data class $this(override val quantity: Double) : Uom<$this>
"""

fun UomRelation.src() = when (method) {
    UomRelation.Type.Derivative -> """
operator fun $i1.div(that: $i2) = $o(this.quantity / that.quantity)
"""
    UomRelation.Type.Integral -> (if (i1 != i2)
        "operator fun $i1.times(that: $i2) = $o(this.quantity * that.quantity)" else "") +
            "\noperator fun $i2.times(that: $i1) = $o(this.quantity * that.quantity)"
}

val header = """
package info.kunalsheth.units_of_measure
"""

fun writeKt(parent: File, simpleName: String): PrintWriter {
    val out = File(parent, "$simpleName.kt").printWriter()
    out.println(header)
    return out
}

fun PrintWriter.done() {
    flush()
    close()
}

val uomBase = """
import java.io.Serializable

/**
 * Created by kunal on 8/6/17.
 */
interface Uom<This : Uom<This>> : Comparable<This>, Serializable {
    val quantity: Double

    operator fun unaryPlus() = copy(+quantity)
    operator fun unaryMinus() = copy(-quantity)

    operator fun plus(that: This) = copy(this.quantity + that.quantity)
    operator fun minus(that: This) = copy(this.quantity - that.quantity)
    fun abs() = copy(Math.abs(quantity))

    fun copy(quantity: Double): This

    operator fun rangeTo(that: This) = object : ClosedRange<This> {
        override val start = (this@Uom min that) as This
        override val endInclusive = (this@Uom max that) as This
    }

    infix fun min(that: This) = if (this < that) this else that
    infix fun max(that: This) = if (this > that) this else that
    val isNegative: Boolean get() = quantity < 0
    val isPositive: Boolean get() = quantity > 0

    override fun compareTo(other: This) = this.quantity.compareTo(other.quantity)
}
"""