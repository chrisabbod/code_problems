package easy

class BirthdayCakeCandles {
    companion object {
        fun birthdayCakeCandles(candles: Array<Int>): Int {
            val tallest = candles.max()!!
            return candles.count { it == tallest }
        }
    }
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()
    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val result = BirthdayCakeCandles.birthdayCakeCandles(candles)

    println(result)
}