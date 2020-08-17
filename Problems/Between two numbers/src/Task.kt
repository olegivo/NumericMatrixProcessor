import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    val range = scanner.nextInt()..scanner.nextInt()
    println(a in range)
}