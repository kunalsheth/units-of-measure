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