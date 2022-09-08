package easy

class PlusMinus {

    fun plusMinus(arr: Array<Int>) {

        var positive = 0.0
        var negative = 0.0
        var zero = 0.0

        arr.forEach {
            if (it > 0) {
                positive++
            } else if (it < 0) {
                negative++
            } else {
                zero++
            }
        }

        println("%,.6f".format(positive / arr.size))
        println("%,.6f".format(negative / arr.size))
        println("%,.6f".format(zero / arr.size))

    }

}

fun main() {
    val pm = PlusMinus()

    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    pm.plusMinus(arr)
}