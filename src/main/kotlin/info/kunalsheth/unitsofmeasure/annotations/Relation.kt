package info.kunalsheth.unitsofmeasure.annotations

/**
 * Created by kunal on 8/6/17.
 */
@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Relation(val a: Dimension, val b: Dimension)
