package info.kunalsheth.units.sample

import info.kunalsheth.units.generated.*

data class Car(val topSpeed: Speed, val floorIt: Acceleration) {
    init { println("Creating $this") }

    fun zeroToSixty(): Time {
        println("Accelerating $this from zero to 60 MPH...")
        return 60.Mile / Hour / floorIt
    }
}

fun timeSeq() = generateSequence(0.Second) { it + 1.Second }


typealias `*` = times
typealias `÷` = div

// support for generic programming
fun <Q : Quan<Q>, DQDT : Quan<DQDT>> Sequence<Q>.derivative(p: (Q, `÷`, T) -> DQDT) = timeSeq()
    .zip(this)
    .zipWithNext { (x1, y1), (x2, y2) ->
        p(
            (y1 - y2), `÷`, (x1 - x2)
        )
    }