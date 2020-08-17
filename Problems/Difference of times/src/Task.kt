import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    println(
            -(scanner.nextInt() * 60 * 60 +
                    scanner.nextInt() * 60 +
                    scanner.nextInt()) +
                    scanner.nextInt() * 60 * 60 +
                    scanner.nextInt() * 60 +
                    scanner.nextInt()
    )
}