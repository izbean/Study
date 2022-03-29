package c24_generic

fun main() {
    val numbers = mutableListOf<Int>()
    numbers.add(1234)
    numbers.add(2345)
    for (num in numbers)
        println(num)
}