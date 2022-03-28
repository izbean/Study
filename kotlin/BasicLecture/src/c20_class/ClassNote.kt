package c20_class

class ClassNote {
    fun run() {
        println("ClassNote 클래스의 run 메서드")
    }
}

fun main() {
    var classNote = ClassNote()
    println(classNote)
    classNote.run()
}