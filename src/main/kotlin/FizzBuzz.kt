class FizzBuzz {

    fun fizzBuzz(num: Int) {
        for (i in 1..num) {
            //If 3 & 5 are multiples of the current number
            if (i % 3 == 0 && i % 5 == 0) {
                println("FizzBuzz")
            }
        }
    }

}

fun main() {
    val userInput = readLine()
    println("$userInput")
}