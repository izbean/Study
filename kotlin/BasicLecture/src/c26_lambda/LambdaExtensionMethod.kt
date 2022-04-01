package c26_lambda

fun main() {
    // 배열(컬렉션, 리스트)
    var numbers = arrayOf(1, 2, 3)

    var sum = numbers.sum()
    println(sum)

    var count = numbers.count()
    println(count)

    var average = numbers.average()
    println(average)

    var max = numbers.maxOrNull()
    println(max)

    var min = numbers.minOrNull()
    println(min)
}