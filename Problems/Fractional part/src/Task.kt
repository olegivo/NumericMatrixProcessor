import java.util.*
import kotlin.math.floor

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val v = scanner.nextDouble()
    println((v - floor(v)).toString().drop(2).first())
}
