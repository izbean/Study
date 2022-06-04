package section01.lec01

fun main() {
    var number1: Long = 10L     // 1
    val number2 = 10L           // 2

    // 기본적으로 모든 변수를 null 을 넣을 수 없다 만약 넣으려면 ? 연산자를 사용해야한다
    // 내부적으로 primitiveType, referenceType 을 판단한다
    val number3: Long? = null

    val person = Person("강병헌")      // 4
}