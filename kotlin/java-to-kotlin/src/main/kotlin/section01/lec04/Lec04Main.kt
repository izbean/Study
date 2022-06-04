package section01.lec04

fun main() {
//    val money1 = JavaMoney(2_000L)
//    val money2 = JavaMoney(1_000L)
//    val money3 = money1
//    val money4 = JavaMoney(1_000L)
//
//    if (money1 > money2) {
//        println("머니 1이 머니 2보다 큽니다.")
//    }
//
//    if (money1 === money3) {
//        println("머니 1과 머니 3는 동일 객체 입니다.")
//    }
//
//    if (money2 == money4) {
//        println("머니 1과 머니 4는 동일 값 입니다.")
//    }

    if (fun1() || fun2()) {
        println("본문")
    }

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}