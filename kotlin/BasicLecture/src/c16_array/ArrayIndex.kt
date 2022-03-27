package c16_array

fun main() {
    var arr = IntArray(3)
    arr[0] = 11
    arr[1] = 22
    arr[2] = 33
//    arr[3] = 4

    var index = 0
    println(arr[index++])
    println(arr[index++])
    println(arr[index++])

    println(arr[--index])
    println(arr[--index])
    println(arr[--index])
}
