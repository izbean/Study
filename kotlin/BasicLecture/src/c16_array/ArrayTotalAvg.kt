package c16_array

fun main() {
    var kor = IntArray(3)

    kor[0] = 95
    kor[1] = 90
    kor[2] = 80

    var total = 0
    for (k in kor)
        total += k

    var avg: Double = total / kor.size.toDouble()

    println("총점: ${total}, 평균: ${String.format("%.2f", avg)}")
}