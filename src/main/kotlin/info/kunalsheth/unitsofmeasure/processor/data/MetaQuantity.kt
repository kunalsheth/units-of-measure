package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.Quantity

/**
 * Created by kunal on 11/8/17.
 */
data class MetaQuantity( val name: String, val dimension: MetaDimension) {
    constructor(quantity: Quantity) : this(
            name = "`${quantity.name}`",
            dimension = MetaDimension(quantity.dimension)
    )

    override fun toString() = name
}