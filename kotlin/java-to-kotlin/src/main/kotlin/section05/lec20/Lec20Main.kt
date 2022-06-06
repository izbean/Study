package section05.lec20

import section05.lec19.Person

fun main() {

}

fun printPerson(person: Person?) {
    // let: scope function 의 한 종류
    // Safe Call 을 사용: person 이 아닐때 Let 을 사용하도록 설정
    person?.let {
        println(it.name)
        println(it.age)
    }
}