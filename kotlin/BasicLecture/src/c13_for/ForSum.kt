package c13_for

fun main() {
    var n = 3
    var sum = 0

    for (i in 1..n)
        sum += i

    println("1부터 ${n}까지의 합: $sum")
}