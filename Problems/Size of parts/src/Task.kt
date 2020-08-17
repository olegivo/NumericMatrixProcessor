import java.util.*
import kotlin.math.sign

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var p = 0
    var l = 0
    var s = 0
    repeat(scanner.nextInt()) {
        when (scanner.nextInt().sign) {
            0 -> p++
            1 -> l++
            -1 -> s++
        }
    }
    println("$p $l $s")
}