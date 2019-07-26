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

import info.kunalsheth.units.data.RelationType.Divide
import info.kunalsheth.units.data.RelationType.Multiply
import java.io.Serializable

/**
 * Created by kunal on 8/5/17.
 */
data class Relation(val a: Dimension, val f: RelationType, val b: Dimension) : Serializable {
    val result = f(a, b)

    companion object {
        operator fun invoke(vararg d: Dimension): Set<Relation> {
            val inputDimensions = d.toSet()

            fun Set<Dimension>.allRelations() =
                    flatMap { x ->
                        flatMap { y ->
                            listOf(
                                    Relation(x, Divide, x),
                                    Relation(x, Divide, y),
                                    Relation(x, Multiply, x),
                                    Relation(x, Multiply, y),

                                    Relation(y, Divide, x),
                                    Relation(y, Divide, y),
                                    Relation(y, Multiply, x),
                                    Relation(y, Multiply, y)
                            )
                        }
                    }

            val newDimensions = inputDimensions +
                    inputDimensions.allRelations().map(Relation::result)

            return newDimensions
                    .allRelations()
                    .filter { arrayOf(it.a, it.b, it.result).all { it in newDimensions } }
                    .toSet()
        }
    }
}

enum class RelationType : (Dimension, Dimension) -> Dimension {
    Divide {
        override fun invoke(a: Dimension, b: Dimension) = Dimension(
                L = a.L - b.L,
                A = a.A - b.A,
                M = a.M - b.M,
                T = a.T - b.T,
                I = a.I - b.I,
                Theta = a.Theta - b.Theta,
                N = a.N - b.N,
                J = a.J - b.J,
                C = a.C - b.C
        )
    },
    Multiply {
        override fun invoke(a: Dimension, b: Dimension) = Dimension(
                L = a.L + b.L,
                A = a.A + b.A,
                M = a.M + b.M,
                T = a.T + b.T,
                I = a.I + b.I,
                Theta = a.Theta + b.Theta,
                N = a.N + b.N,
                J = a.J + b.J,
                C = a.C + b.C
        )
    }
}