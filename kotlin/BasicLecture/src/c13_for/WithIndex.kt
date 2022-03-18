package c13_for

fun main() {
    for ((index, value) in "Hello".withIndex()) {
        println("${index + 1} - $value")
    }
}