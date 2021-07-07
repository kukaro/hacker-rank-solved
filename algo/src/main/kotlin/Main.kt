import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'weightedUniformStrings' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER_ARRAY queries
 */

fun weightedUniformStrings(s: String, queries: Array<Int>): ArrayList<String> {
    var mp = HashMap<Int, Boolean>()
    var cnt = 0
    var pv = 'A'
    var ret = ArrayList<String>()
    for (ps in s) {
        if (pv == ps) {
            cnt += ps.toInt() - 'a'.toInt() + 1
            mp[cnt] = true
        } else {
            mp[cnt] = true
            cnt = ps.toInt() - 'a'.toInt() + 1
            mp[cnt] = true
        }
        pv = ps
    }
    for (query in queries) {
        if (mp[query] != null) {
            ret.add("Yes")
        } else {
            ret.add("No")
        }
    }
    return ret
}

fun main(args: Array<String>) {
    val s = readLine()!!
    val queriesCount = readLine()!!.trim().toInt()

    val queries = Array<Int>(queriesCount, { 0 })
    for (i in 0 until queriesCount) {
        val queriesItem = readLine()!!.trim().toInt()
        queries[i] = queriesItem
    }

    val result = weightedUniformStrings(s, queries)

    println(result.joinToString("\n"))
}
