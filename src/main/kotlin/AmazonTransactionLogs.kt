class AmazonTransactionLogs {

    fun processLogs(logs: Array<String>, threshold: Int): Array<String> {

        for (log in logs) {
            print("Logs: $log")
        }

        return arrayOf()
    }

}

fun main() {

    val atl = AmazonTransactionLogs()

    val logsCount = readLine()!!.trim().toInt()

    val logs = Array<String>(logsCount, { "" })
    for (i in 0 until logsCount) {
        val logsItem = readLine()!!
        logs[i] = logsItem
    }

    val threshold = readLine()!!.trim().toInt()
//    val logs = arrayOf("1", "2", "50","1", "7", "70",
//        "1", "3", "20","2", "2", "17")
//    val threshold = 2
    val result = atl.processLogs(logs, threshold)

    println(result.joinToString("\n"))
}