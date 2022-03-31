package c25_null

fun main() {
    val a = null
    val number = a?.toString() ?: 1234
    println(number)

    val b: String? = "a"
    println(b!!.uppercase())
}