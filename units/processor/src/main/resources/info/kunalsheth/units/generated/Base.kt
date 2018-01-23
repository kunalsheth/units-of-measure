@file:Suppress("DATA_CLASS_OVERRIDE_DEFAULT_VALUES_WARNING")

package info.kunalsheth.units.generated

import kotlin.math.*

/**
 * Created by kunal on 8/6/17.
 */
interface Quan<D : Quan<D>> : Comparable<D> {
    val siValue: Double

    operator fun unaryPlus() = this
    operator fun unaryMinus() = copy(-siValue)

    operator fun plus(that: D) = copy(this.siValue + that.siValue)
    operator fun minus(that: D) = copy(this.siValue - that.siValue)
    val abs get() = copy(abs(siValue))

    fun copy(siValue: Double): D

    @Suppress("UNCHECKED_CAST")
    operator fun rangeTo(that: D) = object : ClosedRange<D> {
        override val start = (this@Quan min that) as D
        override val endInclusive = (this@Quan max that) as D
    }

    infix fun min(that: D) = if (this < that) this else that
    infix fun max(that: D) = if (this > that) this else that

    val signum get() = siValue.sign
    val isNegative: Boolean get() = siValue < 0
    val isPositive: Boolean get() = siValue > 0

    override fun compareTo(other: D) = this.siValue.compareTo(other.siValue)
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