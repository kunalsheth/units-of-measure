package info.kunalsheth.units.sample

import info.kunalsheth.units.generated.*

fun main(args: Array<String>) {
    println("Basic")
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
    val aBitFaster = distance / (time - 30.Seconds)

    assert(distance == time * speed)
    assert(distance in 29.UsMiles..30.UsMiles)
    assert(distance in 30.UsMiles..29.UsMiles) // this works too
    assert(aBitFaster in speed..(speed + 4.KilometersPerHour))


    val kunalsCar = Car(200.UsMilesPerHour, 62.UsMiles / 1.Hours / 3.1.Seconds)
    assert(kunalsCar.zeroToSixty() < 3.2.Seconds)

    val threshold = 0.001.Feet / 1.Seconds / 1.Seconds
    sequenceOf(0, 1, 4, 9, 16, 25).map { it.Feet }
            .derivative()
            .derivative()
            .zipWithNext { a, b -> a in b + threshold..b - threshold }
            .forEach { assert(it) }
}

data class Car(val topSpeed: Speed, val floorIt: Acceleration) {
    fun zeroToSixty() = 60.UsMilesPerHour / floorIt
}

fun timeSeq() = generateSequence(0) { it + 1 }.map { it.Seconds }

fun <Q : Quantity<Q, *, DerivativeOfQ>, DerivativeOfQ> Sequence<Q>.derivative(): Sequence<DerivativeOfQ> = timeSeq()
        .zip(this)
        .zipWithNext { (x1, y1), (x2, y2) ->
            (y1 - y2) / (x1 - x2)
        }

fun <Q : Quantity<Q, *, Nothing>> Sequence<Q>.derivative(): Nothing = error("Derivative out of generated boundaries")