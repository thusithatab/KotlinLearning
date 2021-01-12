fun main(){

    val x = 5
    val y = 5

    println(x == y)
    println(x < y)
    println(x <= y)
    println(x != y)

    val a = 6
    val b = 10

    println (x == y && a == b )
    println (x == y || a == b )

    println(!(x == y || a == b && a > y)) // && operator executes before the ||
}