package section05.lec19

import section02.lec05.judgeNumber

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val person = Person("강병헌", 10)
    val (name, age) = person

    val numbers = listOf(1, 2, 3)

    run {
        numbers.forEach{
            if (it == 2) {
                return@run
            }
            println(it)
        }
    }

    run {
        numbers.forEach{
            if (it == 2) {
                return@forEach
            }
            println(it)
        }
    }

    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 3) {
                break@abc
            }
            println("$i $j")
        }
    }
}

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0 }
}

fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}