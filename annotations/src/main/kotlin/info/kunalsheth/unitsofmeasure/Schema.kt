package info.kunalsheth.unitsofmeasure

@Retention(AnnotationRetention.SOURCE)
annotation class Schema(
        val generateCommonUnits: Boolean = false,
        val dimensionalAnalysis: Relationships = Relationships(),
        val unitConversions: Conversions = Conversions()
)