package section04.lec16

fun main() {
    3.add(4)

    3 add2 4 // infix
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}