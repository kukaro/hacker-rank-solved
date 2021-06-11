import kotlin.io.*
import kotlin.text.*

fun superReducedString(s: String): String {
    var pv = 'A'
    var result = s
    var final = ""
    var cnt = 0
    var isChanged = false
    var ts = s
    while (!isChanged) {
        isChanged = false
        pv = 'A'
        result = ""
        cnt = 0
        for (ps in ts) {
            if (ps != pv) {
                if (cnt % 2 != 0) {
                    result += pv
                }
                cnt = 0
            }
            cnt++
            pv = ps
        }
        if (cnt % 2 != 0) {
            result += pv
        }
        if (final == result) {
            isChanged = true
        }
        final = result
//        println(result)
        ts = result
    }
    if (final == "") {
        final = "Empty String"
    }
    return final
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = superReducedString(s)

    println(result)
}
