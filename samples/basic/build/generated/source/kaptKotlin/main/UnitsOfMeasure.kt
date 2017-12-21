@file:Suppress("DATA_CLASS_OVERRIDE_DEFAULT_VALUES_WARNING")

package info.kunalsheth.units.generated

import java.io.Serializable

/**
 * Created by kunal on 8/6/17.
 */
interface Quan<D : Quan<D>> : Comparable<D>, Serializable {
    val siValue: Double

    operator fun unaryPlus() = this
    operator fun unaryMinus() = copy(-siValue)

    operator fun plus(that: D) = copy(this.siValue + that.siValue)
    operator fun minus(that: D) = copy(this.siValue - that.siValue)
    val abs get() = copy(Math.abs(siValue))

    fun copy(siValue: Double): D

    @Suppress("UNCHECKED_CAST")
    operator fun rangeTo(that: D) = object : ClosedRange<D> {
        override val start = (this@Quan min that) as D
        override val endInclusive = (this@Quan max that) as D
    }

    infix fun min(that: D) = if (this < that) this else that
    infix fun max(that: D) = if (this > that) this else that

    val signum get() = Math.signum(siValue)
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

    data class L1M0T0I0Theta0N0J0(override val siValue: Double) : Quan<L1M0T0I0Theta0N0J0>
    typealias `L` = L1M0T0I0Theta0N0J0


    data class L0M0T0I0Theta0N0J0(override val siValue: Double) : Quan<L0M0T0I0Theta0N0J0>
    typealias Dimensionless = L0M0T0I0Theta0N0J0


    data class L2M0T0I0Theta0N0J0(override val siValue: Double) : Quan<L2M0T0I0Theta0N0J0>
    typealias `L²` = L2M0T0I0Theta0N0J0


    data class L0M0T1I0Theta0N0J0(override val siValue: Double) : Quan<L0M0T1I0Theta0N0J0>
    typealias `T` = L0M0T1I0Theta0N0J0


    data class L1M0I0Theta0N0J0_per_T1(override val siValue: Double) : Quan<L1M0I0Theta0N0J0_per_T1>
    typealias `L⋅T⁻¹` = L1M0I0Theta0N0J0_per_T1


    data class L1M0T1I0Theta0N0J0(override val siValue: Double) : Quan<L1M0T1I0Theta0N0J0>
    typealias `L⋅T` = L1M0T1I0Theta0N0J0


    data class M0T1I0Theta0N0J0_per_L1(override val siValue: Double) : Quan<M0T1I0Theta0N0J0_per_L1>
    typealias `L⁻¹⋅T` = M0T1I0Theta0N0J0_per_L1


    data class L0M0T2I0Theta0N0J0(override val siValue: Double) : Quan<L0M0T2I0Theta0N0J0>
    typealias `T²` = L0M0T2I0Theta0N0J0


    data class L2M0I0Theta0N0J0_per_T2(override val siValue: Double) : Quan<L2M0I0Theta0N0J0_per_T2>
    typealias `L²⋅T⁻²` = L2M0I0Theta0N0J0_per_T2


    data class L1M0I0Theta0N0J0_per_T2(override val siValue: Double) : Quan<L1M0I0Theta0N0J0_per_T2>
    typealias `L⋅T⁻²` = L1M0I0Theta0N0J0_per_T2


    data class L2M0I0Theta0N0J0_per_T3(override val siValue: Double) : Quan<L2M0I0Theta0N0J0_per_T3>
    typealias `L²⋅T⁻³` = L2M0I0Theta0N0J0_per_T3


    data class L0M0I0Theta0N0J0_per_T1(override val siValue: Double) : Quan<L0M0I0Theta0N0J0_per_T1>
    typealias `T⁻¹` = L0M0I0Theta0N0J0_per_T1


    data class L2M0I0Theta0N0J0_per_T4(override val siValue: Double) : Quan<L2M0I0Theta0N0J0_per_T4>
    typealias `L²⋅T⁻⁴` = L2M0I0Theta0N0J0_per_T4


    data class L0M1T0I0Theta0N0J0(override val siValue: Double) : Quan<L0M1T0I0Theta0N0J0>
    typealias `M` = L0M1T0I0Theta0N0J0


    data class L0M0T0I1Theta0N0J0(override val siValue: Double) : Quan<L0M0T0I1Theta0N0J0>
    typealias `I` = L0M0T0I1Theta0N0J0


    data class L0M0T0I0Theta1N0J0(override val siValue: Double) : Quan<L0M0T0I0Theta1N0J0>
    typealias `Θ` = L0M0T0I0Theta1N0J0


    data class L0M0T0I0Theta0N1J0(override val siValue: Double) : Quan<L0M0T0I0Theta0N1J0>
    typealias `N` = L0M0T0I0Theta0N1J0


    data class L0M0T0I0Theta0N0J1(override val siValue: Double) : Quan<L0M0T0I0Theta0N0J1>
    typealias `J` = L0M0T0I0Theta0N0J1


    data class L0M0I0Theta0N0J0_per_T2(override val siValue: Double) : Quan<L0M0I0Theta0N0J0_per_T2>
    typealias `T⁻²` = L0M0I0Theta0N0J0_per_T2


    data class L2M1I0Theta0N0J0_per_T1(override val siValue: Double) : Quan<L2M1I0Theta0N0J0_per_T1>
    typealias `L²⋅M⋅T⁻¹` = L2M1I0Theta0N0J0_per_T1


    data class M1T0I0Theta0N0J0_per_L2(override val siValue: Double) : Quan<M1T0I0Theta0N0J0_per_L2>
    typealias `L⁻²⋅M` = M1T0I0Theta0N0J0_per_L2


    data class T4I2Theta0N0J0_per_L2M1(override val siValue: Double) : Quan<T4I2Theta0N0J0_per_L2M1>
    typealias `L⁻²⋅M⁻¹⋅T⁴⋅I²` = T4I2Theta0N0J0_per_L2M1


    data class L0M0I0Theta0N1J0_per_T1(override val siValue: Double) : Quan<L0M0I0Theta0N1J0_per_T1>
    typealias `T⁻¹⋅N` = L0M0I0Theta0N1J0_per_T1


    data class M0I0Theta0N1J0_per_L3T1(override val siValue: Double) : Quan<M0I0Theta0N1J0_per_L3T1>
    typealias `L⁻³⋅T⁻¹⋅N` = M0I0Theta0N1J0_per_L3T1


    data class L2M1I0Theta0J0_per_T2N1(override val siValue: Double) : Quan<L2M1I0Theta0J0_per_T2N1>
    typealias `L²⋅M⋅T⁻²⋅N⁻¹` = L2M1I0Theta0J0_per_T2N1


    data class L1M0I0Theta0N0J0_per_T5(override val siValue: Double) : Quan<L1M0I0Theta0N0J0_per_T5>
    typealias `L⋅T⁻⁵` = L1M0I0Theta0N0J0_per_T5


    data class M0T0I1Theta0N0J0_per_L2(override val siValue: Double) : Quan<M0T0I1Theta0N0J0_per_L2>
    typealias `L⁻²⋅I` = M0T0I1Theta0N0J0_per_L2


    data class M1I0Theta0N0J0_per_L1T1(override val siValue: Double) : Quan<M1I0Theta0N0J0_per_L1T1>
    typealias `L⁻¹⋅M⋅T⁻¹` = M1I0Theta0N0J0_per_L1T1


    data class L0M0T1I1Theta0N0J0(override val siValue: Double) : Quan<L0M0T1I1Theta0N0J0>
    typealias `T⋅I` = L0M0T1I1Theta0N0J0


    data class M0T1I1Theta0N0J0_per_L3(override val siValue: Double) : Quan<M0T1I1Theta0N0J0_per_L3>
    typealias `L⁻³⋅T⋅I` = M0T1I1Theta0N0J0_per_L3


    data class M0T1I1Theta0N0J0_per_L2(override val siValue: Double) : Quan<M0T1I1Theta0N0J0_per_L2>
    typealias `L⁻²⋅T⋅I` = M0T1I1Theta0N0J0_per_L2


    data class L1M1Theta0N0J0_per_T3I1(override val siValue: Double) : Quan<L1M1Theta0N0J0_per_T3I1>
    typealias `L⋅M⋅T⁻³⋅I⁻¹` = L1M1Theta0N0J0_per_T3I1


    data class T3I2Theta0N0J0_per_L2M1(override val siValue: Double) : Quan<T3I2Theta0N0J0_per_L2M1>
    typealias `L⁻²⋅M⁻¹⋅T³⋅I²` = T3I2Theta0N0J0_per_L2M1


    data class T3I2Theta0N0J0_per_L3M1(override val siValue: Double) : Quan<T3I2Theta0N0J0_per_L3M1>
    typealias `L⁻³⋅M⁻¹⋅T³⋅I²` = T3I2Theta0N0J0_per_L3M1


    data class L2M1Theta0N0J0_per_T3I1(override val siValue: Double) : Quan<L2M1Theta0N0J0_per_T3I1>
    typealias `L²⋅M⋅T⁻³⋅I⁻¹` = L2M1Theta0N0J0_per_T3I1


