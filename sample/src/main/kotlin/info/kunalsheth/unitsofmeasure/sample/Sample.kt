package info.kunalsheth.unitsofmeasure.sample

import info.kunalsheth.unitsofmeasure.annotations.*
import info.kunalsheth.unitsofmeasure.annotations.Quantity
import info.kunalsheth.unitsofmeasure.generated.*

// you can use typealiases to make your schema less verbose
typealias R = Relation
typealias D = Dimension
@Schema(
        generateCommonUnits = true,
        relationships = arrayOf(
                R(D(L = 1), D(L = 1)), // generates Len / Len (amongst others)
                R(D(L = 1), D(T = 1)) // generates Velocity * Time & Len / Time (amongst others)
        )
)
fun simple() {
    val mass1 = 3.Kilograms
    val mass2 = 14.Ounces
    val sum = mass1 + mass2
    // mass1 + 3.Days // will not compile

    assert(sum in 7.4.Pounds..7.5.Pounds)
    assert(sum in 3.3.Kilograms..7.5.Pounds) // this works (but it is hard to understand)
    // assert(sum in 7.4.Kilowatts..7.5.Pounds) // will not compile


    val ratio = 2.Feet / 1.Meters
    assert(ratio in 55.Percent..65.Percent)
    assert(ratio.Percent in 55..65)


    val speed = 65.UsMilesPerHour
    val time = 27.Minutes
    val distance = speed * time
    val aBitFaster = distance / (27.Minutes - 30.Seconds)

    assert(distance in 29.UsMiles..30.UsMiles)
    assert(distance in 30.UsMiles..29.UsMiles) // this works too
    assert(aBitFaster in speed..(speed + 4.KilometersPerHour))
}


@Schema( // If you have any ideas on how I can make this less verbose, please tell me!
        relationships = arrayOf(
                R(
                        D(M = 2, I = 4, N = 6),
                        D(L = 1, T = 3, Theta = 5, J = 7)
                )
        ),
        quantities = arrayOf(
                // generates "typealias `Foo` = `M²⋅I⁴⋅N⁶`"
                Quantity("Foo", D(M = 2, I = 4, N = 6)),
                // generates "typealias `Bar` = `L⋅T³⋅Θ⁵⋅J⁷`"
                Quantity("Bar", D(L = 1, T = 3, Theta = 5, J = 7))
        ),
        unitsOfMeasure = arrayOf(
                UnitOfMeasure(
                        name = "Kunals",
                        prefixed = true, // generates MegaKunals (amongst others)
                        factorToSI = 3.141, // 1 Kunal * 3.141 = 1 M²⋅I⁴⋅N⁶
                        dimension = D(M = 2, I = 4, N = 6)
                ),
                UnitOfMeasure(
                        name = "Sheths",
                        factorToSI = 2.718, // 1 Sheth * 2.718 = 1 L⋅T³⋅Θ⁵⋅J⁷
                        dimension = D(L = 1, T = 3, Theta = 5, J = 7)
                )
        )
)
fun custom() {
    val a: Foo = 17.Kunals
    val b: Foo = 0.01.MegaKunals
    val sum: Foo = a + b

    assert(sum in 10_000.Kunals..10_100.Kunals)


    val kunal = 846.Kunals
    val sheth = 864.Sheths
    val quotient: `L⁻¹⋅M²⋅T⁻³⋅I⁴⋅Θ⁻⁵⋅N⁶⋅J⁻⁷` = kunal / sheth
    val product: `L⋅M²⋅T³⋅I⁴⋅Θ⁵⋅N⁶⋅J⁷` = kunal * sheth

    // there is no unit of measure defined for L⁻¹⋅M²⋅T⁻³⋅I⁴⋅Θ⁻⁵⋅N⁶⋅J⁻⁷ or L⋅M²⋅T³⋅I⁴⋅Θ⁵⋅N⁶⋅J⁷
    // we are forced to use `it.siValue`
    assert(quotient.siValue in 1..2)
    assert(product.siValue in 6240241..6240243)
}

fun main(args: Array<String>) {
    simple()
    custom()
}