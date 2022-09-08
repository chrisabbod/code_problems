package easy

class Staircase {

    fun staircase(n: Int) {

        for (value in n downTo 1) {
            repeat(value - 1) {
                print(" ")
            }

            repeat(n - (value - 1)) {
                print("#")
            }
            println()
        }

    }
}

fun main() {

    val sc = Staircase()
    val n = readLine()!!.trim().toInt()
    sc.staircase(n)
}