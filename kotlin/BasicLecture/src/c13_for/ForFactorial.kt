package c13_for

fun main() {
    var n = 4
    var fact = 0

    for (i in 1..n) {
        print("${i}! -> ")
        fact = 1
        for (j in 1..i) {
            fact *= j
        }
        println("$fact")
    }
}