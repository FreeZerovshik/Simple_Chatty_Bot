import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var m = Int.MIN_VALUE

    repeat(n) {
        val next = scanner.next().toInt()
        if (next < m) {
            println("NO")
            return
        } else {
            m = next
        }
    }

    println("YES")

}