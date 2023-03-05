package easy

//Optimal solution
class MiniMaxSum {
    companion object {
        fun miniMaxSum(arr: Array<Int>) {
            val set = arr.map { it.toLong() }
            val setTotal = set.sum()
            var min: Long = setTotal
            var max: Long = 0
            set.forEach { i : Long ->
                val setPartSum = setTotal - i
                if(setPartSum > max) max = setPartSum
                if(setPartSum < min) min = setPartSum
            }
            print("$min $max")
        }
    }
}

fun main(args: Array<String>) {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    MiniMaxSum.miniMaxSum(arr)
}

