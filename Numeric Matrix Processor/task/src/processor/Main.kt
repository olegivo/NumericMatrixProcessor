package processor

import java.util.*

fun main() {
//    val a = Matrix.readFromInput()
    val scanner = Scanner(System.`in`)
//    val c = scanner.nextInt()
//    (a + b)?.print() ?: run { println("ERROR") }
//    (a * c).print()
    while (true) {
        println("""1. Add matrices
2. Multiply matrix to a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
6. Inverse matrix
0. Exit
Your choice: """)
        when (scanner.nextInt()) {
            1 -> {
                val a = inputMatrix("first")
                val b = inputMatrix("second")
                (a + b)?.print()
            }
            2 -> {
                val a = inputMatrix()
                val c = scanner.nextDouble()
                (a * c).print()
            }
            3 -> {
                val a = inputMatrix("first")
                val b = inputMatrix("second")
                (a * b)?.print()
            }
            4 -> {
                println("""1. Main diagonal
2. Side diagonal
3. Vertical line
4. Horizontal line""")
                val variant = TransposeVariant.getFromInput()
                inputMatrix().transpose(variant).print()
            }
            5 -> {
                val determinant = inputMatrix().getDeterminant()
                println("The result is:\n$determinant")
            }
            6 -> {
                val original = inputMatrix()
                original.inverse().also {
//                    (it * original)?.print()
//                    (original * it)?.print()
                }.print()
            }
            0 -> return
        }
    }
}

private fun inputMatrix(name: String? = null): Matrix =
        (name?.let { " $name" } ?: "")
                .let {
                    Matrix.readFromInput(
                            sizePrompt = "Enter size of$it matrix: ",
                            matrixPrompt = "Enter$it matrix:"
                    )
                }
