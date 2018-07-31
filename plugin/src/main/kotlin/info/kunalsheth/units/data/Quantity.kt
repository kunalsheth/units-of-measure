package info.kunalsheth.units.data

import java.io.Serializable

/**
 * Created by kunal on 11/8/17.
 */
data class Quantity(val name: String, val dimension: Dimension) : Serializable {
    override fun toString() = "`$name`"
}