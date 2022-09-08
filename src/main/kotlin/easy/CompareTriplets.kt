package easy

class CompareTriplets {

    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

        val finalScoreArray : Array<Int> = arrayOf(0,0)

        for (i in a.indices) {
            if (a[i] > b[i]) {
                finalScoreArray[0]++
            } else if (a[i] < b[i]) {
                finalScoreArray[1]++
            }
        }

        return finalScoreArray
    }
}

fun main() {
    val ct: CompareTriplets = CompareTriplets()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = ct.compareTriplets(a, b)

    println(result.joinToString(" "))
}