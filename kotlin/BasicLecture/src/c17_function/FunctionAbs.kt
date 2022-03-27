package c17_function

fun main() {
    var number = -21
    var absNumber = abs(number)

    println("${number}의 절댓값: ${absNumber}")
}

//[?] 절댓값을 구하는 함수 만들기
fun abs(number: Int): Int {
    return if (number < 0) -number else number
}
