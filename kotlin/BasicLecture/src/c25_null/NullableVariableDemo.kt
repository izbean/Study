package c25_null

fun main() {
    var id: Int? = null
    var name: String? = null
    var age: Int = 3

    println("$id - $name - $age")

    var what: String? = null

    var result1 = what?.uppercase()
    println("[2] $result1")

    var result2 = what ?: "null String"
    println("[3] $result2")

    var result3 = what?.uppercase() ?: "Hello"
    println("[4] $result3")

    what = "World"
    var result4 = what?.uppercase() ?: "_______"
    println("[5] $result4")
}