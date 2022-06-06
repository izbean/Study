package section04.lec16

fun main() {
    println("abc".lastChar())
}

// String 클래스의 확장 함수
// fun 확장하려는클래스.함수이름(파라미터): 리턴타입
fun String.lastChar(): Char {
    return this[this.length - 1]
}