class Rectangle(
    private val a: Double,
    private val b: Double
): Shape("Rectangle") {
    init {
        println("$name created with a = $a and b = $b")
    }

    override fun area() = a * b

    override fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}