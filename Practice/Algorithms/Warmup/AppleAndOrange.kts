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

// Complete the countApplesAndOranges function below.
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var apple_cnt = 0;
    var orange_cnt = 0;
    for (apple in apples) if (a + apple in s..t) {
        apple_cnt++;
    }

    for (orange in oranges) if (b + orange in s..t) {
        orange_cnt++;
    }

    println(apple_cnt);
    println(orange_cnt);
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
