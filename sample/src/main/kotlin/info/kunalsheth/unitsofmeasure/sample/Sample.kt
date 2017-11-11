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
                Quantity("FooQuantity", Dimension(1, 2, 3, 4, 5, 6, 7))
        ),
        unitsOfMeasure = arrayOf(
                UnitOfMeasure("FooUnit", 2.718, Dimension(1, 2, 3, 4, 5, 6, 7)),
                UnitOfMeasure("BarUnit", 3.141, Dimension(1, 2, 3, 4, 5, 6, 7))
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
    val k2: FooQuantity = 9000.BarUnit
    val k3: FooQuantity = k1 - k2
    println(k1.BarUnit) // false: same number, different units
    println(k2.FooUnit)

    println(k3.FooUnit) // != 0: same numbers, different units
    println(k3.BarUnit) // != 0: same numbers, different units
}