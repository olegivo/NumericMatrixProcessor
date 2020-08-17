import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val i = scanner.nextInt()
    println(when {
        i < 1 -> "no army"
        i in 1..4 -> "few"
        i in 5..9 -> "several"
        i in 10..19 -> "pack"
        i in 20..49 -> "lots"
        i in 50..99 -> "horde"
        i in 100..249 -> "throng"
        i in 250..499 -> "swarm"
        i in 500..999 -> "zounds"
        else -> "legion"
    })
}