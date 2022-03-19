package c14_while_do

fun main() {
    var sum = 0

    var i = 1
    while (i <= 100) {
        if (i % 2 == 0)
            sum += i
        i++;
    }

    println("$sum");
}