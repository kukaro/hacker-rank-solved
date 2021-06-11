import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'camelcase' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun camelcase(s: String): Int {
    var cnt = 1
    for (ch in s) {
        if (ch in 'A'..'Z') {
            cnt++
        }
    }
    return cnt
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = camelcase(s)

    println(result)
}
