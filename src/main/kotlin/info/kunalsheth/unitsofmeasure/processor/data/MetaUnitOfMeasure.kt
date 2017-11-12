package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.Relation
import info.kunalsheth.unitsofmeasure.annotations.UnitOfMeasure
import java.lang.Math.pow

data class MetaUnitOfMeasure(val name: String, val factorToSI: Double, val dimension: MetaDimension) {

    companion object {
        val prefixes = mapOf(
                "Peta" to 15,
                "Tera" to 12,
                "Giga" to 9,
                "Mega" to 6,
                "Kilo" to 3,
                "Hecto" to 2,
                "Deca" to 1,
                "" to 0,
                "Deci" to -1,
                "Centi" to -2,
                "Milli" to -3,
                "Micro" to -6,
                "Nano" to -9,
                "Pico" to -12,
                "Femto" to -15
        )

        infix fun Number.`^`(that: Number) = Math.pow(this.toDouble(), that.toDouble())

        operator fun invoke(unitOfMeasure: UnitOfMeasure): Set<MetaUnitOfMeasure> = unitOfMeasure.run {
            if (prefixed) prefixes.map { (prefix, power) ->
                MetaUnitOfMeasure(
                        name = "`${prefix + name}`",
                        factorToSI = factorToSI * (10 `^` power),
                        dimension = MetaDimension(dimension)
                )
            }.toSet()
            else setOf(MetaUnitOfMeasure(
                    name = "`$name`",
                    factorToSI = factorToSI,
                    dimension = MetaDimension(dimension)
            ))
        }
    }

    override fun toString() = name
}