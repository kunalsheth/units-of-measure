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
        val J: Int = 0,
        val C: Int = 0
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
                "J" to J,
                "C" to C
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
                "J" to J,
                "¤" to C // https://en.wikipedia.org/wiki/Currency_sign_(typography)
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
                "cd" to J,
                "¤" to C // https://en.wikipedia.org/wiki/Currency_sign_(typography)
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