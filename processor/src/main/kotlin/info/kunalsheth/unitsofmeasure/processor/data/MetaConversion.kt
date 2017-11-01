package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.Convert
import info.kunalsheth.unitsofmeasure.annotations.Measure

data class MetaConversion(val name: String, val ratioToSI: Double, val measure: Measure) {
    constructor(conversion: Convert) : this(
            name = conversion.name,
            ratioToSI = conversion.ratioToSI,
            measure = conversion.measure
    )
}