    data class L2M1Theta0N0J0_per_T3I2(override val siValue: Double) : Quan<L2M1Theta0N0J0_per_T3I2>
    typealias `L²⋅M⋅T⁻³⋅I⁻²` = L2M1Theta0N0J0_per_T3I2


    data class L3M1Theta0N0J0_per_T3I2(override val siValue: Double) : Quan<L3M1Theta0N0J0_per_T3I2>
    typealias `L³⋅M⋅T⁻³⋅I⁻²` = L3M1Theta0N0J0_per_T3I2


    data class L2M1I0Theta0N0J0_per_T2(override val siValue: Double) : Quan<L2M1I0Theta0N0J0_per_T2>
    typealias `L²⋅M⋅T⁻²` = L2M1I0Theta0N0J0_per_T2


    data class M1I0Theta0N0J0_per_L1T2(override val siValue: Double) : Quan<M1I0Theta0N0J0_per_L1T2>
    typealias `L⁻¹⋅M⋅T⁻²` = M1I0Theta0N0J0_per_L1T2


    data class L2M1I0N0J0_per_T2Theta1(override val siValue: Double) : Quan<L2M1I0N0J0_per_T2Theta1>
    typealias `L²⋅M⋅T⁻²⋅Θ⁻¹` = L2M1I0N0J0_per_T2Theta1


    data class L1M1I0Theta0N0J0_per_T2(override val siValue: Double) : Quan<L1M1I0Theta0N0J0_per_T2>
    typealias `L⋅M⋅T⁻²` = L1M1I0Theta0N0J0_per_T2


    data class M0T0I0Theta0N0J0_per_L2(override val siValue: Double) : Quan<M0T0I0Theta0N0J0_per_L2>
    typealias `L⁻²` = M0T0I0Theta0N0J0_per_L2


    data class L0M1I0Theta0N0J0_per_T3(override val siValue: Double) : Quan<L0M1I0Theta0N0J0_per_T3>
    typealias `M⋅T⁻³` = L0M1I0Theta0N0J0_per_T3


    data class M0T0I0Theta0N0J1_per_L2(override val siValue: Double) : Quan<M0T0I0Theta0N0J1_per_L2>
    typealias `L⁻²⋅J` = M0T0I0Theta0N0J1_per_L2


    data class L1M1I0Theta0N0J0_per_T1(override val siValue: Double) : Quan<L1M1I0Theta0N0J0_per_T1>
    typealias `L⋅M⋅T⁻¹` = L1M1I0Theta0N0J0_per_T1


    data class L2M1Theta0N0J0_per_T2I2(override val siValue: Double) : Quan<L2M1Theta0N0J0_per_T2I2>
    typealias `L²⋅M⋅T⁻²⋅I⁻²` = L2M1Theta0N0J0_per_T2I2


    data class L1M0I0Theta0N0J0_per_T3(override val siValue: Double) : Quan<L1M0I0Theta0N0J0_per_T3>
    typealias `L⋅T⁻³` = L1M0I0Theta0N0J0_per_T3


    data class L1M0I0Theta0N0J0_per_T4(override val siValue: Double) : Quan<L1M0I0Theta0N0J0_per_T4>
    typealias `L⋅T⁻⁴` = L1M0I0Theta0N0J0_per_T4


    data class M1T0I0Theta0N0J0_per_L1(override val siValue: Double) : Quan<M1T0I0Theta0N0J0_per_L1>
    typealias `L⁻¹⋅M` = M1T0I0Theta0N0J0_per_L1


    data class M0T0I1Theta0N0J0_per_L1(override val siValue: Double) : Quan<M0T0I1Theta0N0J0_per_L1>
    typealias `L⁻¹⋅I` = M0T0I1Theta0N0J0_per_L1


    data class L2M1Theta0N0J0_per_T2I1(override val siValue: Double) : Quan<L2M1Theta0N0J0_per_T2I1>
    typealias `L²⋅M⋅T⁻²⋅I⁻¹` = L2M1Theta0N0J0_per_T2I1


    data class L0M1Theta0N0J0_per_T2I1(override val siValue: Double) : Quan<L0M1Theta0N0J0_per_T2I1>
    typealias `M⋅T⁻²⋅I⁻¹` = L0M1Theta0N0J0_per_T2I1


    data class M1T0I0Theta0N0J0_per_L3(override val siValue: Double) : Quan<M1T0I0Theta0N0J0_per_L3>
    typealias `L⁻³⋅M` = M1T0I0Theta0N0J0_per_L3


    data class M0T0I0Theta0N1J0_per_L3(override val siValue: Double) : Quan<M0T0I0Theta0N1J0_per_L3>
    typealias `L⁻³⋅N` = M0T0I0Theta0N1J0_per_L3


    data class L2M1I0J0_per_T2Theta1N1(override val siValue: Double) : Quan<L2M1I0J0_per_T2Theta1N1>
    typealias `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹` = L2M1I0J0_per_T2Theta1N1


    data class L2M1T0I0Theta0N0J0(override val siValue: Double) : Quan<L2M1T0I0Theta0N0J0>
    typealias `L²⋅M` = L2M1T0I0Theta0N0J0


    data class L1M1Theta0N0J0_per_T2I2(override val siValue: Double) : Quan<L1M1Theta0N0J0_per_T2I2>
    typealias `L⋅M⋅T⁻²⋅I⁻²` = L1M1Theta0N0J0_per_T2I2


    data class T4I2Theta0N0J0_per_L3M1(override val siValue: Double) : Quan<T4I2Theta0N0J0_per_L3M1>
    typealias `L⁻³⋅M⁻¹⋅T⁴⋅I²` = T4I2Theta0N0J0_per_L3M1


    data class L2M1I0Theta0N0J0_per_T3(override val siValue: Double) : Quan<L2M1I0Theta0N0J0_per_T3>
    typealias `L²⋅M⋅T⁻³` = L2M1I0Theta0N0J0_per_T3


    data class L1M0I0Theta0N0J0_per_T6(override val siValue: Double) : Quan<L1M0I0Theta0N0J0_per_T6>
    typealias `L⋅T⁻⁶` = L1M0I0Theta0N0J0_per_T6


    data class L2M0I0N0J0_per_T2Theta1(override val siValue: Double) : Quan<L2M0I0N0J0_per_T2Theta1>
    typealias `L²⋅T⁻²⋅Θ⁻¹` = L2M0I0N0J0_per_T2Theta1


    data class L3T0I0Theta0N0J0_per_M1(override val siValue: Double) : Quan<L3T0I0Theta0N0J0_per_M1>
    typealias `L³⋅M⁻¹` = L3T0I0Theta0N0J0_per_M1


    data class L0M1I0Theta0N0J0_per_T2(override val siValue: Double) : Quan<L0M1I0Theta0N0J0_per_T2>
    typealias `M⋅T⁻²` = L0M1I0Theta0N0J0_per_T2


    data class L1M1I0N0J0_per_T3Theta1(override val siValue: Double) : Quan<L1M1I0N0J0_per_T3Theta1>
    typealias `L⋅M⋅T⁻³⋅Θ⁻¹` = L1M1I0N0J0_per_T3Theta1


    data class L3M0T0I0Theta0N0J0(override val siValue: Double) : Quan<L3M0T0I0Theta0N0J0>
    typealias `L³` = L3M0T0I0Theta0N0J0


    data class M0T0I0Theta0N0J0_per_L1(override val siValue: Double) : Quan<M0T0I0Theta0N0J0_per_L1>
    typealias `L⁻¹` = M0T0I0Theta0N0J0_per_L1


    data class L0M0T1I0Theta0N0J1(override val siValue: Double) : Quan<L0M0T1I0Theta0N0J1>
    typealias `T⋅J` = L0M0T1I0Theta0N0J1


    data class M0T1I0Theta0N0J1_per_L2(override val siValue: Double) : Quan<M0T1I0Theta0N0J1_per_L2>
    typealias `L⁻²⋅T⋅J` = M0T1I0Theta0N0J1_per_L2


    data class M0T1I0Theta0N0J1_per_L3(override val siValue: Double) : Quan<M0T1I0Theta0N0J1_per_L3>
    typealias `L⁻³⋅T⋅J` = M0T1I0Theta0N0J1_per_L3


    data class T3I0Theta0N0J1_per_L2M1(override val siValue: Double) : Quan<T3I0Theta0N0J1_per_L2M1>
    typealias `L⁻²⋅M⁻¹⋅T³⋅J` = T3I0Theta0N0J1_per_L2M1


    data class L1M1I0Theta0N0J0_per_T3(override val siValue: Double) : Quan<L1M1I0Theta0N0J0_per_T3>
    typealias `L⋅M⋅T⁻³` = L1M1I0Theta0N0J0_per_T3


    data class M1I0Theta0N0J0_per_L1T3(override val siValue: Double) : Quan<M1I0Theta0N0J0_per_L1T3>
    typealias `L⁻¹⋅M⋅T⁻³` = M1I0Theta0N0J0_per_L1T3


