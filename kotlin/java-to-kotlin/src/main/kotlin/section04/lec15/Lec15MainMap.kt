package section04.lec15

fun main() {

    val oldMap = mutableMapOf<Int, String>()

    oldMap[1] = "string"

    mapOf(1 to "string", 2 to "string 2")

    for (key in oldMap.keys) {
        println("$key ${oldMap[key]}")
    }

    for ((key, value) in oldMap.entries) {
        println("$key $value")
    }

}