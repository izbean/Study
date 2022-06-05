package section03.lec14

fun main() {

}

private fun handleCar(car: HyundaiCar) {
    when(car) {
        is Avante -> ""
        is Sonata -> ""
        is Grandeur -> ""
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandeur : HyundaiCar("그랜저", 3_000L)