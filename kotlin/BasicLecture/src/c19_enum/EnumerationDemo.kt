package c19_enum

enum class Priority {
    High,
    Normal,
    Low
}

enum class Animal {
    Mouse,
    Cow,
    Tiger,
    Chicken,
    Dog,
    Pig
}

fun main() {
    println("${Priority.High}, ${Priority.Normal}, ${Priority.Low}")

    val animal = Animal.Dog
    if (animal == Animal.Tiger)
        println("호랑이")
    else if (animal == Animal.Dog)
        println("개")
    else
        println("다른 동물")

    val who = Animal.Pig
    val result = when (who) {
        Animal.Dog -> "개"
        Animal.Cow -> "소"
        Animal.Pig -> "돼지"
        else -> "다른 동물"
    }

    println(result)

}