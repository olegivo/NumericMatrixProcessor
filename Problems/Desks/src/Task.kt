import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    println(
            (1..3)
                    .map {
                        scanner.nextInt().let {
                            if (it % 2 == 0) it / 2 else it / 2 + 1
                        }
                    }
                    .sum())
}