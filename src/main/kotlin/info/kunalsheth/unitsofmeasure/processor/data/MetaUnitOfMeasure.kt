package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.UnitOfMeasure

data class MetaUnitOfMeasure( val name: String, val ratioToSI: Double, val dimension: MetaDimension) {
    constructor(unitOfMeasure: UnitOfMeasure) : this(
            name = "`${unitOfMeasure.name}`",
            ratioToSI = unitOfMeasure.ratioToSI,
            dimension = MetaDimension(unitOfMeasure.dimension)
    )

    override fun toString() = name
}