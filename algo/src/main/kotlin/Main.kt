import kotlin.io.*
import kotlin.text.*

fun dayOfProgrammer(year: Int): String {
    return if (year == 1918) {
        "26.09.$year"
    } else {
        return if (
                when {
                    year % 400 == 0 -> {
                        true
                    }
                    year % 100 == 0 && year >= 1919 -> {
                        false
                    }
                    year % 4 == 0 -> {
                        true
                    }
                    else -> {
                        false
                    }
                }
        ) {
            "12.09.$year"
        } else {
            "13.09.$year"
        }
    }

}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
