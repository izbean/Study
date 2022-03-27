package c16_array

fun main() {
    var numbers = arrayOf(3840, 2160)
    println("${numbers[0]} * ${numbers[1]}")

    var phones = arrayOf("112", "119")
    for (phone in phones) {
        println(phone)
    }
}