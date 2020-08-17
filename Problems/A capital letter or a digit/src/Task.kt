import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    println(
            scanner.next().first().let {
                if (it.isDigit()) {
                    it.toString().toInt() in 1..9
                } else {
                    it.isUpperCase()
                }
            }
    )
}