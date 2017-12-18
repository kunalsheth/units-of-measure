package info.kunalsheth.units.processor.data

import info.kunalsheth.units.annotations.UnitOfMeasure

data class MetaUnitOfMeasure(val name: String, val factorToSI: Double, val dimension: MetaDimension) {
    constructor(unitOfMeasure: UnitOfMeasure) : this(
            name = "`${unitOfMeasure.name}`",
            factorToSI = unitOfMeasure.factorToSI,
            dimension = MetaDimension(unitOfMeasure.dimension)
    )

    override fun toString() = name
}