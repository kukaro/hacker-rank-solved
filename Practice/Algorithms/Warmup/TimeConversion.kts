import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    var hour = s.substring(0, 2).toInt()
    val minute = s.substring(3, 5)
    val second = s.substring(6, 8)
    val twelveHour = s.substring(8, 10)
    if (twelveHour == "PM") {
        if (hour != 12) {
            hour += 12
        }
    } else {
        if (hour == 12) {
            hour = 0
        }
    }
    return String.format("%02d:%s:%s", hour, minute, second);
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
