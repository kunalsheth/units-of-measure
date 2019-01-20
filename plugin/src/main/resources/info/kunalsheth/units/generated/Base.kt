package info.kunalsheth.units.generated

import kotlin.math.abs
import kotlin.math.sign
import kotlin.jvm.JvmName

/**
 * Created by kunal on 8/6/17.
 */
@Suppress("UNCHECKED_CAST")
interface Quan<This> : Comparable<This> where
This : Quan<This> {
    val siValue: Double
    val abrev: String

    fun new(siValue: Double): This

    operator fun unaryPlus(): This
    operator fun unaryMinus(): This

    operator fun plus(that: This): This
    operator fun minus(that: This): This
    operator fun times(that: Number): This
    operator fun div(that: Number): This
    operator fun rem(that: This): This

    infix fun min(that: This): This
    infix fun max(that: This): This

    val abs: This
    val signum: Double
    val isNegative: Boolean
    val isPositive: Boolean

    override fun compareTo(other: This): Int
}

interface UomConverter<Q : Quan<Q>> {
    val unitName: String
    operator fun invoke(x: Double): Q
    operator fun invoke(x: Q): Double
}

private fun <Q : Quan<Q>> box(x: Q) = x as Quan<Q>
