package c17_function

fun main() {
    println(getSum(3.0, 5.0))
    println(getSum(3.5, 3.4))
}

fun getSum(x: Double, y: Double): Double {
    return x + y
}