package c11_if_else

fun main() {
    var number = 1_234

    if (number == 1_234 && number >= 1_000) {
        println("맞습니다.")
    }

    if (number == 1_234 || number <= 1_000) {
        println("하나라도 참이면 참")
    }
}