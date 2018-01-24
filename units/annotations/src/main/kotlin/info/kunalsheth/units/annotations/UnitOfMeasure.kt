package info.kunalsheth.units.annotations

/**
 * Created by kunal on 8/6/17.
 */
@Target
@Retention(AnnotationRetention.SOURCE)
annotation class UnitOfMeasure(
    val name: String,
    val factorToSI: Double,
    val dimension: Dimension
)