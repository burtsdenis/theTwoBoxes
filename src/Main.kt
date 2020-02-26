import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {

    val firstBox = Array(3) { scanner.nextInt() }
    val secondBox = Array(3) { scanner.nextInt() }

    firstBox.sort()
    secondBox.sort()

    if (firstBox[0] == secondBox[0] && firstBox[1] == secondBox[1] && firstBox[2] == secondBox[2]) {
        println("Box 1 = Box 2")
        return
    } else if (firstBox[0] >= secondBox[0] && firstBox[1] >= secondBox[1] && firstBox[2] >= secondBox[2]) {
        println("Box 1 > Box 2")
        return
    } else if (firstBox[0] <= secondBox[0] && firstBox[1] <= secondBox[1] && firstBox[2] <= secondBox[2]) {
        println("Box 1 < Box 2")
        return
    } else {
        println("Incomparable")
    }
}
