import java.util.*

// write your code here

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}

fun getLastDigit(a: Int) = a.toString().last()
