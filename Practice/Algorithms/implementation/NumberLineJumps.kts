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

// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    var x1 = x1
    var x2 = x2
    var v1 = v1
    var v2 = v2
    if (v1 > v2) {
        v1 = v2.also { v2 = v1 }
        x1 = x2.also { x2 = x1 }
    }
    return if (v1 == v2 || x1 < x2) {
        "NO"
    } else {
        while (x1 > x2) {
            x1 += v1
            x2 += v2
        }
        if (x1 == x2) {
            "YES"
        } else {
            "NO"
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