        operator fun `L`.div(that: `L`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L`.times(that: `L`) = `L²`(this.siValue * that.siValue)


        operator fun `L`.div(that: `T`) = `L⋅T⁻¹`(this.siValue / that.siValue)


        operator fun `L`.times(that: `T`) = `L⋅T`(this.siValue * that.siValue)


        operator fun `T`.div(that: `L`) = `L⁻¹⋅T`(this.siValue / that.siValue)


        operator fun `T`.div(that: `T`) = Dimensionless(this.siValue / that.siValue)


        operator fun `T`.times(that: `L`) = `L⋅T`(this.siValue * that.siValue)


        operator fun `T`.times(that: `T`) = `T²`(this.siValue * that.siValue)


        operator fun `L`.div(that: Dimensionless) = `L`(this.siValue / that.siValue)


        operator fun `L`.times(that: Dimensionless) = `L`(this.siValue * that.siValue)


        operator fun Dimensionless.div(that: Dimensionless) = Dimensionless(this.siValue / that.siValue)


        operator fun Dimensionless.times(that: `L`) = `L`(this.siValue * that.siValue)


        operator fun Dimensionless.times(that: Dimensionless) = Dimensionless(this.siValue * that.siValue)


        operator fun `L²`.div(that: `L`) = `L`(this.siValue / that.siValue)


        operator fun `L²`.div(that: `L²`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L`.div(that: `L⋅T⁻¹`) = `T`(this.siValue / that.siValue)


        operator fun `L⋅T⁻¹`.div(that: `L⋅T⁻¹`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L⋅T`.div(that: `L`) = `T`(this.siValue / that.siValue)


        operator fun `L⋅T`.div(that: `L⋅T`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L`.times(that: `L⁻¹⋅T`) = `T`(this.siValue * that.siValue)


        operator fun `L⁻¹⋅T`.div(that: `L⁻¹⋅T`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L⁻¹⋅T`.times(that: `L`) = `T`(this.siValue * that.siValue)


        operator fun `T²`.div(that: `T²`) = Dimensionless(this.siValue / that.siValue)


        operator fun `T`.div(that: Dimensionless) = `T`(this.siValue / that.siValue)


        operator fun `T`.times(that: Dimensionless) = `T`(this.siValue * that.siValue)


        operator fun Dimensionless.times(that: `T`) = `T`(this.siValue * that.siValue)


        operator fun `T`.times(that: `L⋅T⁻¹`) = `L`(this.siValue * that.siValue)


        operator fun `L⋅T⁻¹`.times(that: `T`) = `L`(this.siValue * that.siValue)


        operator fun `L⋅T`.div(that: `T`) = `L`(this.siValue / that.siValue)


        operator fun `T`.div(that: `L⁻¹⋅T`) = `L`(this.siValue / that.siValue)


        operator fun `T²`.div(that: `T`) = `T`(this.siValue / that.siValue)


        operator fun Dimensionless.times(that: `L²`) = `L²`(this.siValue * that.siValue)


        operator fun `L²`.div(that: Dimensionless) = `L²`(this.siValue / that.siValue)


        operator fun `L²`.times(that: Dimensionless) = `L²`(this.siValue * that.siValue)


        operator fun Dimensionless.div(that: `L⋅T⁻¹`) = `L⁻¹⋅T`(this.siValue / that.siValue)


        operator fun Dimensionless.times(that: `L⋅T⁻¹`) = `L⋅T⁻¹`(this.siValue * that.siValue)


        operator fun `L⋅T⁻¹`.div(that: Dimensionless) = `L⋅T⁻¹`(this.siValue / that.siValue)


        operator fun `L⋅T⁻¹`.times(that: Dimensionless) = `L⋅T⁻¹`(this.siValue * that.siValue)


        operator fun Dimensionless.times(that: `L⋅T`) = `L⋅T`(this.siValue * that.siValue)


        operator fun `L⋅T`.div(that: Dimensionless) = `L⋅T`(this.siValue / that.siValue)


        operator fun `L⋅T`.times(that: Dimensionless) = `L⋅T`(this.siValue * that.siValue)


        operator fun Dimensionless.div(that: `L⁻¹⋅T`) = `L⋅T⁻¹`(this.siValue / that.siValue)


        operator fun Dimensionless.times(that: `L⁻¹⋅T`) = `L⁻¹⋅T`(this.siValue * that.siValue)


        operator fun `L⁻¹⋅T`.div(that: Dimensionless) = `L⁻¹⋅T`(this.siValue / that.siValue)


        operator fun `L⁻¹⋅T`.times(that: Dimensionless) = `L⁻¹⋅T`(this.siValue * that.siValue)


        operator fun Dimensionless.times(that: `T²`) = `T²`(this.siValue * that.siValue)


        operator fun `T²`.div(that: Dimensionless) = `T²`(this.siValue / that.siValue)


        operator fun `T²`.times(that: Dimensionless) = `T²`(this.siValue * that.siValue)


        operator fun `L²`.div(that: `L⋅T⁻¹`) = `L⋅T`(this.siValue / that.siValue)


        operator fun `L²`.div(that: `L⋅T`) = `L⋅T⁻¹`(this.siValue / that.siValue)


        operator fun `L⋅T`.div(that: `L²`) = `L⁻¹⋅T`(this.siValue / that.siValue)


        operator fun `L²`.times(that: `L⁻¹⋅T`) = `L⋅T`(this.siValue * that.siValue)


        operator fun `L⁻¹⋅T`.times(that: `L²`) = `L⋅T`(this.siValue * that.siValue)


        operator fun `L⋅T⁻¹`.times(that: `L⋅T`) = `L²`(this.siValue * that.siValue)


        operator fun `L⋅T`.div(that: `L⋅T⁻¹`) = `T²`(this.siValue / that.siValue)


        operator fun `L⋅T`.times(that: `L⋅T⁻¹`) = `L²`(this.siValue * that.siValue)


        operator fun `L⋅T⁻¹`.times(that: `L⁻¹⋅T`) = Dimensionless(this.siValue * that.siValue)


        operator fun `L⁻¹⋅T`.times(that: `L⋅T⁻¹`) = Dimensionless(this.siValue * that.siValue)


        operator fun `L⋅T⁻¹`.times(that: `T²`) = `L⋅T`(this.siValue * that.siValue)


        operator fun `T²`.times(that: `L⋅T⁻¹`) = `L⋅T`(this.siValue * that.siValue)


        operator fun `L⋅T`.div(that: `L⁻¹⋅T`) = `L²`(this.siValue / that.siValue)


        operator fun `L⋅T`.times(that: `L⁻¹⋅T`) = `T²`(this.siValue * that.siValue)


        operator fun `L⁻¹⋅T`.times(that: `L⋅T`) = `T²`(this.siValue * that.siValue)


        operator fun `L⋅T`.div(that: `T²`) = `L⋅T⁻¹`(this.siValue / that.siValue)


        operator fun `T²`.div(that: `L⋅T`) = `L⁻¹⋅T`(this.siValue / that.siValue)


        operator fun `T²`.div(that: `L⁻¹⋅T`) = `L⋅T`(this.siValue / that.siValue)


        operator fun `L⋅T⁻¹`.times(that: `L⋅T⁻¹`) = `L²⋅T⁻²`(this.siValue * that.siValue)


        operator fun `L⋅T⁻¹`.div(that: `L⋅T⁻²`) = `T`(this.siValue / that.siValue)


        operator fun `L⋅T⁻¹`.times(that: `L⋅T⁻²`) = `L²⋅T⁻³`(this.siValue * that.siValue)


        operator fun `L⋅T⁻²`.div(that: `L⋅T⁻¹`) = `T⁻¹`(this.siValue / that.siValue)


        operator fun `L⋅T⁻²`.div(that: `L⋅T⁻²`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L⋅T⁻²`.times(that: `L⋅T⁻¹`) = `L²⋅T⁻³`(this.siValue * that.siValue)


        operator fun `L⋅T⁻²`.times(that: `L⋅T⁻²`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻²`.div(that: `L⋅T⁻¹`) = `L⋅T⁻¹`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻²`.div(that: `L²⋅T⁻²`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L⋅T⁻¹`.div(that: `T`) = `L⋅T⁻²`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻³`.div(that: `L⋅T⁻¹`) = `L⋅T⁻²`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻³`.div(that: `L²⋅T⁻³`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L⋅T⁻¹`.times(that: `T⁻¹`) = `L⋅T⁻²`(this.siValue * that.siValue)


        operator fun `T⁻¹`.div(that: `T⁻¹`) = Dimensionless(this.siValue / that.siValue)


        operator fun `T⁻¹`.times(that: `L⋅T⁻¹`) = `L⋅T⁻²`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻⁴`.div(that: `L²⋅T⁻⁴`) = Dimensionless(this.siValue / that.siValue)


        operator fun `L⋅T⁻²`.div(that: Dimensionless) = `L⋅T⁻²`(this.siValue / that.siValue)


        operator fun `L⋅T⁻²`.times(that: Dimensionless) = `L⋅T⁻²`(this.siValue * that.siValue)


        operator fun Dimensionless.times(that: `L⋅T⁻²`) = `L⋅T⁻²`(this.siValue * that.siValue)


        operator fun `L⋅T⁻²`.times(that: `T`) = `L⋅T⁻¹`(this.siValue * that.siValue)


        operator fun `T`.times(that: `L⋅T⁻²`) = `L⋅T⁻¹`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻³`.div(that: `L⋅T⁻²`) = `L⋅T⁻¹`(this.siValue / that.siValue)


        operator fun `L⋅T⁻²`.div(that: `T⁻¹`) = `L⋅T⁻¹`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻⁴`.div(that: `L⋅T⁻²`) = `L⋅T⁻²`(this.siValue / that.siValue)


        operator fun Dimensionless.times(that: `L²⋅T⁻²`) = `L²⋅T⁻²`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻²`.div(that: Dimensionless) = `L²⋅T⁻²`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻²`.times(that: Dimensionless) = `L²⋅T⁻²`(this.siValue * that.siValue)


        operator fun Dimensionless.div(that: `T`) = `T⁻¹`(this.siValue / that.siValue)


        operator fun Dimensionless.times(that: `L²⋅T⁻³`) = `L²⋅T⁻³`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻³`.div(that: Dimensionless) = `L²⋅T⁻³`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻³`.times(that: Dimensionless) = `L²⋅T⁻³`(this.siValue * that.siValue)


        operator fun Dimensionless.div(that: `T⁻¹`) = `T`(this.siValue / that.siValue)


        operator fun Dimensionless.times(that: `T⁻¹`) = `T⁻¹`(this.siValue * that.siValue)


        operator fun `T⁻¹`.div(that: Dimensionless) = `T⁻¹`(this.siValue / that.siValue)


        operator fun `T⁻¹`.times(that: Dimensionless) = `T⁻¹`(this.siValue * that.siValue)


        operator fun Dimensionless.times(that: `L²⋅T⁻⁴`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻⁴`.div(that: Dimensionless) = `L²⋅T⁻⁴`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻⁴`.times(that: Dimensionless) = `L²⋅T⁻⁴`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻²`.div(that: `T`) = `L²⋅T⁻³`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻²`.div(that: `L²⋅T⁻³`) = `T`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻³`.div(that: `L²⋅T⁻²`) = `T⁻¹`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻²`.times(that: `T⁻¹`) = `L²⋅T⁻³`(this.siValue * that.siValue)


        operator fun `T⁻¹`.times(that: `L²⋅T⁻²`) = `L²⋅T⁻³`(this.siValue * that.siValue)


        operator fun `T`.times(that: `L²⋅T⁻³`) = `L²⋅T⁻²`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻³`.div(that: `T`) = `L²⋅T⁻⁴`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻³`.times(that: `T`) = `L²⋅T⁻²`(this.siValue * that.siValue)


        operator fun `T`.times(that: `T⁻¹`) = Dimensionless(this.siValue * that.siValue)


        operator fun `T⁻¹`.times(that: `T`) = Dimensionless(this.siValue * that.siValue)


        operator fun `T`.times(that: `L²⋅T⁻⁴`) = `L²⋅T⁻³`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻⁴`.times(that: `T`) = `L²⋅T⁻³`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻³`.div(that: `T⁻¹`) = `L²⋅T⁻²`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻³`.times(that: `T⁻¹`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)


        operator fun `T⁻¹`.times(that: `L²⋅T⁻³`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)


        operator fun `L²⋅T⁻³`.div(that: `L²⋅T⁻⁴`) = `T`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻⁴`.div(that: `L²⋅T⁻³`) = `T⁻¹`(this.siValue / that.siValue)


        operator fun `L²⋅T⁻⁴`.div(that: `T⁻¹`) = `L²⋅T⁻³`(this.siValue / that.siValue)


    typealias Length = `L`


    typealias Mass = `M`


    typealias Time = `T`


    typealias ElectricCurrent = `I`


    typealias Temperature = `Θ`


    typealias AmountOfSubstance = `N`


    typealias LuminousIntensity = `J`


    typealias Absement = `L⋅T`


    typealias AbsorbedDoseRate = `L²⋅T⁻³`


    typealias Acceleration = `L⋅T⁻²`


    typealias AngularAcceleration = `T⁻²`


    typealias AngularMomentum = `L²⋅M⋅T⁻¹`


    typealias AngularVelocity = `T⁻¹`


    typealias Area = `L²`


    typealias AreaDensity = `L⁻²⋅M`


    typealias Capacitance = `L⁻²⋅M⁻¹⋅T⁴⋅I²`


    typealias CatalyticActivity = `T⁻¹⋅N`


    typealias CatalyticActivityConcentration = `L⁻³⋅T⁻¹⋅N`


    typealias ChemicalPotential = `L²⋅M⋅T⁻²⋅N⁻¹`


    typealias Crackle = `L⋅T⁻⁵`


    typealias CurrentDensity = `L⁻²⋅I`


    typealias DoseEquivalent = `L²⋅T⁻²`


    typealias DynamicViscosity = `L⁻¹⋅M⋅T⁻¹`


    typealias ElectricCharge = `T⋅I`


    typealias ElectricChargeDensity = `L⁻³⋅T⋅I`


    typealias ElectricDisplacement = `L⁻²⋅T⋅I`


    typealias ElectricFieldStrength = `L⋅M⋅T⁻³⋅I⁻¹`


    typealias ElectricalConductance = `L⁻²⋅M⁻¹⋅T³⋅I²`


    typealias ElectricalConductivity = `L⁻³⋅M⁻¹⋅T³⋅I²`


    typealias ElectricPotential = `L²⋅M⋅T⁻³⋅I⁻¹`


    typealias ElectricalResistance = `L²⋅M⋅T⁻³⋅I⁻²`


    typealias ElectricalResistivity = `L³⋅M⋅T⁻³⋅I⁻²`


    typealias Energy = `L²⋅M⋅T⁻²`


    typealias EnergyDensity = `L⁻¹⋅M⋅T⁻²`


    typealias Entropy = `L²⋅M⋅T⁻²⋅Θ⁻¹`


    typealias Force = `L⋅M⋅T⁻²`


    typealias Frequency = `T⁻¹`


    typealias FuelEfficiency = `L⁻²`


    typealias HalfLife = `T`


    typealias Heat = `L²⋅M⋅T⁻²`


    typealias HeatCapacity = `L²⋅M⋅T⁻²⋅Θ⁻¹`


    typealias HeatFluxDensity = `M⋅T⁻³`


    typealias Illuminance = `L⁻²⋅J`


    typealias Impedance = `L²⋅M⋅T⁻³⋅I⁻²`


    typealias Impulse = `L⋅M⋅T⁻¹`


    typealias Inductance = `L²⋅M⋅T⁻²⋅I⁻²`


    typealias Irradiance = `M⋅T⁻³`


    typealias Intensity = `M⋅T⁻³`


    typealias Jerk = `L⋅T⁻³`


    typealias Snap = `L⋅T⁻⁴`


    typealias LinearDensity = `L⁻¹⋅M`


    typealias LuminousFlux = `J`


    typealias Mach = `L`


    typealias MagneticFieldStrength = `L⁻¹⋅I`


    typealias MagneticFlux = `L²⋅M⋅T⁻²⋅I⁻¹`


    typealias MagneticFluxDensity = `M⋅T⁻²⋅I⁻¹`


    typealias Magnetization = `L⁻¹⋅I`


    typealias MassFraction = `L`


    typealias Density = `L⁻³⋅M`


    typealias MeanLifetime = `T`


    typealias MolarConcentration = `L⁻³⋅N`


    typealias MolarEnergy = `L²⋅M⋅T⁻²⋅N⁻¹`


    typealias MolarEntropy = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`


    typealias MolarHeatCapacity = `L²⋅M⋅T⁻²⋅N⁻¹`


    typealias MomentOfInertia = `L²⋅M`


    typealias Momentum = `L⋅M⋅T⁻¹`


    typealias Permeability = `L⋅M⋅T⁻²⋅I⁻²`


    typealias Permittivity = `L⁻³⋅M⁻¹⋅T⁴⋅I²`


    typealias PlaneAngle = `L`


    typealias Power = `L²⋅M⋅T⁻³`


    typealias Pressure = `L⁻¹⋅M⋅T⁻²`


    typealias Pop = `L⋅T⁻⁶`


    typealias RadioactiveActivity = `T⁻¹`


    typealias RadioactiveDose = `L²⋅T⁻²`


    typealias Radiance = `M⋅T⁻³`


    typealias RadiantIntensity = `L²⋅M⋅T⁻³`


    typealias ReactionRate = `L⁻³⋅T⁻¹⋅N`


    typealias RefractiveIndex = `L`


    typealias SolidAngle = `L`


    typealias Speed = `L⋅T⁻¹`


    typealias SpecificEnergy = `L²⋅T⁻²`


    typealias SpecificHeatCapacity = `L²⋅T⁻²⋅Θ⁻¹`


    typealias SpecificVolume = `L³⋅M⁻¹`


    typealias Spin = `L²⋅M⋅T⁻¹`


    typealias Strain = `L`


    typealias Stress = `L⁻¹⋅M⋅T⁻²`


    typealias SurfaceTension = `M⋅T⁻²`


    typealias ThermalConductivity = `L⋅M⋅T⁻³⋅Θ⁻¹`


    typealias Torque = `L²⋅M⋅T⁻²`


    typealias Velocity = `L⋅T⁻¹`


    typealias Volume = `L³`


    typealias Wavelength = `L`


    typealias Wavenumber = `L⁻¹`


    typealias Wavevector = `L⁻¹`


    typealias Weight = `L⋅M⋅T⁻²`


    typealias Work = `L²⋅M⋅T⁻²`


    typealias YoungsModulus = `L⁻¹⋅M⋅T⁻²`


    typealias LuminousEnergy = `T⋅J`


    typealias Luminance = `L⁻²⋅J`


    typealias LuminousEmittance = `L⁻²⋅J`


    typealias LuminousExposure = `L⁻²⋅T⋅J`


    typealias LuminousEnergyDensity = `L⁻³⋅T⋅J`


    typealias LuminousEfficacy = `L⁻²⋅M⁻¹⋅T³⋅J`


    typealias RadiantEnergy = `L²⋅M⋅T⁻²`


    typealias RadiantEnergyDensity = `L⁻¹⋅M⋅T⁻²`


    typealias RadiantFlux = `L²⋅M⋅T⁻³`


    typealias SpectralFlux = `L⋅M⋅T⁻³`


    typealias SpectralIntensity = `L⋅M⋅T⁻³`


    typealias SpectralIrradiance = `L⁻¹⋅M⋅T⁻³`


    typealias Radiosity = `M⋅T⁻³`


    typealias RadiantExitance = `M⋅T⁻³`


    typealias RadiantExposure = `M⋅T⁻²`


    val Number.FeetPerSecondSquared get() = `L⋅T⁻²`(d * 0.3048006096)
    val `L⋅T⁻²`.FeetPerSecondSquared get() = siValue * 3.2808333333464565


    val Number.EarthGravities get() = `L⋅T⁻²`(d * 9.81)
    val `L⋅T⁻²`.EarthGravities get() = siValue * 0.1019367991845056


    val Number.MetersPerSecondSquared get() = `L⋅T⁻²`(d * 1.0)
    val `L⋅T⁻²`.MetersPerSecondSquared get() = siValue * 1.0


    val Number.UsMilesPerHourSquared get() = `L⋅T⁻²`(d * 1.24E-4)
    val `L⋅T⁻²`.UsMilesPerHourSquared get() = siValue * 8064.516129032258


    val Number.Arcminutes get() = `L`(d * 2.91E-4)
    val `L`.Arcminutes get() = siValue * 3436.426116838488


    val Number.Arcseconds get() = `L`(d * 4.85E-6)
    val `L`.Arcseconds get() = siValue * 206185.56701030929


    val Number.Gradians get() = `L`(d * 0.01570796327)
    val `L`.Gradians get() = siValue * 63.66197722844561


    val Number.Radians get() = `L`(d * 1.0)
    val `L`.Radians get() = siValue * 1.0


    val Number.Turns get() = `L`(d * 6.28)
    val `L`.Turns get() = siValue * 0.1592356687898089


    val Number.Degrees get() = `L`(d * 0.0175)
    val `L`.Degrees get() = siValue * 57.14285714285714


    val Number.ArcminutesPerSecondSquared get() = `T⁻²`(d * 2.91E-4)
    val `T⁻²`.ArcminutesPerSecondSquared get() = siValue * 3436.426116838488


    val Number.ArcsecondsPerSecondSquared get() = `T⁻²`(d * 4.85E-6)
    val `T⁻²`.ArcsecondsPerSecondSquared get() = siValue * 206185.56701030929


    val Number.GradiansPerSecondSquared get() = `T⁻²`(d * 0.01570796327)
    val `T⁻²`.GradiansPerSecondSquared get() = siValue * 63.66197722844561


    val Number.RadiansPerSecondSquared get() = `T⁻²`(d * 1.0)
    val `T⁻²`.RadiansPerSecondSquared get() = siValue * 1.0


    val Number.TurnsPerSecondSquared get() = `T⁻²`(d * 6.28)
    val `T⁻²`.TurnsPerSecondSquared get() = siValue * 0.1592356687898089


    val Number.DegreesPerSecondSquared get() = `T⁻²`(d * 0.0175)
    val `T⁻²`.DegreesPerSecondSquared get() = siValue * 57.14285714285714


    val Number.GradiansPerSecond get() = `T⁻¹`(d * 0.0157)
    val `T⁻¹`.GradiansPerSecond get() = siValue * 63.69426751592357


    val Number.RadiansPerSecond get() = `T⁻¹`(d * 1.0)
    val `T⁻¹`.RadiansPerSecond get() = siValue * 1.0


    val Number.TurnsPerSecond get() = `T⁻¹`(d * 6.283185307)
    val `T⁻¹`.TurnsPerSecond get() = siValue * 0.15915494309644432


    val Number.DegreesPerSecond get() = `T⁻¹`(d * 0.0175)
    val `T⁻¹`.DegreesPerSecond get() = siValue * 57.14285714285714


    val Number.Acres get() = `L²`(d * 4050.0)
    val `L²`.Acres get() = siValue * 2.469135802469136E-4


    val Number.Barnes get() = `L²`(d * 1.0E-28)
    val `L²`.Barnes get() = siValue * 1.0E28


    val Number.SquareCentimeters get() = `L²`(d * 1.0E-4)
    val `L²`.SquareCentimeters get() = siValue * 10000.0


    val Number.SquareFeet get() = `L²`(d * 0.0929)
    val `L²`.SquareFeet get() = siValue * 10.764262648008613


    val Number.Hectares get() = `L²`(d * 10000.0)
    val `L²`.Hectares get() = siValue * 1.0E-4


    val Number.SquareInches get() = `L²`(d * 6.45E-4)
    val `L²`.SquareInches get() = siValue * 1550.387596899225


    val Number.SquareKilometers get() = `L²`(d * 1000000.0)
    val `L²`.SquareKilometers get() = siValue * 1.0E-6


    val Number.SquareUsMiles get() = `L²`(d * 2589988.11)
    val `L²`.SquareUsMiles get() = siValue * 3.86102158592535E-7


    val Number.SquareMeters get() = `L²`(d * 1.0)
    val `L²`.SquareMeters get() = siValue * 1.0


    val Number.SquareYards get() = `L²`(d * 0.83612736)
    val `L²`.SquareYards get() = siValue * 1.1959900463010802


    val Number.GramsPerSquareCentimeter get() = `L⁻²⋅M`(d * 10.0)
    val `L⁻²⋅M`.GramsPerSquareCentimeter get() = siValue * 0.1


    val Number.KilogramsPerHectare get() = `L⁻²⋅M`(d * 1.0E-4)
    val `L⁻²⋅M`.KilogramsPerHectare get() = siValue * 10000.0


    val Number.KilogramsPerSquareMeter get() = `L⁻²⋅M`(d * 1.0)
    val `L⁻²⋅M`.KilogramsPerSquareMeter get() = siValue * 1.0


    val Number.Farads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(d * 1.0)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Farads get() = siValue * 1.0


    val Number.Kilofarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(d * 1000.0)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Kilofarads get() = siValue * 0.001


    val Number.Millifarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(d * 0.001)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Millifarads get() = siValue * 1000.0


    val Number.Nanofarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(d * 1.0E-9)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Nanofarads get() = siValue * 9.999999999999999E8


    val Number.Picofarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(d * 1.0E-12)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Picofarads get() = siValue * 1.0E12


    val Number.Microfarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(d * 1.0E-6)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Microfarads get() = siValue * 1000000.0


    val Number.PoundMoles get() = `N`(d * 454.0)
    val `N`.PoundMoles get() = siValue * 0.0022026431718061676


    val Number.Moles get() = `N`(d * 1.0)
    val `N`.Moles get() = siValue * 1.0


    val Number.SiemensPerMeter get() = `L⁻³⋅M⁻¹⋅T³⋅I²`(d * 1.0)
    val `L⁻³⋅M⁻¹⋅T³⋅I²`.SiemensPerMeter get() = siValue * 1.0


    val Number.KilogramsPerCubicMeter get() = `L⁻³⋅M`(d * 1.0)
    val `L⁻³⋅M`.KilogramsPerCubicMeter get() = siValue * 1.0


    val Number.Percent get() = Dimensionless(d * 0.01)
    val Dimensionless.Percent get() = siValue * 100.0


    val Number.Dozen get() = Dimensionless(d * 12.0)
    val Dimensionless.Dozen get() = siValue * 0.08333333333333333


    val Number.Each get() = Dimensionless(d * 1.0)
    val Dimensionless.Each get() = siValue * 1.0


    val Number.Gross get() = Dimensionless(d * 144.0)
    val Dimensionless.Gross get() = siValue * 0.006944444444444444


    val Number.Score get() = Dimensionless(d * 20.0)
    val Dimensionless.Score get() = siValue * 0.05


    val Number.AmpereHours get() = `T⋅I`(d * 3600.0)
    val `T⋅I`.AmpereHours get() = siValue * 2.777777777777778E-4


    val Number.Coulombs get() = `T⋅I`(d * 1.0)
    val `T⋅I`.Coulombs get() = siValue * 1.0


    val Number.Abcoulombs get() = `T⋅I`(d * 10.0)
    val `T⋅I`.Abcoulombs get() = siValue * 0.1


    val Number.MilliampereHours get() = `T⋅I`(d * 3.6)
    val `T⋅I`.MilliampereHours get() = siValue * 0.2777777777777778


    val Number.MilliampereSeconds get() = `T⋅I`(d * 0.001)
    val `T⋅I`.MilliampereSeconds get() = siValue * 1000.0


    val Number.Millicoulombs get() = `T⋅I`(d * 0.001)
    val `T⋅I`.Millicoulombs get() = siValue * 1000.0


    val Number.Nanocoulombs get() = `T⋅I`(d * 1.0E-9)
    val `T⋅I`.Nanocoulombs get() = siValue * 9.999999999999999E8


    val Number.Picocoulombs get() = `T⋅I`(d * 1.0E-12)
    val `T⋅I`.Picocoulombs get() = siValue * 1.0E12


    val Number.Microcoulombs get() = `T⋅I`(d * 1.0E-6)
    val `T⋅I`.Microcoulombs get() = siValue * 1000000.0


    val Number.Amperes get() = `I`(d * 1.0)
    val `I`.Amperes get() = siValue * 1.0


    val Number.Milliamperes get() = `I`(d * 0.001)
    val `I`.Milliamperes get() = siValue * 1000.0


    val Number.Megavolts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(d * 1000000.0)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Megavolts get() = siValue * 1.0E-6


    val Number.Volts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(d * 1.0)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Volts get() = siValue * 1.0


    val Number.Kilovolts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(d * 1000.0)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Kilovolts get() = siValue * 0.001


    val Number.Millivolts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(d * 0.001)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Millivolts get() = siValue * 1000.0


    val Number.Microvolts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(d * 1.0E-6)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Microvolts get() = siValue * 1000000.0


    val Number.Siemens get() = `L⁻²⋅M⁻¹⋅T³⋅I²`(d * 1.0)
    val `L⁻²⋅M⁻¹⋅T³⋅I²`.Siemens get() = siValue * 1.0


    val Number.Gigohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(d * 1.0E9)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Gigohms get() = siValue * 1.0E-9


    val Number.Megohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(d * 1000000.0)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Megohms get() = siValue * 1.0E-6


    val Number.Kilohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(d * 1000.0)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Kilohms get() = siValue * 0.001


    val Number.Milliohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(d * 0.001)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Milliohms get() = siValue * 1000.0


    val Number.Nanohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(d * 1.0E-9)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Nanohms get() = siValue * 9.999999999999999E8


    val Number.Microohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(d * 1.0E-6)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Microohms get() = siValue * 1000000.0


    val Number.Ohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(d * 1.0)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Ohms get() = siValue * 1.0


    val Number.BritishThermalUnits get() = `L²⋅M⋅T⁻²`(d * 1060.0)
    val `L²⋅M⋅T⁻²`.BritishThermalUnits get() = siValue * 9.433962264150943E-4


    val Number.Gigajoules get() = `L²⋅M⋅T⁻²`(d * 1.0E9)
    val `L²⋅M⋅T⁻²`.Gigajoules get() = siValue * 1.0E-9


    val Number.GigawattHours get() = `L²⋅M⋅T⁻²`(d * 3.6E12)
    val `L²⋅M⋅T⁻²`.GigawattHours get() = siValue * 2.777777777777778E-13


    val Number.Joules get() = `L²⋅M⋅T⁻²`(d * 1.0)
    val `L²⋅M⋅T⁻²`.Joules get() = siValue * 1.0


    val Number.MBtus get() = `L²⋅M⋅T⁻²`(d * 1060000.0)
    val `L²⋅M⋅T⁻²`.MBtus get() = siValue * 9.433962264150943E-7


    val Number.Megajoules get() = `L²⋅M⋅T⁻²`(d * 1000000.0)
    val `L²⋅M⋅T⁻²`.Megajoules get() = siValue * 1.0E-6


    val Number.MMBtus get() = `L²⋅M⋅T⁻²`(d * 1.06E9)
    val `L²⋅M⋅T⁻²`.MMBtus get() = siValue * 9.433962264150944E-10


    val Number.MegawattHours get() = `L²⋅M⋅T⁻²`(d * 3.6E9)
    val `L²⋅M⋅T⁻²`.MegawattHours get() = siValue * 2.7777777777777777E-10


    val Number.Terajoules get() = `L²⋅M⋅T⁻²`(d * 1.0E12)
    val `L²⋅M⋅T⁻²`.Terajoules get() = siValue * 1.0E-12


    val Number.WattHours get() = `L²⋅M⋅T⁻²`(d * 3600.0)
    val `L²⋅M⋅T⁻²`.WattHours get() = siValue * 2.777777777777778E-4


    val Number.Ergs get() = `L²⋅M⋅T⁻²`(d * 1.0E-7)
    val `L²⋅M⋅T⁻²`.Ergs get() = siValue * 1.0E7


    val Number.Kilojoules get() = `L²⋅M⋅T⁻²`(d * 1000.0)
    val `L²⋅M⋅T⁻²`.Kilojoules get() = siValue * 0.001


    val Number.KilowattHours get() = `L²⋅M⋅T⁻²`(d * 3600000.0)
    val `L²⋅M⋅T⁻²`.KilowattHours get() = siValue * 2.7777777777777776E-7


    val Number.Millijoules get() = `L²⋅M⋅T⁻²`(d * 0.001)
    val `L²⋅M⋅T⁻²`.Millijoules get() = siValue * 1000.0


    val Number.Nanojoules get() = `L²⋅M⋅T⁻²`(d * 1.0E-9)
    val `L²⋅M⋅T⁻²`.Nanojoules get() = siValue * 9.999999999999999E8


    val Number.Picojoules get() = `L²⋅M⋅T⁻²`(d * 1.0E-12)
    val `L²⋅M⋅T⁻²`.Picojoules get() = siValue * 1.0E12


    val Number.Microjoules get() = `L²⋅M⋅T⁻²`(d * 1.0E-6)
    val `L²⋅M⋅T⁻²`.Microjoules get() = siValue * 1000000.0


    val Number.JoulesPerCubicMeter get() = `L⁻¹⋅M⋅T⁻²`(d * 1.0)
    val `L⁻¹⋅M⋅T⁻²`.JoulesPerCubicMeter get() = siValue * 1.0


    val Number.Newtons get() = `L⋅M⋅T⁻²`(d * 1.0)
    val `L⋅M⋅T⁻²`.Newtons get() = siValue * 1.0


    val Number.KilogramForce get() = `L⋅M⋅T⁻²`(d * 9.81)
    val `L⋅M⋅T⁻²`.KilogramForce get() = siValue * 0.1019367991845056


    val Number.PoundForce get() = `L⋅M⋅T⁻²`(d * 4.45)
    val `L⋅M⋅T⁻²`.PoundForce get() = siValue * 0.2247191011235955


    val Number.Gigahertz get() = `T⁻¹`(d * 1.0E9)
    val `T⁻¹`.Gigahertz get() = siValue * 1.0E-9


    val Number.Hertz get() = `T⁻¹`(d * 1.0)
    val `T⁻¹`.Hertz get() = siValue * 1.0


    val Number.Megahertz get() = `T⁻¹`(d * 1000000.0)
    val `T⁻¹`.Megahertz get() = siValue * 1.0E-6


    val Number.Terahertz get() = `T⁻¹`(d * 1.0E12)
    val `T⁻¹`.Terahertz get() = siValue * 1.0E-12


    val Number.Kilohertz get() = `T⁻¹`(d * 1000.0)
    val `T⁻¹`.Kilohertz get() = siValue * 0.001


    val Number.RevolutionsPerMinute get() = `T⁻¹`(d * 0.0167)
    val `T⁻¹`.RevolutionsPerMinute get() = siValue * 59.880239520958085


    val Number.Lux get() = `L⁻²⋅J`(d * 1.0)
    val `L⁻²⋅J`.Lux get() = siValue * 1.0


    val Number.Henry get() = `L²⋅M⋅T⁻²⋅I⁻²`(d * 1.0)
    val `L²⋅M⋅T⁻²⋅I⁻²`.Henry get() = siValue * 1.0


    val Number.WattsPerSquareMeter get() = `M⋅T⁻³`(d * 1.0)
    val `M⋅T⁻³`.WattsPerSquareMeter get() = siValue * 1.0


    val Number.ErgsPerSecondPerSquareCentimeter get() = `M⋅T⁻³`(d * 0.001)
    val `M⋅T⁻³`.ErgsPerSecondPerSquareCentimeter get() = siValue * 1000.0


    val Number.FeetPerSecondCubed get() = `L⋅T⁻³`(d * 0.3048006096)
    val `L⋅T⁻³`.FeetPerSecondCubed get() = siValue * 3.2808333333464565


    val Number.MetersPerSecondCubed get() = `L⋅T⁻³`(d * 1.0)
    val `L⋅T⁻³`.MetersPerSecondCubed get() = siValue * 1.0


    val Number.NominalSolarRadii get() = `L`(d * 6.96E8)
    val `L`.NominalSolarRadii get() = siValue * 1.4367816091954023E-9


    val Number.SolarRadii get() = `L`(d * 6.96E8)
    val `L`.SolarRadii get() = siValue * 1.4367816091954023E-9


    val Number.AstronomicalUnits get() = `L`(d * 1.5E11)
    val `L`.AstronomicalUnits get() = siValue * 6.666666666666666E-12


    val Number.Centimeters get() = `L`(d * 0.01)
    val `L`.Centimeters get() = siValue * 100.0


    val Number.Decameters get() = `L`(d * 10.0)
    val `L`.Decameters get() = siValue * 0.1


    val Number.Decimeters get() = `L`(d * 0.1)
    val `L`.Decimeters get() = siValue * 10.0


    val Number.Feet get() = `L`(d * 0.3048006096)
    val `L`.Feet get() = siValue * 3.2808333333464565


    val Number.Hectometers get() = `L`(d * 100.0)
    val `L`.Hectometers get() = siValue * 0.01


    val Number.Inches get() = `L`(d * 0.0254000508)
    val `L`.Inches get() = siValue * 39.37000000015748


    val Number.Kilometers get() = `L`(d * 1000.0)
    val `L`.Kilometers get() = siValue * 0.001


    val Number.LightYears get() = `L`(d * 9.46E15)
    val `L`.LightYears get() = siValue * 1.0570824524312897E-16


    val Number.Meters get() = `L`(d * 1.0)
    val `L`.Meters get() = siValue * 1.0


    val Number.UsMiles get() = `L`(d * 1609.347219)
    val `L`.UsMiles get() = siValue * 6.213699493769715E-4


    val Number.InternationalMiles get() = `L`(d * 1610.0)
    val `L`.InternationalMiles get() = siValue * 6.211180124223603E-4


    val Number.Millimeters get() = `L`(d * 0.001)
    val `L`.Millimeters get() = siValue * 1000.0


    val Number.Nanometers get() = `L`(d * 1.0E-9)
    val `L`.Nanometers get() = siValue * 9.999999999999999E8


    val Number.NauticalMiles get() = `L`(d * 1852.0)
    val `L`.NauticalMiles get() = siValue * 5.399568034557236E-4


    val Number.Parsecs get() = `L`(d * 3.09E16)
    val `L`.Parsecs get() = siValue * 3.2362459546925564E-17


    val Number.Yards get() = `L`(d * 0.9144018288)
    val `L`.Yards get() = siValue * 1.0936111111154856


    val Number.Microns get() = `L`(d * 1.0E-6)
    val `L`.Microns get() = siValue * 1000000.0


    val Number.Angstroms get() = `L`(d * 1.0E-10)
    val `L`.Angstroms get() = siValue * 1.0E10


    val Number.CandelasPerSquareMeter get() = `L⁻²⋅J`(d * 1.0)
    val `L⁻²⋅J`.CandelasPerSquareMeter get() = siValue * 1.0


    val Number.LumenSeconds get() = `T⋅J`(d * 1.0)
    val `T⋅J`.LumenSeconds get() = siValue * 1.0


    val Number.LuxSeconds get() = `L⁻²⋅T⋅J`(d * 1.0)
    val `L⁻²⋅T⋅J`.LuxSeconds get() = siValue * 1.0


    val Number.Lumens get() = `J`(d * 1.0)
    val `J`.Lumens get() = siValue * 1.0


    val Number.Candelas get() = `J`(d * 1.0)
    val `J`.Candelas get() = siValue * 1.0


    val Number.Webers get() = `L²⋅M⋅T⁻²⋅I⁻¹`(d * 1.0)
    val `L²⋅M⋅T⁻²⋅I⁻¹`.Webers get() = siValue * 1.0


    val Number.Gauss get() = `M⋅T⁻²⋅I⁻¹`(d * 1.0E-4)
    val `M⋅T⁻²⋅I⁻¹`.Gauss get() = siValue * 10000.0


    val Number.Teslas get() = `M⋅T⁻²⋅I⁻¹`(d * 1.0)
    val `M⋅T⁻²⋅I⁻¹`.Teslas get() = siValue * 1.0


    val Number.Megapounds get() = `M`(d * 453.59237)
    val `M`.Megapounds get() = siValue * 0.002204622621848776


    val Number.SolarMasses get() = `M`(d * 1.99E30)
    val `M`.SolarMasses get() = siValue * 5.025125628140703E-31


    val Number.Carats get() = `M`(d * 2.0E-4)
    val `M`.Carats get() = siValue * 5000.0


    val Number.Pennyweights get() = `M`(d * 0.00155517384)
    val `M`.Pennyweights get() = siValue * 643.0149313725595


    val Number.Grams get() = `M`(d * 0.001)
    val `M`.Grams get() = siValue * 1000.0


    val Number.TroyGrains get() = `M`(d * 6.48E-5)
    val `M`.TroyGrains get() = siValue * 15432.098765432098


    val Number.Kilograms get() = `M`(d * 1.0)
    val `M`.Kilograms get() = siValue * 1.0


    val Number.Kilopounds get() = `M`(d * 453.59237)
    val `M`.Kilopounds get() = siValue * 0.002204622621848776


    val Number.Pounds get() = `M`(d * 0.45359237)
    val `M`.Pounds get() = siValue * 2.2046226218487757


    val Number.TroyPounds get() = `M`(d * 0.373)
    val `M`.TroyPounds get() = siValue * 2.680965147453083


    val Number.Micrograms get() = `M`(d * 1.0E-9)
    val `M`.Micrograms get() = siValue * 9.999999999999999E8


    val Number.Milligrams get() = `M`(d * 1.0E-6)
    val `M`.Milligrams get() = siValue * 1000000.0


    val Number.Ounces get() = `M`(d * 0.0283)
    val `M`.Ounces get() = siValue * 35.3356890459364


    val Number.TroyOunces get() = `M`(d * 0.0311)
    val `M`.TroyOunces get() = siValue * 32.154340836012864


    val Number.Stone get() = `M`(d * 6.35029318)
    val `M`.Stone get() = siValue * 0.1574730444177697


    val Number.Tonnes get() = `M`(d * 1000.0)
    val `M`.Tonnes get() = siValue * 0.001


    val Number.Tolas get() = `M`(d * 0.0117)
    val `M`.Tolas get() = siValue * 85.47008547008546


    val Number.KilogramsMetersSquared get() = `L²⋅M`(d * 1.0)
    val `L²⋅M`.KilogramsMetersSquared get() = siValue * 1.0


    val Number.PoundsSquareFeet get() = `L²⋅M`(d * 42.1)
    val `L²⋅M`.PoundsSquareFeet get() = siValue * 0.023752969121140142


    val Number.NewtonSeconds get() = `L⋅M⋅T⁻¹`(d * 1.0)
    val `L⋅M⋅T⁻¹`.NewtonSeconds get() = siValue * 1.0


    val Number.BtusPerHour get() = `L²⋅M⋅T⁻³`(d * 0.2930710702)
    val `L²⋅M⋅T⁻³`.BtusPerHour get() = siValue * 3.4121416328045333


    val Number.Gigawatts get() = `L²⋅M⋅T⁻³`(d * 1.0E9)
    val `L²⋅M⋅T⁻³`.Gigawatts get() = siValue * 1.0E-9


    val Number.SolarLuminosities get() = `L²⋅M⋅T⁻³`(d * 3.83E26)
    val `L²⋅M⋅T⁻³`.SolarLuminosities get() = siValue * 2.6109660574412534E-27


    val Number.Megawatts get() = `L²⋅M⋅T⁻³`(d * 1000000.0)
    val `L²⋅M⋅T⁻³`.Megawatts get() = siValue * 1.0E-6


    val Number.Watts get() = `L²⋅M⋅T⁻³`(d * 1.0)
    val `L²⋅M⋅T⁻³`.Watts get() = siValue * 1.0


    val Number.ErgsPerSecond get() = `L²⋅M⋅T⁻³`(d * 1.0E-7)
    val `L²⋅M⋅T⁻³`.ErgsPerSecond get() = siValue * 1.0E7


    val Number.Kilowatts get() = `L²⋅M⋅T⁻³`(d * 1000.0)
    val `L²⋅M⋅T⁻³`.Kilowatts get() = siValue * 0.001


    val Number.Milliwatts get() = `L²⋅M⋅T⁻³`(d * 0.001)
    val `L²⋅M⋅T⁻³`.Milliwatts get() = siValue * 1000.0


    val Number.Pascals get() = `L⁻¹⋅M⋅T⁻²`(d * 1.0)
    val `L⁻¹⋅M⋅T⁻²`.Pascals get() = siValue * 1.0


    val Number.Torrs get() = `L⁻¹⋅M⋅T⁻²`(d * 133.0)
    val `L⁻¹⋅M⋅T⁻²`.Torrs get() = siValue * 0.007518796992481203


    val Number.StandardAtmospheres get() = `L⁻¹⋅M⋅T⁻²`(d * 101000.0)
    val `L⁻¹⋅M⋅T⁻²`.StandardAtmospheres get() = siValue * 9.900990099009901E-6


    val Number.Bars get() = `L⁻¹⋅M⋅T⁻²`(d * 100000.0)
    val `L⁻¹⋅M⋅T⁻²`.Bars get() = siValue * 1.0E-5


    val Number.MillimetersOfMercury get() = `L⁻¹⋅M⋅T⁻²`(d * 133.0)
    val `L⁻¹⋅M⋅T⁻²`.MillimetersOfMercury get() = siValue * 0.007518796992481203


    val Number.PoundsPerSquareInch get() = `L⁻¹⋅M⋅T⁻²`(d * 6890.0)
    val `L⁻¹⋅M⋅T⁻²`.PoundsPerSquareInch get() = siValue * 1.4513788098693758E-4


    val Number.WattsPerSteradianPerSquareMeter get() = `M⋅T⁻³`(d * 1.0)
    val `M⋅T⁻³`.WattsPerSteradianPerSquareMeter get() = siValue * 1.0


    val Number.WattsPerSteradian get() = `L²⋅M⋅T⁻³`(d * 1.0)
    val `L²⋅M⋅T⁻³`.WattsPerSteradian get() = siValue * 1.0


    val Number.OhmMeters get() = `L³⋅M⋅T⁻³⋅I⁻²`(d * 1.0)
    val `L³⋅M⋅T⁻³⋅I⁻²`.OhmMeters get() = siValue * 1.0


    val Number.SquaredRadians get() = `L`(d * 1.0)
    val `L`.SquaredRadians get() = siValue * 1.0


    val Number.Grays get() = `L²⋅T⁻²`(d * 1.0)
    val `L²⋅T⁻²`.Grays get() = siValue * 1.0


    val Number.WattsPerSteradianPerMeter get() = `L⋅M⋅T⁻³`(d * 1.0)
    val `L⋅M⋅T⁻³`.WattsPerSteradianPerMeter get() = siValue * 1.0


    val Number.WattsPerSquareMeterPerNanometer get() = `L⁻¹⋅M⋅T⁻³`(d * 1.0E9)
    val `L⁻¹⋅M⋅T⁻³`.WattsPerSquareMeterPerNanometer get() = siValue * 1.0E-9


    val Number.WattsPerSquareMeterPerMicron get() = `L⁻¹⋅M⋅T⁻³`(d * 1000000.0)
    val `L⁻¹⋅M⋅T⁻³`.WattsPerSquareMeterPerMicron get() = siValue * 1.0E-6


    val Number.WattsPerCubicMeter get() = `L⁻¹⋅M⋅T⁻³`(d * 1.0)
    val `L⁻¹⋅M⋅T⁻³`.WattsPerCubicMeter get() = siValue * 1.0


    val Number.ErgsPerSecondPerSquareCentimeterPerAngstrom get() = `L⁻¹⋅M⋅T⁻³`(d * 1.0E7)
    val `L⁻¹⋅M⋅T⁻³`.ErgsPerSecondPerSquareCentimeterPerAngstrom get() = siValue * 1.0E-7


    val Number.WattsPerMeter get() = `L⋅M⋅T⁻³`(d * 1.0)
    val `L⋅M⋅T⁻³`.WattsPerMeter get() = siValue * 1.0


    val Number.Celsius get() = `Θ`(d * 274.15)
    val `Θ`.Celsius get() = siValue * 0.0036476381542950944


    val Number.Fahrenheit get() = `Θ`(d * 255.9277778)
    val `Θ`.Fahrenheit get() = siValue * 0.003907352334303745


    val Number.Kelvin get() = `Θ`(d * 1.0)
    val `Θ`.Kelvin get() = siValue * 1.0


    val Number.Rankine get() = `Θ`(d * 0.556)
    val `Θ`.Rankine get() = siValue * 1.7985611510791366


    val Number.JoulesPerKelvin get() = `L²⋅M⋅T⁻²⋅Θ⁻¹`(d * 1.0)
    val `L²⋅M⋅T⁻²⋅Θ⁻¹`.JoulesPerKelvin get() = siValue * 1.0


    val Number.Days get() = `T`(d * 86400.0)
    val `T`.Days get() = siValue * 1.1574074074074073E-5


    val Number.Hours get() = `T`(d * 3600.0)
    val `T`.Hours get() = siValue * 2.777777777777778E-4


    val Number.Minutes get() = `T`(d * 60.0)
    val `T`.Minutes get() = siValue * 0.016666666666666666


    val Number.Milliseconds get() = `T`(d * 0.001)
    val `T`.Milliseconds get() = siValue * 1000.0


    val Number.Nanoseconds get() = `T`(d * 1.0E-9)
    val `T`.Nanoseconds get() = siValue * 9.999999999999999E8


    val Number.Seconds get() = `T`(d * 1.0)
    val `T`.Seconds get() = siValue * 1.0


    val Number.Microseconds get() = `T`(d * 1.0E-6)
    val `T`.Microseconds get() = siValue * 1000000.0


    val Number.NewtonMeters get() = `L²⋅M⋅T⁻²`(d * 1.0)
    val `L²⋅M⋅T⁻²`.NewtonMeters get() = siValue * 1.0


    val Number.PoundFeet get() = `L²⋅M⋅T⁻²`(d * 1.36)
    val `L²⋅M⋅T⁻²`.PoundFeet get() = siValue * 0.7352941176470588


    val Number.FeetPerSecond get() = `L⋅T⁻¹`(d * 0.3048006096)
    val `L⋅T⁻¹`.FeetPerSecond get() = siValue * 3.2808333333464565


    val Number.InternationalMilesPerHour get() = `L⋅T⁻¹`(d * 0.44704)
    val `L⋅T⁻¹`.InternationalMilesPerHour get() = siValue * 2.2369362920544025


    val Number.KilometersPerHour get() = `L⋅T⁻¹`(d * 0.278)
    val `L⋅T⁻¹`.KilometersPerHour get() = siValue * 3.597122302158273


    val Number.KilometersPerSecond get() = `L⋅T⁻¹`(d * 1000.0)
    val `L⋅T⁻¹`.KilometersPerSecond get() = siValue * 0.001


    val Number.Knots get() = `L⋅T⁻¹`(d * 0.514)
    val `L⋅T⁻¹`.Knots get() = siValue * 1.9455252918287937


    val Number.MetersPerSecond get() = `L⋅T⁻¹`(d * 1.0)
    val `L⋅T⁻¹`.MetersPerSecond get() = siValue * 1.0


    val Number.UsMilesPerHour get() = `L⋅T⁻¹`(d * 0.4470408941)
    val `L⋅T⁻¹`.UsMilesPerHour get() = siValue * 2.2369318180906888


    val Number.Litres get() = `L³`(d * 0.001)
    val `L³`.Litres get() = siValue * 1000.0


    val Number.AcreFeet get() = `L³`(d * 1230.0)
    val `L³`.AcreFeet get() = siValue * 8.130081300813008E-4


    val Number.UsCups get() = `L³`(d * 2.37E-4)
    val `L³`.UsCups get() = siValue * 4219.409282700422


    val Number.Centilitres get() = `L³`(d * 1.0E-5)
    val `L³`.Centilitres get() = siValue * 99999.99999999999


    val Number.Decilitres get() = `L³`(d * 1.0E-4)
    val `L³`.Decilitres get() = siValue * 10000.0


    val Number.CubicFeet get() = `L³`(d * 0.0283)
    val `L³`.CubicFeet get() = siValue * 35.3356890459364


    val Number.UsGallons get() = `L³`(d * 0.00379)
    val `L³`.UsGallons get() = siValue * 263.85224274406335


    val Number.Hectolitres get() = `L³`(d * 0.1)
    val `L³`.Hectolitres get() = siValue * 10.0


    val Number.CubicInches get() = `L³`(d * 1.64E-5)
    val `L³`.CubicInches get() = siValue * 60975.60975609757


    val Number.CubicUsMiles get() = `L³`(d * 4.17E9)
    val `L³`.CubicUsMiles get() = siValue * 2.398081534772182E-10


    val Number.Millilitres get() = `L³`(d * 1.0E-6)
    val `L³`.Millilitres get() = siValue * 1000000.0


    val Number.CubicMeters get() = `L³`(d * 1.0)
    val `L³`.CubicMeters get() = siValue * 1.0


    val Number.Nanolitres get() = `L³`(d * 1.0E-12)
    val `L³`.Nanolitres get() = siValue * 1.0E12


    val Number.FluidOunces get() = `L³`(d * 2.96E-5)
    val `L³`.FluidOunces get() = siValue * 33783.78378378378


    val Number.UsPints get() = `L³`(d * 4.73E-4)
    val `L³`.UsPints get() = siValue * 2114.164904862579


    val Number.UsQuarts get() = `L³`(d * 9.46E-4)
    val `L³`.UsQuarts get() = siValue * 1057.0824524312895


    val Number.Tablespoons get() = `L³`(d * 1.48E-5)
    val `L³`.Tablespoons get() = siValue * 67567.56756756756


    val Number.Teaspoons get() = `L³`(d * 4.93E-6)
    val `L³`.Teaspoons get() = siValue * 202839.75659229208


    val Number.CubicYards get() = `L³`(d * 0.765)
    val `L³`.CubicYards get() = siValue * 1.3071895424836601


    val Number.Microlitres get() = `L³`(d * 1.0E-9)
    val `L³`.Microlitres get() = siValue * 9.999999999999999E8

