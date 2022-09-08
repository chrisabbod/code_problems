package easy

class LonelyInteger {

    fun lonelyinteger(a: Array<Int>): Int {

        for (i in a) {
            var uniqueNum = 0

            for (j in a) {
                if (i == j) {
                    uniqueNum++

                    if (uniqueNum > 1) {
                        continue
                    }
                }
            }

            if (uniqueNum == 1) {
                return i
            }

        }

        for (i in a) {
            print("$i ")
        }

        return 0
    }
}

fun main() {

    val li = LonelyInteger()

    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = li.lonelyinteger(a)

    println(result)
}