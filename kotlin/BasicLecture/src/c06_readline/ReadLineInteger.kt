package c06_readline

fun main() {
    print("정수를 입력하세요. => ")
    val tempInt = readLine() ?: ""
    val intAge: Int = tempInt.toIntOrNull() ?: 0
    println("당신의 나이는 ${intAge}입니다.")
}