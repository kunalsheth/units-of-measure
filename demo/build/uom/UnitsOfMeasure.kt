/*
 * Copyright 2019 Kunal Sheth
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
    val isZero: Boolean
    val isPositive: Boolean

    override fun compareTo(other: This): Int
}

interface UomConverter<Q : Quan<Q>> {
    val unitName: String
    operator fun invoke(x: Double): Q
    operator fun invoke(x: Q): Double
}

@Deprecated(
        message = "Explicit boxing should only be used to circumnavigate compiler bugs",
        replaceWith = ReplaceWith("a newer version of Kotlin")
)
fun <Q : Quan<Q>> box(x: Q) = x as Quan<Q>

typealias `L` = L1A0M0T0I0Theta0N0J0C0
inline class L1A0M0T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`L`> {
    override val siValue get() = underlying
    override val abrev get() = "m"

    override fun new(siValue: Double) = `L`(siValue)

    override operator fun unaryPlus() = `L`(+underlying)
    override operator fun unaryMinus() = `L`(-underlying)

    override operator fun plus(that: `L`) = `L`(this.underlying + that.underlying)
    override operator fun minus(that: `L`) = `L`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L`(this.underlying / that.toDouble())
    override operator fun rem(that: `L`) = `L`(this.underlying % that.underlying)

    override infix fun min(that: `L`) = if (this < that) this else that
    override infix fun max(that: `L`) = if (this > that) this else that

    override val abs get() = `L`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L` && this.siValue == other.siValue
}

inline val Number.`Metre`: `Length` get() = `L`(toDouble() * 1.0)
inline val `L`.`Metre` get() = siValue * 1.0
object `Metre` : UomConverter<`L`>,
    Quan<`L`> by box(`L`(1.0)) {
    override val unitName = "Metre"
    override fun invoke(x: Double) = x.`Metre`
    override fun invoke(x: `L`) = x.`Metre`
}

inline val Number.`Foot`: `Length` get() = `L`(toDouble() * 0.3048)
inline val `L`.`Foot` get() = siValue * 3.280839895013123
object `Foot` : UomConverter<`L`>,
    Quan<`L`> by box(`L`(0.3048)) {
    override val unitName = "Foot"
    override fun invoke(x: Double) = x.`Foot`
    override fun invoke(x: `L`) = x.`Foot`
}

inline val Number.`Mile`: `Length` get() = `L`(toDouble() * 1609.34)
inline val `L`.`Mile` get() = siValue * 6.213727366498068E-4
object `Mile` : UomConverter<`L`>,
    Quan<`L`> by box(`L`(1609.34)) {
    override val unitName = "Mile"
    override fun invoke(x: Double) = x.`Mile`
    override fun invoke(x: `L`) = x.`Mile`
}


typealias `Length` = `L`

@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L`.div(that: Quan<`L`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L`.div(that: `L`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L`>, that: Quan<`L`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L`.times(that: Quan<`L`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L`.times(that: `L`) = `L²`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L`>, that: Quan<`L`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L`.div(that: Quan<`T`>) = `L⋅T⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L`.div(that: `T`) = `L⋅T⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L`>, that: Quan<`T`>) = thiz.run { `L⋅T⁻¹`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L`.times(that: Quan<`T`>) = `L⋅T`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L`.times(that: `T`) = `L⋅T`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L`>, that: Quan<`T`>) = thiz.run { `L⋅T`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L`.div(that: Quan<`Dimensionless`>) = `L`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L`.div(that: `Dimensionless`) = `L`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L`>, that: Quan<`Dimensionless`>) = thiz.run { `L`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L`.times(that: Quan<`Dimensionless`>) = `L`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L`.times(that: `Dimensionless`) = `L`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L`>, that: Quan<`Dimensionless`>) = thiz.run { `L`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L`.div(that: Quan<`L⋅T⁻¹`>) = `T`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L`.div(that: `L⋅T⁻¹`) = `T`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `L`.times(that: Quan<`L⁻¹⋅T`>) = `T`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `L`.times(that: `L⁻¹⋅T`) = `T`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun times(thiz: Quan<`L`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `T`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `L`.div(that: Quan<`¤`>) = `L⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L`.div(that: `¤`) = `L⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L`>, that: Quan<`¤`>) = thiz.run { `L⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `L`.times(that: Quan<`¤`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L`.times(that: `¤`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L`>, that: Quan<`¤`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L`.div(that: Quan<`L³`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L`.div(that: `L³`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L`>, that: Quan<`L³`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L`.times(that: Quan<`L³`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L`.times(that: `L³`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L`>, that: Quan<`L³`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L`.times(that: Quan<`L⁻¹⋅¤`>) = `¤`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L`.times(that: `L⁻¹⋅¤`) = `¤`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun times(thiz: Quan<`L`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `¤`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L`.div(that: Quan<`L⋅¤⁻¹`>) = `¤`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L`.div(that: `L⋅¤⁻¹`) = `¤`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `¤`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L`.times(that: Quan<`L²`>) = `L³`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L`.times(that: `L²`) = `L³`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L`>, that: Quan<`L²`>) = thiz.run { `L³`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L`.div(that: Quan<`L⁻²`>) = `L³`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L`.div(that: `L⁻²`) = `L³`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`L`>, that: Quan<`L⁻²`>) = thiz.run { `L³`(this.siValue / that.siValue) }


typealias `Dimensionless` = L0A0M0T0I0Theta0N0J0C0
inline class L0A0M0T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`Dimensionless`> {
    override val siValue get() = underlying
    override val abrev get() = ""

    override fun new(siValue: Double) = `Dimensionless`(siValue)

    override operator fun unaryPlus() = `Dimensionless`(+underlying)
    override operator fun unaryMinus() = `Dimensionless`(-underlying)

    override operator fun plus(that: `Dimensionless`) = `Dimensionless`(this.underlying + that.underlying)
    override operator fun minus(that: `Dimensionless`) = `Dimensionless`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `Dimensionless`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `Dimensionless`(this.underlying / that.toDouble())
    override operator fun rem(that: `Dimensionless`) = `Dimensionless`(this.underlying % that.underlying)

    override infix fun min(that: `Dimensionless`) = if (this < that) this else that
    override infix fun max(that: `Dimensionless`) = if (this > that) this else that

    override val abs get() = `Dimensionless`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `Dimensionless`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `Dimensionless` && this.siValue == other.siValue
}

inline val Number.`Degree`: `Dimensionless` get() = `Dimensionless`(toDouble() * 0.017453292519943295)
inline val `Dimensionless`.`Degree` get() = siValue * 57.29577951308232
object `Degree` : UomConverter<`Dimensionless`>,
    Quan<`Dimensionless`> by box(`Dimensionless`(0.017453292519943295)) {
    override val unitName = "Degree"
    override fun invoke(x: Double) = x.`Degree`
    override fun invoke(x: `Dimensionless`) = x.`Degree`
}

inline val Number.`Turn`: `Dimensionless` get() = `Dimensionless`(toDouble() * 6.283185307179586)
inline val `Dimensionless`.`Turn` get() = siValue * 0.15915494309189535
object `Turn` : UomConverter<`Dimensionless`>,
    Quan<`Dimensionless`> by box(`Dimensionless`(6.283185307179586)) {
    override val unitName = "Turn"
    override fun invoke(x: Double) = x.`Turn`
    override fun invoke(x: `Dimensionless`) = x.`Turn`
}

inline val Number.`Percent`: `Dimensionless` get() = `Dimensionless`(toDouble() * 0.01)
inline val `Dimensionless`.`Percent` get() = siValue * 100.0
object `Percent` : UomConverter<`Dimensionless`>,
    Quan<`Dimensionless`> by box(`Dimensionless`(0.01)) {
    override val unitName = "Percent"
    override fun invoke(x: Double) = x.`Percent`
    override fun invoke(x: `Dimensionless`) = x.`Percent`
}


@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.div(that: Quan<`Dimensionless`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.div(that: `Dimensionless`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`Dimensionless`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`L`>) = `L`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `L`) = `L`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L`>) = thiz.run { `L`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`Dimensionless`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `Dimensionless`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`Dimensionless`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`T`>) = `T`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `T`) = `T`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`T`>) = thiz.run { `T`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`L²`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `L²`) = `L²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L²`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `Dimensionless`.div(that: Quan<`L⋅T⁻¹`>) = `L⁻¹⋅T`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `Dimensionless`.div(that: `L⋅T⁻¹`) = `L⁻¹⋅T`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L⁻¹⋅T`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `Dimensionless`.times(that: Quan<`L⋅T⁻¹`>) = `L⋅T⁻¹`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `Dimensionless`.times(that: `L⋅T⁻¹`) = `L⋅T⁻¹`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L⋅T⁻¹`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T1I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`L⋅T`>) = `L⋅T`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T1I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `L⋅T`) = `L⋅T`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⋅T`>) = thiz.run { `L⋅T`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `Dimensionless`.div(that: Quan<`L⁻¹⋅T`>) = `L⋅T⁻¹`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `Dimensionless`.div(that: `L⁻¹⋅T`) = `L⋅T⁻¹`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `L⋅T⁻¹`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `Dimensionless`.times(that: Quan<`L⁻¹⋅T`>) = `L⁻¹⋅T`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `Dimensionless`.times(that: `L⁻¹⋅T`) = `L⁻¹⋅T`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `L⁻¹⋅T`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T2I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`T²`>) = `T²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T2I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `T²`) = `T²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T2I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`T²`>) = thiz.run { `T²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `Dimensionless`.times(that: Quan<`L⋅T⁻²`>) = `L⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `Dimensionless`.times(that: `L⋅T⁻²`) = `L⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⋅T⁻²`>) = thiz.run { `L⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `Dimensionless`.times(that: Quan<`L²⋅T⁻²`>) = `L²⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `Dimensionless`.times(that: `L²⋅T⁻²`) = `L²⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L²⋅T⁻²`>) = thiz.run { `L²⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.div(that: Quan<`T`>) = `T⁻¹`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.div(that: `T`) = `T⁻¹`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`T`>) = thiz.run { `T⁻¹`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_generic")
operator fun `Dimensionless`.times(that: Quan<`L²⋅T⁻³`>) = `L²⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_concrete")
operator fun `Dimensionless`.times(that: `L²⋅T⁻³`) = `L²⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L²⋅T⁻³`>) = thiz.run { `L²⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `Dimensionless`.div(that: Quan<`T⁻¹`>) = `T`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `Dimensionless`.div(that: `T⁻¹`) = `T`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`T⁻¹`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `Dimensionless`.times(that: Quan<`T⁻¹`>) = `T⁻¹`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `Dimensionless`.times(that: `T⁻¹`) = `T⁻¹`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`T⁻¹`>) = thiz.run { `T⁻¹`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T4_generic")
operator fun `Dimensionless`.times(that: Quan<`L²⋅T⁻⁴`>) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T4_concrete")
operator fun `Dimensionless`.times(that: `L²⋅T⁻⁴`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T4_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L²⋅T⁻⁴`>) = thiz.run { `L²⋅T⁻⁴`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_generic")
operator fun `Dimensionless`.times(that: Quan<`L²⋅M⋅T⁻³`>) = `L²⋅M⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_concrete")
operator fun `Dimensionless`.times(that: `L²⋅M⋅T⁻³`) = `L²⋅M⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L²⋅M⋅T⁻³`>) = thiz.run { `L²⋅M⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L4A0M2I0Theta0N0J0C0_per_T6_generic")
operator fun `Dimensionless`.times(that: Quan<`L⁴⋅M²⋅T⁻⁶`>) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L4A0M2I0Theta0N0J0C0_per_T6_concrete")
operator fun `Dimensionless`.times(that: `L⁴⋅M²⋅T⁻⁶`) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L4A0M2I0Theta0N0J0C0_per_T6_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⁴⋅M²⋅T⁻⁶`>) = thiz.run { `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `Dimensionless`.div(that: Quan<`L²⋅M⋅T⁻⁴`>) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `Dimensionless`.div(that: `L²⋅M⋅T⁻⁴`) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `Dimensionless`.times(that: Quan<`L²⋅M⋅T⁻⁴`>) = `L²⋅M⋅T⁻⁴`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `Dimensionless`.times(that: `L²⋅M⋅T⁻⁴`) = `L²⋅M⋅T⁻⁴`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `L²⋅M⋅T⁻⁴`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_generic")
operator fun `Dimensionless`.times(that: Quan<`L²⋅M⋅T⁻²`>) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_concrete")
operator fun `Dimensionless`.times(that: `L²⋅M⋅T⁻²`) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L²⋅M⋅T⁻²`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `Dimensionless`.div(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `Dimensionless`.div(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `Dimensionless`.times(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `Dimensionless`.times(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `L⁻²⋅M⁻¹⋅T⁴`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `Dimensionless`.times(that: Quan<`¤`>) = `¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `Dimensionless`.times(that: `¤`) = `¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`¤`>) = thiz.run { `¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`L³`>) = `L³`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `L³`) = `L³`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L³`>) = thiz.run { `L³`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C2_generic")
operator fun `Dimensionless`.times(that: Quan<`¤²`>) = `¤²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C2_concrete")
operator fun `Dimensionless`.times(that: `¤²`) = `¤²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C2_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`¤²`>) = thiz.run { `¤²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `Dimensionless`.div(that: Quan<`L⁻³⋅¤`>) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `Dimensionless`.div(that: `L⁻³⋅¤`) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `Dimensionless`.times(that: Quan<`L⁻³⋅¤`>) = `L⁻³⋅¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `Dimensionless`.times(that: `L⁻³⋅¤`) = `L⁻³⋅¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L⁻³⋅¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `Dimensionless`.times(that: Quan<`L³⋅¤`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `Dimensionless`.times(that: `L³⋅¤`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L³⋅¤`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `Dimensionless`.div(that: Quan<`L³⋅¤⁻¹`>) = `L⁻³⋅¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `Dimensionless`.div(that: `L³⋅¤⁻¹`) = `L⁻³⋅¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L⁻³⋅¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `Dimensionless`.times(that: Quan<`L³⋅¤⁻¹`>) = `L³⋅¤⁻¹`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `Dimensionless`.times(that: `L³⋅¤⁻¹`) = `L³⋅¤⁻¹`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L6A0M0T0I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`L⁶`>) = `L⁶`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L6A0M0T0I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `L⁶`) = `L⁶`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L6A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⁶`>) = thiz.run { `L⁶`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `Dimensionless`.div(that: Quan<`L⁻¹⋅¤`>) = `L⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `Dimensionless`.div(that: `L⁻¹⋅¤`) = `L⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `Dimensionless`.times(that: Quan<`L⁻¹⋅¤`>) = `L⁻¹⋅¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `Dimensionless`.times(that: `L⁻¹⋅¤`) = `L⁻¹⋅¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L⁻¹⋅¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `Dimensionless`.times(that: Quan<`L⋅¤`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `Dimensionless`.times(that: `L⋅¤`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⋅¤`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `Dimensionless`.div(that: Quan<`L⋅¤⁻¹`>) = `L⁻¹⋅¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `Dimensionless`.div(that: `L⋅¤⁻¹`) = `L⁻¹⋅¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L⁻¹⋅¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `Dimensionless`.times(that: Quan<`L⋅¤⁻¹`>) = `L⋅¤⁻¹`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `Dimensionless`.times(that: `L⋅¤⁻¹`) = `L⋅¤⁻¹`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L⋅¤⁻¹`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.div(that: Quan<`L²`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.div(that: `L²`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L²`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `Dimensionless`.times(that: Quan<`L⁴`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `Dimensionless`.times(that: `L⁴`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⁴`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `Dimensionless`.div(that: Quan<`L⁻²`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `Dimensionless`.div(that: `L⁻²`) = `L²`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻²`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `Dimensionless`.times(that: Quan<`L⁻²`>) = `L⁻²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `Dimensionless`.times(that: `L⁻²`) = `L⁻²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`Dimensionless`>, that: Quan<`L⁻²`>) = thiz.run { `L⁻²`(this.siValue * that.siValue) }


typealias `L²` = L2A0M0T0I0Theta0N0J0C0
inline class L2A0M0T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`L²`> {
    override val siValue get() = underlying
    override val abrev get() = "m²"

    override fun new(siValue: Double) = `L²`(siValue)

    override operator fun unaryPlus() = `L²`(+underlying)
    override operator fun unaryMinus() = `L²`(-underlying)

    override operator fun plus(that: `L²`) = `L²`(this.underlying + that.underlying)
    override operator fun minus(that: `L²`) = `L²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²`) = `L²`(this.underlying % that.underlying)

    override infix fun min(that: `L²`) = if (this < that) this else that
    override infix fun max(that: `L²`) = if (this > that) this else that

    override val abs get() = `L²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²` && this.siValue == other.siValue
}


typealias `Area` = `L²`

@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²`.div(that: Quan<`L`>) = `L`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²`.div(that: `L`) = `L`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L`>) = thiz.run { `L`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²`.div(that: Quan<`L²`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²`.div(that: `L²`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L²`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²`.div(that: Quan<`Dimensionless`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²`.div(that: `Dimensionless`) = `L²`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`Dimensionless`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²`.times(that: Quan<`Dimensionless`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²`.times(that: `Dimensionless`) = `L²`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`Dimensionless`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L²`.div(that: Quan<`L⋅T⁻¹`>) = `L⋅T`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L²`.div(that: `L⋅T⁻¹`) = `L⋅T`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L⋅T`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²`.div(that: Quan<`L⋅T`>) = `L⋅T⁻¹`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²`.div(that: `L⋅T`) = `L⋅T⁻¹`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L⋅T`>) = thiz.run { `L⋅T⁻¹`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `L²`.times(that: Quan<`L⁻¹⋅T`>) = `L⋅T`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `L²`.times(that: `L⁻¹⋅T`) = `L⋅T`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `L⋅T`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²`.times(that: Quan<`L²`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²`.times(that: `L²`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L²`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²`.times(that: Quan<`L`>) = `L³`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²`.times(that: `L`) = `L³`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L`>) = thiz.run { `L³`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L²`.times(that: Quan<`L⁻³⋅¤`>) = `L⁻¹⋅¤`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L²`.times(that: `L⁻³⋅¤`) = `L⁻¹⋅¤`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L⁻¹⋅¤`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L²`.div(that: Quan<`L³⋅¤⁻¹`>) = `L⁻¹⋅¤`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L²`.div(that: `L³⋅¤⁻¹`) = `L⁻¹⋅¤`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L⁻¹⋅¤`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L²`.div(that: Quan<`L⁻¹⋅¤`>) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L²`.div(that: `L⁻¹⋅¤`) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L²`.times(that: Quan<`L⁻¹⋅¤`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L²`.times(that: `L⁻¹⋅¤`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L²`.div(that: Quan<`L⋅¤`>) = `L⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L²`.div(that: `L⋅¤`) = `L⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L⋅¤`>) = thiz.run { `L⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L²`.times(that: Quan<`L⋅¤`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L²`.times(that: `L⋅¤`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L⋅¤`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L²`.div(that: Quan<`L⋅¤⁻¹`>) = `L⋅¤`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L²`.div(that: `L⋅¤⁻¹`) = `L⋅¤`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L⋅¤`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L²`.times(that: Quan<`L⋅¤⁻¹`>) = `L³⋅¤⁻¹`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L²`.times(that: `L⋅¤⁻¹`) = `L³⋅¤⁻¹`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²`.div(that: Quan<`L⁴`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²`.div(that: `L⁴`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L⁴`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²`.times(that: Quan<`L⁴`>) = `L⁶`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²`.times(that: `L⁴`) = `L⁶`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L⁴`>) = thiz.run { `L⁶`(this.siValue * that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L²`.div(that: Quan<`L⁻²`>) = `L⁴`(this.siValue / that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L²`.div(that: `L⁻²`) = `L⁴`(this.siValue / that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`L²`>, that: Quan<`L⁻²`>) = thiz.run { `L⁴`(this.siValue / that.siValue) }
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L²`.times(that: Quan<`L⁻²`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L²`.times(that: `L⁻²`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("L2A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`L²`>, that: Quan<`L⁻²`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }


typealias `T` = L0A0M0T1I0Theta0N0J0C0
inline class L0A0M0T1I0Theta0N0J0C0(internal val underlying: Double) : Quan<`T`> {
    override val siValue get() = underlying
    override val abrev get() = "s"

    override fun new(siValue: Double) = `T`(siValue)

    override operator fun unaryPlus() = `T`(+underlying)
    override operator fun unaryMinus() = `T`(-underlying)

    override operator fun plus(that: `T`) = `T`(this.underlying + that.underlying)
    override operator fun minus(that: `T`) = `T`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `T`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `T`(this.underlying / that.toDouble())
    override operator fun rem(that: `T`) = `T`(this.underlying % that.underlying)

    override infix fun min(that: `T`) = if (this < that) this else that
    override infix fun max(that: `T`) = if (this > that) this else that

    override val abs get() = `T`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `T`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `T` && this.siValue == other.siValue
}

inline val Number.`Second`: `Time` get() = `T`(toDouble() * 1.0)
inline val `T`.`Second` get() = siValue * 1.0
object `Second` : UomConverter<`T`>,
    Quan<`T`> by box(`T`(1.0)) {
    override val unitName = "Second"
    override fun invoke(x: Double) = x.`Second`
    override fun invoke(x: `T`) = x.`Second`
}

inline val Number.`Minute`: `Time` get() = `T`(toDouble() * 60.0)
inline val `T`.`Minute` get() = siValue * 0.016666666666666666
object `Minute` : UomConverter<`T`>,
    Quan<`T`> by box(`T`(60.0)) {
    override val unitName = "Minute"
    override fun invoke(x: Double) = x.`Minute`
    override fun invoke(x: `T`) = x.`Minute`
}

inline val Number.`Hour`: `Time` get() = `T`(toDouble() * 3600.0)
inline val `T`.`Hour` get() = siValue * 2.777777777777778E-4
object `Hour` : UomConverter<`T`>,
    Quan<`T`> by box(`T`(3600.0)) {
    override val unitName = "Hour"
    override fun invoke(x: Double) = x.`Hour`
    override fun invoke(x: `T`) = x.`Hour`
}


typealias `Time` = `T`

@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `T`.div(that: Quan<`L`>) = `L⁻¹⋅T`(this.siValue / that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `T`.div(that: `L`) = `L⁻¹⋅T`(this.siValue / that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`T`>, that: Quan<`L`>) = thiz.run { `L⁻¹⋅T`(this.siValue / that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `T`.div(that: Quan<`T`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `T`.div(that: `T`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`T`>, that: Quan<`T`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `T`.times(that: Quan<`L`>) = `L⋅T`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `T`.times(that: `L`) = `L⋅T`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`L`>) = thiz.run { `L⋅T`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `T`.times(that: Quan<`T`>) = `T²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `T`.times(that: `T`) = `T²`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`T`>) = thiz.run { `T²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `T`.div(that: Quan<`Dimensionless`>) = `T`(this.siValue / that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `T`.div(that: `Dimensionless`) = `T`(this.siValue / that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`T`>, that: Quan<`Dimensionless`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `T`.times(that: Quan<`Dimensionless`>) = `T`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `T`.times(that: `Dimensionless`) = `T`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`Dimensionless`>) = thiz.run { `T`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `T`.times(that: Quan<`L⋅T⁻¹`>) = `L`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `T`.times(that: `L⋅T⁻¹`) = `L`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `T`.div(that: Quan<`L⁻¹⋅T`>) = `L`(this.siValue / that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `T`.div(that: `L⁻¹⋅T`) = `L`(this.siValue / that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun div(thiz: Quan<`T`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `L`(this.siValue / that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `T`.times(that: Quan<`L⋅T⁻²`>) = `L⋅T⁻¹`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `T`.times(that: `L⋅T⁻²`) = `L⋅T⁻¹`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`L⋅T⁻²`>) = thiz.run { `L⋅T⁻¹`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_generic")
operator fun `T`.times(that: Quan<`L²⋅T⁻³`>) = `L²⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_concrete")
operator fun `T`.times(that: `L²⋅T⁻³`) = `L²⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`L²⋅T⁻³`>) = thiz.run { `L²⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `T`.times(that: Quan<`T⁻¹`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `T`.times(that: `T⁻¹`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`T⁻¹`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T4_generic")
operator fun `T`.times(that: Quan<`L²⋅T⁻⁴`>) = `L²⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T4_concrete")
operator fun `T`.times(that: `L²⋅T⁻⁴`) = `L²⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M0I0Theta0N0J0C0_per_T4_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`L²⋅T⁻⁴`>) = thiz.run { `L²⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T3_generic")
operator fun `T`.div(that: Quan<`L²⋅M⋅T⁻³`>) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T3_concrete")
operator fun `T`.div(that: `L²⋅M⋅T⁻³`) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T3_nonextension")
fun div(thiz: Quan<`T`>, that: Quan<`L²⋅M⋅T⁻³`>) = thiz.run { `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_generic")
operator fun `T`.times(that: Quan<`L²⋅M⋅T⁻³`>) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_concrete")
operator fun `T`.times(that: `L²⋅M⋅T⁻³`) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`L²⋅M⋅T⁻³`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `T`.times(that: Quan<`L²⋅M⋅T⁻⁴`>) = `L²⋅M⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `T`.times(that: `L²⋅M⋅T⁻⁴`) = `L²⋅M⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun times(thiz: Quan<`T`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `L²⋅M⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `T`.div(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `L²⋅M⋅T⁻³`(this.siValue / that.siValue)
// @JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `T`.div(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L²⋅M⋅T⁻³`(this.siValue / that.siValue)
@JvmName("L0A0M0T1I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun div(thiz: Quan<`T`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `L²⋅M⋅T⁻³`(this.siValue / that.siValue) }


typealias `L⋅T⁻¹` = L1A0M0I0Theta0N0J0C0_per_T1
inline class L1A0M0I0Theta0N0J0C0_per_T1(internal val underlying: Double) : Quan<`L⋅T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅s⁻¹"

    override fun new(siValue: Double) = `L⋅T⁻¹`(siValue)

    override operator fun unaryPlus() = `L⋅T⁻¹`(+underlying)
    override operator fun unaryMinus() = `L⋅T⁻¹`(-underlying)

    override operator fun plus(that: `L⋅T⁻¹`) = `L⋅T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅T⁻¹`) = `L⋅T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅T⁻¹`) = `L⋅T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L⋅T⁻¹`) = if (this > that) this else that

    override val abs get() = `L⋅T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅T⁻¹` && this.siValue == other.siValue
}


typealias `Speed` = `L⋅T⁻¹`

typealias `Velocity` = `L⋅T⁻¹`

@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⋅T⁻¹`.div(that: Quan<`L⋅T⁻¹`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⋅T⁻¹`.div(that: `L⋅T⁻¹`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻¹`.times(that: Quan<`T`>) = `L`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻¹`.times(that: `T`) = `L`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`T`>) = thiz.run { `L`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻¹`.div(that: Quan<`Dimensionless`>) = `L⋅T⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻¹`.div(that: `Dimensionless`) = `L⋅T⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅T⁻¹`(this.siValue / that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻¹`.times(that: Quan<`Dimensionless`>) = `L⋅T⁻¹`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻¹`.times(that: `Dimensionless`) = `L⋅T⁻¹`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅T⁻¹`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0T1I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻¹`.times(that: Quan<`L⋅T`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻¹`.times(that: `L⋅T`) = `L²`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`L⋅T`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `L⋅T⁻¹`.times(that: Quan<`L⁻¹⋅T`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `L⋅T⁻¹`.times(that: `L⁻¹⋅T`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun times(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T2I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻¹`.times(that: Quan<`T²`>) = `L⋅T`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T2I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻¹`.times(that: `T²`) = `L⋅T`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T2I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`T²`>) = thiz.run { `L⋅T`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⋅T⁻¹`.times(that: Quan<`L⋅T⁻¹`>) = `L²⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⋅T⁻¹`.times(that: `L⋅T⁻¹`) = `L²⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L²⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L1A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `L⋅T⁻¹`.div(that: Quan<`L⋅T⁻²`>) = `T`(this.siValue / that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L1A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `L⋅T⁻¹`.div(that: `L⋅T⁻²`) = `T`(this.siValue / that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L1A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`L⋅T⁻²`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `L⋅T⁻¹`.times(that: Quan<`L⋅T⁻²`>) = `L²⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `L⋅T⁻¹`.times(that: `L⋅T⁻²`) = `L²⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`L⋅T⁻²`>) = thiz.run { `L²⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻¹`.div(that: Quan<`T`>) = `L⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻¹`.div(that: `T`) = `L⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`T`>) = thiz.run { `L⋅T⁻²`(this.siValue / that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⋅T⁻¹`.times(that: Quan<`T⁻¹`>) = `L⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⋅T⁻¹`.times(that: `T⁻¹`) = `L⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`L⋅T⁻¹`>, that: Quan<`T⁻¹`>) = thiz.run { `L⋅T⁻²`(this.siValue * that.siValue) }


typealias `L⋅T` = L1A0M0T1I0Theta0N0J0C0
inline class L1A0M0T1I0Theta0N0J0C0(internal val underlying: Double) : Quan<`L⋅T`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅s"

    override fun new(siValue: Double) = `L⋅T`(siValue)

    override operator fun unaryPlus() = `L⋅T`(+underlying)
    override operator fun unaryMinus() = `L⋅T`(-underlying)

    override operator fun plus(that: `L⋅T`) = `L⋅T`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅T`) = `L⋅T`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅T`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅T`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅T`) = `L⋅T`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅T`) = if (this < that) this else that
    override infix fun max(that: `L⋅T`) = if (this > that) this else that

    override val abs get() = `L⋅T`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅T`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅T` && this.siValue == other.siValue
}


@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅T`.div(that: Quan<`L`>) = `T`(this.siValue / that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅T`.div(that: `L`) = `T`(this.siValue / that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T`>, that: Quan<`L`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_generic")
operator fun `L⋅T`.div(that: Quan<`L⋅T`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L⋅T`.div(that: `L⋅T`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T`>, that: Quan<`L⋅T`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L⋅T`.div(that: Quan<`T`>) = `L`(this.siValue / that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L⋅T`.div(that: `T`) = `L`(this.siValue / that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T`>, that: Quan<`T`>) = thiz.run { `L`(this.siValue / that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅T`.div(that: Quan<`Dimensionless`>) = `L⋅T`(this.siValue / that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅T`.div(that: `Dimensionless`) = `L⋅T`(this.siValue / that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅T`(this.siValue / that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅T`.times(that: Quan<`Dimensionless`>) = `L⋅T`(this.siValue * that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅T`.times(that: `Dimensionless`) = `L⋅T`(this.siValue * that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅T`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅T`(this.siValue * that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅T`.div(that: Quan<`L²`>) = `L⁻¹⋅T`(this.siValue / that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅T`.div(that: `L²`) = `L⁻¹⋅T`(this.siValue / that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T`>, that: Quan<`L²`>) = thiz.run { `L⁻¹⋅T`(this.siValue / that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⋅T`.div(that: Quan<`L⋅T⁻¹`>) = `T²`(this.siValue / that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⋅T`.div(that: `L⋅T⁻¹`) = `T²`(this.siValue / that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L⋅T`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `T²`(this.siValue / that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⋅T`.times(that: Quan<`L⋅T⁻¹`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⋅T`.times(that: `L⋅T⁻¹`) = `L²`(this.siValue * that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`L⋅T`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `L⋅T`.div(that: Quan<`L⁻¹⋅T`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `L⋅T`.div(that: `L⁻¹⋅T`) = `L²`(this.siValue / that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun div(thiz: Quan<`L⋅T`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `L⋅T`.times(that: Quan<`L⁻¹⋅T`>) = `T²`(this.siValue * that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `L⋅T`.times(that: `L⁻¹⋅T`) = `T²`(this.siValue * that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Multiply_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun times(thiz: Quan<`L⋅T`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `T²`(this.siValue * that.siValue) }
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T2I0Theta0N0J0C0_generic")
operator fun `L⋅T`.div(that: Quan<`T²`>) = `L⋅T⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T2I0Theta0N0J0C0_concrete")
operator fun `L⋅T`.div(that: `T²`) = `L⋅T⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0T1I0Theta0N0J0C0_Divide_L0A0M0T2I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T`>, that: Quan<`T²`>) = thiz.run { `L⋅T⁻¹`(this.siValue / that.siValue) }


typealias `L⁻¹⋅T` = A0M0T1I0Theta0N0J0C0_per_L1
inline class A0M0T1I0Theta0N0J0C0_per_L1(internal val underlying: Double) : Quan<`L⁻¹⋅T`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅s"

    override fun new(siValue: Double) = `L⁻¹⋅T`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅T`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅T`(-underlying)

    override operator fun plus(that: `L⁻¹⋅T`) = `L⁻¹⋅T`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅T`) = `L⁻¹⋅T`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅T`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅T`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅T`) = `L⁻¹⋅T`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅T`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅T`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅T`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅T`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅T` && this.siValue == other.siValue
}


@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Divide_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `L⁻¹⋅T`.div(that: Quan<`L⁻¹⋅T`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Divide_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `L⁻¹⋅T`.div(that: `L⁻¹⋅T`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Divide_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun div(thiz: Quan<`L⁻¹⋅T`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅T`.times(that: Quan<`L`>) = `T`(this.siValue * that.siValue)
// @JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅T`.times(that: `L`) = `T`(this.siValue * that.siValue)
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻¹⋅T`>, that: Quan<`L`>) = thiz.run { `T`(this.siValue * that.siValue) }
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅T`.div(that: Quan<`Dimensionless`>) = `L⁻¹⋅T`(this.siValue / that.siValue)
// @JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅T`.div(that: `Dimensionless`) = `L⁻¹⋅T`(this.siValue / that.siValue)
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁻¹⋅T`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻¹⋅T`(this.siValue / that.siValue) }
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅T`.times(that: Quan<`Dimensionless`>) = `L⁻¹⋅T`(this.siValue * that.siValue)
// @JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅T`.times(that: `Dimensionless`) = `L⁻¹⋅T`(this.siValue * that.siValue)
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻¹⋅T`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻¹⋅T`(this.siValue * that.siValue) }
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅T`.times(that: Quan<`L²`>) = `L⋅T`(this.siValue * that.siValue)
// @JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅T`.times(that: `L²`) = `L⋅T`(this.siValue * that.siValue)
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻¹⋅T`>, that: Quan<`L²`>) = thiz.run { `L⋅T`(this.siValue * that.siValue) }
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⁻¹⋅T`.times(that: Quan<`L⋅T⁻¹`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⁻¹⋅T`.times(that: `L⋅T⁻¹`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`L⁻¹⋅T`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0T1I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅T`.times(that: Quan<`L⋅T`>) = `T²`(this.siValue * that.siValue)
// @JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅T`.times(that: `L⋅T`) = `T²`(this.siValue * that.siValue)
@JvmName("A0M0T1I0Theta0N0J0C0_per_L1_Multiply_L1A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻¹⋅T`>, that: Quan<`L⋅T`>) = thiz.run { `T²`(this.siValue * that.siValue) }


typealias `T²` = L0A0M0T2I0Theta0N0J0C0
inline class L0A0M0T2I0Theta0N0J0C0(internal val underlying: Double) : Quan<`T²`> {
    override val siValue get() = underlying
    override val abrev get() = "s²"

    override fun new(siValue: Double) = `T²`(siValue)

    override operator fun unaryPlus() = `T²`(+underlying)
    override operator fun unaryMinus() = `T²`(-underlying)

    override operator fun plus(that: `T²`) = `T²`(this.underlying + that.underlying)
    override operator fun minus(that: `T²`) = `T²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `T²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `T²`(this.underlying / that.toDouble())
    override operator fun rem(that: `T²`) = `T²`(this.underlying % that.underlying)

    override infix fun min(that: `T²`) = if (this < that) this else that
    override infix fun max(that: `T²`) = if (this > that) this else that

    override val abs get() = `T²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `T²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `T²` && this.siValue == other.siValue
}


@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T2I0Theta0N0J0C0_generic")
operator fun `T²`.div(that: Quan<`T²`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T2I0Theta0N0J0C0_concrete")
operator fun `T²`.div(that: `T²`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T2I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`T²`>, that: Quan<`T²`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `T²`.div(that: Quan<`T`>) = `T`(this.siValue / that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `T²`.div(that: `T`) = `T`(this.siValue / that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`T²`>, that: Quan<`T`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `T²`.div(that: Quan<`Dimensionless`>) = `T²`(this.siValue / that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `T²`.div(that: `Dimensionless`) = `T²`(this.siValue / that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`T²`>, that: Quan<`Dimensionless`>) = thiz.run { `T²`(this.siValue / that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `T²`.times(that: Quan<`Dimensionless`>) = `T²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `T²`.times(that: `Dimensionless`) = `T²`(this.siValue * that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`T²`>, that: Quan<`Dimensionless`>) = thiz.run { `T²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `T²`.times(that: Quan<`L⋅T⁻¹`>) = `L⋅T`(this.siValue * that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `T²`.times(that: `L⋅T⁻¹`) = `L⋅T`(this.siValue * that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`T²`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L⋅T`(this.siValue * that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_generic")
operator fun `T²`.div(that: Quan<`L⋅T`>) = `L⁻¹⋅T`(this.siValue / that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_concrete")
operator fun `T²`.div(that: `L⋅T`) = `L⁻¹⋅T`(this.siValue / that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L1A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`T²`>, that: Quan<`L⋅T`>) = thiz.run { `L⁻¹⋅T`(this.siValue / that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_generic")
operator fun `T²`.div(that: Quan<`L⁻¹⋅T`>) = `L⋅T`(this.siValue / that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_concrete")
operator fun `T²`.div(that: `L⁻¹⋅T`) = `L⋅T`(this.siValue / that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_A0M0T1I0Theta0N0J0C0_per_L1_nonextension")
fun div(thiz: Quan<`T²`>, that: Quan<`L⁻¹⋅T`>) = thiz.run { `L⋅T`(this.siValue / that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `T²`.times(that: Quan<`L²⋅M⋅T⁻⁴`>) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `T²`.times(that: `L²⋅M⋅T⁻⁴`) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun times(thiz: Quan<`T²`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T2_generic")
operator fun `T²`.div(that: Quan<`L²⋅M⋅T⁻²`>) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T2_concrete")
operator fun `T²`.div(that: `L²⋅M⋅T⁻²`) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_L2A0M1I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`T²`>, that: Quan<`L²⋅M⋅T⁻²`>) = thiz.run { `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue) }
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `T²`.div(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `L²⋅M⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `T²`.div(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L²⋅M⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L0A0M0T2I0Theta0N0J0C0_Divide_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun div(thiz: Quan<`T²`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue / that.siValue) }


typealias `L²⋅T⁻²` = L2A0M0I0Theta0N0J0C0_per_T2
inline class L2A0M0I0Theta0N0J0C0_per_T2(internal val underlying: Double) : Quan<`L²⋅T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅s⁻²"

    override fun new(siValue: Double) = `L²⋅T⁻²`(siValue)

    override operator fun unaryPlus() = `L²⋅T⁻²`(+underlying)
    override operator fun unaryMinus() = `L²⋅T⁻²`(-underlying)

    override operator fun plus(that: `L²⋅T⁻²`) = `L²⋅T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅T⁻²`) = `L²⋅T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅T⁻²`) = `L²⋅T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅T⁻²`) = if (this < that) this else that
    override infix fun max(that: `L²⋅T⁻²`) = if (this > that) this else that

    override val abs get() = `L²⋅T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅T⁻²` && this.siValue == other.siValue
}

inline val Number.`Gray`: `L²⋅T⁻²` get() = `L²⋅T⁻²`(toDouble() * 1.0)
inline val `L²⋅T⁻²`.`Gray` get() = siValue * 1.0
object `Gray` : UomConverter<`L²⋅T⁻²`>,
    Quan<`L²⋅T⁻²`> by box(`L²⋅T⁻²`(1.0)) {
    override val unitName = "Gray"
    override fun invoke(x: Double) = x.`Gray`
    override fun invoke(x: `L²⋅T⁻²`) = x.`Gray`
}

inline val Number.`Sievert`: `L²⋅T⁻²` get() = `L²⋅T⁻²`(toDouble() * 1.0)
inline val `L²⋅T⁻²`.`Sievert` get() = siValue * 1.0
object `Sievert` : UomConverter<`L²⋅T⁻²`>,
    Quan<`L²⋅T⁻²`> by box(`L²⋅T⁻²`(1.0)) {
    override val unitName = "Sievert"
    override fun invoke(x: Double) = x.`Sievert`
    override fun invoke(x: `L²⋅T⁻²`) = x.`Sievert`
}


typealias `AbsorbedDose` = `L²⋅T⁻²`

typealias `EquivalentDose` = `L²⋅T⁻²`

typealias `SpecificEnergy` = `L²⋅T⁻²`

@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L²⋅T⁻²`.div(that: Quan<`L⋅T⁻¹`>) = `L⋅T⁻¹`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L²⋅T⁻²`.div(that: `L⋅T⁻¹`) = `L⋅T⁻¹`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L²⋅T⁻²`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L⋅T⁻¹`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L2A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `L²⋅T⁻²`.div(that: Quan<`L²⋅T⁻²`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L2A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `L²⋅T⁻²`.div(that: `L²⋅T⁻²`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L2A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`L²⋅T⁻²`>, that: Quan<`L²⋅T⁻²`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻²`.div(that: Quan<`Dimensionless`>) = `L²⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻²`.div(that: `Dimensionless`) = `L²⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅T⁻²`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅T⁻²`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻²`.times(that: Quan<`Dimensionless`>) = `L²⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻²`.times(that: `Dimensionless`) = `L²⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅T⁻²`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻²`.div(that: Quan<`T`>) = `L²⋅T⁻³`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻²`.div(that: `T`) = `L²⋅T⁻³`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅T⁻²`>, that: Quan<`T`>) = thiz.run { `L²⋅T⁻³`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L2A0M0I0Theta0N0J0C0_per_T3_generic")
operator fun `L²⋅T⁻²`.div(that: Quan<`L²⋅T⁻³`>) = `T`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L2A0M0I0Theta0N0J0C0_per_T3_concrete")
operator fun `L²⋅T⁻²`.div(that: `L²⋅T⁻³`) = `T`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Divide_L2A0M0I0Theta0N0J0C0_per_T3_nonextension")
fun div(thiz: Quan<`L²⋅T⁻²`>, that: Quan<`L²⋅T⁻³`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L²⋅T⁻²`.times(that: Quan<`T⁻¹`>) = `L²⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L²⋅T⁻²`.times(that: `T⁻¹`) = `L²⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`L²⋅T⁻²`>, that: Quan<`T⁻¹`>) = thiz.run { `L²⋅T⁻³`(this.siValue * that.siValue) }


typealias `L⋅T⁻²` = L1A0M0I0Theta0N0J0C0_per_T2
inline class L1A0M0I0Theta0N0J0C0_per_T2(internal val underlying: Double) : Quan<`L⋅T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅s⁻²"

    override fun new(siValue: Double) = `L⋅T⁻²`(siValue)

    override operator fun unaryPlus() = `L⋅T⁻²`(+underlying)
    override operator fun unaryMinus() = `L⋅T⁻²`(-underlying)

    override operator fun plus(that: `L⋅T⁻²`) = `L⋅T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅T⁻²`) = `L⋅T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅T⁻²`) = `L⋅T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅T⁻²`) = if (this < that) this else that
    override infix fun max(that: `L⋅T⁻²`) = if (this > that) this else that

    override val abs get() = `L⋅T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅T⁻²` && this.siValue == other.siValue
}


typealias `Acceleration` = `L⋅T⁻²`

@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⋅T⁻²`.div(that: Quan<`L⋅T⁻¹`>) = `T⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⋅T⁻²`.div(that: `L⋅T⁻¹`) = `T⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L⋅T⁻²`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `T⁻¹`(this.siValue / that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `L⋅T⁻²`.div(that: Quan<`L⋅T⁻²`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `L⋅T⁻²`.div(that: `L⋅T⁻²`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L1A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`L⋅T⁻²`>, that: Quan<`L⋅T⁻²`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⋅T⁻²`.times(that: Quan<`L⋅T⁻¹`>) = `L²⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⋅T⁻²`.times(that: `L⋅T⁻¹`) = `L²⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`L⋅T⁻²`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L²⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `L⋅T⁻²`.times(that: Quan<`L⋅T⁻²`>) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `L⋅T⁻²`.times(that: `L⋅T⁻²`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L1A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`L⋅T⁻²`>, that: Quan<`L⋅T⁻²`>) = thiz.run { `L²⋅T⁻⁴`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻²`.div(that: Quan<`Dimensionless`>) = `L⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻²`.div(that: `Dimensionless`) = `L⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅T⁻²`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅T⁻²`(this.siValue / that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻²`.times(that: Quan<`Dimensionless`>) = `L⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻²`.times(that: `Dimensionless`) = `L⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅T⁻²`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L⋅T⁻²`.times(that: Quan<`T`>) = `L⋅T⁻¹`(this.siValue * that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L⋅T⁻²`.times(that: `T`) = `L⋅T⁻¹`(this.siValue * that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅T⁻²`>, that: Quan<`T`>) = thiz.run { `L⋅T⁻¹`(this.siValue * that.siValue) }
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L⋅T⁻²`.div(that: Quan<`T⁻¹`>) = `L⋅T⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L⋅T⁻²`.div(that: `T⁻¹`) = `L⋅T⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0I0Theta0N0J0C0_per_T2_Divide_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L⋅T⁻²`>, that: Quan<`T⁻¹`>) = thiz.run { `L⋅T⁻¹`(this.siValue / that.siValue) }


typealias `L²⋅T⁻³` = L2A0M0I0Theta0N0J0C0_per_T3
inline class L2A0M0I0Theta0N0J0C0_per_T3(internal val underlying: Double) : Quan<`L²⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅s⁻³"

    override fun new(siValue: Double) = `L²⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `L²⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `L²⋅T⁻³`(-underlying)

    override operator fun plus(that: `L²⋅T⁻³`) = `L²⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅T⁻³`) = `L²⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅T⁻³`) = `L²⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `L²⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `L²⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅T⁻³` && this.siValue == other.siValue
}


typealias `AbsorbedDoseRate` = `L²⋅T⁻³`

@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L²⋅T⁻³`.div(that: Quan<`L⋅T⁻¹`>) = `L⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L²⋅T⁻³`.div(that: `L⋅T⁻¹`) = `L⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L⋅T⁻²`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T3_generic")
operator fun `L²⋅T⁻³`.div(that: Quan<`L²⋅T⁻³`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T3_concrete")
operator fun `L²⋅T⁻³`.div(that: `L²⋅T⁻³`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T3_nonextension")
fun div(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`L²⋅T⁻³`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L1A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `L²⋅T⁻³`.div(that: Quan<`L⋅T⁻²`>) = `L⋅T⁻¹`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L1A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `L²⋅T⁻³`.div(that: `L⋅T⁻²`) = `L⋅T⁻¹`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L1A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`L⋅T⁻²`>) = thiz.run { `L⋅T⁻¹`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻³`.div(that: Quan<`Dimensionless`>) = `L²⋅T⁻³`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻³`.div(that: `Dimensionless`) = `L²⋅T⁻³`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅T⁻³`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻³`.times(that: Quan<`Dimensionless`>) = `L²⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻³`.times(that: `Dimensionless`) = `L²⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `L²⋅T⁻³`.div(that: Quan<`L²⋅T⁻²`>) = `T⁻¹`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `L²⋅T⁻³`.div(that: `L²⋅T⁻²`) = `T⁻¹`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`L²⋅T⁻²`>) = thiz.run { `T⁻¹`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻³`.div(that: Quan<`T`>) = `L²⋅T⁻⁴`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻³`.div(that: `T`) = `L²⋅T⁻⁴`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`T`>) = thiz.run { `L²⋅T⁻⁴`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻³`.times(that: Quan<`T`>) = `L²⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻³`.times(that: `T`) = `L²⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`T`>) = thiz.run { `L²⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L²⋅T⁻³`.div(that: Quan<`T⁻¹`>) = `L²⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L²⋅T⁻³`.div(that: `T⁻¹`) = `L²⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`T⁻¹`>) = thiz.run { `L²⋅T⁻²`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L²⋅T⁻³`.times(that: Quan<`T⁻¹`>) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L²⋅T⁻³`.times(that: `T⁻¹`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Multiply_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`T⁻¹`>) = thiz.run { `L²⋅T⁻⁴`(this.siValue * that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T4_generic")
operator fun `L²⋅T⁻³`.div(that: Quan<`L²⋅T⁻⁴`>) = `T`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T4_concrete")
operator fun `L²⋅T⁻³`.div(that: `L²⋅T⁻⁴`) = `T`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T3_Divide_L2A0M0I0Theta0N0J0C0_per_T4_nonextension")
fun div(thiz: Quan<`L²⋅T⁻³`>, that: Quan<`L²⋅T⁻⁴`>) = thiz.run { `T`(this.siValue / that.siValue) }


typealias `T⁻¹` = L0A0M0I0Theta0N0J0C0_per_T1
inline class L0A0M0I0Theta0N0J0C0_per_T1(internal val underlying: Double) : Quan<`T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "s⁻¹"

    override fun new(siValue: Double) = `T⁻¹`(siValue)

    override operator fun unaryPlus() = `T⁻¹`(+underlying)
    override operator fun unaryMinus() = `T⁻¹`(-underlying)

    override operator fun plus(that: `T⁻¹`) = `T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `T⁻¹`) = `T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `T⁻¹`) = `T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `T⁻¹`) = if (this > that) this else that

    override val abs get() = `T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `T⁻¹` && this.siValue == other.siValue
}

inline val Number.`Hertz`: `T⁻¹` get() = `T⁻¹`(toDouble() * 1.0)
inline val `T⁻¹`.`Hertz` get() = siValue * 1.0
object `Hertz` : UomConverter<`T⁻¹`>,
    Quan<`T⁻¹`> by box(`T⁻¹`(1.0)) {
    override val unitName = "Hertz"
    override fun invoke(x: Double) = x.`Hertz`
    override fun invoke(x: `T⁻¹`) = x.`Hertz`
}

inline val Number.`Becquerel`: `T⁻¹` get() = `T⁻¹`(toDouble() * 1.0)
inline val `T⁻¹`.`Becquerel` get() = siValue * 1.0
object `Becquerel` : UomConverter<`T⁻¹`>,
    Quan<`T⁻¹`> by box(`T⁻¹`(1.0)) {
    override val unitName = "Becquerel"
    override fun invoke(x: Double) = x.`Becquerel`
    override fun invoke(x: `T⁻¹`) = x.`Becquerel`
}


typealias `Frequency` = `T⁻¹`

typealias `Radioactivity` = `T⁻¹`

@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `T⁻¹`.div(that: Quan<`T⁻¹`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `T⁻¹`.div(that: `T⁻¹`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`T⁻¹`>, that: Quan<`T⁻¹`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `T⁻¹`.times(that: Quan<`L⋅T⁻¹`>) = `L⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `T⁻¹`.times(that: `L⋅T⁻¹`) = `L⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L1A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun times(thiz: Quan<`T⁻¹`>, that: Quan<`L⋅T⁻¹`>) = thiz.run { `L⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `T⁻¹`.div(that: Quan<`Dimensionless`>) = `T⁻¹`(this.siValue / that.siValue)
// @JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `T⁻¹`.div(that: `Dimensionless`) = `T⁻¹`(this.siValue / that.siValue)
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`T⁻¹`>, that: Quan<`Dimensionless`>) = thiz.run { `T⁻¹`(this.siValue / that.siValue) }
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `T⁻¹`.times(that: Quan<`Dimensionless`>) = `T⁻¹`(this.siValue * that.siValue)
// @JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `T⁻¹`.times(that: `Dimensionless`) = `T⁻¹`(this.siValue * that.siValue)
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`T⁻¹`>, that: Quan<`Dimensionless`>) = thiz.run { `T⁻¹`(this.siValue * that.siValue) }
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L2A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `T⁻¹`.times(that: Quan<`L²⋅T⁻²`>) = `L²⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L2A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `T⁻¹`.times(that: `L²⋅T⁻²`) = `L²⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L2A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`T⁻¹`>, that: Quan<`L²⋅T⁻²`>) = thiz.run { `L²⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `T⁻¹`.times(that: Quan<`T`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `T⁻¹`.times(that: `T`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`T⁻¹`>, that: Quan<`T`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_generic")
operator fun `T⁻¹`.times(that: Quan<`L²⋅T⁻³`>) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
// @JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_concrete")
operator fun `T⁻¹`.times(that: `L²⋅T⁻³`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
@JvmName("L0A0M0I0Theta0N0J0C0_per_T1_Multiply_L2A0M0I0Theta0N0J0C0_per_T3_nonextension")
fun times(thiz: Quan<`T⁻¹`>, that: Quan<`L²⋅T⁻³`>) = thiz.run { `L²⋅T⁻⁴`(this.siValue * that.siValue) }


typealias `L²⋅T⁻⁴` = L2A0M0I0Theta0N0J0C0_per_T4
inline class L2A0M0I0Theta0N0J0C0_per_T4(internal val underlying: Double) : Quan<`L²⋅T⁻⁴`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅s⁻⁴"

    override fun new(siValue: Double) = `L²⋅T⁻⁴`(siValue)

    override operator fun unaryPlus() = `L²⋅T⁻⁴`(+underlying)
    override operator fun unaryMinus() = `L²⋅T⁻⁴`(-underlying)

    override operator fun plus(that: `L²⋅T⁻⁴`) = `L²⋅T⁻⁴`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅T⁻⁴`) = `L²⋅T⁻⁴`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅T⁻⁴`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅T⁻⁴`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅T⁻⁴`) = `L²⋅T⁻⁴`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅T⁻⁴`) = if (this < that) this else that
    override infix fun max(that: `L²⋅T⁻⁴`) = if (this > that) this else that

    override val abs get() = `L²⋅T⁻⁴`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅T⁻⁴`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅T⁻⁴` && this.siValue == other.siValue
}


@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L2A0M0I0Theta0N0J0C0_per_T4_generic")
operator fun `L²⋅T⁻⁴`.div(that: Quan<`L²⋅T⁻⁴`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L2A0M0I0Theta0N0J0C0_per_T4_concrete")
operator fun `L²⋅T⁻⁴`.div(that: `L²⋅T⁻⁴`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L2A0M0I0Theta0N0J0C0_per_T4_nonextension")
fun div(thiz: Quan<`L²⋅T⁻⁴`>, that: Quan<`L²⋅T⁻⁴`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L1A0M0I0Theta0N0J0C0_per_T2_generic")
operator fun `L²⋅T⁻⁴`.div(that: Quan<`L⋅T⁻²`>) = `L⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L1A0M0I0Theta0N0J0C0_per_T2_concrete")
operator fun `L²⋅T⁻⁴`.div(that: `L⋅T⁻²`) = `L⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L1A0M0I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`L²⋅T⁻⁴`>, that: Quan<`L⋅T⁻²`>) = thiz.run { `L⋅T⁻²`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻⁴`.div(that: Quan<`Dimensionless`>) = `L²⋅T⁻⁴`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻⁴`.div(that: `Dimensionless`) = `L²⋅T⁻⁴`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅T⁻⁴`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅T⁻⁴`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻⁴`.times(that: Quan<`Dimensionless`>) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻⁴`.times(that: `Dimensionless`) = `L²⋅T⁻⁴`(this.siValue * that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅T⁻⁴`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅T⁻⁴`(this.siValue * that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²⋅T⁻⁴`.times(that: Quan<`T`>) = `L²⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²⋅T⁻⁴`.times(that: `T`) = `L²⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅T⁻⁴`>, that: Quan<`T`>) = thiz.run { `L²⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L2A0M0I0Theta0N0J0C0_per_T3_generic")
operator fun `L²⋅T⁻⁴`.div(that: Quan<`L²⋅T⁻³`>) = `T⁻¹`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L2A0M0I0Theta0N0J0C0_per_T3_concrete")
operator fun `L²⋅T⁻⁴`.div(that: `L²⋅T⁻³`) = `T⁻¹`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L2A0M0I0Theta0N0J0C0_per_T3_nonextension")
fun div(thiz: Quan<`L²⋅T⁻⁴`>, that: Quan<`L²⋅T⁻³`>) = thiz.run { `T⁻¹`(this.siValue / that.siValue) }
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L0A0M0I0Theta0N0J0C0_per_T1_generic")
operator fun `L²⋅T⁻⁴`.div(that: Quan<`T⁻¹`>) = `L²⋅T⁻³`(this.siValue / that.siValue)
// @JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L0A0M0I0Theta0N0J0C0_per_T1_concrete")
operator fun `L²⋅T⁻⁴`.div(that: `T⁻¹`) = `L²⋅T⁻³`(this.siValue / that.siValue)
@JvmName("L2A0M0I0Theta0N0J0C0_per_T4_Divide_L0A0M0I0Theta0N0J0C0_per_T1_nonextension")
fun div(thiz: Quan<`L²⋅T⁻⁴`>, that: Quan<`T⁻¹`>) = thiz.run { `L²⋅T⁻³`(this.siValue / that.siValue) }


typealias `L²⋅M⋅T⁻³` = L2A0M1I0Theta0N0J0C0_per_T3
inline class L2A0M1I0Theta0N0J0C0_per_T3(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻³"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻³`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻³`) = `L²⋅M⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻³`) = `L²⋅M⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻³`) = `L²⋅M⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻³` && this.siValue == other.siValue
}

inline val Number.`Watt`: `L²⋅M⋅T⁻³` get() = `L²⋅M⋅T⁻³`(toDouble() * 1.0)
inline val `L²⋅M⋅T⁻³`.`Watt` get() = siValue * 1.0
object `Watt` : UomConverter<`L²⋅M⋅T⁻³`>,
    Quan<`L²⋅M⋅T⁻³`> by box(`L²⋅M⋅T⁻³`(1.0)) {
    override val unitName = "Watt"
    override fun invoke(x: Double) = x.`Watt`
    override fun invoke(x: `L²⋅M⋅T⁻³`) = x.`Watt`
}


typealias `Power` = `L²⋅M⋅T⁻³`

typealias `RadiantFlux` = `L²⋅M⋅T⁻³`

@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L2A0M1I0Theta0N0J0C0_per_T3_generic")
operator fun `L²⋅M⋅T⁻³`.div(that: Quan<`L²⋅M⋅T⁻³`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L2A0M1I0Theta0N0J0C0_per_T3_concrete")
operator fun `L²⋅M⋅T⁻³`.div(that: `L²⋅M⋅T⁻³`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L2A0M1I0Theta0N0J0C0_per_T3_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻³`>, that: Quan<`L²⋅M⋅T⁻³`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_generic")
operator fun `L²⋅M⋅T⁻³`.times(that: Quan<`L²⋅M⋅T⁻³`>) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_concrete")
operator fun `L²⋅M⋅T⁻³`.times(that: `L²⋅M⋅T⁻³`) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻³`>, that: Quan<`L²⋅M⋅T⁻³`>) = thiz.run { `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻³`.div(that: Quan<`T`>) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻³`.div(that: `T`) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻³`>, that: Quan<`T`>) = thiz.run { `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻³`.times(that: Quan<`T`>) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻³`.times(that: `T`) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻³`>, that: Quan<`T`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻³`.div(that: Quan<`Dimensionless`>) = `L²⋅M⋅T⁻³`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻³`.div(that: `Dimensionless`) = `L²⋅M⋅T⁻³`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻³`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅M⋅T⁻³`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻³`.times(that: Quan<`Dimensionless`>) = `L²⋅M⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻³`.times(that: `Dimensionless`) = `L²⋅M⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻³`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅M⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `L²⋅M⋅T⁻³`.div(that: Quan<`L²⋅M⋅T⁻⁴`>) = `T`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `L²⋅M⋅T⁻³`.div(that: `L²⋅M⋅T⁻⁴`) = `T`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Divide_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻³`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `L²⋅M⋅T⁻³`.times(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `T`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `L²⋅M⋅T⁻³`.times(that: `L⁻²⋅M⁻¹⋅T⁴`) = `T`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T3_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻³`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `T`(this.siValue * that.siValue) }


typealias `L⁴⋅M²⋅T⁻⁶` = L4A0M2I0Theta0N0J0C0_per_T6
inline class L4A0M2I0Theta0N0J0C0_per_T6(internal val underlying: Double) : Quan<`L⁴⋅M²⋅T⁻⁶`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁴⋅kg²⋅s⁻⁶"

    override fun new(siValue: Double) = `L⁴⋅M²⋅T⁻⁶`(siValue)

    override operator fun unaryPlus() = `L⁴⋅M²⋅T⁻⁶`(+underlying)
    override operator fun unaryMinus() = `L⁴⋅M²⋅T⁻⁶`(-underlying)

    override operator fun plus(that: `L⁴⋅M²⋅T⁻⁶`) = `L⁴⋅M²⋅T⁻⁶`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁴⋅M²⋅T⁻⁶`) = `L⁴⋅M²⋅T⁻⁶`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁴⋅M²⋅T⁻⁶`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁴⋅M²⋅T⁻⁶`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁴⋅M²⋅T⁻⁶`) = `L⁴⋅M²⋅T⁻⁶`(this.underlying % that.underlying)

    override infix fun min(that: `L⁴⋅M²⋅T⁻⁶`) = if (this < that) this else that
    override infix fun max(that: `L⁴⋅M²⋅T⁻⁶`) = if (this > that) this else that

    override val abs get() = `L⁴⋅M²⋅T⁻⁶`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁴⋅M²⋅T⁻⁶`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁴⋅M²⋅T⁻⁶` && this.siValue == other.siValue
}


@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T3_generic")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: Quan<`L²⋅M⋅T⁻³`>) = `L²⋅M⋅T⁻³`(this.siValue / that.siValue)
// @JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T3_concrete")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: `L²⋅M⋅T⁻³`) = `L²⋅M⋅T⁻³`(this.siValue / that.siValue)
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T3_nonextension")
fun div(thiz: Quan<`L⁴⋅M²⋅T⁻⁶`>, that: Quan<`L²⋅M⋅T⁻³`>) = thiz.run { `L²⋅M⋅T⁻³`(this.siValue / that.siValue) }
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L4A0M2I0Theta0N0J0C0_per_T6_generic")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: Quan<`L⁴⋅M²⋅T⁻⁶`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L4A0M2I0Theta0N0J0C0_per_T6_concrete")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: `L⁴⋅M²⋅T⁻⁶`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L4A0M2I0Theta0N0J0C0_per_T6_nonextension")
fun div(thiz: Quan<`L⁴⋅M²⋅T⁻⁶`>, that: Quan<`L⁴⋅M²⋅T⁻⁶`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: Quan<`Dimensionless`>) = `L⁴⋅M²⋅T⁻⁶`(this.siValue / that.siValue)
// @JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: `Dimensionless`) = `L⁴⋅M²⋅T⁻⁶`(this.siValue / that.siValue)
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁴⋅M²⋅T⁻⁶`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁴⋅M²⋅T⁻⁶`(this.siValue / that.siValue) }
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴⋅M²⋅T⁻⁶`.times(that: Quan<`Dimensionless`>) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
// @JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴⋅M²⋅T⁻⁶`.times(that: `Dimensionless`) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁴⋅M²⋅T⁻⁶`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue) }
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: Quan<`L²⋅M⋅T⁻⁴`>) = `L²⋅M⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: `L²⋅M⋅T⁻⁴`) = `L²⋅M⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun div(thiz: Quan<`L⁴⋅M²⋅T⁻⁶`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue / that.siValue) }
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T2_generic")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: Quan<`L²⋅M⋅T⁻²`>) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
// @JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T2_concrete")
operator fun `L⁴⋅M²⋅T⁻⁶`.div(that: `L²⋅M⋅T⁻²`) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Divide_L2A0M1I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`L⁴⋅M²⋅T⁻⁶`>, that: Quan<`L²⋅M⋅T⁻²`>) = thiz.run { `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue) }
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `L⁴⋅M²⋅T⁻⁶`.times(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `L⁴⋅M²⋅T⁻⁶`.times(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L4A0M2I0Theta0N0J0C0_per_T6_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun times(thiz: Quan<`L⁴⋅M²⋅T⁻⁶`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue * that.siValue) }


typealias `L²⋅M⋅T⁻⁴` = L2A0M1I0Theta0N0J0C0_per_T4
inline class L2A0M1I0Theta0N0J0C0_per_T4(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻⁴`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻⁴"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻⁴`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻⁴`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻⁴`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻⁴`) = `L²⋅M⋅T⁻⁴`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻⁴`) = `L²⋅M⋅T⁻⁴`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻⁴`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻⁴`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻⁴`) = `L²⋅M⋅T⁻⁴`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻⁴`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻⁴`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻⁴`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻⁴`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻⁴` && this.siValue == other.siValue
}


@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Divide_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `L²⋅M⋅T⁻⁴`.div(that: Quan<`L²⋅M⋅T⁻⁴`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Divide_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `L²⋅M⋅T⁻⁴`.div(that: `L²⋅M⋅T⁻⁴`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Divide_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻⁴`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻⁴`.times(that: Quan<`T`>) = `L²⋅M⋅T⁻³`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻⁴`.times(that: `T`) = `L²⋅M⋅T⁻³`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻⁴`>, that: Quan<`T`>) = thiz.run { `L²⋅M⋅T⁻³`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻⁴`.div(that: Quan<`Dimensionless`>) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻⁴`.div(that: `Dimensionless`) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻⁴`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻⁴`.times(that: Quan<`Dimensionless`>) = `L²⋅M⋅T⁻⁴`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻⁴`.times(that: `Dimensionless`) = `L²⋅M⋅T⁻⁴`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻⁴`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅M⋅T⁻⁴`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_generic")
operator fun `L²⋅M⋅T⁻⁴`.times(that: Quan<`L²⋅M⋅T⁻²`>) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_concrete")
operator fun `L²⋅M⋅T⁻⁴`.times(that: `L²⋅M⋅T⁻²`) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻⁴`>, that: Quan<`L²⋅M⋅T⁻²`>) = thiz.run { `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `L²⋅M⋅T⁻⁴`.times(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `L²⋅M⋅T⁻⁴`.times(that: `L⁻²⋅M⁻¹⋅T⁴`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻⁴`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T2I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻⁴`.times(that: Quan<`T²`>) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T2I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻⁴`.times(that: `T²`) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T4_Multiply_L0A0M0T2I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻⁴`>, that: Quan<`T²`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue * that.siValue) }


typealias `L²⋅M⋅T⁻²` = L2A0M1I0Theta0N0J0C0_per_T2
inline class L2A0M1I0Theta0N0J0C0_per_T2(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻²"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻²`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻²`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻²`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻²`) = `L²⋅M⋅T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻²`) = `L²⋅M⋅T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻²`) = `L²⋅M⋅T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻²`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻²`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻²` && this.siValue == other.siValue
}

inline val Number.`Joule`: `L²⋅M⋅T⁻²` get() = `L²⋅M⋅T⁻²`(toDouble() * 1.0)
inline val `L²⋅M⋅T⁻²`.`Joule` get() = siValue * 1.0
object `Joule` : UomConverter<`L²⋅M⋅T⁻²`>,
    Quan<`L²⋅M⋅T⁻²`> by box(`L²⋅M⋅T⁻²`(1.0)) {
    override val unitName = "Joule"
    override fun invoke(x: Double) = x.`Joule`
    override fun invoke(x: `L²⋅M⋅T⁻²`) = x.`Joule`
}


typealias `Energy` = `L²⋅M⋅T⁻²`

typealias `Work` = `L²⋅M⋅T⁻²`

typealias `Heat` = `L²⋅M⋅T⁻²`

typealias `MomentOfForce` = `L²⋅M⋅T⁻²`

@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T3_generic")
operator fun `L²⋅M⋅T⁻²`.div(that: Quan<`L²⋅M⋅T⁻³`>) = `T`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T3_concrete")
operator fun `L²⋅M⋅T⁻²`.div(that: `L²⋅M⋅T⁻³`) = `T`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T3_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`L²⋅M⋅T⁻³`>) = thiz.run { `T`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T2_generic")
operator fun `L²⋅M⋅T⁻²`.div(that: Quan<`L²⋅M⋅T⁻²`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T2_concrete")
operator fun `L²⋅M⋅T⁻²`.div(that: `L²⋅M⋅T⁻²`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T2_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`L²⋅M⋅T⁻²`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T1I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻²`.div(that: Quan<`T`>) = `L²⋅M⋅T⁻³`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T1I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻²`.div(that: `T`) = `L²⋅M⋅T⁻³`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T1I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`T`>) = thiz.run { `L²⋅M⋅T⁻³`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻²`.div(that: Quan<`Dimensionless`>) = `L²⋅M⋅T⁻²`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻²`.div(that: `Dimensionless`) = `L²⋅M⋅T⁻²`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻²`.times(that: Quan<`Dimensionless`>) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻²`.times(that: `Dimensionless`) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`Dimensionless`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L4A0M2I0Theta0N0J0C0_per_T6_generic")
operator fun `L²⋅M⋅T⁻²`.div(that: Quan<`L⁴⋅M²⋅T⁻⁶`>) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L4A0M2I0Theta0N0J0C0_per_T6_concrete")
operator fun `L²⋅M⋅T⁻²`.div(that: `L⁴⋅M²⋅T⁻⁶`) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L4A0M2I0Theta0N0J0C0_per_T6_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`L⁴⋅M²⋅T⁻⁶`>) = thiz.run { `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `L²⋅M⋅T⁻²`.div(that: Quan<`L²⋅M⋅T⁻⁴`>) = `T²`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `L²⋅M⋅T⁻²`.div(that: `L²⋅M⋅T⁻⁴`) = `T²`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `T²`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `L²⋅M⋅T⁻²`.times(that: Quan<`L²⋅M⋅T⁻⁴`>) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `L²⋅M⋅T⁻²`.times(that: `L²⋅M⋅T⁻⁴`) = `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `L⁴⋅M²⋅T⁻⁶`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `L²⋅M⋅T⁻²`.div(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `L⁴⋅M²⋅T⁻⁶`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `L²⋅M⋅T⁻²`.div(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L⁴⋅M²⋅T⁻⁶`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `L⁴⋅M²⋅T⁻⁶`(this.siValue / that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `L²⋅M⋅T⁻²`.times(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `T²`(this.siValue * that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `L²⋅M⋅T⁻²`.times(that: `L⁻²⋅M⁻¹⋅T⁴`) = `T²`(this.siValue * that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Multiply_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun times(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `T²`(this.siValue * that.siValue) }
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T2I0Theta0N0J0C0_generic")
operator fun `L²⋅M⋅T⁻²`.div(that: Quan<`T²`>) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
// @JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T2I0Theta0N0J0C0_concrete")
operator fun `L²⋅M⋅T⁻²`.div(that: `T²`) = `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue)
@JvmName("L2A0M1I0Theta0N0J0C0_per_T2_Divide_L0A0M0T2I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L²⋅M⋅T⁻²`>, that: Quan<`T²`>) = thiz.run { `L²⋅M⋅T⁻⁴`(this.siValue / that.siValue) }


typealias `L⁻²⋅M⁻¹⋅T⁴` = A0T4I0Theta0N0J0C0_per_L2M1
inline class A0T4I0Theta0N0J0C0_per_L2M1(internal val underlying: Double) : Quan<`L⁻²⋅M⁻¹⋅T⁴`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅kg⁻¹⋅s⁴"

    override fun new(siValue: Double) = `L⁻²⋅M⁻¹⋅T⁴`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅M⁻¹⋅T⁴`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅M⁻¹⋅T⁴`(-underlying)

    override operator fun plus(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L⁻²⋅M⁻¹⋅T⁴`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L⁻²⋅M⁻¹⋅T⁴`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅M⁻¹⋅T⁴`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅M⁻¹⋅T⁴`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅M⁻¹⋅T⁴`) = `L⁻²⋅M⁻¹⋅T⁴`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅M⁻¹⋅T⁴`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅M⁻¹⋅T⁴`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅M⁻¹⋅T⁴`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅M⁻¹⋅T⁴`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅M⁻¹⋅T⁴` && this.siValue == other.siValue
}


@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Divide_A0T4I0Theta0N0J0C0_per_L2M1_generic")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.div(that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Divide_A0T4I0Theta0N0J0C0_per_L2M1_concrete")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.div(that: `L⁻²⋅M⁻¹⋅T⁴`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Divide_A0T4I0Theta0N0J0C0_per_L2M1_nonextension")
fun div(thiz: Quan<`L⁻²⋅M⁻¹⋅T⁴`>, that: Quan<`L⁻²⋅M⁻¹⋅T⁴`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_generic")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: Quan<`L²⋅M⋅T⁻³`>) = `T`(this.siValue * that.siValue)
// @JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_concrete")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: `L²⋅M⋅T⁻³`) = `T`(this.siValue * that.siValue)
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T3_nonextension")
fun times(thiz: Quan<`L⁻²⋅M⁻¹⋅T⁴`>, that: Quan<`L²⋅M⋅T⁻³`>) = thiz.run { `T`(this.siValue * that.siValue) }
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.div(that: Quan<`Dimensionless`>) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
// @JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.div(that: `Dimensionless`) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue)
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁻²⋅M⁻¹⋅T⁴`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻²⋅M⁻¹⋅T⁴`(this.siValue / that.siValue) }
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: Quan<`Dimensionless`>) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue * that.siValue)
// @JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: `Dimensionless`) = `L⁻²⋅M⁻¹⋅T⁴`(this.siValue * that.siValue)
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻²⋅M⁻¹⋅T⁴`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻²⋅M⁻¹⋅T⁴`(this.siValue * that.siValue) }
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L4A0M2I0Theta0N0J0C0_per_T6_generic")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: Quan<`L⁴⋅M²⋅T⁻⁶`>) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
// @JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L4A0M2I0Theta0N0J0C0_per_T6_concrete")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: `L⁴⋅M²⋅T⁻⁶`) = `L²⋅M⋅T⁻²`(this.siValue * that.siValue)
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L4A0M2I0Theta0N0J0C0_per_T6_nonextension")
fun times(thiz: Quan<`L⁻²⋅M⁻¹⋅T⁴`>, that: Quan<`L⁴⋅M²⋅T⁻⁶`>) = thiz.run { `L²⋅M⋅T⁻²`(this.siValue * that.siValue) }
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_generic")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: Quan<`L²⋅M⋅T⁻⁴`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_concrete")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: `L²⋅M⋅T⁻⁴`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T4_nonextension")
fun times(thiz: Quan<`L⁻²⋅M⁻¹⋅T⁴`>, that: Quan<`L²⋅M⋅T⁻⁴`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_generic")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: Quan<`L²⋅M⋅T⁻²`>) = `T²`(this.siValue * that.siValue)
// @JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_concrete")
operator fun `L⁻²⋅M⁻¹⋅T⁴`.times(that: `L²⋅M⋅T⁻²`) = `T²`(this.siValue * that.siValue)
@JvmName("A0T4I0Theta0N0J0C0_per_L2M1_Multiply_L2A0M1I0Theta0N0J0C0_per_T2_nonextension")
fun times(thiz: Quan<`L⁻²⋅M⁻¹⋅T⁴`>, that: Quan<`L²⋅M⋅T⁻²`>) = thiz.run { `T²`(this.siValue * that.siValue) }


typealias `¤` = L0A0M0T0I0Theta0N0J0C1
inline class L0A0M0T0I0Theta0N0J0C1(internal val underlying: Double) : Quan<`¤`> {
    override val siValue get() = underlying
    override val abrev get() = "¤"

    override fun new(siValue: Double) = `¤`(siValue)

    override operator fun unaryPlus() = `¤`(+underlying)
    override operator fun unaryMinus() = `¤`(-underlying)

    override operator fun plus(that: `¤`) = `¤`(this.underlying + that.underlying)
    override operator fun minus(that: `¤`) = `¤`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `¤`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `¤`(this.underlying / that.toDouble())
    override operator fun rem(that: `¤`) = `¤`(this.underlying % that.underlying)

    override infix fun min(that: `¤`) = if (this < that) this else that
    override infix fun max(that: `¤`) = if (this > that) this else that

    override val abs get() = `¤`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `¤`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `¤` && this.siValue == other.siValue
}

inline val Number.`£`: `Currency` get() = `¤`(toDouble() * 1.24)
inline val `¤`.`£` get() = siValue * 0.8064516129032259
object `£` : UomConverter<`¤`>,
    Quan<`¤`> by box(`¤`(1.24)) {
    override val unitName = "£"
    override fun invoke(x: Double) = x.`£`
    override fun invoke(x: `¤`) = x.`£`
}

inline val Number.`¢`: `Currency` get() = `¤`(toDouble() * 0.01)
inline val `¤`.`¢` get() = siValue * 100.0
object `¢` : UomConverter<`¤`>,
    Quan<`¤`> by box(`¤`(0.01)) {
    override val unitName = "¢"
    override fun invoke(x: Double) = x.`¢`
    override fun invoke(x: `¤`) = x.`¢`
}

inline val Number.`$`: `Currency` get() = `¤`(toDouble() * 1.0)
inline val `¤`.`$` get() = siValue * 1.0
object `$` : UomConverter<`¤`>,
    Quan<`¤`> by box(`¤`(1.0)) {
    override val unitName = "$"
    override fun invoke(x: Double) = x.`$`
    override fun invoke(x: `¤`) = x.`$`
}


typealias `Currency` = `¤`

@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `¤`.div(that: Quan<`¤`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `¤`.div(that: `¤`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`¤`>, that: Quan<`¤`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `¤`.times(that: Quan<`¤`>) = `¤²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `¤`.times(that: `¤`) = `¤²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`¤`>, that: Quan<`¤`>) = thiz.run { `¤²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `¤`.div(that: Quan<`L³`>) = `L⁻³⋅¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `¤`.div(that: `L³`) = `L⁻³⋅¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`¤`>, that: Quan<`L³`>) = thiz.run { `L⁻³⋅¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `¤`.times(that: Quan<`L³`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `¤`.times(that: `L³`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`¤`>, that: Quan<`L³`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `¤`.div(that: Quan<`L`>) = `L⁻¹⋅¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `¤`.div(that: `L`) = `L⁻¹⋅¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`¤`>, that: Quan<`L`>) = thiz.run { `L⁻¹⋅¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `¤`.times(that: Quan<`L`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `¤`.times(that: `L`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`¤`>, that: Quan<`L`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `¤`.div(that: Quan<`Dimensionless`>) = `¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `¤`.div(that: `Dimensionless`) = `¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`¤`>, that: Quan<`Dimensionless`>) = thiz.run { `¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `¤`.times(that: Quan<`Dimensionless`>) = `¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `¤`.times(that: `Dimensionless`) = `¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`¤`>, that: Quan<`Dimensionless`>) = thiz.run { `¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `¤`.div(that: Quan<`L⁻³⋅¤`>) = `L³`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `¤`.div(that: `L⁻³⋅¤`) = `L³`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun div(thiz: Quan<`¤`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L³`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `¤`.times(that: Quan<`L³⋅¤⁻¹`>) = `L³`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `¤`.times(that: `L³⋅¤⁻¹`) = `L³`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`¤`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L³`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `¤`.div(that: Quan<`L⁻¹⋅¤`>) = `L`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `¤`.div(that: `L⁻¹⋅¤`) = `L`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun div(thiz: Quan<`¤`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `¤`.times(that: Quan<`L⋅¤⁻¹`>) = `L`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `¤`.times(that: `L⋅¤⁻¹`) = `L`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`¤`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L`(this.siValue * that.siValue) }


typealias `¤²` = L0A0M0T0I0Theta0N0J0C2
inline class L0A0M0T0I0Theta0N0J0C2(internal val underlying: Double) : Quan<`¤²`> {
    override val siValue get() = underlying
    override val abrev get() = "¤²"

    override fun new(siValue: Double) = `¤²`(siValue)

    override operator fun unaryPlus() = `¤²`(+underlying)
    override operator fun unaryMinus() = `¤²`(-underlying)

    override operator fun plus(that: `¤²`) = `¤²`(this.underlying + that.underlying)
    override operator fun minus(that: `¤²`) = `¤²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `¤²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `¤²`(this.underlying / that.toDouble())
    override operator fun rem(that: `¤²`) = `¤²`(this.underlying % that.underlying)

    override infix fun min(that: `¤²`) = if (this < that) this else that
    override infix fun max(that: `¤²`) = if (this > that) this else that

    override val abs get() = `¤²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `¤²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `¤²` && this.siValue == other.siValue
}


@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `¤²`.div(that: Quan<`¤`>) = `¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `¤²`.div(that: `¤`) = `¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`¤²`>, that: Quan<`¤`>) = thiz.run { `¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C2_generic")
operator fun `¤²`.div(that: Quan<`¤²`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C2_concrete")
operator fun `¤²`.div(that: `¤²`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C2_nonextension")
fun div(thiz: Quan<`¤²`>, that: Quan<`¤²`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `¤²`.div(that: Quan<`Dimensionless`>) = `¤²`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `¤²`.div(that: `Dimensionless`) = `¤²`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`¤²`>, that: Quan<`Dimensionless`>) = thiz.run { `¤²`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `¤²`.times(that: Quan<`Dimensionless`>) = `¤²`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `¤²`.times(that: `Dimensionless`) = `¤²`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`¤²`>, that: Quan<`Dimensionless`>) = thiz.run { `¤²`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `¤²`.div(that: Quan<`L⁻³⋅¤`>) = `L³⋅¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `¤²`.div(that: `L⁻³⋅¤`) = `L³⋅¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun div(thiz: Quan<`¤²`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L³⋅¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `¤²`.div(that: Quan<`L³⋅¤`>) = `L⁻³⋅¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `¤²`.div(that: `L³⋅¤`) = `L⁻³⋅¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`¤²`>, that: Quan<`L³⋅¤`>) = thiz.run { `L⁻³⋅¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `¤²`.times(that: Quan<`L³⋅¤⁻¹`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `¤²`.times(that: `L³⋅¤⁻¹`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`¤²`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `¤²`.div(that: Quan<`L⁻¹⋅¤`>) = `L⋅¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `¤²`.div(that: `L⁻¹⋅¤`) = `L⋅¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun div(thiz: Quan<`¤²`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L⋅¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `¤²`.div(that: Quan<`L⋅¤`>) = `L⁻¹⋅¤`(this.siValue / that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `¤²`.div(that: `L⋅¤`) = `L⁻¹⋅¤`(this.siValue / that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Divide_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`¤²`>, that: Quan<`L⋅¤`>) = thiz.run { `L⁻¹⋅¤`(this.siValue / that.siValue) }
@JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `¤²`.times(that: Quan<`L⋅¤⁻¹`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `¤²`.times(that: `L⋅¤⁻¹`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L0A0M0T0I0Theta0N0J0C2_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`¤²`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }


typealias `L³` = L3A0M0T0I0Theta0N0J0C0
inline class L3A0M0T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`L³`> {
    override val siValue get() = underlying
    override val abrev get() = "m³"

    override fun new(siValue: Double) = `L³`(siValue)

    override operator fun unaryPlus() = `L³`(+underlying)
    override operator fun unaryMinus() = `L³`(-underlying)

    override operator fun plus(that: `L³`) = `L³`(this.underlying + that.underlying)
    override operator fun minus(that: `L³`) = `L³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³`) = `L³`(this.underlying % that.underlying)

    override infix fun min(that: `L³`) = if (this < that) this else that
    override infix fun max(that: `L³`) = if (this > that) this else that

    override val abs get() = `L³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³` && this.siValue == other.siValue
}

inline val Number.`Gallon`: `Volume` get() = `L³`(toDouble() * 0.00378541)
inline val `L³`.`Gallon` get() = siValue * 264.172176857989
object `Gallon` : UomConverter<`L³`>,
    Quan<`L³`> by box(`L³`(0.00378541)) {
    override val unitName = "Gallon"
    override fun invoke(x: Double) = x.`Gallon`
    override fun invoke(x: `L³`) = x.`Gallon`
}


typealias `Volume` = `L³`

@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `L³`.div(that: Quan<`¤`>) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L³`.div(that: `¤`) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L³`>, that: Quan<`¤`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³`.div(that: Quan<`L³`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³`.div(that: `L³`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³`>, that: Quan<`L³`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `L³`.times(that: Quan<`¤`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L³`.times(that: `¤`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L³`>, that: Quan<`¤`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³`.times(that: Quan<`L³`>) = `L⁶`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³`.times(that: `L³`) = `L⁶`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L³`>, that: Quan<`L³`>) = thiz.run { `L⁶`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³`.div(that: Quan<`L`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³`.div(that: `L`) = `L²`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³`>, that: Quan<`L`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³`.times(that: Quan<`L`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³`.times(that: `L`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L³`>, that: Quan<`L`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³`.div(that: Quan<`Dimensionless`>) = `L³`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³`.div(that: `Dimensionless`) = `L³`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³`>, that: Quan<`Dimensionless`>) = thiz.run { `L³`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³`.times(that: Quan<`Dimensionless`>) = `L³`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³`.times(that: `Dimensionless`) = `L³`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L³`>, that: Quan<`Dimensionless`>) = thiz.run { `L³`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L³`.times(that: Quan<`L⁻³⋅¤`>) = `¤`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L³`.times(that: `L⁻³⋅¤`) = `¤`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun times(thiz: Quan<`L³`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `¤`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L³`.div(that: Quan<`L³⋅¤⁻¹`>) = `¤`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L³`.div(that: `L³⋅¤⁻¹`) = `¤`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L³`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `¤`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³`.div(that: Quan<`L²`>) = `L`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³`.div(that: `L²`) = `L`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³`>, that: Quan<`L²`>) = thiz.run { `L`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L³`.times(that: Quan<`L⁻²`>) = `L`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L³`.times(that: `L⁻²`) = `L`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`L³`>, that: Quan<`L⁻²`>) = thiz.run { `L`(this.siValue * that.siValue) }


typealias `L⁻³⋅¤` = A0M0T0I0Theta0N0J0C1_per_L3
inline class A0M0T0I0Theta0N0J0C1_per_L3(internal val underlying: Double) : Quan<`L⁻³⋅¤`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻³⋅¤"

    override fun new(siValue: Double) = `L⁻³⋅¤`(siValue)

    override operator fun unaryPlus() = `L⁻³⋅¤`(+underlying)
    override operator fun unaryMinus() = `L⁻³⋅¤`(-underlying)

    override operator fun plus(that: `L⁻³⋅¤`) = `L⁻³⋅¤`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻³⋅¤`) = `L⁻³⋅¤`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻³⋅¤`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻³⋅¤`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻³⋅¤`) = `L⁻³⋅¤`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻³⋅¤`) = if (this < that) this else that
    override infix fun max(that: `L⁻³⋅¤`) = if (this > that) this else that

    override val abs get() = `L⁻³⋅¤`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻³⋅¤`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻³⋅¤` && this.siValue == other.siValue
}


@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L⁻³⋅¤`.div(that: Quan<`L⁻³⋅¤`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L⁻³⋅¤`.div(that: `L⁻³⋅¤`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun div(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻³⋅¤`.times(that: Quan<`L³`>) = `¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻³⋅¤`.times(that: `L³`) = `¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L³`>) = thiz.run { `¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻³⋅¤`.div(that: Quan<`Dimensionless`>) = `L⁻³⋅¤`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻³⋅¤`.div(that: `Dimensionless`) = `L⁻³⋅¤`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻³⋅¤`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻³⋅¤`.times(that: Quan<`Dimensionless`>) = `L⁻³⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻³⋅¤`.times(that: `Dimensionless`) = `L⁻³⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻³⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⁻³⋅¤`.times(that: Quan<`L³⋅¤`>) = `¤²`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⁻³⋅¤`.times(that: `L³⋅¤`) = `¤²`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L³⋅¤`>) = thiz.run { `¤²`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁻³⋅¤`.times(that: Quan<`L³⋅¤⁻¹`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁻³⋅¤`.times(that: `L³⋅¤⁻¹`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L6A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻³⋅¤`.times(that: Quan<`L⁶`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L6A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻³⋅¤`.times(that: `L⁶`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L6A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L⁶`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L⁻³⋅¤`.div(that: Quan<`L⁻¹⋅¤`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L⁻³⋅¤`.div(that: `L⁻¹⋅¤`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun div(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁻³⋅¤`.times(that: Quan<`L⋅¤⁻¹`>) = `L⁻²`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁻³⋅¤`.times(that: `L⋅¤⁻¹`) = `L⁻²`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L⁻²`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻³⋅¤`.times(that: Quan<`L²`>) = `L⁻¹⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻³⋅¤`.times(that: `L²`) = `L⁻¹⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L²`>) = thiz.run { `L⁻¹⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻³⋅¤`.times(that: Quan<`L⁴`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻³⋅¤`.times(that: `L⁴`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Multiply_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L⁴`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⁻³⋅¤`.div(that: Quan<`L⁻²`>) = `L⁻¹⋅¤`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⁻³⋅¤`.div(that: `L⁻²`) = `L⁻¹⋅¤`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L3_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`L⁻³⋅¤`>, that: Quan<`L⁻²`>) = thiz.run { `L⁻¹⋅¤`(this.siValue / that.siValue) }


typealias `L³⋅¤` = L3A0M0T0I0Theta0N0J0C1
inline class L3A0M0T0I0Theta0N0J0C1(internal val underlying: Double) : Quan<`L³⋅¤`> {
    override val siValue get() = underlying
    override val abrev get() = "m³⋅¤"

    override fun new(siValue: Double) = `L³⋅¤`(siValue)

    override operator fun unaryPlus() = `L³⋅¤`(+underlying)
    override operator fun unaryMinus() = `L³⋅¤`(-underlying)

    override operator fun plus(that: `L³⋅¤`) = `L³⋅¤`(this.underlying + that.underlying)
    override operator fun minus(that: `L³⋅¤`) = `L³⋅¤`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³⋅¤`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³⋅¤`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³⋅¤`) = `L³⋅¤`(this.underlying % that.underlying)

    override infix fun min(that: `L³⋅¤`) = if (this < that) this else that
    override infix fun max(that: `L³⋅¤`) = if (this > that) this else that

    override val abs get() = `L³⋅¤`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³⋅¤`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³⋅¤` && this.siValue == other.siValue
}


@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `L³⋅¤`.div(that: Quan<`¤`>) = `L³`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L³⋅¤`.div(that: `¤`) = `L³`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`¤`>) = thiz.run { `L³`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `L³⋅¤`.div(that: Quan<`L³⋅¤`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L³⋅¤`.div(that: `L³⋅¤`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L³⋅¤`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤`.div(that: Quan<`L³`>) = `¤`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤`.div(that: `L³`) = `¤`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L³`>) = thiz.run { `¤`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤`.div(that: Quan<`Dimensionless`>) = `L³⋅¤`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤`.div(that: `Dimensionless`) = `L³⋅¤`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`Dimensionless`>) = thiz.run { `L³⋅¤`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤`.times(that: Quan<`Dimensionless`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤`.times(that: `Dimensionless`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L³⋅¤`>, that: Quan<`Dimensionless`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C2_generic")
operator fun `L³⋅¤`.div(that: Quan<`¤²`>) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C2_concrete")
operator fun `L³⋅¤`.div(that: `¤²`) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C2_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`¤²`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L³⋅¤`.div(that: Quan<`L⁻³⋅¤`>) = `L⁶`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L³⋅¤`.div(that: `L⁻³⋅¤`) = `L⁶`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L⁶`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L³⋅¤`.times(that: Quan<`L⁻³⋅¤`>) = `¤²`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L³⋅¤`.times(that: `L⁻³⋅¤`) = `¤²`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun times(thiz: Quan<`L³⋅¤`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `¤²`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L³⋅¤`.div(that: Quan<`L³⋅¤⁻¹`>) = `¤²`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L³⋅¤`.div(that: `L³⋅¤⁻¹`) = `¤²`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `¤²`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L³⋅¤`.times(that: Quan<`L³⋅¤⁻¹`>) = `L⁶`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L³⋅¤`.times(that: `L³⋅¤⁻¹`) = `L⁶`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L³⋅¤`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L⁶`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L6A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤`.div(that: Quan<`L⁶`>) = `L⁻³⋅¤`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L6A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤`.div(that: `L⁶`) = `L⁻³⋅¤`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L6A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L⁶`>) = thiz.run { `L⁻³⋅¤`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L³⋅¤`.div(that: Quan<`L⁻¹⋅¤`>) = `L⁴`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L³⋅¤`.div(that: `L⁻¹⋅¤`) = `L⁴`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L⁴`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L³⋅¤`.div(that: Quan<`L⋅¤`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L³⋅¤`.div(that: `L⋅¤`) = `L²`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L⋅¤`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L³⋅¤`.times(that: Quan<`L⋅¤⁻¹`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L³⋅¤`.times(that: `L⋅¤⁻¹`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L³⋅¤`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤`.div(that: Quan<`L²`>) = `L⋅¤`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤`.div(that: `L²`) = `L⋅¤`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L²`>) = thiz.run { `L⋅¤`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤`.div(that: Quan<`L⁴`>) = `L⁻¹⋅¤`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤`.div(that: `L⁴`) = `L⁻¹⋅¤`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Divide_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³⋅¤`>, that: Quan<`L⁴`>) = thiz.run { `L⁻¹⋅¤`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L³⋅¤`.times(that: Quan<`L⁻²`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L³⋅¤`.times(that: `L⁻²`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`L³⋅¤`>, that: Quan<`L⁻²`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }


typealias `L³⋅¤⁻¹` = L3A0M0T0I0Theta0N0J0_per_C1
inline class L3A0M0T0I0Theta0N0J0_per_C1(internal val underlying: Double) : Quan<`L³⋅¤⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m³⋅¤⁻¹"

    override fun new(siValue: Double) = `L³⋅¤⁻¹`(siValue)

    override operator fun unaryPlus() = `L³⋅¤⁻¹`(+underlying)
    override operator fun unaryMinus() = `L³⋅¤⁻¹`(-underlying)

    override operator fun plus(that: `L³⋅¤⁻¹`) = `L³⋅¤⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L³⋅¤⁻¹`) = `L³⋅¤⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³⋅¤⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³⋅¤⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³⋅¤⁻¹`) = `L³⋅¤⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L³⋅¤⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L³⋅¤⁻¹`) = if (this > that) this else that

    override val abs get() = `L³⋅¤⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³⋅¤⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³⋅¤⁻¹` && this.siValue == other.siValue
}


@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L³⋅¤⁻¹`.div(that: Quan<`L³⋅¤⁻¹`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L³⋅¤⁻¹`.div(that: `L³⋅¤⁻¹`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `L³⋅¤⁻¹`.times(that: Quan<`¤`>) = `L³`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L³⋅¤⁻¹`.times(that: `¤`) = `L³`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`¤`>) = thiz.run { `L³`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤⁻¹`.div(that: Quan<`Dimensionless`>) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤⁻¹`.div(that: `Dimensionless`) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`Dimensionless`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤⁻¹`.times(that: Quan<`Dimensionless`>) = `L³⋅¤⁻¹`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤⁻¹`.times(that: `Dimensionless`) = `L³⋅¤⁻¹`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`Dimensionless`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C2_generic")
operator fun `L³⋅¤⁻¹`.times(that: Quan<`¤²`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C2_concrete")
operator fun `L³⋅¤⁻¹`.times(that: `¤²`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C2_nonextension")
fun times(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`¤²`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L³⋅¤⁻¹`.times(that: Quan<`L⁻³⋅¤`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L³⋅¤⁻¹`.times(that: `L⁻³⋅¤`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun times(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `L³⋅¤⁻¹`.times(that: Quan<`L³⋅¤`>) = `L⁶`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L³⋅¤⁻¹`.times(that: `L³⋅¤`) = `L⁶`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`L³⋅¤`>) = thiz.run { `L⁶`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L³⋅¤⁻¹`.times(that: Quan<`L⁻¹⋅¤`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L³⋅¤⁻¹`.times(that: `L⁻¹⋅¤`) = `L²`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun times(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L³⋅¤⁻¹`.times(that: Quan<`L⋅¤`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L³⋅¤⁻¹`.times(that: `L⋅¤`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`L⋅¤`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L³⋅¤⁻¹`.div(that: Quan<`L⋅¤⁻¹`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L³⋅¤⁻¹`.div(that: `L⋅¤⁻¹`) = `L²`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L³⋅¤⁻¹`.div(that: Quan<`L²`>) = `L⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L³⋅¤⁻¹`.div(that: `L²`) = `L⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`L²`>) = thiz.run { `L⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L³⋅¤⁻¹`.times(that: Quan<`L⁻²`>) = `L⋅¤⁻¹`(this.siValue * that.siValue)
// @JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L³⋅¤⁻¹`.times(that: `L⁻²`) = `L⋅¤⁻¹`(this.siValue * that.siValue)
@JvmName("L3A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`L³⋅¤⁻¹`>, that: Quan<`L⁻²`>) = thiz.run { `L⋅¤⁻¹`(this.siValue * that.siValue) }


typealias `L⁶` = L6A0M0T0I0Theta0N0J0C0
inline class L6A0M0T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`L⁶`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁶"

    override fun new(siValue: Double) = `L⁶`(siValue)

    override operator fun unaryPlus() = `L⁶`(+underlying)
    override operator fun unaryMinus() = `L⁶`(-underlying)

    override operator fun plus(that: `L⁶`) = `L⁶`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁶`) = `L⁶`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁶`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁶`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁶`) = `L⁶`(this.underlying % that.underlying)

    override infix fun min(that: `L⁶`) = if (this < that) this else that
    override infix fun max(that: `L⁶`) = if (this > that) this else that

    override val abs get() = `L⁶`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁶`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁶` && this.siValue == other.siValue
}


@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L6A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁶`.div(that: Quan<`L⁶`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L6A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁶`.div(that: `L⁶`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L6A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁶`>, that: Quan<`L⁶`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁶`.div(that: Quan<`L³`>) = `L³`(this.siValue / that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁶`.div(that: `L³`) = `L³`(this.siValue / that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁶`>, that: Quan<`L³`>) = thiz.run { `L³`(this.siValue / that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁶`.div(that: Quan<`Dimensionless`>) = `L⁶`(this.siValue / that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁶`.div(that: `Dimensionless`) = `L⁶`(this.siValue / that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁶`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁶`(this.siValue / that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁶`.times(that: Quan<`Dimensionless`>) = `L⁶`(this.siValue * that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁶`.times(that: `Dimensionless`) = `L⁶`(this.siValue * that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁶`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁶`(this.siValue * that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L⁶`.times(that: Quan<`L⁻³⋅¤`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L⁶`.times(that: `L⁻³⋅¤`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun times(thiz: Quan<`L⁶`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⁶`.div(that: Quan<`L³⋅¤`>) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⁶`.div(that: `L³⋅¤`) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L⁶`>, that: Quan<`L³⋅¤`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁶`.div(that: Quan<`L³⋅¤⁻¹`>) = `L³⋅¤`(this.siValue / that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁶`.div(that: `L³⋅¤⁻¹`) = `L³⋅¤`(this.siValue / that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L⁶`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L³⋅¤`(this.siValue / that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁶`.div(that: Quan<`L²`>) = `L⁴`(this.siValue / that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁶`.div(that: `L²`) = `L⁴`(this.siValue / that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁶`>, that: Quan<`L²`>) = thiz.run { `L⁴`(this.siValue / that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁶`.div(that: Quan<`L⁴`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁶`.div(that: `L⁴`) = `L²`(this.siValue / that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁶`>, that: Quan<`L⁴`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⁶`.times(that: Quan<`L⁻²`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⁶`.times(that: `L⁻²`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L6A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`L⁶`>, that: Quan<`L⁻²`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }


typealias `L⁻¹⋅¤` = A0M0T0I0Theta0N0J0C1_per_L1
inline class A0M0T0I0Theta0N0J0C1_per_L1(internal val underlying: Double) : Quan<`L⁻¹⋅¤`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅¤"

    override fun new(siValue: Double) = `L⁻¹⋅¤`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅¤`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅¤`(-underlying)

    override operator fun plus(that: `L⁻¹⋅¤`) = `L⁻¹⋅¤`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅¤`) = `L⁻¹⋅¤`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅¤`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅¤`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅¤`) = `L⁻¹⋅¤`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅¤`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅¤`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅¤`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅¤`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅¤` && this.siValue == other.siValue
}


@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L⁻¹⋅¤`.div(that: Quan<`L⁻¹⋅¤`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L⁻¹⋅¤`.div(that: `L⁻¹⋅¤`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun div(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅¤`.times(that: Quan<`L`>) = `¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅¤`.times(that: `L`) = `¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L`>) = thiz.run { `¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅¤`.div(that: Quan<`Dimensionless`>) = `L⁻¹⋅¤`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅¤`.div(that: `Dimensionless`) = `L⁻¹⋅¤`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻¹⋅¤`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅¤`.times(that: Quan<`Dimensionless`>) = `L⁻¹⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅¤`.times(that: `Dimensionless`) = `L⁻¹⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻¹⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L⁻¹⋅¤`.div(that: Quan<`L⁻³⋅¤`>) = `L²`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L⁻¹⋅¤`.div(that: `L⁻³⋅¤`) = `L²`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun div(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁻¹⋅¤`.times(that: Quan<`L³⋅¤⁻¹`>) = `L²`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁻¹⋅¤`.times(that: `L³⋅¤⁻¹`) = `L²`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⁻¹⋅¤`.div(that: Quan<`L⋅¤`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⁻¹⋅¤`.div(that: `L⋅¤`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L⋅¤`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⁻¹⋅¤`.times(that: Quan<`L⋅¤`>) = `¤²`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⁻¹⋅¤`.times(that: `L⋅¤`) = `¤²`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L⋅¤`>) = thiz.run { `¤²`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁻¹⋅¤`.times(that: Quan<`L⋅¤⁻¹`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁻¹⋅¤`.times(that: `L⋅¤⁻¹`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅¤`.div(that: Quan<`L²`>) = `L⁻³⋅¤`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅¤`.div(that: `L²`) = `L⁻³⋅¤`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L²`>) = thiz.run { `L⁻³⋅¤`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅¤`.times(that: Quan<`L²`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅¤`.times(that: `L²`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L²`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻¹⋅¤`.times(that: Quan<`L⁴`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻¹⋅¤`.times(that: `L⁴`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L⁴`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⁻¹⋅¤`.div(that: Quan<`L⁻²`>) = `L⋅¤`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⁻¹⋅¤`.div(that: `L⁻²`) = `L⋅¤`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L⁻²`>) = thiz.run { `L⋅¤`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⁻¹⋅¤`.times(that: Quan<`L⁻²`>) = `L⁻³⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⁻¹⋅¤`.times(that: `L⁻²`) = `L⁻³⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C1_per_L1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`L⁻¹⋅¤`>, that: Quan<`L⁻²`>) = thiz.run { `L⁻³⋅¤`(this.siValue * that.siValue) }


typealias `L⋅¤` = L1A0M0T0I0Theta0N0J0C1
inline class L1A0M0T0I0Theta0N0J0C1(internal val underlying: Double) : Quan<`L⋅¤`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅¤"

    override fun new(siValue: Double) = `L⋅¤`(siValue)

    override operator fun unaryPlus() = `L⋅¤`(+underlying)
    override operator fun unaryMinus() = `L⋅¤`(-underlying)

    override operator fun plus(that: `L⋅¤`) = `L⋅¤`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅¤`) = `L⋅¤`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅¤`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅¤`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅¤`) = `L⋅¤`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅¤`) = if (this < that) this else that
    override infix fun max(that: `L⋅¤`) = if (this > that) this else that

    override val abs get() = `L⋅¤`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅¤`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅¤` && this.siValue == other.siValue
}


@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⋅¤`.div(that: Quan<`¤`>) = `L`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⋅¤`.div(that: `¤`) = `L`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`¤`>) = thiz.run { `L`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⋅¤`.div(that: Quan<`L⋅¤`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⋅¤`.div(that: `L⋅¤`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L⋅¤`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤`.div(that: Quan<`L`>) = `¤`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤`.div(that: `L`) = `¤`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L`>) = thiz.run { `¤`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤`.div(that: Quan<`Dimensionless`>) = `L⋅¤`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤`.div(that: `Dimensionless`) = `L⋅¤`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅¤`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤`.times(that: Quan<`Dimensionless`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤`.times(that: `Dimensionless`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅¤`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C2_generic")
operator fun `L⋅¤`.div(that: Quan<`¤²`>) = `L⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C2_concrete")
operator fun `L⋅¤`.div(that: `¤²`) = `L⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L0A0M0T0I0Theta0N0J0C2_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`¤²`>) = thiz.run { `L⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L⋅¤`.div(that: Quan<`L⁻³⋅¤`>) = `L⁴`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L⋅¤`.div(that: `L⁻³⋅¤`) = `L⁴`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L⁴`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⋅¤`.div(that: Quan<`L³⋅¤`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⋅¤`.div(that: `L³⋅¤`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L³⋅¤`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⋅¤`.times(that: Quan<`L³⋅¤⁻¹`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⋅¤`.times(that: `L³⋅¤⁻¹`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L⋅¤`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L⋅¤`.div(that: Quan<`L⁻¹⋅¤`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L⋅¤`.div(that: `L⁻¹⋅¤`) = `L²`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L⋅¤`.times(that: Quan<`L⁻¹⋅¤`>) = `¤²`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L⋅¤`.times(that: `L⁻¹⋅¤`) = `¤²`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun times(thiz: Quan<`L⋅¤`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `¤²`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⋅¤`.div(that: Quan<`L⋅¤⁻¹`>) = `¤²`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⋅¤`.div(that: `L⋅¤⁻¹`) = `¤²`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `¤²`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⋅¤`.times(that: Quan<`L⋅¤⁻¹`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⋅¤`.times(that: `L⋅¤⁻¹`) = `L²`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L⋅¤`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤`.div(that: Quan<`L²`>) = `L⁻¹⋅¤`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤`.div(that: `L²`) = `L⁻¹⋅¤`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L²`>) = thiz.run { `L⁻¹⋅¤`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤`.times(that: Quan<`L²`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤`.times(that: `L²`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅¤`>, that: Quan<`L²`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤`.div(that: Quan<`L⁴`>) = `L⁻³⋅¤`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤`.div(that: `L⁴`) = `L⁻³⋅¤`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L⁴`>) = thiz.run { `L⁻³⋅¤`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⋅¤`.div(that: Quan<`L⁻²`>) = `L³⋅¤`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⋅¤`.div(that: `L⁻²`) = `L³⋅¤`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`L⋅¤`>, that: Quan<`L⁻²`>) = thiz.run { `L³⋅¤`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⋅¤`.times(that: Quan<`L⁻²`>) = `L⁻¹⋅¤`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⋅¤`.times(that: `L⁻²`) = `L⁻¹⋅¤`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0C1_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`L⋅¤`>, that: Quan<`L⁻²`>) = thiz.run { `L⁻¹⋅¤`(this.siValue * that.siValue) }


typealias `L⋅¤⁻¹` = L1A0M0T0I0Theta0N0J0_per_C1
inline class L1A0M0T0I0Theta0N0J0_per_C1(internal val underlying: Double) : Quan<`L⋅¤⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅¤⁻¹"

    override fun new(siValue: Double) = `L⋅¤⁻¹`(siValue)

    override operator fun unaryPlus() = `L⋅¤⁻¹`(+underlying)
    override operator fun unaryMinus() = `L⋅¤⁻¹`(-underlying)

    override operator fun plus(that: `L⋅¤⁻¹`) = `L⋅¤⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅¤⁻¹`) = `L⋅¤⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅¤⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅¤⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅¤⁻¹`) = `L⋅¤⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅¤⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L⋅¤⁻¹`) = if (this > that) this else that

    override val abs get() = `L⋅¤⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅¤⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅¤⁻¹` && this.siValue == other.siValue
}


@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⋅¤⁻¹`.div(that: Quan<`L⋅¤⁻¹`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⋅¤⁻¹`.div(that: `L⋅¤⁻¹`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⋅¤⁻¹`.times(that: Quan<`¤`>) = `L`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⋅¤⁻¹`.times(that: `¤`) = `L`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`¤`>) = thiz.run { `L`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤⁻¹`.div(that: Quan<`Dimensionless`>) = `L⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤⁻¹`.div(that: `Dimensionless`) = `L⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤⁻¹`.times(that: Quan<`Dimensionless`>) = `L⋅¤⁻¹`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤⁻¹`.times(that: `Dimensionless`) = `L⋅¤⁻¹`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`Dimensionless`>) = thiz.run { `L⋅¤⁻¹`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C2_generic")
operator fun `L⋅¤⁻¹`.times(that: Quan<`¤²`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C2_concrete")
operator fun `L⋅¤⁻¹`.times(that: `¤²`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L0A0M0T0I0Theta0N0J0C2_nonextension")
fun times(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`¤²`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L⋅¤⁻¹`.times(that: Quan<`L⁻³⋅¤`>) = `L⁻²`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L⋅¤⁻¹`.times(that: `L⁻³⋅¤`) = `L⁻²`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun times(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L⁻²`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⋅¤⁻¹`.times(that: Quan<`L³⋅¤`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⋅¤⁻¹`.times(that: `L³⋅¤`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`L³⋅¤`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⋅¤⁻¹`.div(that: Quan<`L³⋅¤⁻¹`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⋅¤⁻¹`.div(that: `L³⋅¤⁻¹`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L⋅¤⁻¹`.times(that: Quan<`L⁻¹⋅¤`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L⋅¤⁻¹`.times(that: `L⁻¹⋅¤`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun times(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⋅¤⁻¹`.times(that: Quan<`L⋅¤`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⋅¤⁻¹`.times(that: `L⋅¤`) = `L²`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`L⋅¤`>) = thiz.run { `L²`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⋅¤⁻¹`.times(that: Quan<`L²`>) = `L³⋅¤⁻¹`(this.siValue * that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⋅¤⁻¹`.times(that: `L²`) = `L³⋅¤⁻¹`(this.siValue * that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`L²`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue * that.siValue) }
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⋅¤⁻¹`.div(that: Quan<`L⁻²`>) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⋅¤⁻¹`.div(that: `L⁻²`) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L1A0M0T0I0Theta0N0J0_per_C1_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`L⋅¤⁻¹`>, that: Quan<`L⁻²`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue / that.siValue) }


typealias `L⁴` = L4A0M0T0I0Theta0N0J0C0
inline class L4A0M0T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`L⁴`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁴"

    override fun new(siValue: Double) = `L⁴`(siValue)

    override operator fun unaryPlus() = `L⁴`(+underlying)
    override operator fun unaryMinus() = `L⁴`(-underlying)

    override operator fun plus(that: `L⁴`) = `L⁴`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁴`) = `L⁴`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁴`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁴`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁴`) = `L⁴`(this.underlying % that.underlying)

    override infix fun min(that: `L⁴`) = if (this < that) this else that
    override infix fun max(that: `L⁴`) = if (this > that) this else that

    override val abs get() = `L⁴`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁴`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁴` && this.siValue == other.siValue
}


@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴`.div(that: Quan<`L⁴`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴`.div(that: `L⁴`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L⁴`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴`.div(that: Quan<`L³`>) = `L`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴`.div(that: `L³`) = `L`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L³`>) = thiz.run { `L`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴`.div(that: Quan<`L`>) = `L³`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴`.div(that: `L`) = `L³`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L`>) = thiz.run { `L³`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴`.div(that: Quan<`Dimensionless`>) = `L⁴`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴`.div(that: `Dimensionless`) = `L⁴`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁴`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴`.times(that: Quan<`Dimensionless`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴`.times(that: `Dimensionless`) = `L⁴`(this.siValue * that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁴`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L⁴`.times(that: Quan<`L⁻³⋅¤`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L⁴`.times(that: `L⁻³⋅¤`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun times(thiz: Quan<`L⁴`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⁴`.div(that: Quan<`L³⋅¤`>) = `L⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⁴`.div(that: `L³⋅¤`) = `L⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L³⋅¤`>) = thiz.run { `L⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁴`.div(that: Quan<`L³⋅¤⁻¹`>) = `L⋅¤`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁴`.div(that: `L³⋅¤⁻¹`) = `L⋅¤`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L⋅¤`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L6A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴`.div(that: Quan<`L⁶`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L6A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴`.div(that: `L⁶`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L6A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L⁶`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L⁴`.times(that: Quan<`L⁻¹⋅¤`>) = `L³⋅¤`(this.siValue * that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L⁴`.times(that: `L⁻¹⋅¤`) = `L³⋅¤`(this.siValue * that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun times(thiz: Quan<`L⁴`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L³⋅¤`(this.siValue * that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⁴`.div(that: Quan<`L⋅¤`>) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⁴`.div(that: `L⋅¤`) = `L³⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L⋅¤`>) = thiz.run { `L³⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁴`.div(that: Quan<`L⋅¤⁻¹`>) = `L³⋅¤`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁴`.div(that: `L⋅¤⁻¹`) = `L³⋅¤`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L³⋅¤`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴`.div(that: Quan<`L²`>) = `L²`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴`.div(that: `L²`) = `L²`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L²`>) = thiz.run { `L²`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁴`.times(that: Quan<`L²`>) = `L⁶`(this.siValue * that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁴`.times(that: `L²`) = `L⁶`(this.siValue * that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁴`>, that: Quan<`L²`>) = thiz.run { `L⁶`(this.siValue * that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⁴`.div(that: Quan<`L⁻²`>) = `L⁶`(this.siValue / that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⁴`.div(that: `L⁻²`) = `L⁶`(this.siValue / that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`L⁴`>, that: Quan<`L⁻²`>) = thiz.run { `L⁶`(this.siValue / that.siValue) }
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⁴`.times(that: Quan<`L⁻²`>) = `L²`(this.siValue * that.siValue)
// @JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⁴`.times(that: `L⁻²`) = `L²`(this.siValue * that.siValue)
@JvmName("L4A0M0T0I0Theta0N0J0C0_Multiply_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun times(thiz: Quan<`L⁴`>, that: Quan<`L⁻²`>) = thiz.run { `L²`(this.siValue * that.siValue) }


typealias `L⁻²` = A0M0T0I0Theta0N0J0C0_per_L2
inline class A0M0T0I0Theta0N0J0C0_per_L2(internal val underlying: Double) : Quan<`L⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²"

    override fun new(siValue: Double) = `L⁻²`(siValue)

    override operator fun unaryPlus() = `L⁻²`(+underlying)
    override operator fun unaryMinus() = `L⁻²`(-underlying)

    override operator fun plus(that: `L⁻²`) = `L⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²`) = `L⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²`) = `L⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²`) = if (this < that) this else that
    override infix fun max(that: `L⁻²`) = if (this > that) this else that

    override val abs get() = `L⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²` && this.siValue == other.siValue
}


typealias `FuelEfficiency` = `L⁻²`

@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_A0M0T0I0Theta0N0J0C0_per_L2_generic")
operator fun `L⁻²`.div(that: Quan<`L⁻²`>) = `Dimensionless`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_A0M0T0I0Theta0N0J0C0_per_L2_concrete")
operator fun `L⁻²`.div(that: `L⁻²`) = `Dimensionless`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_A0M0T0I0Theta0N0J0C0_per_L2_nonextension")
fun div(thiz: Quan<`L⁻²`>, that: Quan<`L⁻²`>) = thiz.run { `Dimensionless`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻²`.times(that: Quan<`L³`>) = `L`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻²`.times(that: `L³`) = `L`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`L³`>) = thiz.run { `L`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻²`.div(that: Quan<`Dimensionless`>) = `L⁻²`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻²`.div(that: `Dimensionless`) = `L⁻²`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun div(thiz: Quan<`L⁻²`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻²`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L0A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻²`.times(that: Quan<`Dimensionless`>) = `L⁻²`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L0A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻²`.times(that: `Dimensionless`) = `L⁻²`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L0A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`Dimensionless`>) = thiz.run { `L⁻²`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_A0M0T0I0Theta0N0J0C1_per_L3_generic")
operator fun `L⁻²`.div(that: Quan<`L⁻³⋅¤`>) = `L⋅¤⁻¹`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_A0M0T0I0Theta0N0J0C1_per_L3_concrete")
operator fun `L⁻²`.div(that: `L⁻³⋅¤`) = `L⋅¤⁻¹`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_A0M0T0I0Theta0N0J0C1_per_L3_nonextension")
fun div(thiz: Quan<`L⁻²`>, that: Quan<`L⁻³⋅¤`>) = thiz.run { `L⋅¤⁻¹`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⁻²`.times(that: Quan<`L³⋅¤`>) = `L⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⁻²`.times(that: `L³⋅¤`) = `L⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`L³⋅¤`>) = thiz.run { `L⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁻²`.times(that: Quan<`L³⋅¤⁻¹`>) = `L⋅¤⁻¹`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁻²`.times(that: `L³⋅¤⁻¹`) = `L⋅¤⁻¹`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L3A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`L³⋅¤⁻¹`>) = thiz.run { `L⋅¤⁻¹`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L6A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻²`.times(that: Quan<`L⁶`>) = `L⁴`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L6A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻²`.times(that: `L⁶`) = `L⁴`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L6A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`L⁶`>) = thiz.run { `L⁴`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_generic")
operator fun `L⁻²`.times(that: Quan<`L⁻¹⋅¤`>) = `L⁻³⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_concrete")
operator fun `L⁻²`.times(that: `L⁻¹⋅¤`) = `L⁻³⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_A0M0T0I0Theta0N0J0C1_per_L1_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`L⁻¹⋅¤`>) = thiz.run { `L⁻³⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L1A0M0T0I0Theta0N0J0C1_generic")
operator fun `L⁻²`.times(that: Quan<`L⋅¤`>) = `L⁻¹⋅¤`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L1A0M0T0I0Theta0N0J0C1_concrete")
operator fun `L⁻²`.times(that: `L⋅¤`) = `L⁻¹⋅¤`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L1A0M0T0I0Theta0N0J0C1_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`L⋅¤`>) = thiz.run { `L⁻¹⋅¤`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_L1A0M0T0I0Theta0N0J0_per_C1_generic")
operator fun `L⁻²`.div(that: Quan<`L⋅¤⁻¹`>) = `L⁻³⋅¤`(this.siValue / that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_L1A0M0T0I0Theta0N0J0_per_C1_concrete")
operator fun `L⁻²`.div(that: `L⋅¤⁻¹`) = `L⁻³⋅¤`(this.siValue / that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Divide_L1A0M0T0I0Theta0N0J0_per_C1_nonextension")
fun div(thiz: Quan<`L⁻²`>, that: Quan<`L⋅¤⁻¹`>) = thiz.run { `L⁻³⋅¤`(this.siValue / that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L2A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻²`.times(that: Quan<`L²`>) = `Dimensionless`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L2A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻²`.times(that: `L²`) = `Dimensionless`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L2A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`L²`>) = thiz.run { `Dimensionless`(this.siValue * that.siValue) }
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L4A0M0T0I0Theta0N0J0C0_generic")
operator fun `L⁻²`.times(that: Quan<`L⁴`>) = `L²`(this.siValue * that.siValue)
// @JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L4A0M0T0I0Theta0N0J0C0_concrete")
operator fun `L⁻²`.times(that: `L⁴`) = `L²`(this.siValue * that.siValue)
@JvmName("A0M0T0I0Theta0N0J0C0_per_L2_Multiply_L4A0M0T0I0Theta0N0J0C0_nonextension")
fun times(thiz: Quan<`L⁻²`>, that: Quan<`L⁴`>) = thiz.run { `L²`(this.siValue * that.siValue) }


typealias `M` = L0A0M1T0I0Theta0N0J0C0
inline class L0A0M1T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`M`> {
    override val siValue get() = underlying
    override val abrev get() = "kg"

    override fun new(siValue: Double) = `M`(siValue)

    override operator fun unaryPlus() = `M`(+underlying)
    override operator fun unaryMinus() = `M`(-underlying)

    override operator fun plus(that: `M`) = `M`(this.underlying + that.underlying)
    override operator fun minus(that: `M`) = `M`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M`(this.underlying / that.toDouble())
    override operator fun rem(that: `M`) = `M`(this.underlying % that.underlying)

    override infix fun min(that: `M`) = if (this < that) this else that
    override infix fun max(that: `M`) = if (this > that) this else that

    override val abs get() = `M`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M` && this.siValue == other.siValue
}

inline val Number.`Kilogram`: `Mass` get() = `M`(toDouble() * 1.0)
inline val `M`.`Kilogram` get() = siValue * 1.0
object `Kilogram` : UomConverter<`M`>,
    Quan<`M`> by box(`M`(1.0)) {
    override val unitName = "Kilogram"
    override fun invoke(x: Double) = x.`Kilogram`
    override fun invoke(x: `M`) = x.`Kilogram`
}

inline val Number.`Pound`: `Mass` get() = `M`(toDouble() * 0.453592)
inline val `M`.`Pound` get() = siValue * 2.2046244201837775
object `Pound` : UomConverter<`M`>,
    Quan<`M`> by box(`M`(0.453592)) {
    override val unitName = "Pound"
    override fun invoke(x: Double) = x.`Pound`
    override fun invoke(x: `M`) = x.`Pound`
}

inline val Number.`Ounce`: `Mass` get() = `M`(toDouble() * 0.0283495)
inline val `M`.`Ounce` get() = siValue * 35.27399072294044
object `Ounce` : UomConverter<`M`>,
    Quan<`M`> by box(`M`(0.0283495)) {
    override val unitName = "Ounce"
    override fun invoke(x: Double) = x.`Ounce`
    override fun invoke(x: `M`) = x.`Ounce`
}

inline val Number.`Gram`: `Mass` get() = `M`(toDouble() * 0.001)
inline val `M`.`Gram` get() = siValue * 1000.0
object `Gram` : UomConverter<`M`>,
    Quan<`M`> by box(`M`(0.001)) {
    override val unitName = "Gram"
    override fun invoke(x: Double) = x.`Gram`
    override fun invoke(x: `M`) = x.`Gram`
}


typealias `Mass` = `M`




typealias `I` = L0A0M0T0I1Theta0N0J0C0
inline class L0A0M0T0I1Theta0N0J0C0(internal val underlying: Double) : Quan<`I`> {
    override val siValue get() = underlying
    override val abrev get() = "A"

    override fun new(siValue: Double) = `I`(siValue)

    override operator fun unaryPlus() = `I`(+underlying)
    override operator fun unaryMinus() = `I`(-underlying)

    override operator fun plus(that: `I`) = `I`(this.underlying + that.underlying)
    override operator fun minus(that: `I`) = `I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `I`(this.underlying / that.toDouble())
    override operator fun rem(that: `I`) = `I`(this.underlying % that.underlying)

    override infix fun min(that: `I`) = if (this < that) this else that
    override infix fun max(that: `I`) = if (this > that) this else that

    override val abs get() = `I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `I` && this.siValue == other.siValue
}

inline val Number.`Ampere`: `ElectricCurrent` get() = `I`(toDouble() * 1.0)
inline val `I`.`Ampere` get() = siValue * 1.0
object `Ampere` : UomConverter<`I`>,
    Quan<`I`> by box(`I`(1.0)) {
    override val unitName = "Ampere"
    override fun invoke(x: Double) = x.`Ampere`
    override fun invoke(x: `I`) = x.`Ampere`
}


typealias `ElectricCurrent` = `I`




typealias `Θ` = L0A0M0T0I0Theta1N0J0C0
inline class L0A0M0T0I0Theta1N0J0C0(internal val underlying: Double) : Quan<`Θ`> {
    override val siValue get() = underlying
    override val abrev get() = "K"

    override fun new(siValue: Double) = `Θ`(siValue)

    override operator fun unaryPlus() = `Θ`(+underlying)
    override operator fun unaryMinus() = `Θ`(-underlying)

    override operator fun plus(that: `Θ`) = `Θ`(this.underlying + that.underlying)
    override operator fun minus(that: `Θ`) = `Θ`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `Θ`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `Θ`(this.underlying / that.toDouble())
    override operator fun rem(that: `Θ`) = `Θ`(this.underlying % that.underlying)

    override infix fun min(that: `Θ`) = if (this < that) this else that
    override infix fun max(that: `Θ`) = if (this > that) this else that

    override val abs get() = `Θ`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `Θ`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `Θ` && this.siValue == other.siValue
}

inline val Number.`Kelvin`: `Temperature` get() = `Θ`(toDouble() * 1.0)
inline val `Θ`.`Kelvin` get() = siValue * 1.0
object `Kelvin` : UomConverter<`Θ`>,
    Quan<`Θ`> by box(`Θ`(1.0)) {
    override val unitName = "Kelvin"
    override fun invoke(x: Double) = x.`Kelvin`
    override fun invoke(x: `Θ`) = x.`Kelvin`
}


typealias `Temperature` = `Θ`




typealias `N` = L0A0M0T0I0Theta0N1J0C0
inline class L0A0M0T0I0Theta0N1J0C0(internal val underlying: Double) : Quan<`N`> {
    override val siValue get() = underlying
    override val abrev get() = "mol"

    override fun new(siValue: Double) = `N`(siValue)

    override operator fun unaryPlus() = `N`(+underlying)
    override operator fun unaryMinus() = `N`(-underlying)

    override operator fun plus(that: `N`) = `N`(this.underlying + that.underlying)
    override operator fun minus(that: `N`) = `N`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `N`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `N`(this.underlying / that.toDouble())
    override operator fun rem(that: `N`) = `N`(this.underlying % that.underlying)

    override infix fun min(that: `N`) = if (this < that) this else that
    override infix fun max(that: `N`) = if (this > that) this else that

    override val abs get() = `N`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `N`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `N` && this.siValue == other.siValue
}

inline val Number.`Mole`: `AmountOfSubstance` get() = `N`(toDouble() * 1.0)
inline val `N`.`Mole` get() = siValue * 1.0
object `Mole` : UomConverter<`N`>,
    Quan<`N`> by box(`N`(1.0)) {
    override val unitName = "Mole"
    override fun invoke(x: Double) = x.`Mole`
    override fun invoke(x: `N`) = x.`Mole`
}


typealias `AmountOfSubstance` = `N`




typealias `J` = L0A0M0T0I0Theta0N0J1C0
inline class L0A0M0T0I0Theta0N0J1C0(internal val underlying: Double) : Quan<`J`> {
    override val siValue get() = underlying
    override val abrev get() = "cd"

    override fun new(siValue: Double) = `J`(siValue)

    override operator fun unaryPlus() = `J`(+underlying)
    override operator fun unaryMinus() = `J`(-underlying)

    override operator fun plus(that: `J`) = `J`(this.underlying + that.underlying)
    override operator fun minus(that: `J`) = `J`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `J`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `J`(this.underlying / that.toDouble())
    override operator fun rem(that: `J`) = `J`(this.underlying % that.underlying)

    override infix fun min(that: `J`) = if (this < that) this else that
    override infix fun max(that: `J`) = if (this > that) this else that

    override val abs get() = `J`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `J`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `J` && this.siValue == other.siValue
}

inline val Number.`Candela`: `LuminousIntensity` get() = `J`(toDouble() * 1.0)
inline val `J`.`Candela` get() = siValue * 1.0
object `Candela` : UomConverter<`J`>,
    Quan<`J`> by box(`J`(1.0)) {
    override val unitName = "Candela"
    override fun invoke(x: Double) = x.`Candela`
    override fun invoke(x: `J`) = x.`Candela`
}


typealias `LuminousIntensity` = `J`




typealias `∠` = L0A1M0T0I0Theta0N0J0C0
inline class L0A1M0T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`∠`> {
    override val siValue get() = underlying
    override val abrev get() = "rad"

    override fun new(siValue: Double) = `∠`(siValue)

    override operator fun unaryPlus() = `∠`(+underlying)
    override operator fun unaryMinus() = `∠`(-underlying)

    override operator fun plus(that: `∠`) = `∠`(this.underlying + that.underlying)
    override operator fun minus(that: `∠`) = `∠`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `∠`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `∠`(this.underlying / that.toDouble())
    override operator fun rem(that: `∠`) = `∠`(this.underlying % that.underlying)

    override infix fun min(that: `∠`) = if (this < that) this else that
    override infix fun max(that: `∠`) = if (this > that) this else that

    override val abs get() = `∠`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `∠`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `∠` && this.siValue == other.siValue
}

inline val Number.`Radian`: `Angle` get() = `∠`(toDouble() * 1.0)
inline val `∠`.`Radian` get() = siValue * 1.0
object `Radian` : UomConverter<`∠`>,
    Quan<`∠`> by box(`∠`(1.0)) {
    override val unitName = "Radian"
    override fun invoke(x: Double) = x.`Radian`
    override fun invoke(x: `∠`) = x.`Radian`
}


typealias `Angle` = `∠`




typealias `∠²` = L0A2M0T0I0Theta0N0J0C0
inline class L0A2M0T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`∠²`> {
    override val siValue get() = underlying
    override val abrev get() = "rad²"

    override fun new(siValue: Double) = `∠²`(siValue)

    override operator fun unaryPlus() = `∠²`(+underlying)
    override operator fun unaryMinus() = `∠²`(-underlying)

    override operator fun plus(that: `∠²`) = `∠²`(this.underlying + that.underlying)
    override operator fun minus(that: `∠²`) = `∠²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `∠²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `∠²`(this.underlying / that.toDouble())
    override operator fun rem(that: `∠²`) = `∠²`(this.underlying % that.underlying)

    override infix fun min(that: `∠²`) = if (this < that) this else that
    override infix fun max(that: `∠²`) = if (this > that) this else that

    override val abs get() = `∠²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `∠²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `∠²` && this.siValue == other.siValue
}

inline val Number.`Steradian`: `SolidAngle` get() = `∠²`(toDouble() * 1.0)
inline val `∠²`.`Steradian` get() = siValue * 1.0
object `Steradian` : UomConverter<`∠²`>,
    Quan<`∠²`> by box(`∠²`(1.0)) {
    override val unitName = "Steradian"
    override fun invoke(x: Double) = x.`Steradian`
    override fun invoke(x: `∠²`) = x.`Steradian`
}


typealias `SolidAngle` = `∠²`




typealias `L⋅M⋅T⁻²` = L1A0M1I0Theta0N0J0C0_per_T2
inline class L1A0M1I0Theta0N0J0C0_per_T2(internal val underlying: Double) : Quan<`L⋅M⋅T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅kg⋅s⁻²"

    override fun new(siValue: Double) = `L⋅M⋅T⁻²`(siValue)

    override operator fun unaryPlus() = `L⋅M⋅T⁻²`(+underlying)
    override operator fun unaryMinus() = `L⋅M⋅T⁻²`(-underlying)

    override operator fun plus(that: `L⋅M⋅T⁻²`) = `L⋅M⋅T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅M⋅T⁻²`) = `L⋅M⋅T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅M⋅T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅M⋅T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅M⋅T⁻²`) = `L⋅M⋅T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅M⋅T⁻²`) = if (this < that) this else that
    override infix fun max(that: `L⋅M⋅T⁻²`) = if (this > that) this else that

    override val abs get() = `L⋅M⋅T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅M⋅T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅M⋅T⁻²` && this.siValue == other.siValue
}

inline val Number.`Newton`: `L⋅M⋅T⁻²` get() = `L⋅M⋅T⁻²`(toDouble() * 1.0)
inline val `L⋅M⋅T⁻²`.`Newton` get() = siValue * 1.0
object `Newton` : UomConverter<`L⋅M⋅T⁻²`>,
    Quan<`L⋅M⋅T⁻²`> by box(`L⋅M⋅T⁻²`(1.0)) {
    override val unitName = "Newton"
    override fun invoke(x: Double) = x.`Newton`
    override fun invoke(x: `L⋅M⋅T⁻²`) = x.`Newton`
}


typealias `Force` = `L⋅M⋅T⁻²`

typealias `Weight` = `L⋅M⋅T⁻²`




typealias `L⁻¹⋅M⋅T⁻²` = A0M1I0Theta0N0J0C0_per_L1T2
inline class A0M1I0Theta0N0J0C0_per_L1T2(internal val underlying: Double) : Quan<`L⁻¹⋅M⋅T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅kg⋅s⁻²"

    override fun new(siValue: Double) = `L⁻¹⋅M⋅T⁻²`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅M⋅T⁻²`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅M⋅T⁻²`(-underlying)

    override operator fun plus(that: `L⁻¹⋅M⋅T⁻²`) = `L⁻¹⋅M⋅T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅M⋅T⁻²`) = `L⁻¹⋅M⋅T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅M⋅T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅M⋅T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅M⋅T⁻²`) = `L⁻¹⋅M⋅T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅M⋅T⁻²`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅M⋅T⁻²`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅M⋅T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅M⋅T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅M⋅T⁻²` && this.siValue == other.siValue
}

inline val Number.`Pascal`: `L⁻¹⋅M⋅T⁻²` get() = `L⁻¹⋅M⋅T⁻²`(toDouble() * 1.0)
inline val `L⁻¹⋅M⋅T⁻²`.`Pascal` get() = siValue * 1.0
object `Pascal` : UomConverter<`L⁻¹⋅M⋅T⁻²`>,
    Quan<`L⁻¹⋅M⋅T⁻²`> by box(`L⁻¹⋅M⋅T⁻²`(1.0)) {
    override val unitName = "Pascal"
    override fun invoke(x: Double) = x.`Pascal`
    override fun invoke(x: `L⁻¹⋅M⋅T⁻²`) = x.`Pascal`
}


typealias `Pressure` = `L⁻¹⋅M⋅T⁻²`

typealias `Stress` = `L⁻¹⋅M⋅T⁻²`

typealias `EnergyDensity` = `L⁻¹⋅M⋅T⁻²`




typealias `T⋅I` = L0A0M0T1I1Theta0N0J0C0
inline class L0A0M0T1I1Theta0N0J0C0(internal val underlying: Double) : Quan<`T⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "s⋅A"

    override fun new(siValue: Double) = `T⋅I`(siValue)

    override operator fun unaryPlus() = `T⋅I`(+underlying)
    override operator fun unaryMinus() = `T⋅I`(-underlying)

    override operator fun plus(that: `T⋅I`) = `T⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `T⋅I`) = `T⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `T⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `T⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `T⋅I`) = `T⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `T⋅I`) = if (this < that) this else that
    override infix fun max(that: `T⋅I`) = if (this > that) this else that

    override val abs get() = `T⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `T⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `T⋅I` && this.siValue == other.siValue
}

inline val Number.`Coulomb`: `ElectricCharge` get() = `T⋅I`(toDouble() * 1.0)
inline val `T⋅I`.`Coulomb` get() = siValue * 1.0
object `Coulomb` : UomConverter<`T⋅I`>,
    Quan<`T⋅I`> by box(`T⋅I`(1.0)) {
    override val unitName = "Coulomb"
    override fun invoke(x: Double) = x.`Coulomb`
    override fun invoke(x: `T⋅I`) = x.`Coulomb`
}


typealias `ElectricCharge` = `T⋅I`




typealias `L²⋅M⋅T⁻³⋅I⁻¹` = L2A0M1Theta0N0J0C0_per_T3I1
inline class L2A0M1Theta0N0J0C0_per_T3I1(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻³⋅I⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻³⋅A⁻¹"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻³⋅I⁻¹`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻³⋅I⁻¹`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻³⋅I⁻¹`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻³⋅I⁻¹`) = `L²⋅M⋅T⁻³⋅I⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻³⋅I⁻¹`) = `L²⋅M⋅T⁻³⋅I⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻³⋅I⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻³⋅I⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻³⋅I⁻¹`) = `L²⋅M⋅T⁻³⋅I⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻³⋅I⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻³⋅I⁻¹`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻³⋅I⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻³⋅I⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻³⋅I⁻¹` && this.siValue == other.siValue
}

inline val Number.`Volt`: `ElectricalPotential` get() = `L²⋅M⋅T⁻³⋅I⁻¹`(toDouble() * 1.0)
inline val `L²⋅M⋅T⁻³⋅I⁻¹`.`Volt` get() = siValue * 1.0
object `Volt` : UomConverter<`L²⋅M⋅T⁻³⋅I⁻¹`>,
    Quan<`L²⋅M⋅T⁻³⋅I⁻¹`> by box(`L²⋅M⋅T⁻³⋅I⁻¹`(1.0)) {
    override val unitName = "Volt"
    override fun invoke(x: Double) = x.`Volt`
    override fun invoke(x: `L²⋅M⋅T⁻³⋅I⁻¹`) = x.`Volt`
}


typealias `ElectricalPotential` = `L²⋅M⋅T⁻³⋅I⁻¹`




typealias `L⁻²⋅M⁻¹⋅T⁴⋅I²` = A0T4I2Theta0N0J0C0_per_L2M1
inline class A0T4I2Theta0N0J0C0_per_L2M1(internal val underlying: Double) : Quan<`L⁻²⋅M⁻¹⋅T⁴⋅I²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅kg⁻¹⋅s⁴⋅A²"

    override fun new(siValue: Double) = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(-underlying)

    override operator fun plus(that: `L⁻²⋅M⁻¹⋅T⁴⋅I²`) = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅M⁻¹⋅T⁴⋅I²`) = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅M⁻¹⋅T⁴⋅I²`) = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅M⁻¹⋅T⁴⋅I²`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅M⁻¹⋅T⁴⋅I²`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅M⁻¹⋅T⁴⋅I²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅M⁻¹⋅T⁴⋅I²` && this.siValue == other.siValue
}

inline val Number.`Farad`: `ElectricalCapacitance` get() = `L⁻²⋅M⁻¹⋅T⁴⋅I²`(toDouble() * 1.0)
inline val `L⁻²⋅M⁻¹⋅T⁴⋅I²`.`Farad` get() = siValue * 1.0
object `Farad` : UomConverter<`L⁻²⋅M⁻¹⋅T⁴⋅I²`>,
    Quan<`L⁻²⋅M⁻¹⋅T⁴⋅I²`> by box(`L⁻²⋅M⁻¹⋅T⁴⋅I²`(1.0)) {
    override val unitName = "Farad"
    override fun invoke(x: Double) = x.`Farad`
    override fun invoke(x: `L⁻²⋅M⁻¹⋅T⁴⋅I²`) = x.`Farad`
}


typealias `ElectricalCapacitance` = `L⁻²⋅M⁻¹⋅T⁴⋅I²`




typealias `L²⋅M⋅T⁻³⋅I⁻²` = L2A0M1Theta0N0J0C0_per_T3I2
inline class L2A0M1Theta0N0J0C0_per_T3I2(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻³⋅I⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻³⋅A⁻²"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻³⋅I⁻²`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻³⋅I⁻²`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻³⋅I⁻²`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻³⋅I⁻²`) = `L²⋅M⋅T⁻³⋅I⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻³⋅I⁻²`) = `L²⋅M⋅T⁻³⋅I⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻³⋅I⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻³⋅I⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻³⋅I⁻²`) = `L²⋅M⋅T⁻³⋅I⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻³⋅I⁻²`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻³⋅I⁻²`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻³⋅I⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻³⋅I⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻³⋅I⁻²` && this.siValue == other.siValue
}

inline val Number.`Ohm`: `L²⋅M⋅T⁻³⋅I⁻²` get() = `L²⋅M⋅T⁻³⋅I⁻²`(toDouble() * 1.0)
inline val `L²⋅M⋅T⁻³⋅I⁻²`.`Ohm` get() = siValue * 1.0
object `Ohm` : UomConverter<`L²⋅M⋅T⁻³⋅I⁻²`>,
    Quan<`L²⋅M⋅T⁻³⋅I⁻²`> by box(`L²⋅M⋅T⁻³⋅I⁻²`(1.0)) {
    override val unitName = "Ohm"
    override fun invoke(x: Double) = x.`Ohm`
    override fun invoke(x: `L²⋅M⋅T⁻³⋅I⁻²`) = x.`Ohm`
}


typealias `ElectricalResistance` = `L²⋅M⋅T⁻³⋅I⁻²`

typealias `Impedance` = `L²⋅M⋅T⁻³⋅I⁻²`

typealias `Reactance` = `L²⋅M⋅T⁻³⋅I⁻²`




typealias `L⁻²⋅M⁻¹⋅T³⋅I²` = A0T3I2Theta0N0J0C0_per_L2M1
inline class A0T3I2Theta0N0J0C0_per_L2M1(internal val underlying: Double) : Quan<`L⁻²⋅M⁻¹⋅T³⋅I²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅kg⁻¹⋅s³⋅A²"

    override fun new(siValue: Double) = `L⁻²⋅M⁻¹⋅T³⋅I²`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅M⁻¹⋅T³⋅I²`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅M⁻¹⋅T³⋅I²`(-underlying)

    override operator fun plus(that: `L⁻²⋅M⁻¹⋅T³⋅I²`) = `L⁻²⋅M⁻¹⋅T³⋅I²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅M⁻¹⋅T³⋅I²`) = `L⁻²⋅M⁻¹⋅T³⋅I²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅M⁻¹⋅T³⋅I²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅M⁻¹⋅T³⋅I²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅M⁻¹⋅T³⋅I²`) = `L⁻²⋅M⁻¹⋅T³⋅I²`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅M⁻¹⋅T³⋅I²`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅M⁻¹⋅T³⋅I²`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅M⁻¹⋅T³⋅I²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅M⁻¹⋅T³⋅I²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅M⁻¹⋅T³⋅I²` && this.siValue == other.siValue
}

inline val Number.`Siemens`: `ElectricalConductance` get() = `L⁻²⋅M⁻¹⋅T³⋅I²`(toDouble() * 1.0)
inline val `L⁻²⋅M⁻¹⋅T³⋅I²`.`Siemens` get() = siValue * 1.0
object `Siemens` : UomConverter<`L⁻²⋅M⁻¹⋅T³⋅I²`>,
    Quan<`L⁻²⋅M⁻¹⋅T³⋅I²`> by box(`L⁻²⋅M⁻¹⋅T³⋅I²`(1.0)) {
    override val unitName = "Siemens"
    override fun invoke(x: Double) = x.`Siemens`
    override fun invoke(x: `L⁻²⋅M⁻¹⋅T³⋅I²`) = x.`Siemens`
}


typealias `ElectricalConductance` = `L⁻²⋅M⁻¹⋅T³⋅I²`




typealias `L²⋅M⋅T⁻²⋅I⁻¹` = L2A0M1Theta0N0J0C0_per_T2I1
inline class L2A0M1Theta0N0J0C0_per_T2I1(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻²⋅I⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻²⋅A⁻¹"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻²⋅I⁻¹`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻²⋅I⁻¹`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻²⋅I⁻¹`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻²⋅I⁻¹`) = `L²⋅M⋅T⁻²⋅I⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻²⋅I⁻¹`) = `L²⋅M⋅T⁻²⋅I⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻²⋅I⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻²⋅I⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻²⋅I⁻¹`) = `L²⋅M⋅T⁻²⋅I⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻²⋅I⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻²⋅I⁻¹`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻²⋅I⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻²⋅I⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻²⋅I⁻¹` && this.siValue == other.siValue
}

inline val Number.`Weber`: `MagneticFlux` get() = `L²⋅M⋅T⁻²⋅I⁻¹`(toDouble() * 1.0)
inline val `L²⋅M⋅T⁻²⋅I⁻¹`.`Weber` get() = siValue * 1.0
object `Weber` : UomConverter<`L²⋅M⋅T⁻²⋅I⁻¹`>,
    Quan<`L²⋅M⋅T⁻²⋅I⁻¹`> by box(`L²⋅M⋅T⁻²⋅I⁻¹`(1.0)) {
    override val unitName = "Weber"
    override fun invoke(x: Double) = x.`Weber`
    override fun invoke(x: `L²⋅M⋅T⁻²⋅I⁻¹`) = x.`Weber`
}


typealias `MagneticFlux` = `L²⋅M⋅T⁻²⋅I⁻¹`




typealias `M⋅T⁻²⋅I⁻¹` = L0A0M1Theta0N0J0C0_per_T2I1
inline class L0A0M1Theta0N0J0C0_per_T2I1(internal val underlying: Double) : Quan<`M⋅T⁻²⋅I⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⋅s⁻²⋅A⁻¹"

    override fun new(siValue: Double) = `M⋅T⁻²⋅I⁻¹`(siValue)

    override operator fun unaryPlus() = `M⋅T⁻²⋅I⁻¹`(+underlying)
    override operator fun unaryMinus() = `M⋅T⁻²⋅I⁻¹`(-underlying)

    override operator fun plus(that: `M⋅T⁻²⋅I⁻¹`) = `M⋅T⁻²⋅I⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `M⋅T⁻²⋅I⁻¹`) = `M⋅T⁻²⋅I⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⋅T⁻²⋅I⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⋅T⁻²⋅I⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⋅T⁻²⋅I⁻¹`) = `M⋅T⁻²⋅I⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `M⋅T⁻²⋅I⁻¹`) = if (this < that) this else that
    override infix fun max(that: `M⋅T⁻²⋅I⁻¹`) = if (this > that) this else that

    override val abs get() = `M⋅T⁻²⋅I⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⋅T⁻²⋅I⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⋅T⁻²⋅I⁻¹` && this.siValue == other.siValue
}

inline val Number.`Tesla`: `M⋅T⁻²⋅I⁻¹` get() = `M⋅T⁻²⋅I⁻¹`(toDouble() * 1.0)
inline val `M⋅T⁻²⋅I⁻¹`.`Tesla` get() = siValue * 1.0
object `Tesla` : UomConverter<`M⋅T⁻²⋅I⁻¹`>,
    Quan<`M⋅T⁻²⋅I⁻¹`> by box(`M⋅T⁻²⋅I⁻¹`(1.0)) {
    override val unitName = "Tesla"
    override fun invoke(x: Double) = x.`Tesla`
    override fun invoke(x: `M⋅T⁻²⋅I⁻¹`) = x.`Tesla`
}


typealias `MagneticFieldStrength` = `M⋅T⁻²⋅I⁻¹`

typealias `MagneticFluxDensity` = `M⋅T⁻²⋅I⁻¹`




typealias `L²⋅M⋅T⁻²⋅I⁻²` = L2A0M1Theta0N0J0C0_per_T2I2
inline class L2A0M1Theta0N0J0C0_per_T2I2(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻²⋅I⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻²⋅A⁻²"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻²⋅I⁻²`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻²⋅I⁻²`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻²⋅I⁻²`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻²⋅I⁻²`) = `L²⋅M⋅T⁻²⋅I⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻²⋅I⁻²`) = `L²⋅M⋅T⁻²⋅I⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻²⋅I⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻²⋅I⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻²⋅I⁻²`) = `L²⋅M⋅T⁻²⋅I⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻²⋅I⁻²`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻²⋅I⁻²`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻²⋅I⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻²⋅I⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻²⋅I⁻²` && this.siValue == other.siValue
}

inline val Number.`Henry`: `ElectricalInductance` get() = `L²⋅M⋅T⁻²⋅I⁻²`(toDouble() * 1.0)
inline val `L²⋅M⋅T⁻²⋅I⁻²`.`Henry` get() = siValue * 1.0
object `Henry` : UomConverter<`L²⋅M⋅T⁻²⋅I⁻²`>,
    Quan<`L²⋅M⋅T⁻²⋅I⁻²`> by box(`L²⋅M⋅T⁻²⋅I⁻²`(1.0)) {
    override val unitName = "Henry"
    override fun invoke(x: Double) = x.`Henry`
    override fun invoke(x: `L²⋅M⋅T⁻²⋅I⁻²`) = x.`Henry`
}


typealias `ElectricalInductance` = `L²⋅M⋅T⁻²⋅I⁻²`




typealias `∠²⋅J` = L0A2M0T0I0Theta0N0J1C0
inline class L0A2M0T0I0Theta0N0J1C0(internal val underlying: Double) : Quan<`∠²⋅J`> {
    override val siValue get() = underlying
    override val abrev get() = "rad²⋅cd"

    override fun new(siValue: Double) = `∠²⋅J`(siValue)

    override operator fun unaryPlus() = `∠²⋅J`(+underlying)
    override operator fun unaryMinus() = `∠²⋅J`(-underlying)

    override operator fun plus(that: `∠²⋅J`) = `∠²⋅J`(this.underlying + that.underlying)
    override operator fun minus(that: `∠²⋅J`) = `∠²⋅J`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `∠²⋅J`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `∠²⋅J`(this.underlying / that.toDouble())
    override operator fun rem(that: `∠²⋅J`) = `∠²⋅J`(this.underlying % that.underlying)

    override infix fun min(that: `∠²⋅J`) = if (this < that) this else that
    override infix fun max(that: `∠²⋅J`) = if (this > that) this else that

    override val abs get() = `∠²⋅J`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `∠²⋅J`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `∠²⋅J` && this.siValue == other.siValue
}

inline val Number.`Lumen`: `LuminousFlux` get() = `∠²⋅J`(toDouble() * 1.0)
inline val `∠²⋅J`.`Lumen` get() = siValue * 1.0
object `Lumen` : UomConverter<`∠²⋅J`>,
    Quan<`∠²⋅J`> by box(`∠²⋅J`(1.0)) {
    override val unitName = "Lumen"
    override fun invoke(x: Double) = x.`Lumen`
    override fun invoke(x: `∠²⋅J`) = x.`Lumen`
}


typealias `LuminousFlux` = `∠²⋅J`




typealias `L⁻²⋅J` = A0M0T0I0Theta0N0J1C0_per_L2
inline class A0M0T0I0Theta0N0J1C0_per_L2(internal val underlying: Double) : Quan<`L⁻²⋅J`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅cd"

    override fun new(siValue: Double) = `L⁻²⋅J`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅J`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅J`(-underlying)

    override operator fun plus(that: `L⁻²⋅J`) = `L⁻²⋅J`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅J`) = `L⁻²⋅J`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅J`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅J`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅J`) = `L⁻²⋅J`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅J`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅J`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅J`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅J`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅J` && this.siValue == other.siValue
}

inline val Number.`Lux`: `L⁻²⋅J` get() = `L⁻²⋅J`(toDouble() * 1.0)
inline val `L⁻²⋅J`.`Lux` get() = siValue * 1.0
object `Lux` : UomConverter<`L⁻²⋅J`>,
    Quan<`L⁻²⋅J`> by box(`L⁻²⋅J`(1.0)) {
    override val unitName = "Lux"
    override fun invoke(x: Double) = x.`Lux`
    override fun invoke(x: `L⁻²⋅J`) = x.`Lux`
}


typealias `Illuminance` = `L⁻²⋅J`

typealias `Luminance` = `L⁻²⋅J`




typealias `T⁻¹⋅N` = L0A0M0I0Theta0N1J0C0_per_T1
inline class L0A0M0I0Theta0N1J0C0_per_T1(internal val underlying: Double) : Quan<`T⁻¹⋅N`> {
    override val siValue get() = underlying
    override val abrev get() = "s⁻¹⋅mol"

    override fun new(siValue: Double) = `T⁻¹⋅N`(siValue)

    override operator fun unaryPlus() = `T⁻¹⋅N`(+underlying)
    override operator fun unaryMinus() = `T⁻¹⋅N`(-underlying)

    override operator fun plus(that: `T⁻¹⋅N`) = `T⁻¹⋅N`(this.underlying + that.underlying)
    override operator fun minus(that: `T⁻¹⋅N`) = `T⁻¹⋅N`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `T⁻¹⋅N`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `T⁻¹⋅N`(this.underlying / that.toDouble())
    override operator fun rem(that: `T⁻¹⋅N`) = `T⁻¹⋅N`(this.underlying % that.underlying)

    override infix fun min(that: `T⁻¹⋅N`) = if (this < that) this else that
    override infix fun max(that: `T⁻¹⋅N`) = if (this > that) this else that

    override val abs get() = `T⁻¹⋅N`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `T⁻¹⋅N`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `T⁻¹⋅N` && this.siValue == other.siValue
}

inline val Number.`Katal`: `CatalyticActivity` get() = `T⁻¹⋅N`(toDouble() * 1.0)
inline val `T⁻¹⋅N`.`Katal` get() = siValue * 1.0
object `Katal` : UomConverter<`T⁻¹⋅N`>,
    Quan<`T⁻¹⋅N`> by box(`T⁻¹⋅N`(1.0)) {
    override val unitName = "Katal"
    override fun invoke(x: Double) = x.`Katal`
    override fun invoke(x: `T⁻¹⋅N`) = x.`Katal`
}


typealias `CatalyticActivity` = `T⁻¹⋅N`




typealias `L³⋅T⁻¹` = L3A0M0I0Theta0N0J0C0_per_T1
inline class L3A0M0I0Theta0N0J0C0_per_T1(internal val underlying: Double) : Quan<`L³⋅T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m³⋅s⁻¹"

    override fun new(siValue: Double) = `L³⋅T⁻¹`(siValue)

    override operator fun unaryPlus() = `L³⋅T⁻¹`(+underlying)
    override operator fun unaryMinus() = `L³⋅T⁻¹`(-underlying)

    override operator fun plus(that: `L³⋅T⁻¹`) = `L³⋅T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L³⋅T⁻¹`) = `L³⋅T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³⋅T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³⋅T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³⋅T⁻¹`) = `L³⋅T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L³⋅T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L³⋅T⁻¹`) = if (this > that) this else that

    override val abs get() = `L³⋅T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³⋅T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³⋅T⁻¹` && this.siValue == other.siValue
}


typealias `VolumetricFlow` = `L³⋅T⁻¹`




typealias `L⋅T⁻³` = L1A0M0I0Theta0N0J0C0_per_T3
inline class L1A0M0I0Theta0N0J0C0_per_T3(internal val underlying: Double) : Quan<`L⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅s⁻³"

    override fun new(siValue: Double) = `L⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `L⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `L⋅T⁻³`(-underlying)

    override operator fun plus(that: `L⋅T⁻³`) = `L⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅T⁻³`) = `L⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅T⁻³`) = `L⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `L⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `L⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅T⁻³` && this.siValue == other.siValue
}


typealias `Jerk` = `L⋅T⁻³`

typealias `Jolt` = `L⋅T⁻³`




typealias `L⋅T⁻⁴` = L1A0M0I0Theta0N0J0C0_per_T4
inline class L1A0M0I0Theta0N0J0C0_per_T4(internal val underlying: Double) : Quan<`L⋅T⁻⁴`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅s⁻⁴"

    override fun new(siValue: Double) = `L⋅T⁻⁴`(siValue)

    override operator fun unaryPlus() = `L⋅T⁻⁴`(+underlying)
    override operator fun unaryMinus() = `L⋅T⁻⁴`(-underlying)

    override operator fun plus(that: `L⋅T⁻⁴`) = `L⋅T⁻⁴`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅T⁻⁴`) = `L⋅T⁻⁴`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅T⁻⁴`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅T⁻⁴`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅T⁻⁴`) = `L⋅T⁻⁴`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅T⁻⁴`) = if (this < that) this else that
    override infix fun max(that: `L⋅T⁻⁴`) = if (this > that) this else that

    override val abs get() = `L⋅T⁻⁴`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅T⁻⁴`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅T⁻⁴` && this.siValue == other.siValue
}


typealias `Snap` = `L⋅T⁻⁴`

typealias `Jounce` = `L⋅T⁻⁴`




typealias `∠⋅T⁻¹` = L0A1M0I0Theta0N0J0C0_per_T1
inline class L0A1M0I0Theta0N0J0C0_per_T1(internal val underlying: Double) : Quan<`∠⋅T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "rad⋅s⁻¹"

    override fun new(siValue: Double) = `∠⋅T⁻¹`(siValue)

    override operator fun unaryPlus() = `∠⋅T⁻¹`(+underlying)
    override operator fun unaryMinus() = `∠⋅T⁻¹`(-underlying)

    override operator fun plus(that: `∠⋅T⁻¹`) = `∠⋅T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `∠⋅T⁻¹`) = `∠⋅T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `∠⋅T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `∠⋅T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `∠⋅T⁻¹`) = `∠⋅T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `∠⋅T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `∠⋅T⁻¹`) = if (this > that) this else that

    override val abs get() = `∠⋅T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `∠⋅T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `∠⋅T⁻¹` && this.siValue == other.siValue
}


typealias `AngularVelocity` = `∠⋅T⁻¹`




typealias `∠⋅T⁻²` = L0A1M0I0Theta0N0J0C0_per_T2
inline class L0A1M0I0Theta0N0J0C0_per_T2(internal val underlying: Double) : Quan<`∠⋅T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "rad⋅s⁻²"

    override fun new(siValue: Double) = `∠⋅T⁻²`(siValue)

    override operator fun unaryPlus() = `∠⋅T⁻²`(+underlying)
    override operator fun unaryMinus() = `∠⋅T⁻²`(-underlying)

    override operator fun plus(that: `∠⋅T⁻²`) = `∠⋅T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `∠⋅T⁻²`) = `∠⋅T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `∠⋅T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `∠⋅T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `∠⋅T⁻²`) = `∠⋅T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `∠⋅T⁻²`) = if (this < that) this else that
    override infix fun max(that: `∠⋅T⁻²`) = if (this > that) this else that

    override val abs get() = `∠⋅T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `∠⋅T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `∠⋅T⁻²` && this.siValue == other.siValue
}


typealias `AngularAcceleration` = `∠⋅T⁻²`




typealias `L⋅M⋅T⁻¹` = L1A0M1I0Theta0N0J0C0_per_T1
inline class L1A0M1I0Theta0N0J0C0_per_T1(internal val underlying: Double) : Quan<`L⋅M⋅T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅kg⋅s⁻¹"

    override fun new(siValue: Double) = `L⋅M⋅T⁻¹`(siValue)

    override operator fun unaryPlus() = `L⋅M⋅T⁻¹`(+underlying)
    override operator fun unaryMinus() = `L⋅M⋅T⁻¹`(-underlying)

    override operator fun plus(that: `L⋅M⋅T⁻¹`) = `L⋅M⋅T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅M⋅T⁻¹`) = `L⋅M⋅T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅M⋅T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅M⋅T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅M⋅T⁻¹`) = `L⋅M⋅T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅M⋅T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L⋅M⋅T⁻¹`) = if (this > that) this else that

    override val abs get() = `L⋅M⋅T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅M⋅T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅M⋅T⁻¹` && this.siValue == other.siValue
}


typealias `Momentum` = `L⋅M⋅T⁻¹`

typealias `Impulse` = `L⋅M⋅T⁻¹`




typealias `L²⋅M⋅T⁻¹` = L2A0M1I0Theta0N0J0C0_per_T1
inline class L2A0M1I0Theta0N0J0C0_per_T1(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻¹"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻¹`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻¹`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻¹`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻¹`) = `L²⋅M⋅T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻¹`) = `L²⋅M⋅T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻¹`) = `L²⋅M⋅T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻¹`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻¹` && this.siValue == other.siValue
}


typealias `AngularMomentum` = `L²⋅M⋅T⁻¹`

typealias `Action` = `L²⋅M⋅T⁻¹`




typealias `L²⋅∠⁻¹⋅M⋅T⁻²` = L2M1I0Theta0N0J0C0_per_A1T2
inline class L2M1I0Theta0N0J0C0_per_A1T2(internal val underlying: Double) : Quan<`L²⋅∠⁻¹⋅M⋅T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅rad⁻¹⋅kg⋅s⁻²"

    override fun new(siValue: Double) = `L²⋅∠⁻¹⋅M⋅T⁻²`(siValue)

    override operator fun unaryPlus() = `L²⋅∠⁻¹⋅M⋅T⁻²`(+underlying)
    override operator fun unaryMinus() = `L²⋅∠⁻¹⋅M⋅T⁻²`(-underlying)

    override operator fun plus(that: `L²⋅∠⁻¹⋅M⋅T⁻²`) = `L²⋅∠⁻¹⋅M⋅T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅∠⁻¹⋅M⋅T⁻²`) = `L²⋅∠⁻¹⋅M⋅T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅∠⁻¹⋅M⋅T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅∠⁻¹⋅M⋅T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅∠⁻¹⋅M⋅T⁻²`) = `L²⋅∠⁻¹⋅M⋅T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅∠⁻¹⋅M⋅T⁻²`) = if (this < that) this else that
    override infix fun max(that: `L²⋅∠⁻¹⋅M⋅T⁻²`) = if (this > that) this else that

    override val abs get() = `L²⋅∠⁻¹⋅M⋅T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅∠⁻¹⋅M⋅T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅∠⁻¹⋅M⋅T⁻²` && this.siValue == other.siValue
}


typealias `Torque` = `L²⋅∠⁻¹⋅M⋅T⁻²`




typealias `L⋅M⋅T⁻³` = L1A0M1I0Theta0N0J0C0_per_T3
inline class L1A0M1I0Theta0N0J0C0_per_T3(internal val underlying: Double) : Quan<`L⋅M⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅kg⋅s⁻³"

    override fun new(siValue: Double) = `L⋅M⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `L⋅M⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `L⋅M⋅T⁻³`(-underlying)

    override operator fun plus(that: `L⋅M⋅T⁻³`) = `L⋅M⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅M⋅T⁻³`) = `L⋅M⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅M⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅M⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅M⋅T⁻³`) = `L⋅M⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅M⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `L⋅M⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `L⋅M⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅M⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅M⋅T⁻³` && this.siValue == other.siValue
}


typealias `Yank` = `L⋅M⋅T⁻³`

typealias `SpectralPower` = `L⋅M⋅T⁻³`




typealias `L⁻¹` = A0M0T0I0Theta0N0J0C0_per_L1
inline class A0M0T0I0Theta0N0J0C0_per_L1(internal val underlying: Double) : Quan<`L⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹"

    override fun new(siValue: Double) = `L⁻¹`(siValue)

    override operator fun unaryPlus() = `L⁻¹`(+underlying)
    override operator fun unaryMinus() = `L⁻¹`(-underlying)

    override operator fun plus(that: `L⁻¹`) = `L⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹`) = `L⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹`) = `L⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹`) = if (this > that) this else that

    override val abs get() = `L⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹` && this.siValue == other.siValue
}


typealias `Wavenumber` = `L⁻¹`

typealias `OpticalPower` = `L⁻¹`

typealias `Curvature` = `L⁻¹`

typealias `SpatialFrequency` = `L⁻¹`




typealias `L⁻²⋅M` = A0M1T0I0Theta0N0J0C0_per_L2
inline class A0M1T0I0Theta0N0J0C0_per_L2(internal val underlying: Double) : Quan<`L⁻²⋅M`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅kg"

    override fun new(siValue: Double) = `L⁻²⋅M`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅M`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅M`(-underlying)

    override operator fun plus(that: `L⁻²⋅M`) = `L⁻²⋅M`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅M`) = `L⁻²⋅M`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅M`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅M`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅M`) = `L⁻²⋅M`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅M`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅M`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅M`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅M`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅M` && this.siValue == other.siValue
}


typealias `AreaDensity` = `L⁻²⋅M`




typealias `L⁻³⋅M` = A0M1T0I0Theta0N0J0C0_per_L3
inline class A0M1T0I0Theta0N0J0C0_per_L3(internal val underlying: Double) : Quan<`L⁻³⋅M`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻³⋅kg"

    override fun new(siValue: Double) = `L⁻³⋅M`(siValue)

    override operator fun unaryPlus() = `L⁻³⋅M`(+underlying)
    override operator fun unaryMinus() = `L⁻³⋅M`(-underlying)

    override operator fun plus(that: `L⁻³⋅M`) = `L⁻³⋅M`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻³⋅M`) = `L⁻³⋅M`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻³⋅M`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻³⋅M`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻³⋅M`) = `L⁻³⋅M`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻³⋅M`) = if (this < that) this else that
    override infix fun max(that: `L⁻³⋅M`) = if (this > that) this else that

    override val abs get() = `L⁻³⋅M`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻³⋅M`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻³⋅M` && this.siValue == other.siValue
}


typealias `Density` = `L⁻³⋅M`

typealias `MassDensity` = `L⁻³⋅M`




typealias `L³⋅M⁻¹` = L3A0T0I0Theta0N0J0C0_per_M1
inline class L3A0T0I0Theta0N0J0C0_per_M1(internal val underlying: Double) : Quan<`L³⋅M⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m³⋅kg⁻¹"

    override fun new(siValue: Double) = `L³⋅M⁻¹`(siValue)

    override operator fun unaryPlus() = `L³⋅M⁻¹`(+underlying)
    override operator fun unaryMinus() = `L³⋅M⁻¹`(-underlying)

    override operator fun plus(that: `L³⋅M⁻¹`) = `L³⋅M⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L³⋅M⁻¹`) = `L³⋅M⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³⋅M⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³⋅M⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³⋅M⁻¹`) = `L³⋅M⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L³⋅M⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L³⋅M⁻¹`) = if (this > that) this else that

    override val abs get() = `L³⋅M⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³⋅M⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³⋅M⁻¹` && this.siValue == other.siValue
}


typealias `SpecificVolume` = `L³⋅M⁻¹`




typealias `L⁻³⋅N` = A0M0T0I0Theta0N1J0C0_per_L3
inline class A0M0T0I0Theta0N1J0C0_per_L3(internal val underlying: Double) : Quan<`L⁻³⋅N`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻³⋅mol"

    override fun new(siValue: Double) = `L⁻³⋅N`(siValue)

    override operator fun unaryPlus() = `L⁻³⋅N`(+underlying)
    override operator fun unaryMinus() = `L⁻³⋅N`(-underlying)

    override operator fun plus(that: `L⁻³⋅N`) = `L⁻³⋅N`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻³⋅N`) = `L⁻³⋅N`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻³⋅N`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻³⋅N`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻³⋅N`) = `L⁻³⋅N`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻³⋅N`) = if (this < that) this else that
    override infix fun max(that: `L⁻³⋅N`) = if (this > that) this else that

    override val abs get() = `L⁻³⋅N`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻³⋅N`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻³⋅N` && this.siValue == other.siValue
}


typealias `Molarity` = `L⁻³⋅N`

typealias `AmountOfSubstanceConcentration` = `L⁻³⋅N`




typealias `L³⋅N⁻¹` = L3A0M0T0I0Theta0J0C0_per_N1
inline class L3A0M0T0I0Theta0J0C0_per_N1(internal val underlying: Double) : Quan<`L³⋅N⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m³⋅mol⁻¹"

    override fun new(siValue: Double) = `L³⋅N⁻¹`(siValue)

    override operator fun unaryPlus() = `L³⋅N⁻¹`(+underlying)
    override operator fun unaryMinus() = `L³⋅N⁻¹`(-underlying)

    override operator fun plus(that: `L³⋅N⁻¹`) = `L³⋅N⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L³⋅N⁻¹`) = `L³⋅N⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³⋅N⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³⋅N⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³⋅N⁻¹`) = `L³⋅N⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L³⋅N⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L³⋅N⁻¹`) = if (this > that) this else that

    override val abs get() = `L³⋅N⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³⋅N⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³⋅N⁻¹` && this.siValue == other.siValue
}


typealias `MolarVolume` = `L³⋅N⁻¹`




typealias `L²⋅M⋅T⁻²⋅Θ⁻¹` = L2A0M1I0N0J0C0_per_T2Theta1
inline class L2A0M1I0N0J0C0_per_T2Theta1(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻²⋅Θ⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻²⋅K⁻¹"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻²⋅Θ⁻¹`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻²⋅Θ⁻¹`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻²⋅Θ⁻¹`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻²⋅Θ⁻¹`) = `L²⋅M⋅T⁻²⋅Θ⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻²⋅Θ⁻¹`) = `L²⋅M⋅T⁻²⋅Θ⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻²⋅Θ⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻²⋅Θ⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻²⋅Θ⁻¹`) = `L²⋅M⋅T⁻²⋅Θ⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻²⋅Θ⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻²⋅Θ⁻¹`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻²⋅Θ⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻²⋅Θ⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻²⋅Θ⁻¹` && this.siValue == other.siValue
}


typealias `HeatCapacity` = `L²⋅M⋅T⁻²⋅Θ⁻¹`

typealias `Entropy` = `L²⋅M⋅T⁻²⋅Θ⁻¹`




typealias `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹` = L2A0M1I0J0C0_per_T2Theta1N1
inline class L2A0M1I0J0C0_per_T2Theta1N1(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻²⋅K⁻¹⋅mol⁻¹"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`) = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`) = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`) = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹` && this.siValue == other.siValue
}


typealias `MolarHeatCapacity` = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`

typealias `MolarEntropy` = `L²⋅M⋅T⁻²⋅Θ⁻¹⋅N⁻¹`




typealias `L²⋅T⁻²⋅Θ⁻¹` = L2A0M0I0N0J0C0_per_T2Theta1
inline class L2A0M0I0N0J0C0_per_T2Theta1(internal val underlying: Double) : Quan<`L²⋅T⁻²⋅Θ⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅s⁻²⋅K⁻¹"

    override fun new(siValue: Double) = `L²⋅T⁻²⋅Θ⁻¹`(siValue)

    override operator fun unaryPlus() = `L²⋅T⁻²⋅Θ⁻¹`(+underlying)
    override operator fun unaryMinus() = `L²⋅T⁻²⋅Θ⁻¹`(-underlying)

    override operator fun plus(that: `L²⋅T⁻²⋅Θ⁻¹`) = `L²⋅T⁻²⋅Θ⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅T⁻²⋅Θ⁻¹`) = `L²⋅T⁻²⋅Θ⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅T⁻²⋅Θ⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅T⁻²⋅Θ⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅T⁻²⋅Θ⁻¹`) = `L²⋅T⁻²⋅Θ⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅T⁻²⋅Θ⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L²⋅T⁻²⋅Θ⁻¹`) = if (this > that) this else that

    override val abs get() = `L²⋅T⁻²⋅Θ⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅T⁻²⋅Θ⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅T⁻²⋅Θ⁻¹` && this.siValue == other.siValue
}


typealias `SpecificHeatCapacity` = `L²⋅T⁻²⋅Θ⁻¹`

typealias `SpecificEntropy` = `L²⋅T⁻²⋅Θ⁻¹`




typealias `L²⋅M⋅T⁻²⋅N⁻¹` = L2A0M1I0Theta0J0C0_per_T2N1
inline class L2A0M1I0Theta0J0C0_per_T2N1(internal val underlying: Double) : Quan<`L²⋅M⋅T⁻²⋅N⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg⋅s⁻²⋅mol⁻¹"

    override fun new(siValue: Double) = `L²⋅M⋅T⁻²⋅N⁻¹`(siValue)

    override operator fun unaryPlus() = `L²⋅M⋅T⁻²⋅N⁻¹`(+underlying)
    override operator fun unaryMinus() = `L²⋅M⋅T⁻²⋅N⁻¹`(-underlying)

    override operator fun plus(that: `L²⋅M⋅T⁻²⋅N⁻¹`) = `L²⋅M⋅T⁻²⋅N⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M⋅T⁻²⋅N⁻¹`) = `L²⋅M⋅T⁻²⋅N⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M⋅T⁻²⋅N⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M⋅T⁻²⋅N⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M⋅T⁻²⋅N⁻¹`) = `L²⋅M⋅T⁻²⋅N⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M⋅T⁻²⋅N⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M⋅T⁻²⋅N⁻¹`) = if (this > that) this else that

    override val abs get() = `L²⋅M⋅T⁻²⋅N⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M⋅T⁻²⋅N⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M⋅T⁻²⋅N⁻¹` && this.siValue == other.siValue
}


typealias `MolarEnergy` = `L²⋅M⋅T⁻²⋅N⁻¹`




typealias `M⋅T⁻²` = L0A0M1I0Theta0N0J0C0_per_T2
inline class L0A0M1I0Theta0N0J0C0_per_T2(internal val underlying: Double) : Quan<`M⋅T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⋅s⁻²"

    override fun new(siValue: Double) = `M⋅T⁻²`(siValue)

    override operator fun unaryPlus() = `M⋅T⁻²`(+underlying)
    override operator fun unaryMinus() = `M⋅T⁻²`(-underlying)

    override operator fun plus(that: `M⋅T⁻²`) = `M⋅T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `M⋅T⁻²`) = `M⋅T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⋅T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⋅T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⋅T⁻²`) = `M⋅T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `M⋅T⁻²`) = if (this < that) this else that
    override infix fun max(that: `M⋅T⁻²`) = if (this > that) this else that

    override val abs get() = `M⋅T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⋅T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⋅T⁻²` && this.siValue == other.siValue
}


typealias `SurfaceTension` = `M⋅T⁻²`

typealias `Stiffness` = `M⋅T⁻²`

typealias `RadiantExposure` = `M⋅T⁻²`




typealias `M⋅T⁻³` = L0A0M1I0Theta0N0J0C0_per_T3
inline class L0A0M1I0Theta0N0J0C0_per_T3(internal val underlying: Double) : Quan<`M⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⋅s⁻³"

    override fun new(siValue: Double) = `M⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `M⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `M⋅T⁻³`(-underlying)

    override operator fun plus(that: `M⋅T⁻³`) = `M⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `M⋅T⁻³`) = `M⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⋅T⁻³`) = `M⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `M⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `M⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `M⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⋅T⁻³` && this.siValue == other.siValue
}


typealias `HeatFluxDensity` = `M⋅T⁻³`

typealias `Irradiance` = `M⋅T⁻³`

typealias `EnergyFluxDensity` = `M⋅T⁻³`




typealias `L⋅M⋅T⁻³⋅Θ⁻¹` = L1A0M1I0N0J0C0_per_T3Theta1
inline class L1A0M1I0N0J0C0_per_T3Theta1(internal val underlying: Double) : Quan<`L⋅M⋅T⁻³⋅Θ⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅kg⋅s⁻³⋅K⁻¹"

    override fun new(siValue: Double) = `L⋅M⋅T⁻³⋅Θ⁻¹`(siValue)

    override operator fun unaryPlus() = `L⋅M⋅T⁻³⋅Θ⁻¹`(+underlying)
    override operator fun unaryMinus() = `L⋅M⋅T⁻³⋅Θ⁻¹`(-underlying)

    override operator fun plus(that: `L⋅M⋅T⁻³⋅Θ⁻¹`) = `L⋅M⋅T⁻³⋅Θ⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅M⋅T⁻³⋅Θ⁻¹`) = `L⋅M⋅T⁻³⋅Θ⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅M⋅T⁻³⋅Θ⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅M⋅T⁻³⋅Θ⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅M⋅T⁻³⋅Θ⁻¹`) = `L⋅M⋅T⁻³⋅Θ⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅M⋅T⁻³⋅Θ⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L⋅M⋅T⁻³⋅Θ⁻¹`) = if (this > that) this else that

    override val abs get() = `L⋅M⋅T⁻³⋅Θ⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅M⋅T⁻³⋅Θ⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅M⋅T⁻³⋅Θ⁻¹` && this.siValue == other.siValue
}


typealias `ThermalConductivity` = `L⋅M⋅T⁻³⋅Θ⁻¹`




typealias `L²⋅T⁻¹` = L2A0M0I0Theta0N0J0C0_per_T1
inline class L2A0M0I0Theta0N0J0C0_per_T1(internal val underlying: Double) : Quan<`L²⋅T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅s⁻¹"

    override fun new(siValue: Double) = `L²⋅T⁻¹`(siValue)

    override operator fun unaryPlus() = `L²⋅T⁻¹`(+underlying)
    override operator fun unaryMinus() = `L²⋅T⁻¹`(-underlying)

    override operator fun plus(that: `L²⋅T⁻¹`) = `L²⋅T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅T⁻¹`) = `L²⋅T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅T⁻¹`) = `L²⋅T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L²⋅T⁻¹`) = if (this > that) this else that

    override val abs get() = `L²⋅T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅T⁻¹` && this.siValue == other.siValue
}


typealias `KinematicViscosity` = `L²⋅T⁻¹`

typealias `ThermalDiffusivity` = `L²⋅T⁻¹`

typealias `DiffusionCoefficient` = `L²⋅T⁻¹`

typealias `SpecificAngularMomentum` = `L²⋅T⁻¹`




typealias `L⁻¹⋅M⋅T⁻¹` = A0M1I0Theta0N0J0C0_per_L1T1
inline class A0M1I0Theta0N0J0C0_per_L1T1(internal val underlying: Double) : Quan<`L⁻¹⋅M⋅T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅kg⋅s⁻¹"

    override fun new(siValue: Double) = `L⁻¹⋅M⋅T⁻¹`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅M⋅T⁻¹`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅M⋅T⁻¹`(-underlying)

    override operator fun plus(that: `L⁻¹⋅M⋅T⁻¹`) = `L⁻¹⋅M⋅T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅M⋅T⁻¹`) = `L⁻¹⋅M⋅T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅M⋅T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅M⋅T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅M⋅T⁻¹`) = `L⁻¹⋅M⋅T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅M⋅T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅M⋅T⁻¹`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅M⋅T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅M⋅T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅M⋅T⁻¹` && this.siValue == other.siValue
}


typealias `DynamicViscosity` = `L⁻¹⋅M⋅T⁻¹`




typealias `L⁻²⋅T⋅I` = A0M0T1I1Theta0N0J0C0_per_L2
inline class A0M0T1I1Theta0N0J0C0_per_L2(internal val underlying: Double) : Quan<`L⁻²⋅T⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅s⋅A"

    override fun new(siValue: Double) = `L⁻²⋅T⋅I`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅T⋅I`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅T⋅I`(-underlying)

    override operator fun plus(that: `L⁻²⋅T⋅I`) = `L⁻²⋅T⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅T⋅I`) = `L⁻²⋅T⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅T⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅T⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅T⋅I`) = `L⁻²⋅T⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅T⋅I`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅T⋅I`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅T⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅T⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅T⋅I` && this.siValue == other.siValue
}


typealias `ElectricDisplacementField` = `L⁻²⋅T⋅I`

typealias `PolarizationDensity` = `L⁻²⋅T⋅I`




typealias `L⁻³⋅T⋅I` = A0M0T1I1Theta0N0J0C0_per_L3
inline class A0M0T1I1Theta0N0J0C0_per_L3(internal val underlying: Double) : Quan<`L⁻³⋅T⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻³⋅s⋅A"

    override fun new(siValue: Double) = `L⁻³⋅T⋅I`(siValue)

    override operator fun unaryPlus() = `L⁻³⋅T⋅I`(+underlying)
    override operator fun unaryMinus() = `L⁻³⋅T⋅I`(-underlying)

    override operator fun plus(that: `L⁻³⋅T⋅I`) = `L⁻³⋅T⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻³⋅T⋅I`) = `L⁻³⋅T⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻³⋅T⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻³⋅T⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻³⋅T⋅I`) = `L⁻³⋅T⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻³⋅T⋅I`) = if (this < that) this else that
    override infix fun max(that: `L⁻³⋅T⋅I`) = if (this > that) this else that

    override val abs get() = `L⁻³⋅T⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻³⋅T⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻³⋅T⋅I` && this.siValue == other.siValue
}


typealias `ElectricChargeDensity` = `L⁻³⋅T⋅I`




typealias `L⁻²⋅I` = A0M0T0I1Theta0N0J0C0_per_L2
inline class A0M0T0I1Theta0N0J0C0_per_L2(internal val underlying: Double) : Quan<`L⁻²⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅A"

    override fun new(siValue: Double) = `L⁻²⋅I`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅I`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅I`(-underlying)

    override operator fun plus(that: `L⁻²⋅I`) = `L⁻²⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅I`) = `L⁻²⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅I`) = `L⁻²⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅I`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅I`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅I` && this.siValue == other.siValue
}


typealias `ElectricCurrentDensity` = `L⁻²⋅I`




typealias `L⁻³⋅M⁻¹⋅T³⋅I²` = A0T3I2Theta0N0J0C0_per_L3M1
inline class A0T3I2Theta0N0J0C0_per_L3M1(internal val underlying: Double) : Quan<`L⁻³⋅M⁻¹⋅T³⋅I²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻³⋅kg⁻¹⋅s³⋅A²"

    override fun new(siValue: Double) = `L⁻³⋅M⁻¹⋅T³⋅I²`(siValue)

    override operator fun unaryPlus() = `L⁻³⋅M⁻¹⋅T³⋅I²`(+underlying)
    override operator fun unaryMinus() = `L⁻³⋅M⁻¹⋅T³⋅I²`(-underlying)

    override operator fun plus(that: `L⁻³⋅M⁻¹⋅T³⋅I²`) = `L⁻³⋅M⁻¹⋅T³⋅I²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻³⋅M⁻¹⋅T³⋅I²`) = `L⁻³⋅M⁻¹⋅T³⋅I²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻³⋅M⁻¹⋅T³⋅I²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻³⋅M⁻¹⋅T³⋅I²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻³⋅M⁻¹⋅T³⋅I²`) = `L⁻³⋅M⁻¹⋅T³⋅I²`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻³⋅M⁻¹⋅T³⋅I²`) = if (this < that) this else that
    override infix fun max(that: `L⁻³⋅M⁻¹⋅T³⋅I²`) = if (this > that) this else that

    override val abs get() = `L⁻³⋅M⁻¹⋅T³⋅I²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻³⋅M⁻¹⋅T³⋅I²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻³⋅M⁻¹⋅T³⋅I²` && this.siValue == other.siValue
}


typealias `ElectricalConductivity` = `L⁻³⋅M⁻¹⋅T³⋅I²`




typealias `M⁻¹⋅T³⋅I²⋅N⁻¹` = L0A0T3I2Theta0J0C0_per_M1N1
inline class L0A0T3I2Theta0J0C0_per_M1N1(internal val underlying: Double) : Quan<`M⁻¹⋅T³⋅I²⋅N⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⁻¹⋅s³⋅A²⋅mol⁻¹"

    override fun new(siValue: Double) = `M⁻¹⋅T³⋅I²⋅N⁻¹`(siValue)

    override operator fun unaryPlus() = `M⁻¹⋅T³⋅I²⋅N⁻¹`(+underlying)
    override operator fun unaryMinus() = `M⁻¹⋅T³⋅I²⋅N⁻¹`(-underlying)

    override operator fun plus(that: `M⁻¹⋅T³⋅I²⋅N⁻¹`) = `M⁻¹⋅T³⋅I²⋅N⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `M⁻¹⋅T³⋅I²⋅N⁻¹`) = `M⁻¹⋅T³⋅I²⋅N⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⁻¹⋅T³⋅I²⋅N⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⁻¹⋅T³⋅I²⋅N⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⁻¹⋅T³⋅I²⋅N⁻¹`) = `M⁻¹⋅T³⋅I²⋅N⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `M⁻¹⋅T³⋅I²⋅N⁻¹`) = if (this < that) this else that
    override infix fun max(that: `M⁻¹⋅T³⋅I²⋅N⁻¹`) = if (this > that) this else that

    override val abs get() = `M⁻¹⋅T³⋅I²⋅N⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⁻¹⋅T³⋅I²⋅N⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⁻¹⋅T³⋅I²⋅N⁻¹` && this.siValue == other.siValue
}


typealias `MolarConductivity` = `M⁻¹⋅T³⋅I²⋅N⁻¹`




typealias `L⁻³⋅M⁻¹⋅T⁴⋅I²` = A0T4I2Theta0N0J0C0_per_L3M1
inline class A0T4I2Theta0N0J0C0_per_L3M1(internal val underlying: Double) : Quan<`L⁻³⋅M⁻¹⋅T⁴⋅I²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻³⋅kg⁻¹⋅s⁴⋅A²"

    override fun new(siValue: Double) = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(siValue)

    override operator fun unaryPlus() = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(+underlying)
    override operator fun unaryMinus() = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(-underlying)

    override operator fun plus(that: `L⁻³⋅M⁻¹⋅T⁴⋅I²`) = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻³⋅M⁻¹⋅T⁴⋅I²`) = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻³⋅M⁻¹⋅T⁴⋅I²`) = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻³⋅M⁻¹⋅T⁴⋅I²`) = if (this < that) this else that
    override infix fun max(that: `L⁻³⋅M⁻¹⋅T⁴⋅I²`) = if (this > that) this else that

    override val abs get() = `L⁻³⋅M⁻¹⋅T⁴⋅I²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻³⋅M⁻¹⋅T⁴⋅I²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻³⋅M⁻¹⋅T⁴⋅I²` && this.siValue == other.siValue
}


typealias `Permittivity` = `L⁻³⋅M⁻¹⋅T⁴⋅I²`




typealias `L⋅M⋅T⁻²⋅I⁻²` = L1A0M1Theta0N0J0C0_per_T2I2
inline class L1A0M1Theta0N0J0C0_per_T2I2(internal val underlying: Double) : Quan<`L⋅M⋅T⁻²⋅I⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅kg⋅s⁻²⋅A⁻²"

    override fun new(siValue: Double) = `L⋅M⋅T⁻²⋅I⁻²`(siValue)

    override operator fun unaryPlus() = `L⋅M⋅T⁻²⋅I⁻²`(+underlying)
    override operator fun unaryMinus() = `L⋅M⋅T⁻²⋅I⁻²`(-underlying)

    override operator fun plus(that: `L⋅M⋅T⁻²⋅I⁻²`) = `L⋅M⋅T⁻²⋅I⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅M⋅T⁻²⋅I⁻²`) = `L⋅M⋅T⁻²⋅I⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅M⋅T⁻²⋅I⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅M⋅T⁻²⋅I⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅M⋅T⁻²⋅I⁻²`) = `L⋅M⋅T⁻²⋅I⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅M⋅T⁻²⋅I⁻²`) = if (this < that) this else that
    override infix fun max(that: `L⋅M⋅T⁻²⋅I⁻²`) = if (this > that) this else that

    override val abs get() = `L⋅M⋅T⁻²⋅I⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅M⋅T⁻²⋅I⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅M⋅T⁻²⋅I⁻²` && this.siValue == other.siValue
}


typealias `MagneticPermeability` = `L⋅M⋅T⁻²⋅I⁻²`




typealias `L⋅M⋅T⁻³⋅I⁻¹` = L1A0M1Theta0N0J0C0_per_T3I1
inline class L1A0M1Theta0N0J0C0_per_T3I1(internal val underlying: Double) : Quan<`L⋅M⋅T⁻³⋅I⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅kg⋅s⁻³⋅A⁻¹"

    override fun new(siValue: Double) = `L⋅M⋅T⁻³⋅I⁻¹`(siValue)

    override operator fun unaryPlus() = `L⋅M⋅T⁻³⋅I⁻¹`(+underlying)
    override operator fun unaryMinus() = `L⋅M⋅T⁻³⋅I⁻¹`(-underlying)

    override operator fun plus(that: `L⋅M⋅T⁻³⋅I⁻¹`) = `L⋅M⋅T⁻³⋅I⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅M⋅T⁻³⋅I⁻¹`) = `L⋅M⋅T⁻³⋅I⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅M⋅T⁻³⋅I⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅M⋅T⁻³⋅I⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅M⋅T⁻³⋅I⁻¹`) = `L⋅M⋅T⁻³⋅I⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅M⋅T⁻³⋅I⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L⋅M⋅T⁻³⋅I⁻¹`) = if (this > that) this else that

    override val abs get() = `L⋅M⋅T⁻³⋅I⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅M⋅T⁻³⋅I⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅M⋅T⁻³⋅I⁻¹` && this.siValue == other.siValue
}


typealias `ElectricFieldStrength` = `L⋅M⋅T⁻³⋅I⁻¹`




typealias `L⁻¹⋅I` = A0M0T0I1Theta0N0J0C0_per_L1
inline class A0M0T0I1Theta0N0J0C0_per_L1(internal val underlying: Double) : Quan<`L⁻¹⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅A"

    override fun new(siValue: Double) = `L⁻¹⋅I`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅I`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅I`(-underlying)

    override operator fun plus(that: `L⁻¹⋅I`) = `L⁻¹⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅I`) = `L⁻¹⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅I`) = `L⁻¹⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅I`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅I`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅I` && this.siValue == other.siValue
}


typealias `Magnetization` = `L⁻¹⋅I`




typealias `T⋅J` = L0A0M0T1I0Theta0N0J1C0
inline class L0A0M0T1I0Theta0N0J1C0(internal val underlying: Double) : Quan<`T⋅J`> {
    override val siValue get() = underlying
    override val abrev get() = "s⋅cd"

    override fun new(siValue: Double) = `T⋅J`(siValue)

    override operator fun unaryPlus() = `T⋅J`(+underlying)
    override operator fun unaryMinus() = `T⋅J`(-underlying)

    override operator fun plus(that: `T⋅J`) = `T⋅J`(this.underlying + that.underlying)
    override operator fun minus(that: `T⋅J`) = `T⋅J`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `T⋅J`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `T⋅J`(this.underlying / that.toDouble())
    override operator fun rem(that: `T⋅J`) = `T⋅J`(this.underlying % that.underlying)

    override infix fun min(that: `T⋅J`) = if (this < that) this else that
    override infix fun max(that: `T⋅J`) = if (this > that) this else that

    override val abs get() = `T⋅J`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `T⋅J`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `T⋅J` && this.siValue == other.siValue
}


typealias `LuminousEnergy` = `T⋅J`




typealias `L⁻²⋅T⋅J` = A0M0T1I0Theta0N0J1C0_per_L2
inline class A0M0T1I0Theta0N0J1C0_per_L2(internal val underlying: Double) : Quan<`L⁻²⋅T⋅J`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅s⋅cd"

    override fun new(siValue: Double) = `L⁻²⋅T⋅J`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅T⋅J`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅T⋅J`(-underlying)

    override operator fun plus(that: `L⁻²⋅T⋅J`) = `L⁻²⋅T⋅J`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅T⋅J`) = `L⁻²⋅T⋅J`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅T⋅J`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅T⋅J`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅T⋅J`) = `L⁻²⋅T⋅J`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅T⋅J`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅T⋅J`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅T⋅J`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅T⋅J`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅T⋅J` && this.siValue == other.siValue
}


typealias `LuminousExposure` = `L⁻²⋅T⋅J`




typealias `M⁻¹⋅T⋅I` = L0A0T1I1Theta0N0J0C0_per_M1
inline class L0A0T1I1Theta0N0J0C0_per_M1(internal val underlying: Double) : Quan<`M⁻¹⋅T⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⁻¹⋅s⋅A"

    override fun new(siValue: Double) = `M⁻¹⋅T⋅I`(siValue)

    override operator fun unaryPlus() = `M⁻¹⋅T⋅I`(+underlying)
    override operator fun unaryMinus() = `M⁻¹⋅T⋅I`(-underlying)

    override operator fun plus(that: `M⁻¹⋅T⋅I`) = `M⁻¹⋅T⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `M⁻¹⋅T⋅I`) = `M⁻¹⋅T⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⁻¹⋅T⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⁻¹⋅T⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⁻¹⋅T⋅I`) = `M⁻¹⋅T⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `M⁻¹⋅T⋅I`) = if (this < that) this else that
    override infix fun max(that: `M⁻¹⋅T⋅I`) = if (this > that) this else that

    override val abs get() = `M⁻¹⋅T⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⁻¹⋅T⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⁻¹⋅T⋅I` && this.siValue == other.siValue
}


typealias `Exposure` = `M⁻¹⋅T⋅I`




typealias `L³⋅M⋅T⁻³⋅I⁻²` = L3A0M1Theta0N0J0C0_per_T3I2
inline class L3A0M1Theta0N0J0C0_per_T3I2(internal val underlying: Double) : Quan<`L³⋅M⋅T⁻³⋅I⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "m³⋅kg⋅s⁻³⋅A⁻²"

    override fun new(siValue: Double) = `L³⋅M⋅T⁻³⋅I⁻²`(siValue)

    override operator fun unaryPlus() = `L³⋅M⋅T⁻³⋅I⁻²`(+underlying)
    override operator fun unaryMinus() = `L³⋅M⋅T⁻³⋅I⁻²`(-underlying)

    override operator fun plus(that: `L³⋅M⋅T⁻³⋅I⁻²`) = `L³⋅M⋅T⁻³⋅I⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `L³⋅M⋅T⁻³⋅I⁻²`) = `L³⋅M⋅T⁻³⋅I⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³⋅M⋅T⁻³⋅I⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³⋅M⋅T⁻³⋅I⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³⋅M⋅T⁻³⋅I⁻²`) = `L³⋅M⋅T⁻³⋅I⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `L³⋅M⋅T⁻³⋅I⁻²`) = if (this < that) this else that
    override infix fun max(that: `L³⋅M⋅T⁻³⋅I⁻²`) = if (this > that) this else that

    override val abs get() = `L³⋅M⋅T⁻³⋅I⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³⋅M⋅T⁻³⋅I⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³⋅M⋅T⁻³⋅I⁻²` && this.siValue == other.siValue
}


typealias `Resistivity` = `L³⋅M⋅T⁻³⋅I⁻²`




typealias `L⁻¹⋅M` = A0M1T0I0Theta0N0J0C0_per_L1
inline class A0M1T0I0Theta0N0J0C0_per_L1(internal val underlying: Double) : Quan<`L⁻¹⋅M`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅kg"

    override fun new(siValue: Double) = `L⁻¹⋅M`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅M`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅M`(-underlying)

    override operator fun plus(that: `L⁻¹⋅M`) = `L⁻¹⋅M`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅M`) = `L⁻¹⋅M`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅M`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅M`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅M`) = `L⁻¹⋅M`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅M`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅M`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅M`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅M`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅M` && this.siValue == other.siValue
}


typealias `LinearMassDensity` = `L⁻¹⋅M`




typealias `L⁻¹⋅T⋅I` = A0M0T1I1Theta0N0J0C0_per_L1
inline class A0M0T1I1Theta0N0J0C0_per_L1(internal val underlying: Double) : Quan<`L⁻¹⋅T⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅s⋅A"

    override fun new(siValue: Double) = `L⁻¹⋅T⋅I`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅T⋅I`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅T⋅I`(-underlying)

    override operator fun plus(that: `L⁻¹⋅T⋅I`) = `L⁻¹⋅T⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅T⋅I`) = `L⁻¹⋅T⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅T⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅T⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅T⋅I`) = `L⁻¹⋅T⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅T⋅I`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅T⋅I`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅T⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅T⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅T⋅I` && this.siValue == other.siValue
}


typealias `LinearChargeDensity` = `L⁻¹⋅T⋅I`




typealias `M⁻¹⋅N` = L0A0T0I0Theta0N1J0C0_per_M1
inline class L0A0T0I0Theta0N1J0C0_per_M1(internal val underlying: Double) : Quan<`M⁻¹⋅N`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⁻¹⋅mol"

    override fun new(siValue: Double) = `M⁻¹⋅N`(siValue)

    override operator fun unaryPlus() = `M⁻¹⋅N`(+underlying)
    override operator fun unaryMinus() = `M⁻¹⋅N`(-underlying)

    override operator fun plus(that: `M⁻¹⋅N`) = `M⁻¹⋅N`(this.underlying + that.underlying)
    override operator fun minus(that: `M⁻¹⋅N`) = `M⁻¹⋅N`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⁻¹⋅N`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⁻¹⋅N`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⁻¹⋅N`) = `M⁻¹⋅N`(this.underlying % that.underlying)

    override infix fun min(that: `M⁻¹⋅N`) = if (this < that) this else that
    override infix fun max(that: `M⁻¹⋅N`) = if (this > that) this else that

    override val abs get() = `M⁻¹⋅N`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⁻¹⋅N`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⁻¹⋅N` && this.siValue == other.siValue
}


typealias `Molality` = `M⁻¹⋅N`




typealias `M⋅N⁻¹` = L0A0M1T0I0Theta0J0C0_per_N1
inline class L0A0M1T0I0Theta0J0C0_per_N1(internal val underlying: Double) : Quan<`M⋅N⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⋅mol⁻¹"

    override fun new(siValue: Double) = `M⋅N⁻¹`(siValue)

    override operator fun unaryPlus() = `M⋅N⁻¹`(+underlying)
    override operator fun unaryMinus() = `M⋅N⁻¹`(-underlying)

    override operator fun plus(that: `M⋅N⁻¹`) = `M⋅N⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `M⋅N⁻¹`) = `M⋅N⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⋅N⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⋅N⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⋅N⁻¹`) = `M⋅N⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `M⋅N⁻¹`) = if (this < that) this else that
    override infix fun max(that: `M⋅N⁻¹`) = if (this > that) this else that

    override val abs get() = `M⋅N⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⋅N⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⋅N⁻¹` && this.siValue == other.siValue
}


typealias `MolarMass` = `M⋅N⁻¹`




typealias `M⋅T⁻¹` = L0A0M1I0Theta0N0J0C0_per_T1
inline class L0A0M1I0Theta0N0J0C0_per_T1(internal val underlying: Double) : Quan<`M⋅T⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⋅s⁻¹"

    override fun new(siValue: Double) = `M⋅T⁻¹`(siValue)

    override operator fun unaryPlus() = `M⋅T⁻¹`(+underlying)
    override operator fun unaryMinus() = `M⋅T⁻¹`(-underlying)

    override operator fun plus(that: `M⋅T⁻¹`) = `M⋅T⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `M⋅T⁻¹`) = `M⋅T⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⋅T⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⋅T⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⋅T⁻¹`) = `M⋅T⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `M⋅T⁻¹`) = if (this < that) this else that
    override infix fun max(that: `M⋅T⁻¹`) = if (this > that) this else that

    override val abs get() = `M⋅T⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⋅T⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⋅T⁻¹` && this.siValue == other.siValue
}


typealias `MassFlowRate` = `M⋅T⁻¹`




typealias `L²⋅I` = L2A0M0T0I1Theta0N0J0C0
inline class L2A0M0T0I1Theta0N0J0C0(internal val underlying: Double) : Quan<`L²⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅A"

    override fun new(siValue: Double) = `L²⋅I`(siValue)

    override operator fun unaryPlus() = `L²⋅I`(+underlying)
    override operator fun unaryMinus() = `L²⋅I`(-underlying)

    override operator fun plus(that: `L²⋅I`) = `L²⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅I`) = `L²⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅I`) = `L²⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅I`) = if (this < that) this else that
    override infix fun max(that: `L²⋅I`) = if (this > that) this else that

    override val abs get() = `L²⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅I` && this.siValue == other.siValue
}


typealias `MagneticDipoleMoment` = `L²⋅I`




typealias `L⁻¹⋅M⋅T⁻³` = A0M1I0Theta0N0J0C0_per_L1T3
inline class A0M1I0Theta0N0J0C0_per_L1T3(internal val underlying: Double) : Quan<`L⁻¹⋅M⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅kg⋅s⁻³"

    override fun new(siValue: Double) = `L⁻¹⋅M⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅M⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅M⋅T⁻³`(-underlying)

    override operator fun plus(that: `L⁻¹⋅M⋅T⁻³`) = `L⁻¹⋅M⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅M⋅T⁻³`) = `L⁻¹⋅M⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅M⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅M⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅M⋅T⁻³`) = `L⁻¹⋅M⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅M⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅M⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅M⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅M⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅M⋅T⁻³` && this.siValue == other.siValue
}


typealias `SpectralIrradiance` = `L⁻¹⋅M⋅T⁻³`

typealias `PowerDensity` = `L⁻¹⋅M⋅T⁻³`




typealias `L⁻²⋅M⁻¹⋅T³⋅Θ` = A0T3I0Theta1N0J0C0_per_L2M1
inline class A0T3I0Theta1N0J0C0_per_L2M1(internal val underlying: Double) : Quan<`L⁻²⋅M⁻¹⋅T³⋅Θ`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅kg⁻¹⋅s³⋅K"

    override fun new(siValue: Double) = `L⁻²⋅M⁻¹⋅T³⋅Θ`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅M⁻¹⋅T³⋅Θ`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅M⁻¹⋅T³⋅Θ`(-underlying)

    override operator fun plus(that: `L⁻²⋅M⁻¹⋅T³⋅Θ`) = `L⁻²⋅M⁻¹⋅T³⋅Θ`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅M⁻¹⋅T³⋅Θ`) = `L⁻²⋅M⁻¹⋅T³⋅Θ`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅M⁻¹⋅T³⋅Θ`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅M⁻¹⋅T³⋅Θ`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅M⁻¹⋅T³⋅Θ`) = `L⁻²⋅M⁻¹⋅T³⋅Θ`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅M⁻¹⋅T³⋅Θ`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅M⁻¹⋅T³⋅Θ`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅M⁻¹⋅T³⋅Θ`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅M⁻¹⋅T³⋅Θ`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅M⁻¹⋅T³⋅Θ` && this.siValue == other.siValue
}


typealias `ThermalResistance` = `L⁻²⋅M⁻¹⋅T³⋅Θ`




typealias `Θ⁻¹` = L0A0M0T0I0N0J0C0_per_Theta1
inline class L0A0M0T0I0N0J0C0_per_Theta1(internal val underlying: Double) : Quan<`Θ⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "K⁻¹"

    override fun new(siValue: Double) = `Θ⁻¹`(siValue)

    override operator fun unaryPlus() = `Θ⁻¹`(+underlying)
    override operator fun unaryMinus() = `Θ⁻¹`(-underlying)

    override operator fun plus(that: `Θ⁻¹`) = `Θ⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `Θ⁻¹`) = `Θ⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `Θ⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `Θ⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `Θ⁻¹`) = `Θ⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `Θ⁻¹`) = if (this < that) this else that
    override infix fun max(that: `Θ⁻¹`) = if (this > that) this else that

    override val abs get() = `Θ⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `Θ⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `Θ⁻¹` && this.siValue == other.siValue
}


typealias `ThermalExpansionCoefficient` = `Θ⁻¹`




typealias `L⁻¹⋅Θ` = A0M0T0I0Theta1N0J0C0_per_L1
inline class A0M0T0I0Theta1N0J0C0_per_L1(internal val underlying: Double) : Quan<`L⁻¹⋅Θ`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅K"

    override fun new(siValue: Double) = `L⁻¹⋅Θ`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅Θ`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅Θ`(-underlying)

    override operator fun plus(that: `L⁻¹⋅Θ`) = `L⁻¹⋅Θ`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅Θ`) = `L⁻¹⋅Θ`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅Θ`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅Θ`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅Θ`) = `L⁻¹⋅Θ`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅Θ`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅Θ`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅Θ`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅Θ`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅Θ` && this.siValue == other.siValue
}


typealias `TemperatureGradient` = `L⁻¹⋅Θ`




typealias `M⁻¹⋅T²⋅I` = L0A0T2I1Theta0N0J0C0_per_M1
inline class L0A0T2I1Theta0N0J0C0_per_M1(internal val underlying: Double) : Quan<`M⁻¹⋅T²⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "kg⁻¹⋅s²⋅A"

    override fun new(siValue: Double) = `M⁻¹⋅T²⋅I`(siValue)

    override operator fun unaryPlus() = `M⁻¹⋅T²⋅I`(+underlying)
    override operator fun unaryMinus() = `M⁻¹⋅T²⋅I`(-underlying)

    override operator fun plus(that: `M⁻¹⋅T²⋅I`) = `M⁻¹⋅T²⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `M⁻¹⋅T²⋅I`) = `M⁻¹⋅T²⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `M⁻¹⋅T²⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `M⁻¹⋅T²⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `M⁻¹⋅T²⋅I`) = `M⁻¹⋅T²⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `M⁻¹⋅T²⋅I`) = if (this < that) this else that
    override infix fun max(that: `M⁻¹⋅T²⋅I`) = if (this > that) this else that

    override val abs get() = `M⁻¹⋅T²⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `M⁻¹⋅T²⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `M⁻¹⋅T²⋅I` && this.siValue == other.siValue
}


typealias `ElectronMobility` = `M⁻¹⋅T²⋅I`




typealias `L⋅M⁻¹⋅T²` = L1A0T2I0Theta0N0J0C0_per_M1
inline class L1A0T2I0Theta0N0J0C0_per_M1(internal val underlying: Double) : Quan<`L⋅M⁻¹⋅T²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅kg⁻¹⋅s²"

    override fun new(siValue: Double) = `L⋅M⁻¹⋅T²`(siValue)

    override operator fun unaryPlus() = `L⋅M⁻¹⋅T²`(+underlying)
    override operator fun unaryMinus() = `L⋅M⁻¹⋅T²`(-underlying)

    override operator fun plus(that: `L⋅M⁻¹⋅T²`) = `L⋅M⁻¹⋅T²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅M⁻¹⋅T²`) = `L⋅M⁻¹⋅T²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅M⁻¹⋅T²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅M⁻¹⋅T²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅M⁻¹⋅T²`) = `L⋅M⁻¹⋅T²`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅M⁻¹⋅T²`) = if (this < that) this else that
    override infix fun max(that: `L⋅M⁻¹⋅T²`) = if (this > that) this else that

    override val abs get() = `L⋅M⁻¹⋅T²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅M⁻¹⋅T²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅M⁻¹⋅T²` && this.siValue == other.siValue
}


typealias `Compressibility` = `L⋅M⁻¹⋅T²`




typealias `L⁻²⋅M⁻¹⋅T²⋅I²` = A0T2I2Theta0N0J0C0_per_L2M1
inline class A0T2I2Theta0N0J0C0_per_L2M1(internal val underlying: Double) : Quan<`L⁻²⋅M⁻¹⋅T²⋅I²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅kg⁻¹⋅s²⋅A²"

    override fun new(siValue: Double) = `L⁻²⋅M⁻¹⋅T²⋅I²`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅M⁻¹⋅T²⋅I²`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅M⁻¹⋅T²⋅I²`(-underlying)

    override operator fun plus(that: `L⁻²⋅M⁻¹⋅T²⋅I²`) = `L⁻²⋅M⁻¹⋅T²⋅I²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅M⁻¹⋅T²⋅I²`) = `L⁻²⋅M⁻¹⋅T²⋅I²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅M⁻¹⋅T²⋅I²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅M⁻¹⋅T²⋅I²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅M⁻¹⋅T²⋅I²`) = `L⁻²⋅M⁻¹⋅T²⋅I²`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅M⁻¹⋅T²⋅I²`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅M⁻¹⋅T²⋅I²`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅M⁻¹⋅T²⋅I²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅M⁻¹⋅T²⋅I²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅M⁻¹⋅T²⋅I²` && this.siValue == other.siValue
}


typealias `MagneticReluctance` = `L⁻²⋅M⁻¹⋅T²⋅I²`




typealias `L⋅M⋅T⁻²⋅I⁻¹` = L1A0M1Theta0N0J0C0_per_T2I1
inline class L1A0M1Theta0N0J0C0_per_T2I1(internal val underlying: Double) : Quan<`L⋅M⋅T⁻²⋅I⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅kg⋅s⁻²⋅A⁻¹"

    override fun new(siValue: Double) = `L⋅M⋅T⁻²⋅I⁻¹`(siValue)

    override operator fun unaryPlus() = `L⋅M⋅T⁻²⋅I⁻¹`(+underlying)
    override operator fun unaryMinus() = `L⋅M⋅T⁻²⋅I⁻¹`(-underlying)

    override operator fun plus(that: `L⋅M⋅T⁻²⋅I⁻¹`) = `L⋅M⋅T⁻²⋅I⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅M⋅T⁻²⋅I⁻¹`) = `L⋅M⋅T⁻²⋅I⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅M⋅T⁻²⋅I⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅M⋅T⁻²⋅I⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅M⋅T⁻²⋅I⁻¹`) = `L⋅M⋅T⁻²⋅I⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅M⋅T⁻²⋅I⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L⋅M⋅T⁻²⋅I⁻¹`) = if (this > that) this else that

    override val abs get() = `L⋅M⋅T⁻²⋅I⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅M⋅T⁻²⋅I⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅M⋅T⁻²⋅I⁻¹` && this.siValue == other.siValue
}


typealias `MagneticVectorPotential` = `L⋅M⋅T⁻²⋅I⁻¹`

typealias `MagneticRigidity` = `L⋅M⋅T⁻²⋅I⁻¹`




typealias `L³⋅M⋅T⁻²⋅I⁻¹` = L3A0M1Theta0N0J0C0_per_T2I1
inline class L3A0M1Theta0N0J0C0_per_T2I1(internal val underlying: Double) : Quan<`L³⋅M⋅T⁻²⋅I⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m³⋅kg⋅s⁻²⋅A⁻¹"

    override fun new(siValue: Double) = `L³⋅M⋅T⁻²⋅I⁻¹`(siValue)

    override operator fun unaryPlus() = `L³⋅M⋅T⁻²⋅I⁻¹`(+underlying)
    override operator fun unaryMinus() = `L³⋅M⋅T⁻²⋅I⁻¹`(-underlying)

    override operator fun plus(that: `L³⋅M⋅T⁻²⋅I⁻¹`) = `L³⋅M⋅T⁻²⋅I⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L³⋅M⋅T⁻²⋅I⁻¹`) = `L³⋅M⋅T⁻²⋅I⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³⋅M⋅T⁻²⋅I⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³⋅M⋅T⁻²⋅I⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³⋅M⋅T⁻²⋅I⁻¹`) = `L³⋅M⋅T⁻²⋅I⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L³⋅M⋅T⁻²⋅I⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L³⋅M⋅T⁻²⋅I⁻¹`) = if (this > that) this else that

    override val abs get() = `L³⋅M⋅T⁻²⋅I⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³⋅M⋅T⁻²⋅I⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³⋅M⋅T⁻²⋅I⁻¹` && this.siValue == other.siValue
}


typealias `MagneticMoment` = `L³⋅M⋅T⁻²⋅I⁻¹`




typealias `L³⋅T⁻¹⋅N⁻¹` = L3A0M0I0Theta0J0C0_per_T1N1
inline class L3A0M0I0Theta0J0C0_per_T1N1(internal val underlying: Double) : Quan<`L³⋅T⁻¹⋅N⁻¹`> {
    override val siValue get() = underlying
    override val abrev get() = "m³⋅s⁻¹⋅mol⁻¹"

    override fun new(siValue: Double) = `L³⋅T⁻¹⋅N⁻¹`(siValue)

    override operator fun unaryPlus() = `L³⋅T⁻¹⋅N⁻¹`(+underlying)
    override operator fun unaryMinus() = `L³⋅T⁻¹⋅N⁻¹`(-underlying)

    override operator fun plus(that: `L³⋅T⁻¹⋅N⁻¹`) = `L³⋅T⁻¹⋅N⁻¹`(this.underlying + that.underlying)
    override operator fun minus(that: `L³⋅T⁻¹⋅N⁻¹`) = `L³⋅T⁻¹⋅N⁻¹`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L³⋅T⁻¹⋅N⁻¹`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L³⋅T⁻¹⋅N⁻¹`(this.underlying / that.toDouble())
    override operator fun rem(that: `L³⋅T⁻¹⋅N⁻¹`) = `L³⋅T⁻¹⋅N⁻¹`(this.underlying % that.underlying)

    override infix fun min(that: `L³⋅T⁻¹⋅N⁻¹`) = if (this < that) this else that
    override infix fun max(that: `L³⋅T⁻¹⋅N⁻¹`) = if (this > that) this else that

    override val abs get() = `L³⋅T⁻¹⋅N⁻¹`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L³⋅T⁻¹⋅N⁻¹`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L³⋅T⁻¹⋅N⁻¹` && this.siValue == other.siValue
}


typealias `CatalyticEfficiency` = `L³⋅T⁻¹⋅N⁻¹`




typealias `L²⋅M` = L2A0M1T0I0Theta0N0J0C0
inline class L2A0M1T0I0Theta0N0J0C0(internal val underlying: Double) : Quan<`L²⋅M`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅kg"

    override fun new(siValue: Double) = `L²⋅M`(siValue)

    override operator fun unaryPlus() = `L²⋅M`(+underlying)
    override operator fun unaryMinus() = `L²⋅M`(-underlying)

    override operator fun plus(that: `L²⋅M`) = `L²⋅M`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅M`) = `L²⋅M`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅M`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅M`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅M`) = `L²⋅M`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅M`) = if (this < that) this else that
    override infix fun max(that: `L²⋅M`) = if (this > that) this else that

    override val abs get() = `L²⋅M`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅M`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅M` && this.siValue == other.siValue
}


typealias `MomentOfInertia` = `L²⋅M`




typealias `T⁻²` = L0A0M0I0Theta0N0J0C0_per_T2
inline class L0A0M0I0Theta0N0J0C0_per_T2(internal val underlying: Double) : Quan<`T⁻²`> {
    override val siValue get() = underlying
    override val abrev get() = "s⁻²"

    override fun new(siValue: Double) = `T⁻²`(siValue)

    override operator fun unaryPlus() = `T⁻²`(+underlying)
    override operator fun unaryMinus() = `T⁻²`(-underlying)

    override operator fun plus(that: `T⁻²`) = `T⁻²`(this.underlying + that.underlying)
    override operator fun minus(that: `T⁻²`) = `T⁻²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `T⁻²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `T⁻²`(this.underlying / that.toDouble())
    override operator fun rem(that: `T⁻²`) = `T⁻²`(this.underlying % that.underlying)

    override infix fun min(that: `T⁻²`) = if (this < that) this else that
    override infix fun max(that: `T⁻²`) = if (this > that) this else that

    override val abs get() = `T⁻²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `T⁻²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `T⁻²` && this.siValue == other.siValue
}


typealias `FrequencyDrift` = `T⁻²`




typealias `L⁻²⋅M⁻¹⋅T³⋅J` = A0T3I0Theta0N0J1C0_per_L2M1
inline class A0T3I0Theta0N0J1C0_per_L2M1(internal val underlying: Double) : Quan<`L⁻²⋅M⁻¹⋅T³⋅J`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻²⋅kg⁻¹⋅s³⋅cd"

    override fun new(siValue: Double) = `L⁻²⋅M⁻¹⋅T³⋅J`(siValue)

    override operator fun unaryPlus() = `L⁻²⋅M⁻¹⋅T³⋅J`(+underlying)
    override operator fun unaryMinus() = `L⁻²⋅M⁻¹⋅T³⋅J`(-underlying)

    override operator fun plus(that: `L⁻²⋅M⁻¹⋅T³⋅J`) = `L⁻²⋅M⁻¹⋅T³⋅J`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻²⋅M⁻¹⋅T³⋅J`) = `L⁻²⋅M⁻¹⋅T³⋅J`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻²⋅M⁻¹⋅T³⋅J`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻²⋅M⁻¹⋅T³⋅J`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻²⋅M⁻¹⋅T³⋅J`) = `L⁻²⋅M⁻¹⋅T³⋅J`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻²⋅M⁻¹⋅T³⋅J`) = if (this < that) this else that
    override infix fun max(that: `L⁻²⋅M⁻¹⋅T³⋅J`) = if (this > that) this else that

    override val abs get() = `L⁻²⋅M⁻¹⋅T³⋅J`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻²⋅M⁻¹⋅T³⋅J`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻²⋅M⁻¹⋅T³⋅J` && this.siValue == other.siValue
}


typealias `LuminousEfficacy` = `L⁻²⋅M⁻¹⋅T³⋅J`




typealias `∠⋅I` = L0A1M0T0I1Theta0N0J0C0
inline class L0A1M0T0I1Theta0N0J0C0(internal val underlying: Double) : Quan<`∠⋅I`> {
    override val siValue get() = underlying
    override val abrev get() = "rad⋅A"

    override fun new(siValue: Double) = `∠⋅I`(siValue)

    override operator fun unaryPlus() = `∠⋅I`(+underlying)
    override operator fun unaryMinus() = `∠⋅I`(-underlying)

    override operator fun plus(that: `∠⋅I`) = `∠⋅I`(this.underlying + that.underlying)
    override operator fun minus(that: `∠⋅I`) = `∠⋅I`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `∠⋅I`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `∠⋅I`(this.underlying / that.toDouble())
    override operator fun rem(that: `∠⋅I`) = `∠⋅I`(this.underlying % that.underlying)

    override infix fun min(that: `∠⋅I`) = if (this < that) this else that
    override infix fun max(that: `∠⋅I`) = if (this > that) this else that

    override val abs get() = `∠⋅I`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `∠⋅I`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `∠⋅I` && this.siValue == other.siValue
}


typealias `MagnetomotiveForce` = `∠⋅I`




typealias `L⁻¹⋅M⁻¹⋅T²⋅I²` = A0T2I2Theta0N0J0C0_per_L1M1
inline class A0T2I2Theta0N0J0C0_per_L1M1(internal val underlying: Double) : Quan<`L⁻¹⋅M⁻¹⋅T²⋅I²`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅kg⁻¹⋅s²⋅A²"

    override fun new(siValue: Double) = `L⁻¹⋅M⁻¹⋅T²⋅I²`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅M⁻¹⋅T²⋅I²`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅M⁻¹⋅T²⋅I²`(-underlying)

    override operator fun plus(that: `L⁻¹⋅M⁻¹⋅T²⋅I²`) = `L⁻¹⋅M⁻¹⋅T²⋅I²`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅M⁻¹⋅T²⋅I²`) = `L⁻¹⋅M⁻¹⋅T²⋅I²`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅M⁻¹⋅T²⋅I²`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅M⁻¹⋅T²⋅I²`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅M⁻¹⋅T²⋅I²`) = `L⁻¹⋅M⁻¹⋅T²⋅I²`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅M⁻¹⋅T²⋅I²`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅M⁻¹⋅T²⋅I²`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅M⁻¹⋅T²⋅I²`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅M⁻¹⋅T²⋅I²`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅M⁻¹⋅T²⋅I²` && this.siValue == other.siValue
}


typealias `MagneticSusceptibility` = `L⁻¹⋅M⁻¹⋅T²⋅I²`




typealias `L²⋅∠⁻²⋅M⋅T⁻³` = L2M1I0Theta0N0J0C0_per_A2T3
inline class L2M1I0Theta0N0J0C0_per_A2T3(internal val underlying: Double) : Quan<`L²⋅∠⁻²⋅M⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "m²⋅rad⁻²⋅kg⋅s⁻³"

    override fun new(siValue: Double) = `L²⋅∠⁻²⋅M⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `L²⋅∠⁻²⋅M⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `L²⋅∠⁻²⋅M⋅T⁻³`(-underlying)

    override operator fun plus(that: `L²⋅∠⁻²⋅M⋅T⁻³`) = `L²⋅∠⁻²⋅M⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `L²⋅∠⁻²⋅M⋅T⁻³`) = `L²⋅∠⁻²⋅M⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L²⋅∠⁻²⋅M⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L²⋅∠⁻²⋅M⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L²⋅∠⁻²⋅M⋅T⁻³`) = `L²⋅∠⁻²⋅M⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `L²⋅∠⁻²⋅M⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `L²⋅∠⁻²⋅M⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `L²⋅∠⁻²⋅M⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L²⋅∠⁻²⋅M⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L²⋅∠⁻²⋅M⋅T⁻³` && this.siValue == other.siValue
}


typealias `RadiantIntensity` = `L²⋅∠⁻²⋅M⋅T⁻³`




typealias `L⋅∠⁻²⋅M⋅T⁻³` = L1M1I0Theta0N0J0C0_per_A2T3
inline class L1M1I0Theta0N0J0C0_per_A2T3(internal val underlying: Double) : Quan<`L⋅∠⁻²⋅M⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "m⋅rad⁻²⋅kg⋅s⁻³"

    override fun new(siValue: Double) = `L⋅∠⁻²⋅M⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `L⋅∠⁻²⋅M⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `L⋅∠⁻²⋅M⋅T⁻³`(-underlying)

    override operator fun plus(that: `L⋅∠⁻²⋅M⋅T⁻³`) = `L⋅∠⁻²⋅M⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `L⋅∠⁻²⋅M⋅T⁻³`) = `L⋅∠⁻²⋅M⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⋅∠⁻²⋅M⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⋅∠⁻²⋅M⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⋅∠⁻²⋅M⋅T⁻³`) = `L⋅∠⁻²⋅M⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `L⋅∠⁻²⋅M⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `L⋅∠⁻²⋅M⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `L⋅∠⁻²⋅M⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⋅∠⁻²⋅M⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⋅∠⁻²⋅M⋅T⁻³` && this.siValue == other.siValue
}


typealias `SpectralIntensity` = `L⋅∠⁻²⋅M⋅T⁻³`




typealias `∠⁻²⋅M⋅T⁻³` = L0M1I0Theta0N0J0C0_per_A2T3
inline class L0M1I0Theta0N0J0C0_per_A2T3(internal val underlying: Double) : Quan<`∠⁻²⋅M⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "rad⁻²⋅kg⋅s⁻³"

    override fun new(siValue: Double) = `∠⁻²⋅M⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `∠⁻²⋅M⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `∠⁻²⋅M⋅T⁻³`(-underlying)

    override operator fun plus(that: `∠⁻²⋅M⋅T⁻³`) = `∠⁻²⋅M⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `∠⁻²⋅M⋅T⁻³`) = `∠⁻²⋅M⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `∠⁻²⋅M⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `∠⁻²⋅M⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `∠⁻²⋅M⋅T⁻³`) = `∠⁻²⋅M⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `∠⁻²⋅M⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `∠⁻²⋅M⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `∠⁻²⋅M⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `∠⁻²⋅M⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `∠⁻²⋅M⋅T⁻³` && this.siValue == other.siValue
}


typealias `Radiance` = `∠⁻²⋅M⋅T⁻³`




typealias `L⁻¹⋅∠⁻²⋅M⋅T⁻³` = M1I0Theta0N0J0C0_per_L1A2T3
inline class M1I0Theta0N0J0C0_per_L1A2T3(internal val underlying: Double) : Quan<`L⁻¹⋅∠⁻²⋅M⋅T⁻³`> {
    override val siValue get() = underlying
    override val abrev get() = "m⁻¹⋅rad⁻²⋅kg⋅s⁻³"

    override fun new(siValue: Double) = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(siValue)

    override operator fun unaryPlus() = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(+underlying)
    override operator fun unaryMinus() = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(-underlying)

    override operator fun plus(that: `L⁻¹⋅∠⁻²⋅M⋅T⁻³`) = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(this.underlying + that.underlying)
    override operator fun minus(that: `L⁻¹⋅∠⁻²⋅M⋅T⁻³`) = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(this.underlying - that.underlying)
    override operator fun times(that: Number) = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(this.underlying * that.toDouble())
    override operator fun div(that: Number) = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(this.underlying / that.toDouble())
    override operator fun rem(that: `L⁻¹⋅∠⁻²⋅M⋅T⁻³`) = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(this.underlying % that.underlying)

    override infix fun min(that: `L⁻¹⋅∠⁻²⋅M⋅T⁻³`) = if (this < that) this else that
    override infix fun max(that: `L⁻¹⋅∠⁻²⋅M⋅T⁻³`) = if (this > that) this else that

    override val abs get() = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`(abs(underlying))
    override val signum get() = underlying.sign
    override val isNegative get() = underlying < 0
    override val isZero get() = underlying == 0.0
    override val isPositive get() = underlying > 0

    override fun compareTo(other: `L⁻¹⋅∠⁻²⋅M⋅T⁻³`) = this.underlying.compareTo(other.underlying)

    override fun toString() = "$underlying $abrev"
    // override fun equals(other: Any?) = other is `L⁻¹⋅∠⁻²⋅M⋅T⁻³` && this.siValue == other.siValue
}


typealias `SpectralRadiance` = `L⁻¹⋅∠⁻²⋅M⋅T⁻³`



