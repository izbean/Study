package c15_break_continue

fun main() {
    val goal = 22
    var sum = 0

    var i = 1
    while (i <= 10) {
        sum += i

        if (sum >= goal)
            break

        i++
    }

    println("1부터 ${i}까지의 합은 ${sum}이고, 목표치 ${goal}이상을 당성했습니다.")
}