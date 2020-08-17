import java.util.*

data class Client(val name: String, val age: Int) {
    var balance = 0
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    //implement your code here
    val client = {
        Client(input.next(), input.nextInt()).apply {
            balance = input.nextInt()
        }
    }
    println(client() == client())
}