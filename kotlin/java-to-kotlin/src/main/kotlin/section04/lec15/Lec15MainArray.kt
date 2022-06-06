package section04.lec15

fun main() {

    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("$i:${array[i]}")
    }

    for ((index, value) in array.withIndex()) {
        println("$index, $value")
    }

    array.plus(300)

}