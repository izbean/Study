package c11_if_else

fun main() {
    var number1 = 10
    var number2 = 20

    if (number1 > number2) {
        println("number1이 더 큽니다.")
    } else if (number1 < number2) {
        println("number2가 더 큽니다.")
    } else {
        println("둘 다 같습니다.")
    }
}