import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    while (scanner.hasNext()) {
        scanner.next().split(' ').forEach { println(it) }
    }
}