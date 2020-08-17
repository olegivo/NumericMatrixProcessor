import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val rooms = scanner.nextInt()
    val price = scanner.nextInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}

fun totalPrice(house: House): Int {
    return (house.price.let {
        when {
            it < 0 -> 0
            it > 1_000_000 -> 1_000_000
            else -> it
        }
    } * house.rooms.let {
        (when {
            it < 2 -> 1.0
            it in 2..3 -> 1.2
            it == 4 -> 1.25
            it in 5..7 -> 1.4
            else -> 1.6
        })
    }).toInt()
}

data class House(val rooms: Int, val price: Int)