import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var prev = scanner.nextInt()
    var ordered = true
    while (ordered && scanner.hasNext()) {
        val current = scanner.nextInt()
        if (current < prev) {
            ordered = false
        }
        prev = current
    }
    println(if (ordered) "YES" else "NO")
}