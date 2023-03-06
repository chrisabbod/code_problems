package easy

class PlusMinus {
    companion object {
        fun plusMinus(arr: Array<Int>) {
            println(arr.filter { it > 0 }.size / arr.size.toDouble())
            println(arr.filter { it < 0 }.size / arr.size.toDouble())
            println(arr.filter { it == 0 }.size / arr.size.toDouble())
        }
    }
}

fun main() {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    PlusMinus.plusMinus(arr)
}