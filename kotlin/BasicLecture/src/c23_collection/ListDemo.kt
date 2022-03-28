package c23_collection

fun main() {
    val techs = listOf("Kotlin", "Android", "Java", "C#")
    println(techs.get(0))
    println(techs[1])
    println(techs::class.qualifiedName)

    val subs = techs.subList(1, 3)
    subs.forEach {
        println(it)
    }

    val sites = mutableListOf("VisualAcademy", "DotNetKorea")
    sites[1] = "닷넷코리아"
    sites.removeAt(0)
    sites.forEach {
        println(it)
    }
}