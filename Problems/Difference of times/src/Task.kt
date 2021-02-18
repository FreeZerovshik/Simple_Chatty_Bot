import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
//    println("Please enter first period:")
    val h1 = scanner.nextInt()
    val m1 = scanner.nextInt()
    val s1 = scanner.nextInt()
//    println("Please enter second period:")
    val h2 = scanner.nextInt()
    val m2 = scanner.nextInt()
    val s2 = scanner.nextInt()

    val period1 = (h1*60*60) + (m1*60) + s1
    val period2 = (h2*60*60) + (m2*60) + s2

    println(period2-period1)
}