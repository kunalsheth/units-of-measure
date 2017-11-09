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
        ),
        quantities = arrayOf(
                Quantity("velocity", Dimension(L = 1, T = -1)),
                Quantity("acceleration", Dimension(L = 1, T = -2))
        ),
        unitsOfMeasure = arrayOf(
                UnitOfMeasure("foot", 3.28084, Dimension(L = 1)),
                UnitOfMeasure("second", 1.0, Dimension(T = 1)),
                UnitOfMeasure("feetPerSecond", 3.28084, Dimension(L = 1, T = -1)),
                UnitOfMeasure("metersPerSecondSquared", 1.0, Dimension(L = 1, T = -2))
        )
)
fun main(args: Array<String>) {
    val distance = foot(10.0)
    val time = second(2.0)
    val speed: velocity = distance / time
    println(speed.feetPerSecond)
    val acceleration: acceleration = speed / time
    println(acceleration.metersPerSecondSquared)
}