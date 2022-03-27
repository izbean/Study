package c17_function

fun main() {
    var returnValue = getString()
    println(returnValue)
}

fun getString(): String {
    return "반환 값(Return Value)"
}