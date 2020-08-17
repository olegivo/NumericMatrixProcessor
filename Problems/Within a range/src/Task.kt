import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val r1 = scanner.nextInt()..scanner.nextInt()
    val r2 = scanner.nextInt()..scanner.nextInt()
    val i = scanner.nextInt()
    println(i in r1 || i in r2)
}