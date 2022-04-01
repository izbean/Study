package c26_lambda

fun main() {
    var numbers = arrayOf(1, 2, 3, 4, 5)

    // Filter
    var newNumber = numbers.filter {
        number -> number != 1
    }

    newNumber.forEach {
        println(it)
    }

    var asc = numbers.sortedArray()
    for (a in asc)
        print("$a\t")

    println()

    var desc1 = numbers.sortedArrayDescending()
    for (d in desc1)
        print("$d\t")

}