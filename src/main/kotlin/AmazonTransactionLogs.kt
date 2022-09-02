class AmazonTransactionLogs {

    fun processLogs(logs: Array<String>, threshold: Int): Array<String> {

        val users: MutableList<String> = mutableListOf()

        logs.forEach {
            val sender = it.split(" ")[0]
            val recipient = it.split(" ")[1]

            users.add(sender)

            if (sender != recipient)
                users.add(recipient)
        }

        users.sort()

        val output: MutableList<String> = mutableListOf()
        var count = 1
        for (i in 1 until users.size) {
            if (users[i] == users[i-1]) {
                count++
            } else {
                if (count >= threshold) {
                    output.add(users[i-1])
                }
                count = 1
            }
        }

        return output.toTypedArray() //Convert mutable list to Array<String>
    }
}

fun main() {

    val atl = AmazonTransactionLogs()

//    val logsCount = readLine()!!.trim().toInt()
//
//    val logs = Array<String>(logsCount, { "" })
//    for (i in 0 until logsCount) {
//        val logsItem = readLine()!!
//        logs[i] = logsItem
//    }

//    val threshold = readLine()!!.trim().toInt()

    val logs = arrayOf("1 2 50","1 7 70",
        "1 3 20","2 2 17")
    val threshold = 2
    val result = atl.processLogs(logs, threshold)

//    val logs = arrayOf("9 7 50", "22 7 20", "33 7 50", "22 7 30")
//    val threshold = 3
//    val result = atl.processLogs(logs, threshold)

    println(result.joinToString("\n"))
}