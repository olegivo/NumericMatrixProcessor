import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    println(
            scanner.nextLine()
                    .split(' ')
                    .let {
                        it[0].equals(it[1], ignoreCase = true)
                    }
    )
}