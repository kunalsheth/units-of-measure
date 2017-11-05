package info.kunalsheth.unitsofmeasure.annotations

/**
 * Created by kunal on 8/6/17.
 */
@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Relate(val a: Dimension, val b: Dimension)

@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Relationships(vararg val value: Relate)
