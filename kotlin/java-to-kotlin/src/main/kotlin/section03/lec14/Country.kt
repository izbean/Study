package section03.lec14

fun main() {

}

fun handlerCountry(country: Country) {
    when (country) {
        Country.KOREA -> println()
        Country.AMERICA -> println()
    }
}

enum class Country(
    val code: String
) {

    KOREA("KO"),
    AMERICA("US")

}