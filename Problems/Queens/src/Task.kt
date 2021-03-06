import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    if (x1 == x2 || y1 == y2) {
        println("YES")
    } else if (x1 == x2 || y1 == y2) {
        println("YES")
    } else if (abs(x1 - x2) == abs(y1 - y2)) {
        println("YES")
    } else {
        println("NO")
    }
}