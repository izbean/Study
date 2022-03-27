package c15_break_continue

fun main() {
    var number = 0

    // 무한루프
    while (true) {
        println("${++number}")

        if (number >= 5) {
            break // break 문으로 무한 루프 빠져 나오기
        }
    }
}