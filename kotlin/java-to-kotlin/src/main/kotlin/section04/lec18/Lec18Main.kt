package section04.lec18

import section04.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("바나나", 2_000),
        Fruit("수박", 3_000)
    )

    val apple = fruits.filter { fruit -> fruit.name == "사과" }
    val isApple = fruits.all { fruit -> fruit.name == "사과" }
    val isNotApple = fruits.none { fruit -> fruit.name == "사과" }
    val isNoApple = fruits.any { fruit -> fruit.name == "사과" }
    val fruitCount = fruits.count()
    val fruitSoring = fruits.sortedBy { fruit: Fruit -> fruit.price }
    val fruitDescSoring = fruits.sortedByDescending { fruit: Fruit -> fruit.price }
    val distinctFruitNames = fruits.distinctBy { fruit: Fruit -> fruit.name }
        .map { fruit: Fruit -> fruit.name }

    val firstFruits = fruits.first()
    val firstOrNullFruits = fruits.firstOrNull()

    val lastFruits = fruits.last()
    val lastOrNullFruits = fruits.lastOrNull()

    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
//    val fruitMap: Map<Long, Fruit> = fruits.associateBy { fruit ->  }

}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}