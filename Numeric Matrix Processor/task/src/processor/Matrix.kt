package processor

import java.util.*

class Matrix(
        val rows: Int,
        val columns: Int,
        val items: Array<Array<Double>>
) {

    constructor(rows: Int, columns: Int, cellEvaluator: (row: Int, column: Int) -> Double) :
            this(
                    rows = rows,
                    columns = columns,
                    items = Array(rows) { r ->
                        Array(columns) { c ->
                            cellEvaluator(r, c)
                        }
                    }
            )

    override fun toString(): String {
        return buildString {
            val a = items
            for (r in 0 until rows) {
                for (c in 0 until columns) {
                    append("${a[r][c]} ")
                }
                appendln()
            }
        }
    }

    fun print() {
        print(toString())
    }

    companion object {
        fun readFromInput(sizePrompt: String? = null, matrixPrompt: String? = null): Matrix {
            sizePrompt?.let { println(it) }
            val scanner = Scanner(System.`in`)
            if (!scanner.hasNextInt()) scanner.nextLine()
            val r = scanner.nextInt()
            if (!scanner.hasNextInt()) scanner.nextLine()
            val c = scanner.nextInt()
            matrixPrompt?.let { println(it) }
            val a = Array(r) {
                Array(c) {
                    // while (!scanner.hasNextDouble()) scanner.nextLine()
                    if (!scanner.hasNextDouble()) scanner.nextLine()
                    scanner.nextDouble()
                }
            }
            return Matrix(rows = r, columns = c, items = a)
        }
    }
}

operator fun Matrix.times(b: Matrix): Matrix? {
    val a = this
    return if (a.columns == b.rows) {
        Matrix(a.rows, b.columns) { r, c ->
            (0 until a.columns).map { a[r][it] * b[it][c] }.sum()
        }
    } else {
        null
    }
}

operator fun Matrix.times(value: Double): Matrix =
        Matrix(rows, columns) { r: Int, c: Int -> this[r][c] * value }

operator fun Double.times(matrix: Matrix): Matrix = matrix * this

operator fun Matrix.get(row: Int) = items[row]

operator fun Matrix.get(row: Int, column: Int) = items[row][column]

operator fun Matrix.plus(b: Matrix): Matrix? =
        if (rows == b.rows && columns == b.columns) {
            Matrix(rows, columns) { r, c -> this[r][c] + b[r][c] }
        } else {
            null
        }

fun Matrix.transpose(variant: TransposeVariant = TransposeVariant.`relatively main diagonal`): Matrix =
        when (variant) {
            TransposeVariant.`relatively main diagonal` -> Matrix(columns, rows) { r, c -> this[c][r] }
            TransposeVariant.`relatively side diagonal` -> Matrix(columns, rows) { r, c -> this[columns - 1 - c][rows - 1 - r] }
            TransposeVariant.`by vertical line` -> Matrix(columns, rows) { r, c -> this[r][rows - 1 - c] }
            TransposeVariant.`by horizontal line` -> Matrix(columns, rows) { r, c -> this[columns - 1 - r][c] }
        }

sealed class TransposeVariant {
    object `relatively main diagonal` : TransposeVariant()
    object `relatively side diagonal` : TransposeVariant()
    object `by vertical line` : TransposeVariant()
    object `by horizontal line` : TransposeVariant()

    companion object {
        fun getFromInput() =
                when (Scanner(System.`in`).nextInt()) {
                    1 -> `relatively main diagonal`
                    2 -> `relatively side diagonal`
                    3 -> `by vertical line`
                    4 -> `by horizontal line`
                    else -> TODO()
                }
    }
}

fun Matrix.getDeterminant(): Double {
    if (rows == 2) return this[0, 0] * this[1, 1] - this[0, 1] * this[1, 0]
    return items.first()
            .mapIndexed { column, value -> value * getCofactor(0, column) }
            .sum()
}

private fun Matrix.getCofactor(row: Int, column: Int): Double {
    val minor = getMinor(row, column)
    val determinant = minor.getDeterminant()
    val sign = if ((row + column) % 2 == 0) 1 else -1
    return determinant * sign
}

private fun Matrix.getMinor(row: Int, column: Int) =
        Matrix(rows - 1, columns - 1) { r, c ->
            val shiftRow: (Int) -> Int = { if (it < row) it else it + 1 }
            val shiftColumn: (Int) -> Int = { if (it < column) it else it + 1 }
            this[r.let(shiftRow), c.let(shiftColumn)]
        }

fun Matrix.inverse(): Matrix =
        (1 / getDeterminant()) *
                (Matrix(rows, columns) { row, column ->
                    getCofactor(row, column)
                }.transpose())
