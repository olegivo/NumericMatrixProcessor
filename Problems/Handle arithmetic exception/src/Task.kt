import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    println(if (second == 0)
        "Division by zero, please fix the second argument!"
    else (first / second).toString())
}