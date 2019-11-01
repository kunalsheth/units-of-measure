package info.kunalsheth.units.sample

import info.kunalsheth.units.generated.*
import info.kunalsheth.units.generated.Byte
import info.kunalsheth.units.math.*


fun main(args: Array<String>) {
    val mass1 = 3.kilo(Gram)
    val mass2 = 14.Ounce
    val sum = mass1 + mass2
    // mass1 + 3.Days // will not compile

    assert(sum in 7.5.Pound `±` 1.Ounce)
    assert(sum in 3.3.kilo(Gram)..7.5.Pound) // this works too
    // assert(sum in 7.4.Kilowatts..7.5.Pounds) // will not compile

    val ratio = 2.Foot / 1.Metre
    assert(ratio in 60.Percent `±` 5.Percent)
    assert(ratio.Percent.toInt() in 55..65)


    assert(1.kilo(Gram) == 1000.Gram)
    assert(10.milli(Metre) == 1.centi(Metre))
    assert(60000.milli(Second) == 1.Minute)


    assert(420.Degree % 1.Turn in 60.Degree `±` 1.Degree)


    val gasPrice = 3.96.`$` / 1.Gallon
    val carEfficiency = 16.Mile / 1.Gallon
    val trip = 30.6.Mile
    val gasMoney = gasPrice / carEfficiency * trip

    assert(gasMoney in 7.57.`$` `±` 1.`¢`)
    assert(gasMoney in 6.11.`£` `±` 1.`¢`)


    val hardDrive = 500.giga(Byte)
    val price = 54.99.`$`
    val download = 15.3.mega(Bit) / Second

    val restoreTime = hardDrive / download
    val dailyExpense = price / hardDrive * download * Day

    assert(restoreTime in 72.Hour..73.Hour)
    assert(dailyExpense in 18.`$`..19.`$`)


    val speed = 65.Mile / Hour
    val time = 27.Minute
    val distance = speed * time
    val aBitFaster = distance / (time - 30.Second)

    assert(distance == time * speed)
    assert(distance in 29.Mile..30.Mile)
    assert(distance in 30.Mile..29.Mile) // this works too
    assert(aBitFaster in speed..(speed + 4.kilo(Metre) / Hour))


    val kunalsCar = Car(200.Mile / Hour, 62.Mile / Hour / 3.1.Second)
    assert(kunalsCar.zeroToSixty() < 3.2.Second)

    val threshold = 0.001.Foot / Second / Second

    sequenceOf(0, 1, 4, 9, 16, 25).map { it.Foot }
            .derivative(::div)
            .derivative(::div)
            .zipWithNext { a, b -> a in b `±` threshold }
            .forEach { assert(it) }
}

// inlined to prevent boxing
inline infix fun <Q : Quan<Q>> Q.`±`(radius: Q) = this.plusOrMinus(radius)
inline fun <Q : Quan<Q>> `±`(radius: Q) = radius.new(0.0).plusOrMinus(radius)

data class Car(val topSpeed: Speed, val floorIt: Acceleration) {
    fun zeroToSixty() = 60.Mile / Hour / floorIt
}

fun timeSeq() = generateSequence(0) { it + 1 }.map { it.Second }

// support for generic programming
fun <Q : Quan<Q>, DQDT : Quan<DQDT>> Sequence<Q>.derivative(div: (Q, T) -> DQDT) = timeSeq()
        .zip(this)
        .zipWithNext { (x1, y1), (x2, y2) ->
            div((y1 - y2), (x1 - x2))
        }