package section04.lec16

fun main() {
    3.add3(4)
}

inline fun Int.add3(other: Int): Int {
    return this + other
}