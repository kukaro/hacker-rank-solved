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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    val n = arr.size;
    var positive = 0.0;
    var negative = 0.0;
    var zero = 0.0;
    for (atom in arr) {
        if (atom > 0) {
            positive++;
        } else if (atom < 0) {
            negative++;
        } else {
            zero++;
        }
    }
    println(String.format("%.6f", positive / n));
    println(String.format("%.6f", negative / n));
    println(String.format("%.6f", zero / n));
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
