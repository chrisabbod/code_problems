class Fibonacci {

    fun calculateSequence(num: Int) {
        val firstElement = 0
        val secondElement = 1
        var nextDigit: Int

        val fullSequence = mutableListOf(firstElement, secondElement)

        for (i in 2 until num) {

            nextDigit = fullSequence[i - 1] + fullSequence[i - 2]
            fullSequence.add(nextDigit)
        }

        println("The first $num digits of the Fibonacci Sequence are: $fullSequence")
    }

}

fun main() {

    var fib = Fibonacci()

    fib.calculateSequence(10)
}