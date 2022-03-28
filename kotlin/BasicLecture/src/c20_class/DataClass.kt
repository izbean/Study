package c20_class

data class Customer(val id: Int, val name: String, val city: String)

fun main() {
    val customer = Customer(id = 1, name = "홍길동", city = "서울")
    println("${customer.id}, ${customer.name}, ${customer.city}")

    val customers = arrayOf(
            Customer(id = 1, name = "홍길동", city = "서울"),
            Customer(id = 2, name = "백두산", city = "평양")
    )

    for (cust in customers) {
        println("번호: ${cust.id}, 이름: ${cust.name}, 사는곳: ${cust.city}")
    }
}