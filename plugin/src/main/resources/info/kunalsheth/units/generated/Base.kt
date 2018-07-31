package info.kunalsheth.units.generated

import kotlin.math.abs
import kotlin.math.sign
import kotlin.jvm.JvmName

/**
 * Created by kunal on 8/6/17.
 */
typealias Quan<Q> = Quantity<Q, *, *>

@Suppress("FINITE_BOUNDS_VIOLATION", "UNCHECKED_CAST")
interface Quantity<This, Integral, Derivative> : Comparable<Quan<This>> where
This : Quantity<This, Integral, Derivative>,
Integral : Quantity<Integral, *, This>,
Derivative : Quantity<Derivative, This, *> {
    val siValue: Double
    val abrev: String

    fun new(siValue: Double): This

    operator fun unaryPlus(): This = this as This
    operator fun unaryMinus(): This = new(-siValue)

    operator fun plus(that: Quan<This>): This = new(this.siValue + that.siValue)
    operator fun minus(that: Quan<This>): This = new(this.siValue - that.siValue)
    operator fun times(that: Number): This = new(this.siValue * that.toDouble())
    operator fun div(that: Number): This = new(this.siValue / that.toDouble())
    operator fun rem(that: Quan<This>): This = new(this.siValue % that.siValue)

    operator fun times(that: Quan<T>): Integral = TODO()
    operator fun div(that: Quan<T>): Derivative = TODO()

    @Suppress("UNCHECKED_CAST")
    operator fun rangeTo(that: Quan<This>) = object : ClosedRange<This> {
        override val start = (this@Quantity min that)
        override val endInclusive = (this@Quantity max that)
    }

    infix fun min(that: Quan<This>): This = (if (this < that) this else that) as This
    infix fun max(that: Quan<This>): This = (if (this > that) this else that) as This

    val abs: This get() = new(abs(siValue))
    val signum get() = siValue.sign
    val isNegative: Boolean get() = siValue < 0
    val isPositive: Boolean get() = siValue > 0

    override fun compareTo(other: Quan<This>) = this.siValue.compareTo(other.siValue)
}

private inline fun <reified Q : Quan<Q>> Q.eq(that: Any?) = when (that) {
    is Q -> this.siValue == that.siValue
    else -> false
}

private val Number.d get() = toDouble()

operator fun <Q : Quan<Q>> Number.times(that: Quan<Q>): Q = that * this
// operator fun <Q : Quan<Q>> Number.div(that: Quan<Q>): Q = need some sort of reciprocal op

fun <Q : Quan<Q>> Number.exa(f: UomConverter<Q>) = f(d * 1E18)
fun <Q : Quan<Q>> Q.exa(f: UomConverter<Q>) = f(this) * 1E-18

fun <Q : Quan<Q>> Number.peta(f: UomConverter<Q>) = f(d * 1E15)
fun <Q : Quan<Q>> Q.peta(f: UomConverter<Q>) = f(this) * 1E-15

fun <Q : Quan<Q>> Number.tera(f: UomConverter<Q>) = f(d * 1E12)
fun <Q : Quan<Q>> Q.tera(f: UomConverter<Q>) = f(this) * 1E-12

fun <Q : Quan<Q>> Number.giga(f: UomConverter<Q>) = f(d * 1E9)
fun <Q : Quan<Q>> Q.giga(f: UomConverter<Q>) = f(this) * 1E-9

fun <Q : Quan<Q>> Number.mega(f: UomConverter<Q>) = f(d * 1E6)
fun <Q : Quan<Q>> Q.mega(f: UomConverter<Q>) = f(this) * 1E-6

fun <Q : Quan<Q>> Number.kilo(f: UomConverter<Q>) = f(d * 1E3)
fun <Q : Quan<Q>> Q.kilo(f: UomConverter<Q>) = f(this) * 1E-3

fun <Q : Quan<Q>> Number.hecto(f: UomConverter<Q>) = f(d * 1E2)
fun <Q : Quan<Q>> Q.hecto(f: UomConverter<Q>) = f(this) * 1E-2

fun <Q : Quan<Q>> Number.deca(f: UomConverter<Q>) = f(d * 1E1)
fun <Q : Quan<Q>> Q.deca(f: UomConverter<Q>) = f(this) * 1E-1

fun <Q : Quan<Q>> Number.deci(f: UomConverter<Q>) = f(d * 1E-1)
fun <Q : Quan<Q>> Q.deci(f: UomConverter<Q>) = f(this) * 1E1

fun <Q : Quan<Q>> Number.centi(f: UomConverter<Q>) = f(d * 1E-2)
fun <Q : Quan<Q>> Q.centi(f: UomConverter<Q>) = f(this) * 1E2

fun <Q : Quan<Q>> Number.milli(f: UomConverter<Q>) = f(d * 1E-3)
fun <Q : Quan<Q>> Q.milli(f: UomConverter<Q>) = f(this) * 1E3

fun <Q : Quan<Q>> Number.micro(f: UomConverter<Q>) = f(d * 1E-6)
fun <Q : Quan<Q>> Q.micro(f: UomConverter<Q>) = f(this) * 1E6

fun <Q : Quan<Q>> Number.nano(f: UomConverter<Q>) = f(d * 1E-9)
fun <Q : Quan<Q>> Q.nano(f: UomConverter<Q>) = f(this) * 1E9

fun <Q : Quan<Q>> Number.pico(f: UomConverter<Q>) = f(d * 1E-12)
fun <Q : Quan<Q>> Q.pico(f: UomConverter<Q>) = f(this) * 1E12

fun <Q : Quan<Q>> Number.femto(f: UomConverter<Q>) = f(d * 1E-15)
fun <Q : Quan<Q>> Q.femto(f: UomConverter<Q>) = f(this) * 1E15

fun <Q : Quan<Q>> Number.atto(f: UomConverter<Q>) = f(d * 1E-18)
fun <Q : Quan<Q>> Q.atto(f: UomConverter<Q>) = f(this) * 1E18

interface UomConverter<Q : Quan<Q>> {
    val unitName: String
    operator fun invoke(x: Number): Q
    operator fun invoke(x: Q): Double
}