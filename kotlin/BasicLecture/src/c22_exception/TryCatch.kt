package c22_exception

fun main() {
    try {
        val arr = arrayOf(1, 2)
        arr[100] = 1234
    } catch (ex: Exception) {
        println("에러가 발생했습니다.")
        println("예외 메세지: ${ex.message}")
    }
}