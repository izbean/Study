package c07_operator

fun main() {
    var days = 29

    println("2월달은 " + days + "일입니다.")               // 암시적(Implicit)
    println("2월달은 " + days.toString() + "일입니다.")    // 명시적(Explicit)
    println("2월달은 ${days}일입니다.")                    // 템플릿 문자열, 문자열 보간법
}