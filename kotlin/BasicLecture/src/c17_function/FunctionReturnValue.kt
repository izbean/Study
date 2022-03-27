package c17_function

fun main() {
    var r = squareFunction(2)
    println(r)
}

fun squareFunction(x: Int): Int {
    return x * x
}