package info.kunalsheth.units.data

import java.io.Serializable

/**
 * Created by kunal on 8/4/17.
 */
data class Dimension(
        val L: Int = 0,
        val A: Int = 0,
        val M: Int = 0,
        val T: Int = 0,
        val I: Int = 0,
        val Theta: Int = 0,
        val N: Int = 0,
        val J: Int = 0
) : Serializable {
    val safeName by lazy {
        val (numerator, denominator) = mapOf(
                "L" to L,
                "A" to A,
                "M" to M,
                "T" to T,
                "I" to I,
                "Theta" to Theta,
                "N" to N,
                "J" to J
        )
                .toList()
                .partition { (_, power) -> power >= 0 }

        val numeratorString = numerator
                .joinToString(separator = "") { (unit, power) -> unit + power }

        val denominatorString = denominator
                .map { (unit, power) -> unit to Math.abs(power) }
                .joinToString(separator = "") { (unit, power) -> unit + power }

        (numeratorString + if (denominatorString.isNotEmpty()) "_per_$denominatorString" else "")
                .takeUnless { it.isBlank() } ?: "Dimensionless"
    }

    val fancyName by lazy {
        mapOf(
                "L" to L,
                "∠" to A,
                "M" to M,
                "T" to T,
                "I" to I,
                "Θ" to Theta,
                "N" to N,
                "J" to J
        ).factorizedString
                .takeUnless(String::isBlank)
                ?: "Dimensionless"
    }


    val abbreviation by lazy {
        mapOf(
                "m" to L,
                "rad" to A,
                "kg" to M,
                "s" to T,
                "A" to I,
                "K" to Theta,
                "mol" to N,
                "cd" to J
        ).factorizedString
    }

    private val Map<String, Int>.factorizedString
        get() = filterValues { it != 0 }
                .mapValues { (_, power) ->
                    power.toString()
                            .map {
                                when (it) {
                                    '+' -> '⁺'
                                    '-' -> '⁻'
                                    '1' -> '¹'
                                    '2' -> '²'
                                    '3' -> '³'
                                    '4' -> '⁴'
                                    '5' -> '⁵'
                                    '6' -> '⁶'
                                    '7' -> '⁷'
                                    '8' -> '⁸'
                                    '9' -> '⁹'
                                    else -> it
                                }
                            }
                            .joinToString(separator = "")
                            .takeUnless { it == "¹" } ?: ""
                }
                .map { (base, power) -> base + power }
                .joinToString(separator = "⋅")

    override fun toString() = "`$fancyName`"
}