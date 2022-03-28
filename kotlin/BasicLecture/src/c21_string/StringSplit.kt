package c21_string

fun main() {
    val src = "Red,Green,Blue"
    val colors = src.split(",")
    for (color in colors)
        println(color)
}