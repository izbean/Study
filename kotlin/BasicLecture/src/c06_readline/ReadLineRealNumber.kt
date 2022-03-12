package c06_readline

fun main() {
    print("몸무게를 입력하세요. => ")
    val input = readLine() ?: ""
    val weight: Double = input.toDoubleOrNull() ?: 0.0
    println("당신의 몸무게는 ${weight}입니다.")
}