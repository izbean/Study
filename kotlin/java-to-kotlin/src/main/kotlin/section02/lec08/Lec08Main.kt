package section02.lec08

fun main() {
    repeat("Hello World", 4, true)
    repeat("Hello World", 5)
    repeat("Hello World", useNewLine = false)

    // named Arguments
    printNameAndGender(gender = "여", name = "남")

    // 가변 인자
    printAll(*arrayOf("1", "2"))
    printAll("1", "2")
}

fun max(a: Int, b: Int) = if (a > b) a else b

// default Parameter
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine)
            println(str)
        else
            print(str)
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}