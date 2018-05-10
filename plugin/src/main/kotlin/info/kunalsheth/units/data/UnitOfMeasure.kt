package info.kunalsheth.units.data

import java.io.Serializable

data class UnitOfMeasure(val name: String, val factorToSI: Double, val dimension: Dimension) : Serializable {
    override fun toString() = "`$name`"
}