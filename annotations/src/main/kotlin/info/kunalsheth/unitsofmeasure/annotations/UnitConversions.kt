package info.kunalsheth.unitsofmeasure.annotations

/**
 * Created by kunal on 8/6/17.
 */
@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Convert(val name: String, val ratioToSI: Double, val measure: Measure)

@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Conversions(vararg val value: Convert)