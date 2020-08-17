import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    scanner.nextInt().let {
        println(if (it % 2 == 0) it + 2 else it + 1)
    }
}