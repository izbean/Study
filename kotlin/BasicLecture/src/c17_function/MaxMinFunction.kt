package c17_function

fun main() {
    println("큰 값: ${max(3, 5)}")
    println("작은 값: ${min(-3, -5)}")
}

fun max(x: Int, y: Int): Int {
    return if (x > y) x else y
}

fun min(x: Int, y: Int): Int {
    return if (x < y) x else y
}