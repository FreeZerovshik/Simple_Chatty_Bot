import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var m = Int.MAX_VALUE


    repeat(n) {
        val next = scanner.next().toInt()
        if (next < m) m = next
    }

    println(m)
}