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

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    val mn = arr.min()!!
    val mx = arr.max()!!
    var sum: Long = 0
    for (atom in arr) {
        sum += atom.toLong()
    }
    println(String.format("%d %d", sum - mx, sum - mn))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
