package info.kunalsheth.unitsofmeasure.sample

import info.kunalsheth.unitsofmeasure.annotations.*
import info.kunalsheth.unitsofmeasure.generated.*

@Schema(
        relationships = arrayOf(
                Relation(Dimension(L = 1), Dimension(T = 1))
        ),
        unitsOfMeasure = arrayOf(
                UnitOfMeasure("Grams", true, 0.001, Dimension(M = 1)),
                UnitOfMeasure("Ounces", false, 0.0283495, Dimension(M = 1)),
                UnitOfMeasure("Pounds", false, 0.453592, Dimension(M = 1)),
                UnitOfMeasure("Feet", false, 0.3048, Dimension(L = 1)),
                UnitOfMeasure("Metres", true, 1.0, Dimension(L = 1)),
                UnitOfMeasure("Percent", false, 0.01, Dimension()),
                UnitOfMeasure("MilesPerHour", false, 0.44704, Dimension(L = 1, T = -1)),
                UnitOfMeasure("Minutes", false, 60.0, Dimension(T = 1)),
                UnitOfMeasure("Seconds", false, 1.0, Dimension(T = 1)),
                UnitOfMeasure("Miles", false, 1609.34, Dimension(L = 1)),
                UnitOfMeasure("MetresPerHour", true, 0.000277778, Dimension(L = 1, T = -1))
        )
)
fun main(args: Array<String>) {
    val mass1 = 3.KiloGrams
    val mass2 = 14.Ounces
    val sum = mass1 + mass2
    // mass1 + 3.Days // will not compile

    assert(sum in 7.4.Pounds..7.5.Pounds)
    assert(sum in 3.3.KiloGrams..7.5.Pounds) // this works (but it is hard to understand)
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
    assert(aBitFaster in speed..(speed + 4.KiloMetresPerHour))
}