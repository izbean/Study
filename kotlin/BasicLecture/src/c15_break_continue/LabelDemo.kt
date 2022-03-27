package c15_break_continue

fun main() {
    var count = 1
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            println("안녕")
            if (count++ >= 5) {
                break@loop
            }
        }
    }
    println()
}