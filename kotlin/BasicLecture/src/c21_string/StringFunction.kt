package c21_string

fun main() {
    val message = "hello, World!"

    println(message.length)
    println(message.uppercase())
    println(message.lowercase())

    println(message
            .replace("hello", "안녕하세요")
            .replace("World", "세계"))

    println("안녕".plus("").plus("하세요."))
}