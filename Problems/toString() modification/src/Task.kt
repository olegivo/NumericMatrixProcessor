data class Box(val height: Int, val width: Int) {
    constructor(height: Int, length: Int, width: Int) : this(height, width) {
        this.length = length
    }

    var length = 0
}