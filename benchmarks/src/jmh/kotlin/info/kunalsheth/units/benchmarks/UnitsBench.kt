package info.kunalsheth.units.benchmarks

import info.kunalsheth.units.annotations.*
import info.kunalsheth.units.generated.*
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole
import java.util.*

typealias R = Relation
typealias Q = Quantity
typealias D = Dimension
typealias U = UnitOfMeasure

@Schema(
        relationships = [
            R(D(L = 1), D(T = 1)),
            R(D(L = 1, T = -1), D(L = 1, T = -2))
        ],
        unitsOfMeasure = [
            U("Grams", 0.001, D(M = 1)),
            U("Ounces", 0.0283495, D(M = 1)),
            U("Pounds", 0.453592, D(M = 1)),
            U("Feet", 0.3048, D(L = 1)),
            U("Metres", 1.0, D(L = 1)),
            U("Percent", 0.01, D()),
            U("MilesPerHour", 0.44704, D(L = 1, T = -1)),
            U("Minutes", 60.0, D(T = 1)),
            U("Seconds", 1.0, D(T = 1)),
            U("Miles", 1609.34, D(L = 1)),
            U("MetresPerHour", 0.0002777777778, D(L = 1, T = -1))
        ]
)
@State(Scope.Thread)
open class KotlinBenchmark {
    var x = 0.0
    var y = 0.0

    @Setup
    fun setUp(): Unit {
        val r = Random()
        x = r.nextDouble()
        y = r.nextDouble()
    }

    @Benchmark
    fun safeSum(blackhole: Blackhole) {
        val mass1 = x.kilo { Grams }
        val mass2 = y.Ounces
        val sum = mass1 + mass2
        blackhole.consume(sum in x.Pounds..y.Pounds)
        blackhole.consume(sum in x.kilo { Grams }..y.Pounds)
    }

    @Benchmark
    fun primSum(blackhole: Blackhole) {
        val mass1 = x * 1000 * 0.001
        val mass2 = y * 0.0283495
        val sum = mass1 + mass2
        blackhole.consume(sum in (x * 0.453592)..(y * 0.453592))
        blackhole.consume(sum in (x * 1000 * 0.001)..(y * 0.453592))
    }

    @Benchmark
    fun safeRatio(blackhole: Blackhole) {
        val ratio = x.Feet / y.Metres
        blackhole.consume(ratio in x.Percent..y.Percent)
        blackhole.consume(ratio.Percent in x..y)
    }

    @Benchmark
    fun primRatio(blackhole: Blackhole) {
        val ratio = (x * 0.3048) / (y * 1.0)
        blackhole.consume(ratio in (x * 0.01)..(y * 0.01))
        blackhole.consume((ratio / 0.01) in x..y)
    }

    @Benchmark
    fun safeSpeed(blackhole: Blackhole) {
        val speed = x.MilesPerHour
        val time = y.Minutes
        val distance = speed * time
        val aBitFaster = distance / (time - x.Seconds)

        blackhole.consume(distance in x.Miles..y.Miles)
        blackhole.consume(distance in x.Miles..y.Miles)
        blackhole.consume(aBitFaster in speed..(speed + y.kilo { MetresPerHour }))
    }

    @Benchmark
    fun primSpeed(blackhole: Blackhole) {
        val speed = x * 0.44704
        val time = y * 60.0
        val distance = speed * time
        val aBitFaster = distance / (time - (x * 1.0))

        blackhole.consume(distance in (x * 1609.34)..(y * 1609.34))
        blackhole.consume(distance !in (x * 1609.34)..(y * 1609.34))
        blackhole.consume(aBitFaster in speed..(speed + (y * 1000 * 2.77778E-4)))
    }
}