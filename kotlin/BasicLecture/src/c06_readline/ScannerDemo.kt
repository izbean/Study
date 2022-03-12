package c06_readline

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("정수: ")
    val number = scanner.nextInt()

    print("실수: ")
    val realNumber = scanner.nextDouble()

    println("${number}-${realNumber}")
}