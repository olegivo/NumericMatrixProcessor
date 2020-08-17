val numbers = IntArray(100) {
    when (it + 1) {
        1, 10, 100 -> it + 1
        else -> 0
    }
}