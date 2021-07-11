import java.lang.Integer.max
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'alternate' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun alternate(s: String): Int {
    var result = 0
    for (a in 'a'..'z') {
        for (b in a + 1..'z') {
            var pv = 'A'
            var isSuccess = true
            var num = 0
            outer@   for (ps in s) {
                if (ps == a || ps == b) {
//                    print("$pv:$ps\n")
                    if (pv != ps) {
                        num++
                        pv = ps
                    } else {
                        isSuccess = false
                        break@outer
                    }
                }
            }
            if(isSuccess){
                result = max(result,num)
            }
        }
    }
    if(result==1){
        result = 0
    }
    return result
}

fun main(args: Array<String>) {
    val l = readLine()!!.trim().toInt()

    val s = readLine()!!

    val result = alternate(s)

    println(result)
}
/*
10
beabeefeab
 */