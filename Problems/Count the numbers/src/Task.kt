import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val r = scanner.nextInt()..scanner.nextInt()
    val n = scanner.nextInt()
    println(r.count { it % n == 0 })
}
