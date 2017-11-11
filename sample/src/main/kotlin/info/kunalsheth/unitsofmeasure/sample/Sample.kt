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
                Quantity("FooQuantity", Dimension(L = 1, M = 2, T = 3, I = 4, Theta = 5, N = 6, J = 7))
        ),
        unitsOfMeasure = arrayOf(
                UnitOfMeasure("FooUnit", 2.718, Dimension(L = 1, M = 2, T = 3, I = 4, Theta = 5, N = 6, J = 7)),
                UnitOfMeasure("BarUnit", 3.141, Dimension(L = 1, M = 2, T = 3, I = 4, Theta = 5, N = 6, J = 7))
        )
)
fun main(args: Array<String>) {


    // Available using only `generateCommonUnits` and `relationships`

    val distance: Length = 15.Feet
    val time: Time = 3.14.Seconds
    val speed: Velocity = distance / time
    println(speed.KilometersPerHour)

    val acceleration: Acceleration = speed / time
    println(acceleration.MetersPerSecondSquared)

    val v: ElectricPotential = 12.Volts
    val i: ElectricCurrent = 50.Amperes
    val r: ElectricalResistance = v / i


    // Available using `quantities` and `unitsOfMeasure`

    val k1: FooQuantity = 9000.FooUnit
    println(k1.BarUnit)

    val k2: FooQuantity = 9000.BarUnit
    println(k2.FooUnit)

    val k3: FooQuantity = k1 - k2
    println(k3.FooUnit)
    println(k3.BarUnit)
}