package section02.lec05

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score in 0..100) {
        throw IllegalArgumentException("score 의 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 80) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
//    return when (score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "D"
//    }
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun judgeNumber(number: Int): String {
    return when (number) {
        -1, 1, 0 -> "1"
        else -> "2"
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("1")
        number % 2 == 0 -> println("2")
        else -> println("3")
    }
}