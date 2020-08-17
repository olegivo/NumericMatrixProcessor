import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val size = scanner.nextInt()
    val a = IntArray(size) { scanner.nextInt() }
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    var yes = false
    for (i in a.indices.drop(1)) {
        if (a[i - 1] == n && a[i] == m || a[i - 1] == m && a[i] == n) {
            yes = true
            break
        }
    }
    println(if (!yes) "YES" else "NO")
}