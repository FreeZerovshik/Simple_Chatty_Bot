import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val rees = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()

    val res = rees in 10..20 && !isWeekend || rees in 15..25 && isWeekend
    println(res)
}
