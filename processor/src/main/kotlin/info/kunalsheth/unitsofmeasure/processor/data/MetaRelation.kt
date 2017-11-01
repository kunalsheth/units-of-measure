package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.Relate
import info.kunalsheth.unitsofmeasure.processor.data.RelationType.*

/**
 * Created by kunal on 8/5/17.
 */
data class MetaRelation(val a: MetaMeasure, val f: RelationType, val b: MetaMeasure) {
    val result = f(a, b)

    companion object {
        operator fun invoke(relation: Relate) = relation.run {
            val a = MetaMeasure(a)
            val b = MetaMeasure(b)

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

enum class RelationType : (MetaMeasure, MetaMeasure) -> MetaMeasure {
    Divide {
        override fun invoke(a: MetaMeasure, b: MetaMeasure) = MetaMeasure(
                length = a.length - b.length,
                mass = a.mass - b.mass,
                time = a.time - b.time,
                electricCurrent = a.electricCurrent - b.electricCurrent,
                thermodynamicTemperature = a.thermodynamicTemperature - b.thermodynamicTemperature,
                amountOfSubstance = a.amountOfSubstance - b.amountOfSubstance,
                luminousIntensity = a.luminousIntensity - b.luminousIntensity
        )
    },
    Multiply {
        override fun invoke(a: MetaMeasure, b: MetaMeasure) = MetaMeasure(
                length = a.length + b.length,
                mass = a.mass + b.mass,
                time = a.time + b.time,
                electricCurrent = a.electricCurrent + b.electricCurrent,
                thermodynamicTemperature = a.thermodynamicTemperature + b.thermodynamicTemperature,
                amountOfSubstance = a.amountOfSubstance + b.amountOfSubstance,
                luminousIntensity = a.luminousIntensity + b.luminousIntensity
        )
    }
}