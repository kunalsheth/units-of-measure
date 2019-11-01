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

sealed class OperationProof
object times : OperationProof()
object div : OperationProof()

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
