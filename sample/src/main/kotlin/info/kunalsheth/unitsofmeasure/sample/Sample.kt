package info.kunalsheth.unitsofmeasure.sample

import info.kunalsheth.unitsofmeasure.annotations.*
import info.kunalsheth.unitsofmeasure.generated.*

@Schema(
        generateCommonUnits = true,
        dimensionalAnalysis = Relationships(
                Relate(
                        Measure(L = 2, M = 1, T = -3, I = -2),
                        Measure(I = 1)
                ),
                Relate(Measure(L = 1), Measure(T = 1))
        ),
        unitConversions = Conversions(
                Convert("foot", 3.28084, Measure(L = 1)),
                Convert("second", 1.0, Measure(T = 1)),
                Convert("feetPerSecond", 3.28084, Measure(L = 1, T = -1))
        )
)
fun main(args: Array<String>) {
    val distance = foot(10.0)
    val time = second(3.14)
    val speed: `L⋅T⁻¹` = distance / time
    println(speed.feetPerSecond)
}