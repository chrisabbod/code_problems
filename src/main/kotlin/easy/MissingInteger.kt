package easy

class MissingInteger {

    fun solution(A: IntArray): Int {

        var numToReturn = 1
        var previousNum: Int

        for (i in A.indices) {
            previousNum = numToReturn

            for (j in A.indices) {
                if (numToReturn == A[j]) {
                    numToReturn++
                    continue
                }
            }

            if (numToReturn == previousNum) {
                break
            }
        }

        return numToReturn
    }
}

fun main() {

    val s = MissingInteger()
    val intArray = IntArray(6)

    intArray[0] = 1
    intArray[1] = 3
    intArray[2] = 6
    intArray[3] = 4
    intArray[4] = 1
    intArray[5] = 2

    val smallestInt = s.solution(intArray)
    println(smallestInt)
}