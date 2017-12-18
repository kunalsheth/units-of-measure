@file:Suppress("DATA_CLASS_OVERRIDE_DEFAULT_VALUES_WARNING")

package info.kunalsheth.unitsofmeasure.generated

import java.io.Serializable

/**
 * Created by kunal on 8/6/17.
 */
interface Quantity<D : Quantity<D>> : Comparable<D>, Serializable {
    val siValue: Double

    operator fun unaryPlus() = this
    operator fun unaryMinus() = copy(-siValue)

    operator fun plus(that: D) = copy(this.siValue + that.siValue)
    operator fun minus(that: D) = copy(this.siValue - that.siValue)
    val abs get() = copy(Math.abs(siValue))

    fun copy(siValue: Double): D

    @Suppress("UNCHECKED_CAST")
    operator fun rangeTo(that: D) = object : ClosedRange<D> {
        override val start = (this@Quantity min that) as D
        override val endInclusive = (this@Quantity max that) as D
    }

    infix fun min(that: D) = if (this < that) this else that
    infix fun max(that: D) = if (this > that) this else that

    val signum get() = Math.signum(siValue)
    val isNegative: Boolean get() = siValue < 0
    val isPositive: Boolean get() = siValue > 0

    override fun compareTo(other: D) = this.siValue.compareTo(other.siValue)
}

private val Number.d get() = toDouble()

fun <N : Number, Q : Quantity<Q>> N.exa(f: Number.() -> Q) = f(d * 1000000000000000000)
fun <N : Number, Q : Quantity<Q>> Q.exa(f: Q.() -> N) = f().d / 1000000000000000000

fun <N : Number, Q : Quantity<Q>> N.peta(f: Number.() -> Q) = f(d * 1000000000000000)
fun <N : Number, Q : Quantity<Q>> Q.peta(f: Q.() -> N) = f().d / 1000000000000000

fun <N : Number, Q : Quantity<Q>> N.tera(f: Number.() -> Q) = f(d * 1000000000000)
fun <N : Number, Q : Quantity<Q>> Q.tera(f: Q.() -> N) = f().d / 1000000000000

fun <N : Number, Q : Quantity<Q>> N.giga(f: Number.() -> Q) = f(d * 1000000000)
fun <N : Number, Q : Quantity<Q>> Q.giga(f: Q.() -> N) = f().d / 1000000000

fun <N : Number, Q : Quantity<Q>> N.mega(f: Number.() -> Q) = f(d * 1000000)
fun <N : Number, Q : Quantity<Q>> Q.mega(f: Q.() -> N) = f().d / 1000000

fun <N : Number, Q : Quantity<Q>> N.kilo(f: Number.() -> Q) = f(d * 1000)
fun <N : Number, Q : Quantity<Q>> Q.kilo(f: Q.() -> N) = f().d / 1000

fun <N : Number, Q : Quantity<Q>> N.hecto(f: Number.() -> Q) = f(d * 100)
fun <N : Number, Q : Quantity<Q>> Q.hecto(f: Q.() -> N) = f().d / 100

fun <N : Number, Q : Quantity<Q>> N.deca(f: Number.() -> Q) = f(d * 10)
fun <N : Number, Q : Quantity<Q>> Q.deca(f: Q.() -> N) = f().d / 10

fun <N : Number, Q : Quantity<Q>> N.deci(f: Number.() -> Q) = f(d * 0.1)
fun <N : Number, Q : Quantity<Q>> Q.deci(f: Q.() -> N) = f().d / 0.1

fun <N : Number, Q : Quantity<Q>> N.centi(f: Number.() -> Q) = f(d * 0.01)
fun <N : Number, Q : Quantity<Q>> Q.centi(f: Q.() -> N) = f().d / 0.01

fun <N : Number, Q : Quantity<Q>> N.milli(f: Number.() -> Q) = f(d * 0.001)
fun <N : Number, Q : Quantity<Q>> Q.milli(f: Q.() -> N) = f().d / 0.001

fun <N : Number, Q : Quantity<Q>> N.micro(f: Number.() -> Q) = f(d * 0.000001)
fun <N : Number, Q : Quantity<Q>> Q.micro(f: Q.() -> N) = f().d / 0.000001

fun <N : Number, Q : Quantity<Q>> N.nano(f: Number.() -> Q) = f(d * 0.000000001)
fun <N : Number, Q : Quantity<Q>> Q.nano(f: Q.() -> N) = f().d / 0.000000001

fun <N : Number, Q : Quantity<Q>> N.pico(f: Number.() -> Q) = f(d * 0.000000000001)
fun <N : Number, Q : Quantity<Q>> Q.pico(f: Q.() -> N) = f().d / 0.000000000001

fun <N : Number, Q : Quantity<Q>> N.femto(f: Number.() -> Q) = f(d * 0.000000000000001)
fun <N : Number, Q : Quantity<Q>> Q.femto(f: Q.() -> N) = f().d / 0.000000000000001

fun <N : Number, Q : Quantity<Q>> N.atto(f: Number.() -> Q) = f(d * 0.000000000000000001)
fun <N : Number, Q : Quantity<Q>> Q.atto(f: Q.() -> N) = f().d / 0.000000000000000001

fun <N : Number, Q : Quantity<Q>> N.zepto(f: Number.() -> Q) = f(d * 0.000000000000000000001)
fun <N : Number, Q : Quantity<Q>> Q.zepto(f: Q.() -> N) = f().d / 0.000000000000000000001

