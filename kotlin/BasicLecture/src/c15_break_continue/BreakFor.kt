package c15_break_continue

fun main() {
    for (i in 0 until 5) {
        if (i >= 0) {
            break
            println("이 라인이 실행될까요?")
        }
    }
}