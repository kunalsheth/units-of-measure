package info.kunalsheth.unitsofmeasure.sample

import info.kunalsheth.unitsofmeasure.annotations.*
import info.kunalsheth.unitsofmeasure.annotations.Quantity
import info.kunalsheth.unitsofmeasure.generated.*

@Schema(
        relationships = arrayOf(
                Relation(Dimension(L = 1), Dimension(T = 1)),
                Relation(Dimension(L = 1, T = -1), Dimension(L = 1, T = -2))
        ),
        quantities = arrayOf(
                Quantity("Speed", Dimension(L = 1, T = -1)),
                Quantity("Acceleration", Dimension(L = 1, T = -2))
        ),
        unitsOfMeasure = arrayOf(
                UnitOfMeasure("Grams", 0.001, Dimension(M = 1)),
                UnitOfMeasure("Ounces", 0.0283495, Dimension(M = 1)),
                UnitOfMeasure("Pounds", 0.453592, Dimension(M = 1)),
                UnitOfMeasure("Feet", 0.3048, Dimension(L = 1)),
                UnitOfMeasure("Metres", 1.0, Dimension(L = 1)),
                UnitOfMeasure("Percent", 0.01, Dimension()),
                UnitOfMeasure("MilesPerHour", 0.44704, Dimension(L = 1, T = -1)),
                UnitOfMeasure("Minutes", 60.0, Dimension(T = 1)),
                UnitOfMeasure("Hours", 3600.0, Dimension(T = 1)),
                UnitOfMeasure("Seconds", 1.0, Dimension(T = 1)),
                UnitOfMeasure("Miles", 1609.34, Dimension(L = 1)),
                UnitOfMeasure("MetresPerHour", 0.000277778, Dimension(L = 1, T = -1))
        )
)
fun main(args: Array<String>) {
    val mass1 = 3.kilo { Grams }
    val mass2 = 14.Ounces
    val sum = mass1 + mass2
    // mass1 + 3.Days // will not compile

    assert(sum in 7.4.Pounds..7.5.Pounds)
    assert(sum in 3.3.kilo { Grams }..7.5.Pounds) // this works (but it is hard to understand)
    // assert(sum in 7.4.Kilowatts..7.5.Pounds) // will not compile


    val ratio = 2.Feet / 1.Metres
    assert(ratio in 55.Percent..65.Percent)
    assert(ratio.Percent in 55..65)


    val speed = 65.MilesPerHour
    val time = 27.Minutes
    val distance = speed * time
    val aBitFaster = distance / (time - 30.Seconds)

    assert(distance in 29.Miles..30.Miles)
    assert(distance in 30.Miles..29.Miles) // this works too
    assert(aBitFaster in speed..(speed + 4.kilo { MetresPerHour }))

    val kunalsCar = Car(200.MilesPerHour, 62.Miles / 1.Hours / 3.1.Seconds)
    assert(kunalsCar.zeroToSixty() < 3.2.Seconds)
}

data class Car(val topSpeed: Speed, val floorIt: Acceleration) {
    fun zeroToSixty() = 60.MilesPerHour / floorIt
}