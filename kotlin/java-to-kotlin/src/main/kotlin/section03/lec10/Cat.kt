package section03.lec10

class Cat(
    species: String
) : Animal(species, 4) {
    // extends 를 사용하지 않고 : 를 사용한다.
    // override 를 필수적으로 붙여 줘야한다.
    override fun move() {
        println("고양이가 걸어간다")
    }
}