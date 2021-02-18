import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var m = 0

    repeat(n) {
        val next = scanner.nextInt()
        if (next % 4 == 0 ) {
            if (m < next) m = next
        }
    }

    println(m)
}