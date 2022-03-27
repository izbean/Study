package c16_array

fun main() {
    var languages = arrayOf("Korean", "English", "Spanish")
    languages[1] = "영어"
    for (language in languages)
        println(language)

    var numbers: IntArray = intArrayOf(1, 2, 3)
    for (n in numbers)
        println(n)

    var floats = floatArrayOf(1.1f, 2.2f, 3.3f, 4.4f)
    for (f in floats)
        println(f)

    var favorites = arrayListOf("C#", "Java", "Kotlin")
    for (fav in favorites)
        println(fav)
}