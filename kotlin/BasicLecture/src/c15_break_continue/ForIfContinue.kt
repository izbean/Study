package c15_break_continue

fun main() {
    for (i in 1..5) {
        if (i % 2 == 0)
            continue

        println("$i")
    }
}