package c09_relational_logical

fun main() {
    var i = 3
    var j = 5
    var r = false

    r = (i == 3) && (j != 3)

    println(r)

    r = (i != 3) || (j == 3)

    println(r)

    r = (i >= 5)

    println(!r)
}