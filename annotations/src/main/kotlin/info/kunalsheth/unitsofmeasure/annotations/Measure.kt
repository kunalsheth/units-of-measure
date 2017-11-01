package info.kunalsheth.unitsofmeasure.annotations

/**
 * Created by kunal on 8/8/17.
 */
@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Measure(
        val length: Int = 0,
        val mass: Int = 0,
        val time: Int = 0,
        val electricCurrent: Int = 0,
        val thermodynamicTemperature: Int = 0,
        val amountOfSubstance: Int = 0,
        val luminousIntensity: Int = 0
)
