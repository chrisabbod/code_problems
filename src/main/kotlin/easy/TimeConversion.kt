package easy

class TimeConversion {
    companion object {
        fun timeConversion(s: String): String {
            val splitString = s.split(":")
            var hour = splitString[0].toInt()
            val minute = splitString[1]
            val second = splitString[2].substring(0, 2)
            val amPm = splitString[2].substring(2, 4)

            if (amPm == "AM" && hour == 12) { hour = 0 }
            if (amPm == "PM" && hour != 12) { hour += 12 }

            return if (hour < 10) { "0$hour:$minute:$second"} else { "$hour:$minute:$second" }
        }
    }
}

fun main() {
    val s = readLine()!!
    val result = TimeConversion.timeConversion(s)
    println(result)
}