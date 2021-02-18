import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1= scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()


    if ((x1 + 1 == x2 || Math.abs(x1 - 1) == x2) && (y1 + 2 == y2 || Math.abs(y1 - 2) == y2)) {
        println("YES")
    } else if ((x1 + 2 == x2 || Math.abs(x1 - 2) == x2) && (y1 + 1 == y2 || Math.abs(y1 - 1) == y2)) {
        println("YES")
    } else {
        println("NO")
    }

//    if (x1 + 2 == x2 && y1 + 1 == y2) {
//        println("YES")
//    } else if (x1 + 2 == x2 && y1 -1 == y2 ) {
//        println("YES")
//    } else if (x1 + 1 == x2 && y1 + 2 == y2 ) {
//        println("YES")
//    } else if (x1 + 1 == x2 && y1 - 2 == y2 ) {
//        println("YES")
//    } else if (x1 - 1 == x2 && y1 + 2 == y2 ) {
//        println("YES")
//    } else if (x1 - 1 == x2 && y1 - 2 == y2 ) {
//        println("YES")
//    } else if (x1 - 2 == x2 && y1 + 1 == y2 ) {
//        println("YES")
//    } else if (x1 - 2 == x2 && y1 - 1 == y2 ) {
//        println("YES")
//    } else {
//        println("NO")
//    }
}