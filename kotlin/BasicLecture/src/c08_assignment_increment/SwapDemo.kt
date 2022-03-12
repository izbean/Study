package c08_assignment_increment

fun main() {
    var i = 100
    var j = 200

    println("처음 $i, $j")

    // 변숫값 서로 바꾸기
    var temp = i
    i = j
    j = temp

    println("변경 $i, $j")
}