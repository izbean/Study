package c17_function

fun main() {
    println(sumAll1(3, 5))
    println(sumAll2(3, 5))
}

fun sumAll1(first: Int, second: Int) = first + second

fun sumAll2(first: Int, second: Int): Int {
    return first + second
}