package c23_collection

fun main() {
    val colors = arrayOf("red", "green", "blue", 1, 2, 3, 4L, true, 3.14)
    println(colors.size)

    for (color in colors)
        println("$color\t")

    colors.forEach {
        println(it)
    }

    colors.forEach {
        color -> println(color)
    }

    colors.forEachIndexed { index, color ->
        println("$index - $color")
    }

}