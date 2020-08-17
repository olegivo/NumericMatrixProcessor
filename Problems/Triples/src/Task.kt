import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    val a = IntArray(n) { scanner.nextInt() }
    var count = 0
    for (lastTripleIndex in a.indices.drop(2)) {
        if (a[lastTripleIndex - 2] + 1 == a[lastTripleIndex - 1] &&
                a[lastTripleIndex - 1] + 1 == a[lastTripleIndex]) {
            count++
        }
    }
    println(count)
}