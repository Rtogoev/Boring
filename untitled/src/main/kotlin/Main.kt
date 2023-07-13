import java.lang.Math.pow
import kotlin.math.sin

fun main(args: Array<String>) {
    println(f(24.0) - f(11.0))
}

fun f(x: Double) = 512 - 24 * sin(x / 6) - 60 * pow(Math.E, (1 - x) / 62)