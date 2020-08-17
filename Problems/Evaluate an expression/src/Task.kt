import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    println(scanner.nextDouble().let { x ->
        (0..3).sumByDouble { x.pow(it) }
    })
}