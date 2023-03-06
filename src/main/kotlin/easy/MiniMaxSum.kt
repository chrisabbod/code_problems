package easy

//Optimal solution
class MiniMaxSum {
    companion object {
        fun miniMaxSum(arr: Array<Int>) {
            var set = arr.map { it.toLong() }
            val total = set.sum()
            var min: Long = total
            var max: Long = 0
            arr.forEach {
                var netValue = total - it
                if (netValue < min) min = netValue
                if (netValue > max) max = netValue
            }
            println("$min $max")
        }
    }
}

fun main(args: Array<String>) {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    MiniMaxSum.miniMaxSum(arr)
}

