package info.kunalsheth.units.data

import info.kunalsheth.units.data.RelationType.Divide
import info.kunalsheth.units.data.RelationType.Multiply
import java.io.Serializable

/**
 * Created by kunal on 8/5/17.
 */
data class Relation(val a: Dimension, val f: RelationType, val b: Dimension): Serializable {
    val result = f(a, b)

    companion object {
        operator fun invoke(vararg d: Dimension): Set<Relation> {
            var newDimensions = d.toSet()

            fun Set<Dimension>.allRelations() =
                    flatMap { x ->
                        flatMap { y ->
                            setOf(
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

            newDimensions += newDimensions
                    .allRelations()
                    .map(Relation::result)

            return newDimensions
                    .allRelations()
                    .filter { newDimensions.containsAll(setOf(it.a, it.b, it.result)) }
                    .toSet()
        }
    }
}

enum class RelationType : (Dimension, Dimension) -> Dimension {
    Divide {
        override fun invoke(a: Dimension, b: Dimension) = Dimension(
                L = a.L - b.L,
                M = a.M - b.M,
                T = a.T - b.T,
                I = a.I - b.I,
                Theta = a.Theta - b.Theta,
                N = a.N - b.N,
                J = a.J - b.J
        )
    },
    Multiply {
        override fun invoke(a: Dimension, b: Dimension) = Dimension(
                L = a.L + b.L,
                M = a.M + b.M,
                T = a.T + b.T,
                I = a.I + b.I,
                Theta = a.Theta + b.Theta,
                N = a.N + b.N,
                J = a.J + b.J
        )
    }
}