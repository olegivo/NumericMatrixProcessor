import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    println(
            scanner.nextLine()
                    .split(' ')
                    .filter { it.isNotBlank() }
                    .map { it.first().isDigit() }
                    .joinToString("\\")
    )
}