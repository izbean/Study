package section03.lec12

fun main() {

}

class Person private constructor(
    var name: String,
    var age: Int,
) {
    companion object Factory : Log {
        private const val MIN_GE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_GE)
        }

        override fun log() {
            TODO("Not yet implemented")
        }
    }

}

object Singleton {
    var a: Int = 0
}