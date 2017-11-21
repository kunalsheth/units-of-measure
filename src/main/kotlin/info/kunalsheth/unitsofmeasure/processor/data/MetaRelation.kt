package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.Relation
import info.kunalsheth.unitsofmeasure.processor.data.RelationType.*

/**
 * Created by kunal on 8/5/17.
 */
data class MetaRelation(val a: MetaDimension, val f: RelationType, val b: MetaDimension) {
    val result = f(a, b)

    companion object {
        operator fun invoke(relation: Relation) = relation.run {
            val a = MetaDimension(a)
            val b = MetaDimension(b)

            var newDimensions = setOf(a, b)

            fun Set<MetaDimension>.allRelations() =
                    flatMap { x ->
                        flatMap { y ->
                            setOf(
                                    MetaRelation(x, Divide, x),
                                    MetaRelation(x, Divide, y),
                                    MetaRelation(x, Multiply, x),
                                    MetaRelation(x, Multiply, y),

                                    MetaRelation(y, Divide, x),
                                    MetaRelation(y, Divide, y),
                                    MetaRelation(y, Multiply, x),
                                    MetaRelation(y, Multiply, y)
                            )
                        }
                    }

            newDimensions += newDimensions
                    .allRelations()
                    .map(MetaRelation::result)

            newDimensions
                    .allRelations()
                    .filter { newDimensions.containsAll(setOf(it.a, it.b, it.result)) }
        }
    }
}

enum class RelationType : (MetaDimension, MetaDimension) -> MetaDimension {
    Divide {
        override fun invoke(a: MetaDimension, b: MetaDimension) = MetaDimension(
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
        override fun invoke(a: MetaDimension, b: MetaDimension) = MetaDimension(
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