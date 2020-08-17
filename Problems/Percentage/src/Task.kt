import java.math.BigInteger

fun main() {
    // write your code here
    val a1 = BigInteger(readLine()!!)
    val a2 = BigInteger(readLine()!!)
    val sum = a1 + a2
    val hundred = BigInteger.valueOf(100)
    println("${a1 * hundred / sum}% ${a2 * hundred / sum}%")
}