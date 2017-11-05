package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.UnitOfMeasure

data class MetaUnitOfMeasure(private val name: String, val ratioToSI: Double, val dimensions: MetaDimension) {
    constructor(unitOfMeasure: UnitOfMeasure) : this(
            name = "`${unitOfMeasure.name}`",
            ratioToSI = unitOfMeasure.ratioToSI,
            dimensions = MetaDimension(unitOfMeasure.dimension)
    )

    override fun toString() = name
}