package info.kunalsheth.units.annotations

/**
 * Created by kunal on 11/8/17.
 */
@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Quantity(val name: String, val dimension: Dimension)