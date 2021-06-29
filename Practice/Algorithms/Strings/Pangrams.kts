import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'pangrams' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun pangrams(s: String): String {
    val map = HashMap<Char, Boolean>()
    var result = 0
    for (ch in 'a'..'z') {
        map[ch] = false
    }
    for (ch in s) {
        if(ch.toLowerCase() in 'a'..'z'){
            map[ch.toLowerCase()] = true
        }
    }
    for (atom in map) {
        if (atom.value) {
            result++
        }
    }
    return if (result == 26) {
        "pangram"
    } else {
        "not pangram"
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = pangrams(s)

    println(result)
}
