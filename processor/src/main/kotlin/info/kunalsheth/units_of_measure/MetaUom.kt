package info.kunalsheth.units_of_measure

/**
 * Created by kunal on 8/4/17.
 */
data class MetaUom(
        val metre: Int = 0,
        val kilogram: Int = 0,
        val second: Int = 0,
        val ampere: Int = 0,
        val kelvin: Int = 0,
        val mole: Int = 0,
        val candela: Int = 0
) {
    constructor(uomData: UomData) : this(
            metre = uomData.metre,
            kilogram = uomData.kilogram,
            second = uomData.second,
            ampere = uomData.ampere,
            kelvin = uomData.kelvin,
            mole = uomData.mole,
            candela = uomData.candela
    )

    operator fun div(that: MetaUom) = MetaUom(
            metre = this.metre - that.metre,
            kilogram = this.kilogram - that.kilogram,
            second = this.second - that.second,
            ampere = this.ampere - that.ampere,
            kelvin = this.kelvin - that.kelvin,
            mole = this.mole - that.mole,
            candela = this.candela - that.candela
    )

    operator fun times(that: MetaUom) = MetaUom(
            metre = this.metre + that.metre,
            kilogram = this.kilogram + that.kilogram,
            second = this.second + that.second,
            ampere = this.ampere + that.ampere,
            kelvin = this.kelvin + that.kelvin,
            mole = this.mole + that.mole,
            candela = this.candela + that.candela
    )

    override fun toString() = safeName

    val unicodeName by lazy {
        mapOf(
                "m" to metre,
                "kg" to kilogram,
                "s" to second,
                "A" to ampere,
                "K" to kelvin,
                "mol" to mole,
                "cd" to candela
        )
                .filterValues { it != 0 }
                .mapValues { (_, power) ->
                    power.toString()
                            .map {
                                mapOf(
                                        '+' to '⁺',
                                        '-' to '⁻',
                                        '1' to '¹',
                                        '2' to '²',
                                        '3' to '³',
                                        '4' to '⁴',
                                        '5' to '⁵',
                                        '6' to '⁶',
                                        '7' to '⁷',
                                        '8' to '⁸',
                                        '9' to '⁹'
                                )[it] ?: it
                            }
                            .joinToString(separator = "")
                            .takeUnless { it == "¹" } ?: ""
                }
                .map { (base, power) -> base + power }
                .joinToString(
                        separator = "⋅",
                        prefix = "`",
                        postfix = "`"
                )
                .takeUnless { it == "``" } ?: "Dimensionless"
    }

    val safeName by lazy {
        val (numerator, denominator) = mapOf(
                "m" to metre,
                "kg" to kilogram,
                "s" to second,
                "A" to ampere,
                "K" to kelvin,
                "mol" to mole,
                "cd" to candela
        )
                .toList()
                .filter { (_, power) -> power != 0 }
                .partition { (_, power) -> power > 0 }

        val numeratorString = numerator
                .joinToString(separator = "") { (unit, power) -> unit + power }

        val denominatorString = denominator
                .map { (unit, power) -> unit to Math.abs(power) }
                .joinToString(separator = "") { (unit, power) -> unit + power }

        (numeratorString + if (denominatorString.isNotEmpty()) "_per_$denominatorString" else "")
                .takeUnless { it.isBlank() } ?: "Dimensionless"
    }
}