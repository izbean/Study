package c13_for

fun main() {
    for (i in 1..5) {
        println("$i\t")
    }
    println()

    for (i in 1..5 step 2) {
        print("$i\t")
    }
    println()

    for (i in 5 downTo 1) {
        print("$i\t")
    }
    println()

    for (i in 5 downTo 1 step 2) {
        print("$i\t")
    }
    println()

    for (i in 1 until 5) {
        print("$i\t")
    }
    println()

    for (c in "HelloWorld")
        print("$c\t")
    println()
}