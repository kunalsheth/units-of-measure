package info.kunalsheth.units.generated

import kotlin.math.abs
import kotlin.math.sign

/**
 * Created by kunal on 8/6/17.
 */
abstract class Quan<Q : Quan<Q>> : Comparable<Q> {
    abstract val siValue: Double
    abstract val abrev: String
    abstract val new: (Double) -> Q

    operator fun unaryPlus() = this
    operator fun unaryMinus() = new(-siValue)

    operator fun plus(that: Q) = new(this.siValue + that.siValue)
    operator fun minus(that: Q) = new(this.siValue - that.siValue)
    val abs get() = new(abs(siValue))

    @Suppress("UNCHECKED_CAST")
    operator fun rangeTo(that: Q) = object : ClosedRange<Q> {
        override val start = (this@Quan min that) as Q
        override val endInclusive = (this@Quan max that) as Q
    }

    infix fun min(that: Q) = if (this < that) this else that
    infix fun max(that: Q) = if (this > that) this else that

    val signum get() = siValue.sign
    val isNegative: Boolean get() = siValue < 0
    val isPositive: Boolean get() = siValue > 0

    override fun compareTo(other: Q) = this.siValue.compareTo(other.siValue)

    override fun hashCode() = (siValue to abrev).hashCode()
    override fun toString() = "$siValue $abrev"
}

private inline fun <reified Q : Quan<Q>> Q.eq(that: Any?) = when (that) {
    is Q -> this.siValue == that.siValue
    else -> false
}

private val Number.d get() = toDouble()

fun <Q : Quan<Q>> Number.exa(f: Double.() -> Q) = f(d * 1E18)
fun <Q : Quan<Q>> Q.exa(f: Q.() -> Double) = f() * 1E-18

fun <Q : Quan<Q>> Number.peta(f: Double.() -> Q) = f(d * 1E15)
fun <Q : Quan<Q>> Q.peta(f: Q.() -> Double) = f() * 1E-15

fun <Q : Quan<Q>> Number.tera(f: Double.() -> Q) = f(d * 1E12)
fun <Q : Quan<Q>> Q.tera(f: Q.() -> Double) = f() * 1E-12

fun <Q : Quan<Q>> Number.giga(f: Double.() -> Q) = f(d * 1E9)
fun <Q : Quan<Q>> Q.giga(f: Q.() -> Double) = f() * 1E-9

fun <Q : Quan<Q>> Number.mega(f: Double.() -> Q) = f(d * 1E6)
fun <Q : Quan<Q>> Q.mega(f: Q.() -> Double) = f() * 1E-6

fun <Q : Quan<Q>> Number.kilo(f: Double.() -> Q) = f(d * 1E3)
fun <Q : Quan<Q>> Q.kilo(f: Q.() -> Double) = f() * 1E-3

fun <Q : Quan<Q>> Number.hecto(f: Double.() -> Q) = f(d * 1E2)
fun <Q : Quan<Q>> Q.hecto(f: Q.() -> Double) = f() * 1E-2

fun <Q : Quan<Q>> Number.deca(f: Double.() -> Q) = f(d * 1E1)
fun <Q : Quan<Q>> Q.deca(f: Q.() -> Double) = f() * 1E-1

fun <Q : Quan<Q>> Number.deci(f: Double.() -> Q) = f(d * 1E-1)
fun <Q : Quan<Q>> Q.deci(f: Q.() -> Double) = f() * 1E1

fun <Q : Quan<Q>> Number.centi(f: Double.() -> Q) = f(d * 1E-2)
fun <Q : Quan<Q>> Q.centi(f: Q.() -> Double) = f() * 1E2

fun <Q : Quan<Q>> Number.milli(f: Double.() -> Q) = f(d * 1E-3)
fun <Q : Quan<Q>> Q.milli(f: Q.() -> Double) = f() * 1E3

fun <Q : Quan<Q>> Number.micro(f: Double.() -> Q) = f(d * 1E-6)
fun <Q : Quan<Q>> Q.micro(f: Q.() -> Double) = f() * 1E6

fun <Q : Quan<Q>> Number.nano(f: Double.() -> Q) = f(d * 1E-9)
fun <Q : Quan<Q>> Q.nano(f: Q.() -> Double) = f() * 1E9

fun <Q : Quan<Q>> Number.pico(f: Double.() -> Q) = f(d * 1E-12)
fun <Q : Quan<Q>> Q.pico(f: Q.() -> Double) = f() * 1E12

fun <Q : Quan<Q>> Number.femto(f: Double.() -> Q) = f(d * 1E-15)
fun <Q : Quan<Q>> Q.femto(f: Q.() -> Double) = f() * 1E15

fun <Q : Quan<Q>> Number.atto(f: Double.() -> Q) = f(d * 1E-18)
fun <Q : Quan<Q>> Q.atto(f: Q.() -> Double) = f() * 1E18

@Suppress("FINITE_BOUNDS_VIOLATION")
interface TimeDerivative<Of> where
Of : TimeIntegral<out TimeDerivative<Of>> {
    operator fun times(t: L0M0T1I0Theta0N0J0): Of
}

@Suppress("FINITE_BOUNDS_VIOLATION")
interface TimeIntegral<Of> where
Of : TimeDerivative<out TimeIntegral<Of>> {
    operator fun div(t: L0M0T1I0Theta0N0J0): Of
}