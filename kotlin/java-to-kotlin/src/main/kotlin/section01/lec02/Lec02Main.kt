package section01.lec02

import section01.lec01.Person

// Kotlin 에서 null 을 다루는 방법
fun main() {
    // Safe Call
    // str?.length <-- null 이면 실행하지 않는다.

    // Elvis 연산자
    // str?.length ?: 0 <-- str 이 null 이라면 0 기본 값을 주입

    // str!!.startsWith("A") <-- !! 는 절때 변수가 null 이 주입 될 수 없다는걸 의미
    // 만약 null 이 들어갔다면 NPE 발생

    val person = Person("공부하는 개발자")

}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null 이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWith3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}