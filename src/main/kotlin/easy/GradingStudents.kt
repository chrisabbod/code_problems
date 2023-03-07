package easy

class GradingStudents {

    //Grades are 0 - 100
    // < 40 is a failing grade
    //Rounding Rules:
    //1. Difference between the grade and next multiple of 5 is less than 3 = round grade up to next multiple of 5
    //2. Value of grade is less than 38, no rounding and fail
    companion object {
        fun gradingStudents(grades: Array<Int>): Array<Int> {

            for (index in grades.indices) {
                val numToAdd = (5 - (grades[index] % 5))
                val nearestMultipleOfFive = grades[index] + numToAdd
                val shouldRound = nearestMultipleOfFive - grades[index]

                if (grades[index] >= 38) {
                    if (shouldRound < 3) {
                        grades[index] = nearestMultipleOfFive
                    }
                }
            }

            return grades
        }
    }
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = GradingStudents.gradingStudents(grades)

    println(result.joinToString("\n"))
}