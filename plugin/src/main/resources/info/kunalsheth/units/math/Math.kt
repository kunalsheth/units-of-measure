package info.kunalsheth.units.math

import info.kunalsheth.units.generated.*
import kotlin.math.*

fun sin(x: `∠`) = Dimensionless(kotlin.math.sin(x.siValue))
fun cos(x: `∠`) = Dimensionless(kotlin.math.cos(x.siValue))
fun tan(x: `∠`) = Dimensionless(kotlin.math.tan(x.siValue))
fun asin(x: Dimensionless) = `∠`(kotlin.math.asin(x.siValue))
fun acos(x: Dimensionless) = `∠`(kotlin.math.acos(x.siValue))
fun atan(x: Dimensionless) = `∠`(kotlin.math.atan(x.siValue))
fun atan2(y: `L`, x: `L`) = `∠`(kotlin.math.atan2(y.siValue, x.siValue))
fun hypot(x: `L`, y: `L`) = `L`(kotlin.math.hypot(x.siValue, y.siValue))
fun sqrt(x: Dimensionless) = Dimensionless(kotlin.math.sqrt(x.siValue))
fun exp(x: Dimensionless) = Dimensionless(kotlin.math.exp(x.siValue))
fun expm1(x: Dimensionless, q: UomConverter<Dimensionless>) = q(expm1(q(x)))
fun log(x: Dimensionless, base: Dimensionless) = Dimensionless(kotlin.math.log(x.siValue, base.siValue))
fun ln(x: Dimensionless, q: UomConverter<Dimensionless>) = q(ln(q(x)))
fun log10(x: Dimensionless, q: UomConverter<Dimensionless>) = q(log10(q(x)))
fun log2(x: Dimensionless, q: UomConverter<Dimensionless>) = q(log2(q(x)))
fun ln1p(x: Dimensionless, q: UomConverter<Dimensionless>) = q(ln1p(q(x)))
fun <Q : Quan<Q>> ceil(x: Q, q: UomConverter<Q>) = q(ceil(q(x)))
fun <Q : Quan<Q>> floor(x: Q, q: UomConverter<Q>) = q(floor(q(x)))
fun <Q : Quan<Q>> truncate(x: Q, q: UomConverter<Q>) = q(truncate(q(x)))
fun <Q : Quan<Q>> round(x: Q, q: UomConverter<Q>) = q(round(q(x)))
fun <Q : Quan<Q>> abs(x: Q) = x.abs
fun <Q : Quan<Q>> sign(x: Q) = x.signum
fun <Q : Quan<Q>> min(a: Q, b: Q) = a min b
fun <Q : Quan<Q>> max(a: Q, b: Q) = a max b
fun Dimensionless.pow(x: Dimensionless) = Dimensionless(siValue.pow(x.siValue))
fun <Q : Quan<Q>> Q.IEEErem(divisor: Q) = new(siValue.IEEErem(divisor.siValue))
fun <Q : Quan<Q>> Q.withSign(sign: Quan<*>) = new(siValue.withSign(sign.siValue))
val <Q : Quan<Q>> Q.ulp get() = new(siValue.ulp)
fun <Q : Quan<Q>> Q.nextUp() = new(siValue.nextUp())
fun <Q : Quan<Q>> Q.nextDown() = new(siValue.nextDown())
fun <Q : Quan<Q>> Q.nextTowards(to: Q) = new(siValue.nextTowards(to.siValue))
fun <Q : Quan<Q>> Q.roundToInt(q: UomConverter<Q>) = q(q(this).roundToInt())
fun <Q : Quan<Q>> Q.roundToLong(q: UomConverter<Q>) = q(q(this).roundToLong())

infix fun <Q : Quan<Q>> Q.plusOrMinus(radius: Q) = (this - radius)..(this + radius)
infix fun <Q : Quan<Q>> Q.`±`(radius: Q) = (this - radius)..(this + radius)

operator fun <Q : Quan<Q>> Q.rangeTo(that: Q) = object : ClosedRange<Q> {
    override val start = min(that)
    override val endInclusive = max(that)
}

fun <Q : Quan<Q>> avg(a: Q, b: Q) = (a + b) / 2
fun <Q : Quan<Q>> avg(first: Q, vararg x: Q) = first.new(
        (first.siValue + x.sumByDouble(Quan<Q>::siValue)) /
                (1 + x.size)
)

private inline val Number.d get() = toDouble()

operator fun <Q : Quan<Q>> Number.times(that: Quan<Q>): Q = that * this

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