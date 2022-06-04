package section01.lec03

import section01.lec01.Person

fun main() {
    // Any
    // Java 의 Object 역할 (모든 객체의 최상위 타입)
    // 모든 Primitive Type 의 최상위 타입도 Any 이다.
    // 코틀린에서는 선언된 기본값을 보고 타입을 추론한다.
    val number1 = 1     // Int
    val number2 = 1L    // Long
    val number3 = 0.0f  // float
    val number4 = 0.0   // double

    val number5 = 4
    // Type miss match
    // val number2: Long = number1
    val number6: Long = number5.toLong()

    // Kotlin 에서 타입 변환시 to{} 메서드를 통해 변경해야한다.

    val person = Person("강병헌", 26)
    println("이름: ${person.name}, 나이: ${person.age}")

    """
        1
        2
        3
        5
        6
        
    """.trimIndent()

    val str = "ABC"
    println(str[1])
}

// Smart 캐스팅
fun printAgeIfPerson(obj: Any?) {
//    if (obj is Person) {
//    if (obj !is Person) {
//        println(obj.age)
//    }

//    val person = obj as Person
    val person = obj as? Person
    println(person?.age)
}