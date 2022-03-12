package c07_operator

fun main() {
    var value: Int = 0

    value = 8
    value = +value
    println(value)

    value = -8
    value = +value
    println(value)

    value = -8
    value = -value
    println(value)

    value = 8
    value = -value
    println(value)
}