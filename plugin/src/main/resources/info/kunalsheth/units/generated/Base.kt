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

infix fun <Q : Quan<Q>> Q.plusOrMinus(radius: Q) = (this - radius)..(this + radius)
infix fun <Q : Quan<Q>> Q.`±`(radius: Q) = (this - radius)..(this + radius)

operator fun <Q : Quan<Q>> Q.rangeTo(that: Q) = object : ClosedRange<Q> {
    override val start = min(that)
    override val endInclusive = max(that)
}

fun <Q : Quan<Q>> avg(a: Q, b: Q) = (a + b) / 2
fun <Q : Quan<Q>> avg(a: Q, b: Q, c: Q) = (a + b + c) / 3
fun <Q : Quan<Q>> avg(a: Q, b: Q, c: Q, d: Q) = (a + b + c + d) / 4
fun <Q : Quan<Q>> avg(first: Q, vararg x: Q) = first.new(
        (first.siValue + x.sumByDouble { it.siValue }) / (x.size + 1)
)

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

private fun <Q : Quan<Q>> box(x: Q) = x as Quan<Q>