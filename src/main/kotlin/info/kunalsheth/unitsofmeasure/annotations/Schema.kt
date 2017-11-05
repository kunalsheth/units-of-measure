package info.kunalsheth.unitsofmeasure.annotations

/**
 * Created by kunal on 10/31/17.
 */
@Retention(AnnotationRetention.SOURCE)
annotation class Schema(
        val generateCommonUnits: Boolean = false,
        val dimensionalAnalysis: Relationships = Relationships(),
        val unitsOfMeasure: UnitsOfMeasure = UnitsOfMeasure()
)