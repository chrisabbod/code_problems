package easy

import kotlin.math.abs

class TaskTwo {

    fun solution(A: IntArray, B: IntArray, X: Int, Y: Int): Int {

        //Get absolute value of icons
        val iconOne = abs(A[0] + B[0])
        val iconTwo = abs(A[1] + B[1])
        val iconThree = abs(A[2] + B[2])

        //Get absolute value of tap
        val tapLocation = abs(X + Y)

        //Max distance to click icon
        val maxDistance = 20

        val iconOneTapDistance = (abs(iconOne - tapLocation))
        val iconTwoTapDistance = (abs(iconTwo - tapLocation))
        val iconThreeTapDistance = (abs(iconThree - tapLocation))

        return if (iconOneTapDistance <= maxDistance ) {
            0
        } else if (iconTwoTapDistance <= maxDistance) {
            1
        } else if (iconThreeTapDistance <= maxDistance) {
            2
        } else {
            -1
        }
    }

}

fun main() {

    val t2 = TaskTwo()

    val xAxisIcon = IntArray(3)
    xAxisIcon[0] = 100
    xAxisIcon[1] = 200
    xAxisIcon[2] = 100
    val yAxisIcon = IntArray(3)
    yAxisIcon[0] = 50
    yAxisIcon[1] = 100
    yAxisIcon[2] = 100

    val xPositionTap = 100
    val yPositionTap = 100

    val iconTapped = t2.solution(xAxisIcon, yAxisIcon, xPositionTap, yPositionTap)
    println("Icon Tapped: $iconTapped")
}