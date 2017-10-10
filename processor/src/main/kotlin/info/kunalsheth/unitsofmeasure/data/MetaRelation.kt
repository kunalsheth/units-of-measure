package info.kunalsheth.unitsofmeasure.data

/**
 * Created by kunal on 8/5/17.
 */
data class MetaRelation<out T : RelationType>(val a: MetaUom, val relationType: T, val b: MetaUom) {
    val result = relationType(a, b)

    override fun toString() = """
operator fun ${a.safeName}.$relationType(that: ${b.safeName})
    = ${result.safeName}(this.quantity.$relationType(that.quantity))
"""
}

sealed class RelationType : (MetaUom, MetaUom) -> MetaUom {
    object Divide : RelationType() {
        override fun invoke(a: MetaUom, b: MetaUom) = a / b
        override fun toString() = "div"
    }

    object Multiply : RelationType() {
        override fun invoke(a: MetaUom, b: MetaUom) = a * b
        override fun toString() = "times"
    }
}