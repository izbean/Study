package c14_while_do

fun main() {
    var sum: Int = 0

    var i = 1
    do {
        if ((i % 3 == 0) and (i % 4 == 0))
            sum += i
        i++
    } while (i <= 100)

    println(sum)
}