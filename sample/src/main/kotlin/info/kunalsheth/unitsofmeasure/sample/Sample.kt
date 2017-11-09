package info.kunalsheth.unitsofmeasure.sample

import info.kunalsheth.unitsofmeasure.annotations.*
import info.kunalsheth.unitsofmeasure.annotations.Quantity
import info.kunalsheth.unitsofmeasure.generated.*

@Schema(
        generateCommonUnits = true,
        relationships = arrayOf(
                Relation(
                        Dimension(L = 2, M = 1, T = -3, I = -2),
                        Dimension(I = 1)
                ),
                Relation(Dimension(L = 1), Dimension(T = 1)),
                Relation(Dimension(L = 1, T = -1), Dimension(T = 1))
        )
)
fun main(args: Array<String>) {
    val distance = Feet(10.0)
    val time = Seconds(2.0)
    val speed: Velocity = distance / time
    println(speed.KilometersPerHour)

    val acceleration: Acceleration = speed / time
    println(acceleration.MetersPerSecondSquared)
}