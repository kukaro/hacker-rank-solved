import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var sum = 0
    var result = 0
    for (i in s.indices) {
        if (i < m) {
            sum += s[i]
            if (i == m - 1 && sum == d) {
                result++
            }
        } else {
            sum += s[i] - s[i - m]
            if (sum == d) {
                result++
            }
        }
    }
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
