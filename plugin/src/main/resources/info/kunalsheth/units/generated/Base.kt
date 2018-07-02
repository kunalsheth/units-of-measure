package info.kunalsheth.units.generated

import kotlin.math.abs
import kotlin.math.sign

/**
 * Created by kunal on 8/6/17.
 */
@Suppress("FINITE_BOUNDS_VIOLATION", "UNCHECKED_CAST")
interface Quantity<This, Integral, Derivative> : Comparable<This> where
This : Quantity<This, Integral, Derivative>,
Integral : Quantity<Integral, *, This>,
Derivative : Quantity<Derivative, This, *> {
    val siValue: Double
    val abrev: String
    val new: (Double) -> This

    operator fun unaryPlus(): This = this as This
    operator fun unaryMinus(): This = new(-siValue)

    operator fun plus(that: This): This = new(this.siValue + that.siValue)
    operator fun minus(that: This): This = new(this.siValue - that.siValue)
    operator fun times(that: Number): This = new(this.siValue * that.toDouble())
    operator fun div(that: Number): This = new(this.siValue / that.toDouble())

    operator fun times(that: T): Integral = TODO()
    operator fun div(that: T): Derivative = TODO()

    @Suppress("UNCHECKED_CAST")
    operator fun rangeTo(that: This) = object : ClosedRange<This> {
        override val start = (this@Quantity min that)
        override val endInclusive = (this@Quantity max that)
    }

    infix fun min(that: This): This = if (this < that) this as This else that
    infix fun max(that: This): This = if (this > that) this as This else that

    val abs: This get() = new(abs(siValue))
    val signum get() = siValue.sign
    val isNegative: Boolean get() = siValue < 0
    val isPositive: Boolean get() = siValue > 0

    override fun compareTo(other: This) = this.siValue.compareTo(other.siValue)
}

private inline fun <reified Q : Quantity<Q, *, *>> Q.eq(that: Any?) = when (that) {
    is Q -> this.siValue == that.siValue
    else -> false
}

private val Number.d get() = toDouble()

fun <Q : Quantity<Q, *, *>> Number.exa(f: Double.() -> Q) = f(d * 1E18)
fun <Q : Quantity<Q, *, *>> Q.exa(f: Q.() -> Double) = f() * 1E-18

fun <Q : Quantity<Q, *, *>> Number.peta(f: Double.() -> Q) = f(d * 1E15)
fun <Q : Quantity<Q, *, *>> Q.peta(f: Q.() -> Double) = f() * 1E-15

fun <Q : Quantity<Q, *, *>> Number.tera(f: Double.() -> Q) = f(d * 1E12)
fun <Q : Quantity<Q, *, *>> Q.tera(f: Q.() -> Double) = f() * 1E-12

fun <Q : Quantity<Q, *, *>> Number.giga(f: Double.() -> Q) = f(d * 1E9)
fun <Q : Quantity<Q, *, *>> Q.giga(f: Q.() -> Double) = f() * 1E-9

fun <Q : Quantity<Q, *, *>> Number.mega(f: Double.() -> Q) = f(d * 1E6)
fun <Q : Quantity<Q, *, *>> Q.mega(f: Q.() -> Double) = f() * 1E-6

fun <Q : Quantity<Q, *, *>> Number.kilo(f: Double.() -> Q) = f(d * 1E3)
fun <Q : Quantity<Q, *, *>> Q.kilo(f: Q.() -> Double) = f() * 1E-3

fun <Q : Quantity<Q, *, *>> Number.hecto(f: Double.() -> Q) = f(d * 1E2)
fun <Q : Quantity<Q, *, *>> Q.hecto(f: Q.() -> Double) = f() * 1E-2

fun <Q : Quantity<Q, *, *>> Number.deca(f: Double.() -> Q) = f(d * 1E1)
fun <Q : Quantity<Q, *, *>> Q.deca(f: Q.() -> Double) = f() * 1E-1

fun <Q : Quantity<Q, *, *>> Number.deci(f: Double.() -> Q) = f(d * 1E-1)
fun <Q : Quantity<Q, *, *>> Q.deci(f: Q.() -> Double) = f() * 1E1

fun <Q : Quantity<Q, *, *>> Number.centi(f: Double.() -> Q) = f(d * 1E-2)
fun <Q : Quantity<Q, *, *>> Q.centi(f: Q.() -> Double) = f() * 1E2

fun <Q : Quantity<Q, *, *>> Number.milli(f: Double.() -> Q) = f(d * 1E-3)
fun <Q : Quantity<Q, *, *>> Q.milli(f: Q.() -> Double) = f() * 1E3

fun <Q : Quantity<Q, *, *>> Number.micro(f: Double.() -> Q) = f(d * 1E-6)
fun <Q : Quantity<Q, *, *>> Q.micro(f: Q.() -> Double) = f() * 1E6

fun <Q : Quantity<Q, *, *>> Number.nano(f: Double.() -> Q) = f(d * 1E-9)
fun <Q : Quantity<Q, *, *>> Q.nano(f: Q.() -> Double) = f() * 1E9

fun <Q : Quantity<Q, *, *>> Number.pico(f: Double.() -> Q) = f(d * 1E-12)
fun <Q : Quantity<Q, *, *>> Q.pico(f: Q.() -> Double) = f() * 1E12

fun <Q : Quantity<Q, *, *>> Number.femto(f: Double.() -> Q) = f(d * 1E-15)
fun <Q : Quantity<Q, *, *>> Q.femto(f: Q.() -> Double) = f() * 1E15

fun <Q : Quantity<Q, *, *>> Number.atto(f: Double.() -> Q) = f(d * 1E-18)
fun <Q : Quantity<Q, *, *>> Q.atto(f: Q.() -> Double) = f() * 1E18

interface UomConverter<Q : Quantity<Q, *, *>> {
    val unitName: String
    operator fun invoke(x: Number): Q
    operator fun invoke(x: Q): Number
}