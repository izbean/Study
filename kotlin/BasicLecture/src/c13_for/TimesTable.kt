package c13_for

fun main() {
    for (i in 2..9) {
        print("${String.format("%5s", i)}단")
    }
    println()

    for (i in 1..9) {
        for (j in 2..9) {
            print("$j*$i=${String.format("%2s", (j * i))} ")
        }
        println()
    }
}