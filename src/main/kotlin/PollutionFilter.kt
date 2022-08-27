class TaskThree {

    fun solution(A: IntArray): Int {

        var totalEmissions: Double
        var totalFilters = 0
        val factories: MutableList<Double> = mutableListOf()

        //Convert IntArray to list
        for (i in A.indices) {
            factories.add(A[i].toDouble())
        }

        //Get Total Emissions
        totalEmissions = A.sum().toDouble()

        //Get Target Emissions
        val targetEmissions: Double = totalEmissions / 2

        do {
            //Loop through and find the largest number
            var largestNum: Int = 0
            var largestNumIndex: Int = 0

            for (i in factories.indices) {
                largestNum = factories[i].toInt()

                for (j in factories.indices) {
                    if (factories[j] > largestNum) {
                        largestNum = factories[j].toInt()
                        largestNumIndex = j
                    }
                }
            }

            //Add filter to the largest pollution creator (divide by 2)
            val halvePollution: Double = (largestNum.toDouble() / 2)
            factories[largestNumIndex] = halvePollution

            totalFilters++
            totalEmissions = factories.sum()

        } while (targetEmissions < totalEmissions)

        return totalFilters
    }

}

fun main() {

    var t3 = TaskThree()
    val factories = IntArray(4)

    factories[0] = 5
    factories[1] = 19
    factories[2] = 8
    factories[3] = 1

    var filtersUsed = t3.solution(factories)
    println("Filters Used: $filtersUsed")
}