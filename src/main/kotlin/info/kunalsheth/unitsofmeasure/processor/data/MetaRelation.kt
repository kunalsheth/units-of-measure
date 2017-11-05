package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.Relate
import info.kunalsheth.unitsofmeasure.processor.data.RelationType.*

/**
 * Created by kunal on 8/5/17.
 */
data class MetaRelation(val a: MetaDimension, val f: RelationType, val b: MetaDimension) {
    val result = f(a, b)

    companion object {
        operator fun invoke(relation: Relate) = relation.run {
            val a = MetaDimension(a)
            val b = MetaDimension(b)

            val aDb = MetaRelation(a, Divide, b)
            val aMb = MetaRelation(a, Multiply, b)
            val bDa = MetaRelation(b, Divide, a)
            val bMa = MetaRelation(b, Multiply, a)

            val aDbMb = MetaRelation(aDb.result, Multiply, b)
            val aMbDb = MetaRelation(aMb.result, Divide, b)
            val aMbDa = MetaRelation(aMb.result, Divide, a)
            val bDaMa = MetaRelation(bDa.result, Multiply, a)
            val bMaDa = MetaRelation(bMa.result, Divide, a)
            val bMaDb = MetaRelation(bMa.result, Divide, b)

            setOf(
                    aDb, aMb, bDa, bMa,
                    aDbMb, aMbDb, aMbDa, bDaMa, bMaDa, bMaDb
            )
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