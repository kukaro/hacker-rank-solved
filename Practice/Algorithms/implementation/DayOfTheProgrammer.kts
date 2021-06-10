import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int): String {
    return if (year == 1918) {
        "26.09.$year"
    } else {
        return if (
                when {
                    year % 400 == 0 -> {
                        true
                    }
                    year % 100 == 0 && year >= 1919 -> {
                        false
                    }
                    year % 4 == 0 -> {
                        true
                    }
                    else -> {
                        false
                    }
                }
        ) {
            "12.09.$year"
        } else {
            "13.09.$year"
        }
    }

}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
