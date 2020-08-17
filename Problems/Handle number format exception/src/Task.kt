import java.lang.RuntimeException

fun parseCardNumber(cardNumber: String): Long {
    return cardNumber.let {
        if (it.count { it == ' ' } != 3) throw RuntimeException("invalid")
        it.replace(" ", "")
                .toLong()
    }
}