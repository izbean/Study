package c24_generic

fun main() {
    var numbers = listOf<Int>(1, 2, 3)
    println(numbers[0])
    numbers.forEach {
        println(it)
    }

    var colors = listOf<String>("red", "green", "blue")
    colors.forEach {
        println(it)
    }

    var favorites = mutableListOf<String>("Kotlin", "C#")
    favorites.add("Java")
    favorites.removeAt(0)
    favorites.forEach {
        println(it)
    }

    var techs = mutableListOf<Any>("Kotlin", 1.4)
    techs.forEach {
        println(it)
    }

}