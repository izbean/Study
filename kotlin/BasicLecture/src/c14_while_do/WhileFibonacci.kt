package c14_while_do

fun main() {
    var first = 0
    var second = 1

    while (second <= 20) {
        print("$second \t")
        val temp = first + second
        first = second
        second = temp
    }
    println()
}