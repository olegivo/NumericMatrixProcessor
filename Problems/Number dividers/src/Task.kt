import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val i = scanner.nextInt()
    arrayOf(2, 3, 5, 6).forEach {
        if (i % it == 0) println("Divided by $it")
    }
}