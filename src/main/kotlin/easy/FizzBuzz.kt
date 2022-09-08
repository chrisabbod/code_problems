package easy

class FizzBuzz {

    fun fizzBuzz(num: Int) {
        for (i in 1..num) {
            //If 3 & 5 are multiples of the current number
            if (i % 3 == 0 && i % 5 == 0) {
                println("FizzBuzz")
            } else if (i % 3 == 0) {
                println("Fizz")
            } else if (i % 5 == 0) {
                println("Buzz")
            } else {
                println(i)
            }
        }
    }

}

fun main() {
    val fb = FizzBuzz()
    print("Enter a number: ")
    val userInput = readLine()

    if (userInput != null) {
        fb.fizzBuzz(userInput.toInt())
    }
}