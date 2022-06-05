package section03.lec10

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        // 중복되는 인터페이스를 특정할때 <> 를 사용한다.
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = TODO("Not yet implemented")
}