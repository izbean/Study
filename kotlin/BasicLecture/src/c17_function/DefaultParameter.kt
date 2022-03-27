package c17_function

fun main() {
    log("디버그") // [A] 두 번째 매개 변수 생략
    log("에러", 4)
}

fun log(message: String, level: Byte = 1) {
    println("$message, $level")
}