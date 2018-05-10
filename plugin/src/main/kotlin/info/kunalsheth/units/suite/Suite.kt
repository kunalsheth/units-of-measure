package info.kunalsheth.units.suite

import info.kunalsheth.units.data.Quantity
import info.kunalsheth.units.data.UnitOfMeasure


sealed class Suite {
    abstract val units: Set<UnitOfMeasure>
    abstract val quantities: Set<Quantity>
}

class Squants(useUnits: Boolean = true, useQuantities: Boolean = true) : Suite() {
    override val units = if(useUnits) SquantsExport.units else emptySet()
    override val quantities = if(useQuantities) SquantsExport.quantities else emptySet()

}
class SI(useUnits: Boolean = true, useQuantities: Boolean) : Suite() {
    override val units = if(useUnits) InternationalSystemOfUnits.units else emptySet()
    override val quantities = if(useQuantities) InternationalSystemOfUnits.quantities else emptySet()
}