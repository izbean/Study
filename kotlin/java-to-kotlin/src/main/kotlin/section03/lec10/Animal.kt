package section03.lec10

abstract class Animal(
    protected val species: String,
    // property 를 override 할 때에 open 을 붙여 줘야 한다.
    protected open val legCount: Int,
) {
    abstract fun move()
}