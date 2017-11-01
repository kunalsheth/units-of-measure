package info.kunalsheth.unitsofmeasure.processor.data

import info.kunalsheth.unitsofmeasure.annotations.Convert

data class MetaConversion(private val name: String, val ratioToSI: Double, val measure: MetaMeasure) {
    constructor(conversion: Convert) : this(
            name = "`${conversion.name}`",
            ratioToSI = conversion.ratioToSI,
            measure = MetaMeasure(conversion.measure)
    )

    override fun toString() = name
}