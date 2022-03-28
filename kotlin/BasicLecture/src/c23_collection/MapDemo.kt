package c23_collection

fun main() {
    val map = mapOf(1 to "하나", 2 to "둘", 3 to "셋")
    map.forEach { (key, value) ->
        println("$key - $value")
    }

    val mutableMap = mutableMapOf("A" to "AA", "B" to "BB")
    mutableMap["C"] = "CC"
    mutableMap.forEach { (key, value) ->
        println("$key - $value")
    }
}