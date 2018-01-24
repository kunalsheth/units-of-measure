@file:Suppress("DATA_CLASS_OVERRIDE_DEFAULT_VALUES_WARNING")

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

fun <N : Number, Q : Quan<Q>> N.exa(f: Number.() -> Q) = f(d * 1E18)
fun <N : Number, Q : Quan<Q>> Q.exa(f: Q.() -> N) = f().d * 1E-18

fun <N : Number, Q : Quan<Q>> N.peta(f: Number.() -> Q) = f(d * 1E15)
fun <N : Number, Q : Quan<Q>> Q.peta(f: Q.() -> N) = f().d * 1E-15

fun <N : Number, Q : Quan<Q>> N.tera(f: Number.() -> Q) = f(d * 1E12)
fun <N : Number, Q : Quan<Q>> Q.tera(f: Q.() -> N) = f().d * 1E-12

fun <N : Number, Q : Quan<Q>> N.giga(f: Number.() -> Q) = f(d * 1E9)
fun <N : Number, Q : Quan<Q>> Q.giga(f: Q.() -> N) = f().d * 1E-9

fun <N : Number, Q : Quan<Q>> N.mega(f: Number.() -> Q) = f(d * 1E6)
fun <N : Number, Q : Quan<Q>> Q.mega(f: Q.() -> N) = f().d * 1E-6

fun <N : Number, Q : Quan<Q>> N.kilo(f: Number.() -> Q) = f(d * 1E3)
fun <N : Number, Q : Quan<Q>> Q.kilo(f: Q.() -> N) = f().d * 1E-3

fun <N : Number, Q : Quan<Q>> N.hecto(f: Number.() -> Q) = f(d * 1E2)
fun <N : Number, Q : Quan<Q>> Q.hecto(f: Q.() -> N) = f().d * 1E-2

fun <N : Number, Q : Quan<Q>> N.deca(f: Number.() -> Q) = f(d * 1E1)
fun <N : Number, Q : Quan<Q>> Q.deca(f: Q.() -> N) = f().d * 1E-1

fun <N : Number, Q : Quan<Q>> N.deci(f: Number.() -> Q) = f(d * 1E-1)
fun <N : Number, Q : Quan<Q>> Q.deci(f: Q.() -> N) = f().d * 1E1

fun <N : Number, Q : Quan<Q>> N.centi(f: Number.() -> Q) = f(d * 1E-2)
fun <N : Number, Q : Quan<Q>> Q.centi(f: Q.() -> N) = f().d * 1E2

fun <N : Number, Q : Quan<Q>> N.milli(f: Number.() -> Q) = f(d * 1E-3)
fun <N : Number, Q : Quan<Q>> Q.milli(f: Q.() -> N) = f().d * 1E3

fun <N : Number, Q : Quan<Q>> N.micro(f: Number.() -> Q) = f(d * 1E-6)
fun <N : Number, Q : Quan<Q>> Q.micro(f: Q.() -> N) = f().d * 1E6

fun <N : Number, Q : Quan<Q>> N.nano(f: Number.() -> Q) = f(d * 1E-9)
fun <N : Number, Q : Quan<Q>> Q.nano(f: Q.() -> N) = f().d * 1E9

fun <N : Number, Q : Quan<Q>> N.pico(f: Number.() -> Q) = f(d * 1E-12)
fun <N : Number, Q : Quan<Q>> Q.pico(f: Q.() -> N) = f().d * 1E12

fun <N : Number, Q : Quan<Q>> N.femto(f: Number.() -> Q) = f(d * 1E-15)
fun <N : Number, Q : Quan<Q>> Q.femto(f: Q.() -> N) = f().d * 1E15

fun <N : Number, Q : Quan<Q>> N.atto(f: Number.() -> Q) = f(d * 1E-18)
fun <N : Number, Q : Quan<Q>> Q.atto(f: Q.() -> N) = f().d * 1E18