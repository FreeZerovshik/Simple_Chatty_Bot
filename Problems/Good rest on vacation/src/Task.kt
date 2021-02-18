import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val period = scanner.next().toInt()
    val foodPerDay = scanner.next().toInt()
    val flightCoast = scanner.next().toInt()//one way
    val nightCoast = scanner.next().toInt()

    val fullCoast = (foodPerDay*period)+(flightCoast*2)+(nightCoast*(period-1))
    println(fullCoast)
}