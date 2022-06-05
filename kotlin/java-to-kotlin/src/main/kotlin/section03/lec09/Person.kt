package section03.lec09

fun main() {
    val person = Person("s", 10)
    println(person.name)
    person.age = 20
    println(person.age)

    val javaPerson = JavaPerson("name", 200)


}

class Person(
    // 필드만 만들면 getter, setter 를 자동으로 만들어준다.
    name: String,
    var age: Int
) {

    // 주 생성자에서 받은 name 을 불변 property 에 대입
    // field 를 사용하는 이유: getter 를 부르면 name 을 부르는 무한 루프가 발생한다.
    // 자기 자신을 가리키는 field 에약어를 사용한다.
    // backing field
//    val name = name
//    get() = field.uppercase()

//    fun getUpperCaseName(): String {
//        return this.name.uppercase()
//    }
//
//    val upperCaseName: String
//    get() = this.name.uppercase()

    var name = name
        set(value) {
            field = value.uppercase()
        }

    // 생성자가 생성되는 시점에 호출된다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없습니다.")
        }
        println("첫 번째 초기화 블럭")
    }

    // constructor 키워드를 통해 새로운 생성자를 생성한다.
    // 부 생성자 있을 수도 있고 없을 수도 있다.
    // 최종적으로 this 로 호출해야한다. body 를 가질 수 있다.
    constructor(name: String) : this(name, 1) {
        println("첫 번째 부 생성자")
    }

    constructor() : this("홍길동") {
        println("두 번째 부 생성자")
    }

//    fun isAdult: Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20
}

