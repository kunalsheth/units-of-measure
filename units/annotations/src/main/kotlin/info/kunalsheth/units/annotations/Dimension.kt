package info.kunalsheth.units.annotations

/**
 * Created by kunal on 8/8/17.
 */
@Target
@Retention(AnnotationRetention.SOURCE)
annotation class Dimension(
    val L: Int = 0,
    val M: Int = 0,
    val T: Int = 0,
    val I: Int = 0,
    val Theta: Int = 0,
    val N: Int = 0,
    val J: Int = 0
)