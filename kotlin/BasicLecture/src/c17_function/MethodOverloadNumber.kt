// 메서드(함수) 오버로드(다중 정의, 여러 번 정의)
package c17_function

fun main() {
    getNumber(123)
    getNumber(123L)
}

fun getNumber(number: Int) {
    println("Int: $number")
}

fun getNumber(number: Long) {
    println("Long: $number")
}