package c25_null

fun main() {
    var bln: Boolean? = null

    if (bln != null)
        println(bln)
    else
        println("널입니다.")
}