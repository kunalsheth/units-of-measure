package info.kunalsheth.unitsofmeasure

/**
 * Created by kunal on 8/6/17.
 */
@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Relate(val a: Measure, val b: Measure)

@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Relationships(vararg val value: Relate)
