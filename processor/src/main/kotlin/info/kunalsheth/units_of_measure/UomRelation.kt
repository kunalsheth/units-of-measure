package info.kunalsheth.units_of_measure

/**
 * Created by kunal on 8/5/17.
 */
data class UomRelation(val i1: MetaUom, val method: Type, val i2: MetaUom, val o: MetaUom) {
    enum class Type {
        Integral, Derivative
    }
}