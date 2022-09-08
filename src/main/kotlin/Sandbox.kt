class Sandbox {

    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

        return arrayOf()
    }
}

fun main() {
    val ct: Sandbox = Sandbox()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = ct.compareTriplets(a, b)

    println(result.joinToString(" "))
}