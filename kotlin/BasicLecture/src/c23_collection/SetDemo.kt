package c23_collection

fun main() {
    val numbers = setOf(1, 3, 3, 9)
    println("개수: ${numbers.size}")
    numbers.forEach {
        println(it)
    }

    if (numbers.contains(3)) {
        println("3 포함됨")
    }
}