package info.kunalsheth.units.suite

import info.kunalsheth.units.data.Quantity
import info.kunalsheth.units.data.UnitOfMeasure
import java.io.Serializable

sealed class Suite {
    abstract val units: Set<UnitOfMeasure>
    abstract val quantities: Set<Quantity>
}

object NoSuite : Suite(), Serializable {
    override val units get() = emptySet<UnitOfMeasure>()
    override val quantities get() = emptySet<Quantity>()
}

class Squants(private val useUnits: Boolean = true, private val useQuantities: Boolean = true) : Suite(), Serializable {
    override val units get() = if (useUnits) SquantsExport.units else emptySet()
    override val quantities = if (useQuantities) SquantsExport.quantities else emptySet()

}

class SI(private val useUnits: Boolean = true, private val useQuantities: Boolean) : Suite(), Serializable {
    override val units get() = if (useUnits) InternationalSystemOfUnits.units else emptySet()
    override val quantities get() = if (useQuantities) InternationalSystemOfUnits.quantities else emptySet()
}