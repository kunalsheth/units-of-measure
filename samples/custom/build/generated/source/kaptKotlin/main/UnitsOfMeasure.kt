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


    typealias `Speed` = `L⋅T⁻¹`


    typealias `Acceleration` = `L⋅T⁻²`


    val Number.`PetaGrams` get() = `M`(this.toDouble() * 1.0E12)
    val `M`.`PetaGrams` get() = siValue / 1.0E12


    val Number.`TeraGrams` get() = `M`(this.toDouble() * 1.0E9)
    val `M`.`TeraGrams` get() = siValue / 1.0E9


    val Number.`GigaGrams` get() = `M`(this.toDouble() * 1000000.0)
    val `M`.`GigaGrams` get() = siValue / 1000000.0


    val Number.`MegaGrams` get() = `M`(this.toDouble() * 1000.0)
    val `M`.`MegaGrams` get() = siValue / 1000.0


    val Number.`KiloGrams` get() = `M`(this.toDouble() * 1.0)
    val `M`.`KiloGrams` get() = siValue / 1.0


    val Number.`HectoGrams` get() = `M`(this.toDouble() * 0.1)
    val `M`.`HectoGrams` get() = siValue / 0.1


    val Number.`DecaGrams` get() = `M`(this.toDouble() * 0.01)
    val `M`.`DecaGrams` get() = siValue / 0.01


    val Number.`Grams` get() = `M`(this.toDouble() * 0.001)
    val `M`.`Grams` get() = siValue / 0.001


    val Number.`DeciGrams` get() = `M`(this.toDouble() * 1.0E-4)
    val `M`.`DeciGrams` get() = siValue / 1.0E-4


    val Number.`CentiGrams` get() = `M`(this.toDouble() * 1.0E-5)
    val `M`.`CentiGrams` get() = siValue / 1.0E-5


    val Number.`MilliGrams` get() = `M`(this.toDouble() * 1.0E-6)
    val `M`.`MilliGrams` get() = siValue / 1.0E-6


    val Number.`MicroGrams` get() = `M`(this.toDouble() * 1.0E-9)
    val `M`.`MicroGrams` get() = siValue / 1.0E-9


    val Number.`NanoGrams` get() = `M`(this.toDouble() * 1.0000000000000002E-12)
    val `M`.`NanoGrams` get() = siValue / 1.0000000000000002E-12


    val Number.`PicoGrams` get() = `M`(this.toDouble() * 1.0E-15)
    val `M`.`PicoGrams` get() = siValue / 1.0E-15


    val Number.`FemtoGrams` get() = `M`(this.toDouble() * 1.0E-18)
    val `M`.`FemtoGrams` get() = siValue / 1.0E-18


    val Number.`Ounces` get() = `M`(this.toDouble() * 0.0283495)
    val `M`.`Ounces` get() = siValue / 0.0283495


    val Number.`Pounds` get() = `M`(this.toDouble() * 0.453592)
    val `M`.`Pounds` get() = siValue / 0.453592


    val Number.`Feet` get() = `L`(this.toDouble() * 0.3048)
    val `L`.`Feet` get() = siValue / 0.3048


    val Number.`PetaMetres` get() = `L`(this.toDouble() * 1.0E15)
    val `L`.`PetaMetres` get() = siValue / 1.0E15


    val Number.`TeraMetres` get() = `L`(this.toDouble() * 1.0E12)
    val `L`.`TeraMetres` get() = siValue / 1.0E12


    val Number.`GigaMetres` get() = `L`(this.toDouble() * 1.0E9)
    val `L`.`GigaMetres` get() = siValue / 1.0E9


    val Number.`MegaMetres` get() = `L`(this.toDouble() * 1000000.0)
    val `L`.`MegaMetres` get() = siValue / 1000000.0


    val Number.`KiloMetres` get() = `L`(this.toDouble() * 1000.0)
    val `L`.`KiloMetres` get() = siValue / 1000.0


    val Number.`HectoMetres` get() = `L`(this.toDouble() * 100.0)
    val `L`.`HectoMetres` get() = siValue / 100.0


    val Number.`DecaMetres` get() = `L`(this.toDouble() * 10.0)
    val `L`.`DecaMetres` get() = siValue / 10.0


    val Number.`Metres` get() = `L`(this.toDouble() * 1.0)
    val `L`.`Metres` get() = siValue / 1.0


    val Number.`DeciMetres` get() = `L`(this.toDouble() * 0.1)
    val `L`.`DeciMetres` get() = siValue / 0.1


    val Number.`CentiMetres` get() = `L`(this.toDouble() * 0.01)
    val `L`.`CentiMetres` get() = siValue / 0.01


    val Number.`MilliMetres` get() = `L`(this.toDouble() * 0.001)
    val `L`.`MilliMetres` get() = siValue / 0.001


    val Number.`MicroMetres` get() = `L`(this.toDouble() * 1.0E-6)
    val `L`.`MicroMetres` get() = siValue / 1.0E-6


    val Number.`NanoMetres` get() = `L`(this.toDouble() * 1.0E-9)
    val `L`.`NanoMetres` get() = siValue / 1.0E-9


    val Number.`PicoMetres` get() = `L`(this.toDouble() * 1.0E-12)
    val `L`.`PicoMetres` get() = siValue / 1.0E-12


    val Number.`FemtoMetres` get() = `L`(this.toDouble() * 1.0E-15)
    val `L`.`FemtoMetres` get() = siValue / 1.0E-15


    val Number.`Percent` get() = Dimensionless(this.toDouble() * 0.01)
    val Dimensionless.`Percent` get() = siValue / 0.01


    val Number.`MilesPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 0.44704)
    val `L⋅T⁻¹`.`MilesPerHour` get() = siValue / 0.44704


    val Number.`Minutes` get() = `T`(this.toDouble() * 60.0)
    val `T`.`Minutes` get() = siValue / 60.0


    val Number.`Hours` get() = `T`(this.toDouble() * 3600.0)
    val `T`.`Hours` get() = siValue / 3600.0


    val Number.`Seconds` get() = `T`(this.toDouble() * 1.0)
    val `T`.`Seconds` get() = siValue / 1.0


    val Number.`Miles` get() = `L`(this.toDouble() * 1609.34)
    val `L`.`Miles` get() = siValue / 1609.34


    val Number.`PetaMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.77778E11)
    val `L⋅T⁻¹`.`PetaMetresPerHour` get() = siValue / 2.77778E11


    val Number.`TeraMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.77778E8)
    val `L⋅T⁻¹`.`TeraMetresPerHour` get() = siValue / 2.77778E8


    val Number.`GigaMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 277778.0)
    val `L⋅T⁻¹`.`GigaMetresPerHour` get() = siValue / 277778.0


    val Number.`MegaMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 277.778)
    val `L⋅T⁻¹`.`MegaMetresPerHour` get() = siValue / 277.778


    val Number.`KiloMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 0.277778)
    val `L⋅T⁻¹`.`KiloMetresPerHour` get() = siValue / 0.277778


    val Number.`HectoMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 0.027777800000000002)
    val `L⋅T⁻¹`.`HectoMetresPerHour` get() = siValue / 0.027777800000000002


    val Number.`DecaMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 0.00277778)
    val `L⋅T⁻¹`.`DecaMetresPerHour` get() = siValue / 0.00277778


    val Number.`MetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.77778E-4)
    val `L⋅T⁻¹`.`MetresPerHour` get() = siValue / 2.77778E-4


    val Number.`DeciMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.7777800000000004E-5)
    val `L⋅T⁻¹`.`DeciMetresPerHour` get() = siValue / 2.7777800000000004E-5


    val Number.`CentiMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.77778E-6)
    val `L⋅T⁻¹`.`CentiMetresPerHour` get() = siValue / 2.77778E-6


    val Number.`MilliMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.7777800000000004E-7)
    val `L⋅T⁻¹`.`MilliMetresPerHour` get() = siValue / 2.7777800000000004E-7


    val Number.`MicroMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.77778E-10)
    val `L⋅T⁻¹`.`MicroMetresPerHour` get() = siValue / 2.77778E-10


    val Number.`NanoMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.77778E-13)
    val `L⋅T⁻¹`.`NanoMetresPerHour` get() = siValue / 2.77778E-13


    val Number.`PicoMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.77778E-16)
    val `L⋅T⁻¹`.`PicoMetresPerHour` get() = siValue / 2.77778E-16


    val Number.`FemtoMetresPerHour` get() = `L⋅T⁻¹`(this.toDouble() * 2.7777800000000003E-19)
    val `L⋅T⁻¹`.`FemtoMetresPerHour` get() = siValue / 2.7777800000000003E-19

