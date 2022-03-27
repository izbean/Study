package c17_function

fun main() {
    multi()
    multi("반갑습니다.")
    multi("또 만나요.", 3)
}

fun multi() {
    println("안녕하세요.")
}

fun multi(message: String) {
    println(message)
}

fun multi(message: String, count: Int) {
    for (i in 1..count) {
        println(message)
    }
}