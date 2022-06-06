package section04.lec15

fun main() {

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    printNumbers(emptyList())

    println(numbers[0])

    for (number in numbers)
        println(number)

    for ((index, number) in numbers.withIndex())
        println("$index, $number")

    // 가변 리스트
    val numbersMutableList = mutableListOf(100)


}

private fun printNumbers(numbers: List<Int>) {

}