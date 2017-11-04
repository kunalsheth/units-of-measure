package info.kunalsheth.unitsofmeasure.generated

import java.io.Serializable

/**
 * Created by kunal on 8/6/17.
 */
interface Base<This : Base<This>> : Comparable<This>, Serializable {
    val siQuantity: Double

    operator fun unaryPlus() = copy(+siQuantity)
    operator fun unaryMinus() = copy(-siQuantity)

    operator fun plus(that: This) = copy(this.siQuantity + that.siQuantity)
    operator fun minus(that: This) = copy(this.siQuantity - that.siQuantity)
    fun abs() = copy(Math.abs(siQuantity))

    fun copy(siQuantity: Double): This

    operator fun rangeTo(that: This) = object : ClosedRange<This> {
        override val start = (this@Base min that) as This
        override val endInclusive = (this@Base max that) as This
    }

    infix fun min(that: This) = if (this < that) this else that
    infix fun max(that: This) = if (this > that) this else that
    val isNegative: Boolean get() = siQuantity < 0
    val isPositive: Boolean get() = siQuantity > 0

    override fun compareTo(other: This) = this.siQuantity.compareTo(other.siQuantity)
}