package info.kunalsheth.units.sample

import info.kunalsheth.units.generated.*

fun main(args: Array<String>) {
    println("Custom")
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


    assert(1.kilo { Grams } == 1000.Grams)
    assert(10.milli { Metres } == 1.centi { Metres })
    assert(60000.milli { Seconds } == 1.Minutes)


    val speed = 65.MilesPerHour
    val time = 27.Minutes
    val distance = speed * time
    val aBitFaster = distance / (time - 30.Seconds)

    assert(distance == time * speed)
    assert(distance in 29.Miles..30.Miles)
    assert(distance in 30.Miles..29.Miles) // this works too
    assert(aBitFaster in speed..(speed + 4.kilo { MetresPerHour }))


    val kunalsCar = Car(200.MilesPerHour, 62.Miles / 1.Hours / 3.1.Seconds)
    assert(kunalsCar.zeroToSixty() < 3.2.Seconds)
}

data class Car(val topSpeed: Speed, val floorIt: Acceleration) {
    fun zeroToSixty() = 60.MilesPerHour / floorIt
}

val timeSeq = generateSequence { System.currentTimeMillis() }
        .map { it.milli { Seconds } }

fun <Q, IQ> Sequence<IQ>.derivative(): Sequence<Q> where
        IQ : Integral<Q, IQ>,
        IQ : Quan<IQ> = timeSeq.zip(this)
        .windowed(size = 2)
        .map {
            val (pt1, pt2) = it
            val (x1, y1) = pt1
            val (x2, y2) = pt2

            (y1 - y2) / (x1 - x2)
        }