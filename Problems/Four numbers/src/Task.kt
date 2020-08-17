import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    repeat((1..4).count()) { println(scanner.nextInt()) }
}