fun <N : Number, Q : Quantity<Q>> N.yocto(f: Number.() -> Q) = f(d * 0.000000000000000000000001)
fun <N : Number, Q : Quantity<Q>> Q.yocto(f: Q.() -> N) = f().d / 0.000000000000000000000001

    data class L1M0T0I0Theta0N0J0(override val siValue: Double) : Quantity<L1M0T0I0Theta0N0J0>
    typealias `L` = L1M0T0I0Theta0N0J0


    data class L0M0T0I0Theta0N0J0(override val siValue: Double) : Quantity<L0M0T0I0Theta0N0J0>
    typealias Dimensionless = L0M0T0I0Theta0N0J0


    data class L2M0T0I0Theta0N0J0(override val siValue: Double) : Quantity<L2M0T0I0Theta0N0J0>
    typealias `L²` = L2M0T0I0Theta0N0J0


    data class L0M0T1I0Theta0N0J0(override val siValue: Double) : Quantity<L0M0T1I0Theta0N0J0>
    typealias `T` = L0M0T1I0Theta0N0J0


    data class L1M0I0Theta0N0J0_per_T1(override val siValue: Double) : Quantity<L1M0I0Theta0N0J0_per_T1>
    typealias `L⋅T⁻¹` = L1M0I0Theta0N0J0_per_T1


    data class L1M0T1I0Theta0N0J0(override val siValue: Double) : Quantity<L1M0T1I0Theta0N0J0>
    typealias `L⋅T` = L1M0T1I0Theta0N0J0


    data class M0T1I0Theta0N0J0_per_L1(override val siValue: Double) : Quantity<M0T1I0Theta0N0J0_per_L1>
    typealias `L⁻¹⋅T` = M0T1I0Theta0N0J0_per_L1


    data class L0M0T2I0Theta0N0J0(override val siValue: Double) : Quantity<L0M0T2I0Theta0N0J0>
    typealias `T²` = L0M0T2I0Theta0N0J0


    data class L2M0I0Theta0N0J0_per_T2(override val siValue: Double) : Quantity<L2M0I0Theta0N0J0_per_T2>
    typealias `L²⋅T⁻²` = L2M0I0Theta0N0J0_per_T2


    data class L1M0I0Theta0N0J0_per_T2(override val siValue: Double) : Quantity<L1M0I0Theta0N0J0_per_T2>
    typealias `L⋅T⁻²` = L1M0I0Theta0N0J0_per_T2


    data class L2M0I0Theta0N0J0_per_T3(override val siValue: Double) : Quantity<L2M0I0Theta0N0J0_per_T3>
    typealias `L²⋅T⁻³` = L2M0I0Theta0N0J0_per_T3


    data class L0M0I0Theta0N0J0_per_T1(override val siValue: Double) : Quantity<L0M0I0Theta0N0J0_per_T1>
    typealias `T⁻¹` = L0M0I0Theta0N0J0_per_T1


    data class L2M0I0Theta0N0J0_per_T4(override val siValue: Double) : Quantity<L2M0I0Theta0N0J0_per_T4>
    typealias `L²⋅T⁻⁴` = L2M0I0Theta0N0J0_per_T4


    data class L0M1T0I0Theta0N0J0(override val siValue: Double) : Quantity<L0M1T0I0Theta0N0J0>
    typealias `M` = L0M1T0I0Theta0N0J0


    data class L0M0T0I1Theta0N0J0(override val siValue: Double) : Quantity<L0M0T0I1Theta0N0J0>
    typealias `I` = L0M0T0I1Theta0N0J0


    data class L0M0T0I0Theta1N0J0(override val siValue: Double) : Quantity<L0M0T0I0Theta1N0J0>
    typealias `Θ` = L0M0T0I0Theta1N0J0


    data class L0M0T0I0Theta0N1J0(override val siValue: Double) : Quantity<L0M0T0I0Theta0N1J0>
    typealias `N` = L0M0T0I0Theta0N1J0


    data class L0M0T0I0Theta0N0J1(override val siValue: Double) : Quantity<L0M0T0I0Theta0N0J1>
    typealias `J` = L0M0T0I0Theta0N0J1


    data class L0M0I0Theta0N0J0_per_T2(override val siValue: Double) : Quantity<L0M0I0Theta0N0J0_per_T2>
    typealias `T⁻²` = L0M0I0Theta0N0J0_per_T2


    data class L2M1I0Theta0N0J0_per_T1(override val siValue: Double) : Quantity<L2M1I0Theta0N0J0_per_T1>
    typealias `L²⋅M⋅T⁻¹` = L2M1I0Theta0N0J0_per_T1


    data class M1T0I0Theta0N0J0_per_L2(override val siValue: Double) : Quantity<M1T0I0Theta0N0J0_per_L2>
    typealias `L⁻²⋅M` = M1T0I0Theta0N0J0_per_L2


    data class T4I2Theta0N0J0_per_L2M1(override val siValue: Double) : Quantity<T4I2Theta0N0J0_per_L2M1>
    typealias `L⁻²⋅M⁻¹⋅T⁴⋅I²` = T4I2Theta0N0J0_per_L2M1


    data class L0M0I0Theta0N1J0_per_T1(override val siValue: Double) : Quantity<L0M0I0Theta0N1J0_per_T1>
    typealias `T⁻¹⋅N` = L0M0I0Theta0N1J0_per_T1


    data class M0I0Theta0N1J0_per_L3T1(override val siValue: Double) : Quantity<M0I0Theta0N1J0_per_L3T1>
    typealias `L⁻³⋅T⁻¹⋅N` = M0I0Theta0N1J0_per_L3T1


    data class L2M1I0Theta0J0_per_T2N1(override val siValue: Double) : Quantity<L2M1I0Theta0J0_per_T2N1>
    typealias `L²⋅M⋅T⁻²⋅N⁻¹` = L2M1I0Theta0J0_per_T2N1


    data class L1M0I0Theta0N0J0_per_T5(override val siValue: Double) : Quantity<L1M0I0Theta0N0J0_per_T5>
    typealias `L⋅T⁻⁵` = L1M0I0Theta0N0J0_per_T5


    data class M0T0I1Theta0N0J0_per_L2(override val siValue: Double) : Quantity<M0T0I1Theta0N0J0_per_L2>
    typealias `L⁻²⋅I` = M0T0I1Theta0N0J0_per_L2


    data class M1I0Theta0N0J0_per_L1T1(override val siValue: Double) : Quantity<M1I0Theta0N0J0_per_L1T1>
    typealias `L⁻¹⋅M⋅T⁻¹` = M1I0Theta0N0J0_per_L1T1


    data class L0M0T1I1Theta0N0J0(override val siValue: Double) : Quantity<L0M0T1I1Theta0N0J0>
    typealias `T⋅I` = L0M0T1I1Theta0N0J0


    data class M0T1I1Theta0N0J0_per_L3(override val siValue: Double) : Quantity<M0T1I1Theta0N0J0_per_L3>
    typealias `L⁻³⋅T⋅I` = M0T1I1Theta0N0J0_per_L3


    data class M0T1I1Theta0N0J0_per_L2(override val siValue: Double) : Quantity<M0T1I1Theta0N0J0_per_L2>
    typealias `L⁻²⋅T⋅I` = M0T1I1Theta0N0J0_per_L2


    data class L1M1Theta0N0J0_per_T3I1(override val siValue: Double) : Quantity<L1M1Theta0N0J0_per_T3I1>
    typealias `L⋅M⋅T⁻³⋅I⁻¹` = L1M1Theta0N0J0_per_T3I1


    data class T3I2Theta0N0J0_per_L2M1(override val siValue: Double) : Quantity<T3I2Theta0N0J0_per_L2M1>
    typealias `L⁻²⋅M⁻¹⋅T³⋅I²` = T3I2Theta0N0J0_per_L2M1


    data class T3I2Theta0N0J0_per_L3M1(override val siValue: Double) : Quantity<T3I2Theta0N0J0_per_L3M1>
    typealias `L⁻³⋅M⁻¹⋅T³⋅I²` = T3I2Theta0N0J0_per_L3M1


    data class L2M1Theta0N0J0_per_T3I1(override val siValue: Double) : Quantity<L2M1Theta0N0J0_per_T3I1>
    typealias `L²⋅M⋅T⁻³⋅I⁻¹` = L2M1Theta0N0J0_per_T3I1


    data class L2M1Theta0N0J0_per_T3I2(override val siValue: Double) : Quantity<L2M1Theta0N0J0_per_T3I2>
    typealias `L²⋅M⋅T⁻³⋅I⁻²` = L2M1Theta0N0J0_per_T3I2


    data class L3M1Theta0N0J0_per_T3I2(override val siValue: Double) : Quantity<L3M1Theta0N0J0_per_T3I2>
    typealias `L³⋅M⋅T⁻³⋅I⁻²` = L3M1Theta0N0J0_per_T3I2


    data class L2M1I0Theta0N0J0_per_T2(override val siValue: Double) : Quantity<L2M1I0Theta0N0J0_per_T2>
    typealias `L²⋅M⋅T⁻²` = L2M1I0Theta0N0J0_per_T2


    data class M1I0Theta0N0J0_per_L1T2(override val siValue: Double) : Quantity<M1I0Theta0N0J0_per_L1T2>
    typealias `L⁻¹⋅M⋅T⁻²` = M1I0Theta0N0J0_per_L1T2


    data class L2M1I0N0J0_per_T2Theta1(override val siValue: Double) : Quantity<L2M1I0N0J0_per_T2Theta1>
    typealias `L²⋅M⋅T⁻²⋅Θ⁻¹` = L2M1I0N0J0_per_T2Theta1


    data class L1M1I0Theta0N0J0_per_T2(override val siValue: Double) : Quantity<L1M1I0Theta0N0J0_per_T2>
    typealias `L⋅M⋅T⁻²` = L1M1I0Theta0N0J0_per_T2


    data class M0T0I0Theta0N0J0_per_L2(override val siValue: Double) : Quantity<M0T0I0Theta0N0J0_per_L2>
    typealias `L⁻²` = M0T0I0Theta0N0J0_per_L2


    data class L0M1I0Theta0N0J0_per_T3(override val siValue: Double) : Quantity<L0M1I0Theta0N0J0_per_T3>
    typealias `M⋅T⁻³` = L0M1I0Theta0N0J0_per_T3


    data class M0T0I0Theta0N0J1_per_L2(override val siValue: Double) : Quantity<M0T0I0Theta0N0J1_per_L2>
    typealias `L⁻²⋅J` = M0T0I0Theta0N0J1_per_L2


    data class L1M1I0Theta0N0J0_per_T1(override val siValue: Double) : Quantity<L1M1I0Theta0N0J0_per_T1>
    typealias `L⋅M⋅T⁻¹` = L1M1I0Theta0N0J0_per_T1


    data class L2M1Theta0N0J0_per_T2I2(override val siValue: Double) : Quantity<L2M1Theta0N0J0_per_T2I2>
    typealias `L²⋅M⋅T⁻²⋅I⁻²` = L2M1Theta0N0J0_per_T2I2


    data class L1M0I0Theta0N0J0_per_T3(override val siValue: Double) : Quantity<L1M0I0Theta0N0J0_per_T3>
    typealias `L⋅T⁻³` = L1M0I0Theta0N0J0_per_T3


    data class L1M0I0Theta0N0J0_per_T4(override val siValue: Double) : Quantity<L1M0I0Theta0N0J0_per_T4>
    typealias `L⋅T⁻⁴` = L1M0I0Theta0N0J0_per_T4


    data class M1T0I0Theta0N0J0_per_L1(override val siValue: Double) : Quantity<M1T0I0Theta0N0J0_per_L1>
    typealias `L⁻¹⋅M` = M1T0I0Theta0N0J0_per_L1


    data class M0T0I1Theta0N0J0_per_L1(override val siValue: Double) : Quantity<M0T0I1Theta0N0J0_per_L1>
    typealias `L⁻¹⋅I` = M0T0I1Theta0N0J0_per_L1


    data class L2M1Theta0N0J0_per_T2I1(override val siValue: Double) : Quantity<L2M1Theta0N0J0_per_T2I1>
    typealias `L²⋅M⋅T⁻²⋅I⁻¹` = L2M1Theta0N0J0_per_T2I1


    data class L0M1Theta0N0J0_per_T2I1(override val siValue: Double) : Quantity<L0M1Theta0N0J0_per_T2I1>
    typealias `M⋅T⁻²⋅I⁻¹` = L0M1Theta0N0J0_per_T2I1


    data class M1T0I0Theta0N0J0_per_L3(override val siValue: Double) : Quantity<M1T0I0Theta0N0J0_per_L3>
    typealias `L⁻³⋅M` = M1T0I0Theta0N0J0_per_L3


    data class M0T0I0Theta0N1J0_per_L3(override val siValue: Double) : Quantity<M0T0I0Theta0N1J0_per_L3>
    typealias `L⁻³⋅N` = M0T0I0Theta0N1J0_per_L3


    data class L2M1I0J0_per_T2Theta1N1(override val siValue: Double) : Quantity<L2M1I0J0_per_T2Theta1N1>
    typealias `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹` = L2M1I0J0_per_T2Theta1N1


    data class L2M1T0I0Theta0N0J0(override val siValue: Double) : Quantity<L2M1T0I0Theta0N0J0>
    typealias `L²⋅M` = L2M1T0I0Theta0N0J0


    data class L1M1Theta0N0J0_per_T2I2(override val siValue: Double) : Quantity<L1M1Theta0N0J0_per_T2I2>
    typealias `L⋅M⋅T⁻²⋅I⁻²` = L1M1Theta0N0J0_per_T2I2


    data class T4I2Theta0N0J0_per_L3M1(override val siValue: Double) : Quantity<T4I2Theta0N0J0_per_L3M1>
    typealias `L⁻³⋅M⁻¹⋅T⁴⋅I²` = T4I2Theta0N0J0_per_L3M1


    data class L2M1I0Theta0N0J0_per_T3(override val siValue: Double) : Quantity<L2M1I0Theta0N0J0_per_T3>
    typealias `L²⋅M⋅T⁻³` = L2M1I0Theta0N0J0_per_T3


    data class L1M0I0Theta0N0J0_per_T6(override val siValue: Double) : Quantity<L1M0I0Theta0N0J0_per_T6>
    typealias `L⋅T⁻⁶` = L1M0I0Theta0N0J0_per_T6


    data class L2M0I0N0J0_per_T2Theta1(override val siValue: Double) : Quantity<L2M0I0N0J0_per_T2Theta1>
    typealias `L²⋅T⁻²⋅Θ⁻¹` = L2M0I0N0J0_per_T2Theta1


    data class L3T0I0Theta0N0J0_per_M1(override val siValue: Double) : Quantity<L3T0I0Theta0N0J0_per_M1>
    typealias `L³⋅M⁻¹` = L3T0I0Theta0N0J0_per_M1


    data class L0M1I0Theta0N0J0_per_T2(override val siValue: Double) : Quantity<L0M1I0Theta0N0J0_per_T2>
    typealias `M⋅T⁻²` = L0M1I0Theta0N0J0_per_T2


    data class L1M1I0N0J0_per_T3Theta1(override val siValue: Double) : Quantity<L1M1I0N0J0_per_T3Theta1>
    typealias `L⋅M⋅T⁻³⋅Θ⁻¹` = L1M1I0N0J0_per_T3Theta1


    data class L3M0T0I0Theta0N0J0(override val siValue: Double) : Quantity<L3M0T0I0Theta0N0J0>
    typealias `L³` = L3M0T0I0Theta0N0J0


    data class M0T0I0Theta0N0J0_per_L1(override val siValue: Double) : Quantity<M0T0I0Theta0N0J0_per_L1>
    typealias `L⁻¹` = M0T0I0Theta0N0J0_per_L1


    data class L0M0T1I0Theta0N0J1(override val siValue: Double) : Quantity<L0M0T1I0Theta0N0J1>
    typealias `T⋅J` = L0M0T1I0Theta0N0J1


    data class M0T1I0Theta0N0J1_per_L2(override val siValue: Double) : Quantity<M0T1I0Theta0N0J1_per_L2>
    typealias `L⁻²⋅T⋅J` = M0T1I0Theta0N0J1_per_L2


    data class M0T1I0Theta0N0J1_per_L3(override val siValue: Double) : Quantity<M0T1I0Theta0N0J1_per_L3>
    typealias `L⁻³⋅T⋅J` = M0T1I0Theta0N0J1_per_L3


    data class T3I0Theta0N0J1_per_L2M1(override val siValue: Double) : Quantity<T3I0Theta0N0J1_per_L2M1>
    typealias `L⁻²⋅M⁻¹⋅T³⋅J` = T3I0Theta0N0J1_per_L2M1


    data class L1M1I0Theta0N0J0_per_T3(override val siValue: Double) : Quantity<L1M1I0Theta0N0J0_per_T3>
    typealias `L⋅M⋅T⁻³` = L1M1I0Theta0N0J0_per_T3


    data class M1I0Theta0N0J0_per_L1T3(override val siValue: Double) : Quantity<M1I0Theta0N0J0_per_L1T3>
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


    val Number.FeetPerSecondSquared get() = `L⋅T⁻²`(this.toDouble() * 0.3048006096)
    val `L⋅T⁻²`.FeetPerSecondSquared get() = siValue / 0.3048006096


    val Number.EarthGravities get() = `L⋅T⁻²`(this.toDouble() * 9.81)
    val `L⋅T⁻²`.EarthGravities get() = siValue / 9.81


    val Number.MetersPerSecondSquared get() = `L⋅T⁻²`(this.toDouble() * 1.0)
    val `L⋅T⁻²`.MetersPerSecondSquared get() = siValue / 1.0


    val Number.UsMilesPerHourSquared get() = `L⋅T⁻²`(this.toDouble() * 1.24E-4)
    val `L⋅T⁻²`.UsMilesPerHourSquared get() = siValue / 1.24E-4


    val Number.Arcminutes get() = `L`(this.toDouble() * 2.91E-4)
    val `L`.Arcminutes get() = siValue / 2.91E-4


    val Number.Arcseconds get() = `L`(this.toDouble() * 4.85E-6)
    val `L`.Arcseconds get() = siValue / 4.85E-6


    val Number.Gradians get() = `L`(this.toDouble() * 0.01570796327)
    val `L`.Gradians get() = siValue / 0.01570796327


    val Number.Radians get() = `L`(this.toDouble() * 1.0)
    val `L`.Radians get() = siValue / 1.0


    val Number.Turns get() = `L`(this.toDouble() * 6.28)
    val `L`.Turns get() = siValue / 6.28


    val Number.Degrees get() = `L`(this.toDouble() * 0.0175)
    val `L`.Degrees get() = siValue / 0.0175


    val Number.ArcminutesPerSecondSquared get() = `T⁻²`(this.toDouble() * 2.91E-4)
    val `T⁻²`.ArcminutesPerSecondSquared get() = siValue / 2.91E-4


    val Number.ArcsecondsPerSecondSquared get() = `T⁻²`(this.toDouble() * 4.85E-6)
    val `T⁻²`.ArcsecondsPerSecondSquared get() = siValue / 4.85E-6


    val Number.GradiansPerSecondSquared get() = `T⁻²`(this.toDouble() * 0.01570796327)
    val `T⁻²`.GradiansPerSecondSquared get() = siValue / 0.01570796327


    val Number.RadiansPerSecondSquared get() = `T⁻²`(this.toDouble() * 1.0)
    val `T⁻²`.RadiansPerSecondSquared get() = siValue / 1.0


    val Number.TurnsPerSecondSquared get() = `T⁻²`(this.toDouble() * 6.28)
    val `T⁻²`.TurnsPerSecondSquared get() = siValue / 6.28


    val Number.DegreesPerSecondSquared get() = `T⁻²`(this.toDouble() * 0.0175)
    val `T⁻²`.DegreesPerSecondSquared get() = siValue / 0.0175


    val Number.GradiansPerSecond get() = `T⁻¹`(this.toDouble() * 0.0157)
    val `T⁻¹`.GradiansPerSecond get() = siValue / 0.0157


    val Number.RadiansPerSecond get() = `T⁻¹`(this.toDouble() * 1.0)
    val `T⁻¹`.RadiansPerSecond get() = siValue / 1.0


    val Number.TurnsPerSecond get() = `T⁻¹`(this.toDouble() * 6.283185307)
    val `T⁻¹`.TurnsPerSecond get() = siValue / 6.283185307


    val Number.DegreesPerSecond get() = `T⁻¹`(this.toDouble() * 0.0175)
    val `T⁻¹`.DegreesPerSecond get() = siValue / 0.0175


    val Number.Acres get() = `L²`(this.toDouble() * 4050.0)
    val `L²`.Acres get() = siValue / 4050.0


    val Number.Barnes get() = `L²`(this.toDouble() * 1.0E-28)
    val `L²`.Barnes get() = siValue / 1.0E-28


    val Number.SquareCentimeters get() = `L²`(this.toDouble() * 1.0E-4)
    val `L²`.SquareCentimeters get() = siValue / 1.0E-4


    val Number.SquareFeet get() = `L²`(this.toDouble() * 0.0929)
    val `L²`.SquareFeet get() = siValue / 0.0929


    val Number.Hectares get() = `L²`(this.toDouble() * 10000.0)
    val `L²`.Hectares get() = siValue / 10000.0


    val Number.SquareInches get() = `L²`(this.toDouble() * 6.45E-4)
    val `L²`.SquareInches get() = siValue / 6.45E-4


    val Number.SquareKilometers get() = `L²`(this.toDouble() * 1000000.0)
    val `L²`.SquareKilometers get() = siValue / 1000000.0


    val Number.SquareUsMiles get() = `L²`(this.toDouble() * 2589988.11)
    val `L²`.SquareUsMiles get() = siValue / 2589988.11


    val Number.SquareMeters get() = `L²`(this.toDouble() * 1.0)
    val `L²`.SquareMeters get() = siValue / 1.0


    val Number.SquareYards get() = `L²`(this.toDouble() * 0.83612736)
    val `L²`.SquareYards get() = siValue / 0.83612736


    val Number.GramsPerSquareCentimeter get() = `L⁻²⋅M`(this.toDouble() * 10.0)
    val `L⁻²⋅M`.GramsPerSquareCentimeter get() = siValue / 10.0


    val Number.KilogramsPerHectare get() = `L⁻²⋅M`(this.toDouble() * 1.0E-4)
    val `L⁻²⋅M`.KilogramsPerHectare get() = siValue / 1.0E-4


    val Number.KilogramsPerSquareMeter get() = `L⁻²⋅M`(this.toDouble() * 1.0)
    val `L⁻²⋅M`.KilogramsPerSquareMeter get() = siValue / 1.0


    val Number.Farads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.toDouble() * 1.0)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Farads get() = siValue / 1.0


    val Number.Kilofarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.toDouble() * 1000.0)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Kilofarads get() = siValue / 1000.0


    val Number.Millifarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.toDouble() * 0.001)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Millifarads get() = siValue / 0.001


    val Number.Nanofarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.toDouble() * 1.0E-9)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Nanofarads get() = siValue / 1.0E-9


    val Number.Picofarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.toDouble() * 1.0E-12)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Picofarads get() = siValue / 1.0E-12


    val Number.Microfarads get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.toDouble() * 1.0E-6)
    val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.Microfarads get() = siValue / 1.0E-6


    val Number.PoundMoles get() = `N`(this.toDouble() * 454.0)
    val `N`.PoundMoles get() = siValue / 454.0


    val Number.Moles get() = `N`(this.toDouble() * 1.0)
    val `N`.Moles get() = siValue / 1.0


    val Number.SiemensPerMeter get() = `L⁻³⋅M⁻¹⋅T³⋅I²`(this.toDouble() * 1.0)
    val `L⁻³⋅M⁻¹⋅T³⋅I²`.SiemensPerMeter get() = siValue / 1.0


    val Number.KilogramsPerCubicMeter get() = `L⁻³⋅M`(this.toDouble() * 1.0)
    val `L⁻³⋅M`.KilogramsPerCubicMeter get() = siValue / 1.0


    val Number.Percent get() = Dimensionless(this.toDouble() * 0.01)
    val Dimensionless.Percent get() = siValue / 0.01


    val Number.Dozen get() = Dimensionless(this.toDouble() * 12.0)
    val Dimensionless.Dozen get() = siValue / 12.0


    val Number.Each get() = Dimensionless(this.toDouble() * 1.0)
    val Dimensionless.Each get() = siValue / 1.0


    val Number.Gross get() = Dimensionless(this.toDouble() * 144.0)
    val Dimensionless.Gross get() = siValue / 144.0


    val Number.Score get() = Dimensionless(this.toDouble() * 20.0)
    val Dimensionless.Score get() = siValue / 20.0


    val Number.AmpereHours get() = `T⋅I`(this.toDouble() * 3600.0)
    val `T⋅I`.AmpereHours get() = siValue / 3600.0


    val Number.Coulombs get() = `T⋅I`(this.toDouble() * 1.0)
    val `T⋅I`.Coulombs get() = siValue / 1.0


    val Number.Abcoulombs get() = `T⋅I`(this.toDouble() * 10.0)
    val `T⋅I`.Abcoulombs get() = siValue / 10.0


    val Number.MilliampereHours get() = `T⋅I`(this.toDouble() * 3.6)
    val `T⋅I`.MilliampereHours get() = siValue / 3.6


    val Number.MilliampereSeconds get() = `T⋅I`(this.toDouble() * 0.001)
    val `T⋅I`.MilliampereSeconds get() = siValue / 0.001


    val Number.Millicoulombs get() = `T⋅I`(this.toDouble() * 0.001)
    val `T⋅I`.Millicoulombs get() = siValue / 0.001


    val Number.Nanocoulombs get() = `T⋅I`(this.toDouble() * 1.0E-9)
    val `T⋅I`.Nanocoulombs get() = siValue / 1.0E-9


    val Number.Picocoulombs get() = `T⋅I`(this.toDouble() * 1.0E-12)
    val `T⋅I`.Picocoulombs get() = siValue / 1.0E-12


    val Number.Microcoulombs get() = `T⋅I`(this.toDouble() * 1.0E-6)
    val `T⋅I`.Microcoulombs get() = siValue / 1.0E-6


    val Number.Amperes get() = `I`(this.toDouble() * 1.0)
    val `I`.Amperes get() = siValue / 1.0


    val Number.Milliamperes get() = `I`(this.toDouble() * 0.001)
    val `I`.Milliamperes get() = siValue / 0.001


    val Number.Megavolts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(this.toDouble() * 1000000.0)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Megavolts get() = siValue / 1000000.0


    val Number.Volts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Volts get() = siValue / 1.0


    val Number.Kilovolts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(this.toDouble() * 1000.0)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Kilovolts get() = siValue / 1000.0


    val Number.Millivolts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(this.toDouble() * 0.001)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Millivolts get() = siValue / 0.001


    val Number.Microvolts get() = `L²⋅M⋅T⁻³⋅I⁻¹`(this.toDouble() * 1.0E-6)
    val `L²⋅M⋅T⁻³⋅I⁻¹`.Microvolts get() = siValue / 1.0E-6


    val Number.Siemens get() = `L⁻²⋅M⁻¹⋅T³⋅I²`(this.toDouble() * 1.0)
    val `L⁻²⋅M⁻¹⋅T³⋅I²`.Siemens get() = siValue / 1.0


    val Number.Gigohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(this.toDouble() * 1.0E9)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Gigohms get() = siValue / 1.0E9


    val Number.Megohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(this.toDouble() * 1000000.0)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Megohms get() = siValue / 1000000.0


    val Number.Kilohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(this.toDouble() * 1000.0)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Kilohms get() = siValue / 1000.0


    val Number.Milliohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(this.toDouble() * 0.001)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Milliohms get() = siValue / 0.001


    val Number.Nanohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(this.toDouble() * 1.0E-9)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Nanohms get() = siValue / 1.0E-9


    val Number.Microohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(this.toDouble() * 1.0E-6)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Microohms get() = siValue / 1.0E-6


    val Number.Ohms get() = `L²⋅M⋅T⁻³⋅I⁻²`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻³⋅I⁻²`.Ohms get() = siValue / 1.0


    val Number.BritishThermalUnits get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1060.0)
    val `L²⋅M⋅T⁻²`.BritishThermalUnits get() = siValue / 1060.0


    val Number.Gigajoules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.0E9)
    val `L²⋅M⋅T⁻²`.Gigajoules get() = siValue / 1.0E9


    val Number.GigawattHours get() = `L²⋅M⋅T⁻²`(this.toDouble() * 3.6E12)
    val `L²⋅M⋅T⁻²`.GigawattHours get() = siValue / 3.6E12


    val Number.Joules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻²`.Joules get() = siValue / 1.0


    val Number.MBtus get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1060000.0)
    val `L²⋅M⋅T⁻²`.MBtus get() = siValue / 1060000.0


    val Number.Megajoules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1000000.0)
    val `L²⋅M⋅T⁻²`.Megajoules get() = siValue / 1000000.0


    val Number.MMBtus get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.06E9)
    val `L²⋅M⋅T⁻²`.MMBtus get() = siValue / 1.06E9


    val Number.MegawattHours get() = `L²⋅M⋅T⁻²`(this.toDouble() * 3.6E9)
    val `L²⋅M⋅T⁻²`.MegawattHours get() = siValue / 3.6E9


    val Number.Terajoules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.0E12)
    val `L²⋅M⋅T⁻²`.Terajoules get() = siValue / 1.0E12


    val Number.WattHours get() = `L²⋅M⋅T⁻²`(this.toDouble() * 3600.0)
    val `L²⋅M⋅T⁻²`.WattHours get() = siValue / 3600.0


    val Number.Ergs get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.0E-7)
    val `L²⋅M⋅T⁻²`.Ergs get() = siValue / 1.0E-7


    val Number.Kilojoules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1000.0)
    val `L²⋅M⋅T⁻²`.Kilojoules get() = siValue / 1000.0


    val Number.KilowattHours get() = `L²⋅M⋅T⁻²`(this.toDouble() * 3600000.0)
    val `L²⋅M⋅T⁻²`.KilowattHours get() = siValue / 3600000.0


    val Number.Millijoules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 0.001)
    val `L²⋅M⋅T⁻²`.Millijoules get() = siValue / 0.001


    val Number.Nanojoules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.0E-9)
    val `L²⋅M⋅T⁻²`.Nanojoules get() = siValue / 1.0E-9


    val Number.Picojoules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.0E-12)
    val `L²⋅M⋅T⁻²`.Picojoules get() = siValue / 1.0E-12


    val Number.Microjoules get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.0E-6)
    val `L²⋅M⋅T⁻²`.Microjoules get() = siValue / 1.0E-6


    val Number.JoulesPerCubicMeter get() = `L⁻¹⋅M⋅T⁻²`(this.toDouble() * 1.0)
    val `L⁻¹⋅M⋅T⁻²`.JoulesPerCubicMeter get() = siValue / 1.0


    val Number.Newtons get() = `L⋅M⋅T⁻²`(this.toDouble() * 1.0)
    val `L⋅M⋅T⁻²`.Newtons get() = siValue / 1.0


    val Number.KilogramForce get() = `L⋅M⋅T⁻²`(this.toDouble() * 9.81)
    val `L⋅M⋅T⁻²`.KilogramForce get() = siValue / 9.81


    val Number.PoundForce get() = `L⋅M⋅T⁻²`(this.toDouble() * 4.45)
    val `L⋅M⋅T⁻²`.PoundForce get() = siValue / 4.45


    val Number.Gigahertz get() = `T⁻¹`(this.toDouble() * 1.0E9)
    val `T⁻¹`.Gigahertz get() = siValue / 1.0E9


    val Number.Hertz get() = `T⁻¹`(this.toDouble() * 1.0)
    val `T⁻¹`.Hertz get() = siValue / 1.0


    val Number.Megahertz get() = `T⁻¹`(this.toDouble() * 1000000.0)
    val `T⁻¹`.Megahertz get() = siValue / 1000000.0


    val Number.Terahertz get() = `T⁻¹`(this.toDouble() * 1.0E12)
    val `T⁻¹`.Terahertz get() = siValue / 1.0E12


    val Number.Kilohertz get() = `T⁻¹`(this.toDouble() * 1000.0)
    val `T⁻¹`.Kilohertz get() = siValue / 1000.0


    val Number.RevolutionsPerMinute get() = `T⁻¹`(this.toDouble() * 0.0167)
    val `T⁻¹`.RevolutionsPerMinute get() = siValue / 0.0167


    val Number.Lux get() = `L⁻²⋅J`(this.toDouble() * 1.0)
    val `L⁻²⋅J`.Lux get() = siValue / 1.0


    val Number.Henry get() = `L²⋅M⋅T⁻²⋅I⁻²`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻²⋅I⁻²`.Henry get() = siValue / 1.0


    val Number.WattsPerSquareMeter get() = `M⋅T⁻³`(this.toDouble() * 1.0)
    val `M⋅T⁻³`.WattsPerSquareMeter get() = siValue / 1.0


    val Number.ErgsPerSecondPerSquareCentimeter get() = `M⋅T⁻³`(this.toDouble() * 0.001)
    val `M⋅T⁻³`.ErgsPerSecondPerSquareCentimeter get() = siValue / 0.001


    val Number.FeetPerSecondCubed get() = `L⋅T⁻³`(this.toDouble() * 0.3048006096)
    val `L⋅T⁻³`.FeetPerSecondCubed get() = siValue / 0.3048006096


    val Number.MetersPerSecondCubed get() = `L⋅T⁻³`(this.toDouble() * 1.0)
    val `L⋅T⁻³`.MetersPerSecondCubed get() = siValue / 1.0


    val Number.NominalSolarRadii get() = `L`(this.toDouble() * 6.96E8)
    val `L`.NominalSolarRadii get() = siValue / 6.96E8


    val Number.SolarRadii get() = `L`(this.toDouble() * 6.96E8)
    val `L`.SolarRadii get() = siValue / 6.96E8


    val Number.AstronomicalUnits get() = `L`(this.toDouble() * 1.5E11)
    val `L`.AstronomicalUnits get() = siValue / 1.5E11


    val Number.Centimeters get() = `L`(this.toDouble() * 0.01)
    val `L`.Centimeters get() = siValue / 0.01


    val Number.Decameters get() = `L`(this.toDouble() * 10.0)
    val `L`.Decameters get() = siValue / 10.0


    val Number.Decimeters get() = `L`(this.toDouble() * 0.1)
    val `L`.Decimeters get() = siValue / 0.1


    val Number.Feet get() = `L`(this.toDouble() * 0.3048006096)
    val `L`.Feet get() = siValue / 0.3048006096


    val Number.Hectometers get() = `L`(this.toDouble() * 100.0)
    val `L`.Hectometers get() = siValue / 100.0


    val Number.Inches get() = `L`(this.toDouble() * 0.0254000508)
    val `L`.Inches get() = siValue / 0.0254000508


    val Number.Kilometers get() = `L`(this.toDouble() * 1000.0)
    val `L`.Kilometers get() = siValue / 1000.0


    val Number.LightYears get() = `L`(this.toDouble() * 9.46E15)
    val `L`.LightYears get() = siValue / 9.46E15


    val Number.Meters get() = `L`(this.toDouble() * 1.0)
    val `L`.Meters get() = siValue / 1.0


    val Number.UsMiles get() = `L`(this.toDouble() * 1609.347219)
    val `L`.UsMiles get() = siValue / 1609.347219


    val Number.InternationalMiles get() = `L`(this.toDouble() * 1610.0)
    val `L`.InternationalMiles get() = siValue / 1610.0


    val Number.Millimeters get() = `L`(this.toDouble() * 0.001)
    val `L`.Millimeters get() = siValue / 0.001


    val Number.Nanometers get() = `L`(this.toDouble() * 1.0E-9)
    val `L`.Nanometers get() = siValue / 1.0E-9


    val Number.NauticalMiles get() = `L`(this.toDouble() * 1852.0)
    val `L`.NauticalMiles get() = siValue / 1852.0


    val Number.Parsecs get() = `L`(this.toDouble() * 3.09E16)
    val `L`.Parsecs get() = siValue / 3.09E16


    val Number.Yards get() = `L`(this.toDouble() * 0.9144018288)
    val `L`.Yards get() = siValue / 0.9144018288


    val Number.Microns get() = `L`(this.toDouble() * 1.0E-6)
    val `L`.Microns get() = siValue / 1.0E-6


    val Number.Angstroms get() = `L`(this.toDouble() * 1.0E-10)
    val `L`.Angstroms get() = siValue / 1.0E-10


    val Number.CandelasPerSquareMeter get() = `L⁻²⋅J`(this.toDouble() * 1.0)
    val `L⁻²⋅J`.CandelasPerSquareMeter get() = siValue / 1.0


    val Number.LumenSeconds get() = `T⋅J`(this.toDouble() * 1.0)
    val `T⋅J`.LumenSeconds get() = siValue / 1.0


    val Number.LuxSeconds get() = `L⁻²⋅T⋅J`(this.toDouble() * 1.0)
    val `L⁻²⋅T⋅J`.LuxSeconds get() = siValue / 1.0


    val Number.Lumens get() = `J`(this.toDouble() * 1.0)
    val `J`.Lumens get() = siValue / 1.0


    val Number.Candelas get() = `J`(this.toDouble() * 1.0)
    val `J`.Candelas get() = siValue / 1.0


    val Number.Webers get() = `L²⋅M⋅T⁻²⋅I⁻¹`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻²⋅I⁻¹`.Webers get() = siValue / 1.0


    val Number.Gauss get() = `M⋅T⁻²⋅I⁻¹`(this.toDouble() * 1.0E-4)
    val `M⋅T⁻²⋅I⁻¹`.Gauss get() = siValue / 1.0E-4


    val Number.Teslas get() = `M⋅T⁻²⋅I⁻¹`(this.toDouble() * 1.0)
    val `M⋅T⁻²⋅I⁻¹`.Teslas get() = siValue / 1.0


    val Number.Megapounds get() = `M`(this.toDouble() * 453.59237)
    val `M`.Megapounds get() = siValue / 453.59237


    val Number.SolarMasses get() = `M`(this.toDouble() * 1.99E30)
    val `M`.SolarMasses get() = siValue / 1.99E30


    val Number.Carats get() = `M`(this.toDouble() * 2.0E-4)
    val `M`.Carats get() = siValue / 2.0E-4


    val Number.Pennyweights get() = `M`(this.toDouble() * 0.00155517384)
    val `M`.Pennyweights get() = siValue / 0.00155517384


    val Number.Grams get() = `M`(this.toDouble() * 0.001)
    val `M`.Grams get() = siValue / 0.001


    val Number.TroyGrains get() = `M`(this.toDouble() * 6.48E-5)
    val `M`.TroyGrains get() = siValue / 6.48E-5


    val Number.Kilograms get() = `M`(this.toDouble() * 1.0)
    val `M`.Kilograms get() = siValue / 1.0


    val Number.Kilopounds get() = `M`(this.toDouble() * 453.59237)
    val `M`.Kilopounds get() = siValue / 453.59237


    val Number.Pounds get() = `M`(this.toDouble() * 0.45359237)
    val `M`.Pounds get() = siValue / 0.45359237


    val Number.TroyPounds get() = `M`(this.toDouble() * 0.373)
    val `M`.TroyPounds get() = siValue / 0.373


    val Number.Micrograms get() = `M`(this.toDouble() * 1.0E-9)
    val `M`.Micrograms get() = siValue / 1.0E-9


    val Number.Milligrams get() = `M`(this.toDouble() * 1.0E-6)
    val `M`.Milligrams get() = siValue / 1.0E-6


    val Number.Ounces get() = `M`(this.toDouble() * 0.0283)
    val `M`.Ounces get() = siValue / 0.0283


    val Number.TroyOunces get() = `M`(this.toDouble() * 0.0311)
    val `M`.TroyOunces get() = siValue / 0.0311


    val Number.Stone get() = `M`(this.toDouble() * 6.35029318)
    val `M`.Stone get() = siValue / 6.35029318


    val Number.Tonnes get() = `M`(this.toDouble() * 1000.0)
    val `M`.Tonnes get() = siValue / 1000.0


    val Number.Tolas get() = `M`(this.toDouble() * 0.0117)
    val `M`.Tolas get() = siValue / 0.0117


    val Number.KilogramsMetersSquared get() = `L²⋅M`(this.toDouble() * 1.0)
    val `L²⋅M`.KilogramsMetersSquared get() = siValue / 1.0


    val Number.PoundsSquareFeet get() = `L²⋅M`(this.toDouble() * 42.1)
    val `L²⋅M`.PoundsSquareFeet get() = siValue / 42.1


    val Number.NewtonSeconds get() = `L⋅M⋅T⁻¹`(this.toDouble() * 1.0)
    val `L⋅M⋅T⁻¹`.NewtonSeconds get() = siValue / 1.0


    val Number.BtusPerHour get() = `L²⋅M⋅T⁻³`(this.toDouble() * 0.2930710702)
    val `L²⋅M⋅T⁻³`.BtusPerHour get() = siValue / 0.2930710702


    val Number.Gigawatts get() = `L²⋅M⋅T⁻³`(this.toDouble() * 1.0E9)
    val `L²⋅M⋅T⁻³`.Gigawatts get() = siValue / 1.0E9


    val Number.SolarLuminosities get() = `L²⋅M⋅T⁻³`(this.toDouble() * 3.83E26)
    val `L²⋅M⋅T⁻³`.SolarLuminosities get() = siValue / 3.83E26


    val Number.Megawatts get() = `L²⋅M⋅T⁻³`(this.toDouble() * 1000000.0)
    val `L²⋅M⋅T⁻³`.Megawatts get() = siValue / 1000000.0


    val Number.Watts get() = `L²⋅M⋅T⁻³`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻³`.Watts get() = siValue / 1.0


    val Number.ErgsPerSecond get() = `L²⋅M⋅T⁻³`(this.toDouble() * 1.0E-7)
    val `L²⋅M⋅T⁻³`.ErgsPerSecond get() = siValue / 1.0E-7


    val Number.Kilowatts get() = `L²⋅M⋅T⁻³`(this.toDouble() * 1000.0)
    val `L²⋅M⋅T⁻³`.Kilowatts get() = siValue / 1000.0


    val Number.Milliwatts get() = `L²⋅M⋅T⁻³`(this.toDouble() * 0.001)
    val `L²⋅M⋅T⁻³`.Milliwatts get() = siValue / 0.001


    val Number.Pascals get() = `L⁻¹⋅M⋅T⁻²`(this.toDouble() * 1.0)
    val `L⁻¹⋅M⋅T⁻²`.Pascals get() = siValue / 1.0


    val Number.Torrs get() = `L⁻¹⋅M⋅T⁻²`(this.toDouble() * 133.0)
    val `L⁻¹⋅M⋅T⁻²`.Torrs get() = siValue / 133.0


    val Number.StandardAtmospheres get() = `L⁻¹⋅M⋅T⁻²`(this.toDouble() * 101000.0)
    val `L⁻¹⋅M⋅T⁻²`.StandardAtmospheres get() = siValue / 101000.0


    val Number.Bars get() = `L⁻¹⋅M⋅T⁻²`(this.toDouble() * 100000.0)
    val `L⁻¹⋅M⋅T⁻²`.Bars get() = siValue / 100000.0


    val Number.MillimetersOfMercury get() = `L⁻¹⋅M⋅T⁻²`(this.toDouble() * 133.0)
    val `L⁻¹⋅M⋅T⁻²`.MillimetersOfMercury get() = siValue / 133.0


    val Number.PoundsPerSquareInch get() = `L⁻¹⋅M⋅T⁻²`(this.toDouble() * 6890.0)
    val `L⁻¹⋅M⋅T⁻²`.PoundsPerSquareInch get() = siValue / 6890.0


    val Number.WattsPerSteradianPerSquareMeter get() = `M⋅T⁻³`(this.toDouble() * 1.0)
    val `M⋅T⁻³`.WattsPerSteradianPerSquareMeter get() = siValue / 1.0


    val Number.WattsPerSteradian get() = `L²⋅M⋅T⁻³`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻³`.WattsPerSteradian get() = siValue / 1.0


    val Number.OhmMeters get() = `L³⋅M⋅T⁻³⋅I⁻²`(this.toDouble() * 1.0)
    val `L³⋅M⋅T⁻³⋅I⁻²`.OhmMeters get() = siValue / 1.0


    val Number.SquaredRadians get() = `L`(this.toDouble() * 1.0)
    val `L`.SquaredRadians get() = siValue / 1.0


    val Number.Grays get() = `L²⋅T⁻²`(this.toDouble() * 1.0)
    val `L²⋅T⁻²`.Grays get() = siValue / 1.0


    val Number.WattsPerSteradianPerMeter get() = `L⋅M⋅T⁻³`(this.toDouble() * 1.0)
    val `L⋅M⋅T⁻³`.WattsPerSteradianPerMeter get() = siValue / 1.0


    val Number.WattsPerSquareMeterPerNanometer get() = `L⁻¹⋅M⋅T⁻³`(this.toDouble() * 1.0E9)
    val `L⁻¹⋅M⋅T⁻³`.WattsPerSquareMeterPerNanometer get() = siValue / 1.0E9


    val Number.WattsPerSquareMeterPerMicron get() = `L⁻¹⋅M⋅T⁻³`(this.toDouble() * 1000000.0)
    val `L⁻¹⋅M⋅T⁻³`.WattsPerSquareMeterPerMicron get() = siValue / 1000000.0


    val Number.WattsPerCubicMeter get() = `L⁻¹⋅M⋅T⁻³`(this.toDouble() * 1.0)
    val `L⁻¹⋅M⋅T⁻³`.WattsPerCubicMeter get() = siValue / 1.0


    val Number.ErgsPerSecondPerSquareCentimeterPerAngstrom get() = `L⁻¹⋅M⋅T⁻³`(this.toDouble() * 1.0E7)
    val `L⁻¹⋅M⋅T⁻³`.ErgsPerSecondPerSquareCentimeterPerAngstrom get() = siValue / 1.0E7


    val Number.WattsPerMeter get() = `L⋅M⋅T⁻³`(this.toDouble() * 1.0)
    val `L⋅M⋅T⁻³`.WattsPerMeter get() = siValue / 1.0


    val Number.Celsius get() = `Θ`(this.toDouble() * 274.15)
    val `Θ`.Celsius get() = siValue / 274.15


    val Number.Fahrenheit get() = `Θ`(this.toDouble() * 255.9277778)
    val `Θ`.Fahrenheit get() = siValue / 255.9277778


    val Number.Kelvin get() = `Θ`(this.toDouble() * 1.0)
    val `Θ`.Kelvin get() = siValue / 1.0


    val Number.Rankine get() = `Θ`(this.toDouble() * 0.556)
    val `Θ`.Rankine get() = siValue / 0.556


    val Number.JoulesPerKelvin get() = `L²⋅M⋅T⁻²⋅Θ⁻¹`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻²⋅Θ⁻¹`.JoulesPerKelvin get() = siValue / 1.0


    val Number.Days get() = `T`(this.toDouble() * 86400.0)
    val `T`.Days get() = siValue / 86400.0


    val Number.Hours get() = `T`(this.toDouble() * 3600.0)
    val `T`.Hours get() = siValue / 3600.0


    val Number.Minutes get() = `T`(this.toDouble() * 60.0)
    val `T`.Minutes get() = siValue / 60.0


    val Number.Milliseconds get() = `T`(this.toDouble() * 0.001)
    val `T`.Milliseconds get() = siValue / 0.001


    val Number.Nanoseconds get() = `T`(this.toDouble() * 1.0E-9)
    val `T`.Nanoseconds get() = siValue / 1.0E-9


    val Number.Seconds get() = `T`(this.toDouble() * 1.0)
    val `T`.Seconds get() = siValue / 1.0


    val Number.Microseconds get() = `T`(this.toDouble() * 1.0E-6)
    val `T`.Microseconds get() = siValue / 1.0E-6


    val Number.NewtonMeters get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.0)
    val `L²⋅M⋅T⁻²`.NewtonMeters get() = siValue / 1.0


    val Number.PoundFeet get() = `L²⋅M⋅T⁻²`(this.toDouble() * 1.36)
    val `L²⋅M⋅T⁻²`.PoundFeet get() = siValue / 1.36


    val Number.FeetPerSecond get() = `L⋅T⁻¹`(this.toDouble() * 0.3048006096)
    val `L⋅T⁻¹`.FeetPerSecond get() = siValue / 0.3048006096


    val Number.InternationalMilesPerHour get() = `L⋅T⁻¹`(this.toDouble() * 0.44704)
    val `L⋅T⁻¹`.InternationalMilesPerHour get() = siValue / 0.44704


    val Number.KilometersPerHour get() = `L⋅T⁻¹`(this.toDouble() * 0.278)
    val `L⋅T⁻¹`.KilometersPerHour get() = siValue / 0.278


    val Number.KilometersPerSecond get() = `L⋅T⁻¹`(this.toDouble() * 1000.0)
    val `L⋅T⁻¹`.KilometersPerSecond get() = siValue / 1000.0


    val Number.Knots get() = `L⋅T⁻¹`(this.toDouble() * 0.514)
    val `L⋅T⁻¹`.Knots get() = siValue / 0.514


    val Number.MetersPerSecond get() = `L⋅T⁻¹`(this.toDouble() * 1.0)
    val `L⋅T⁻¹`.MetersPerSecond get() = siValue / 1.0


    val Number.UsMilesPerHour get() = `L⋅T⁻¹`(this.toDouble() * 0.4470408941)
    val `L⋅T⁻¹`.UsMilesPerHour get() = siValue / 0.4470408941


    val Number.Litres get() = `L³`(this.toDouble() * 0.001)
    val `L³`.Litres get() = siValue / 0.001


    val Number.AcreFeet get() = `L³`(this.toDouble() * 1230.0)
    val `L³`.AcreFeet get() = siValue / 1230.0


    val Number.UsCups get() = `L³`(this.toDouble() * 2.37E-4)
    val `L³`.UsCups get() = siValue / 2.37E-4


    val Number.Centilitres get() = `L³`(this.toDouble() * 1.0E-5)
    val `L³`.Centilitres get() = siValue / 1.0E-5


    val Number.Decilitres get() = `L³`(this.toDouble() * 1.0E-4)
    val `L³`.Decilitres get() = siValue / 1.0E-4


    val Number.CubicFeet get() = `L³`(this.toDouble() * 0.0283)
    val `L³`.CubicFeet get() = siValue / 0.0283


    val Number.UsGallons get() = `L³`(this.toDouble() * 0.00379)
    val `L³`.UsGallons get() = siValue / 0.00379


    val Number.Hectolitres get() = `L³`(this.toDouble() * 0.1)
    val `L³`.Hectolitres get() = siValue / 0.1


    val Number.CubicInches get() = `L³`(this.toDouble() * 1.64E-5)
    val `L³`.CubicInches get() = siValue / 1.64E-5


    val Number.CubicUsMiles get() = `L³`(this.toDouble() * 4.17E9)
    val `L³`.CubicUsMiles get() = siValue / 4.17E9


    val Number.Millilitres get() = `L³`(this.toDouble() * 1.0E-6)
    val `L³`.Millilitres get() = siValue / 1.0E-6


    val Number.CubicMeters get() = `L³`(this.toDouble() * 1.0)
    val `L³`.CubicMeters get() = siValue / 1.0


    val Number.Nanolitres get() = `L³`(this.toDouble() * 1.0E-12)
    val `L³`.Nanolitres get() = siValue / 1.0E-12


    val Number.FluidOunces get() = `L³`(this.toDouble() * 2.96E-5)
    val `L³`.FluidOunces get() = siValue / 2.96E-5


    val Number.UsPints get() = `L³`(this.toDouble() * 4.73E-4)
    val `L³`.UsPints get() = siValue / 4.73E-4


    val Number.UsQuarts get() = `L³`(this.toDouble() * 9.46E-4)
    val `L³`.UsQuarts get() = siValue / 9.46E-4


    val Number.Tablespoons get() = `L³`(this.toDouble() * 1.48E-5)
    val `L³`.Tablespoons get() = siValue / 1.48E-5


    val Number.Teaspoons get() = `L³`(this.toDouble() * 4.93E-6)
    val `L³`.Teaspoons get() = siValue / 4.93E-6


    val Number.CubicYards get() = `L³`(this.toDouble() * 0.765)
    val `L³`.CubicYards get() = siValue / 0.765


    val Number.Microlitres get() = `L³`(this.toDouble() * 1.0E-9)
    val `L³`.Microlitres get() = siValue / 1.0E-9

