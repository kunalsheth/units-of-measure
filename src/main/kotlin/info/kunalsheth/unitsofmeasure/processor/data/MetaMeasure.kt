package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.Measure

/**
 * Created by kunal on 8/4/17.
 */
data class MetaMeasure(
        val L: Int = 0,
        val M: Int = 0,
        val T: Int = 0,
        val I: Int = 0,
        val Theta: Int = 0,
        val N: Int = 0,
        val J: Int = 0
) {
    constructor(measure: Measure) : this(
            L = measure.L,
            M = measure.M,
            T = measure.T,
            I = measure.I,
            Theta = measure.Theta,
            N = measure.N,
            J = measure.J
    )

    val safeName = {
        val (numerator, denominator) = mapOf(
                "L" to L,
                "M" to M,
                "T" to T,
                "I" to I,
                "Theta" to Theta,
                "N" to N,
                "J" to J
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
    }()

    private val name = mapOf(
            "L" to L,
            "M" to M,
            "T" to T,
            "I" to I,
            "Θ" to Theta,
            "N" to N,
            "J" to J
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

    override fun toString() = name
}