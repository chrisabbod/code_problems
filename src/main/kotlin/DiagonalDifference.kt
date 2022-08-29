import java.lang.Math.abs

class DiagonalDifference {

    fun diagonalDifference(arr: Array<Array<Int>>): Int {

        val matrixSize = arr.size
        var leftToRightDiagonalSum = 0
        var rightToLeftDiagonalSum = 0

        //Find first diagonal (top left to bottom right) and sum result
        for ((j, i) in (0 until matrixSize).withIndex()) {
            leftToRightDiagonalSum += arr[i][j]
        }

        //Find second diagonal (top right to bottom left) and sum result
        for ((j, i) in ((matrixSize - 1) downTo 0).withIndex()) {
            rightToLeftDiagonalSum += arr[j][i]
        }

        //Take absolute value and return
        return kotlin.math.abs(leftToRightDiagonalSum - rightToLeftDiagonalSum)

    }

}

fun main() {

    val dd = DiagonalDifference()

    //val n = readLine()!!.trim().toInt()

    //val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

//    for (i in 0 until n) {
//        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//    }

    val arr: Array<Array<Int>> =
        arrayOf(
            arrayOf(11, 2, 4),
            arrayOf(4, 5, 6),
            arrayOf(10, 8, -12)
        )

    val result = dd.diagonalDifference(arr)

    println(result)
}

