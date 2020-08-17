import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val s = scanner.nextLine()
    val n = scanner.nextInt()
    println("Symbol # $n of the string \"$s\" is '${s[n - 1]}'")
}