package c21_string

fun main() {
    val s1 = "VisualAcademy"
    val s2 = "visualacademy"

    if (s1 == s2)
        println("[1] 같다.")

    if (s1.equals(s2))
        println("[2] 같다.")

    if (s1.lowercase() == s2.lowercase())
        println("[3] 같다.")

    if (s1.equals(s2, true))
        println("[4] 같다.")
}