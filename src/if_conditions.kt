

fun main(){

    val x = 7
    val y = 7
    val z = if (x + y == 14) 3 else 4

    if(x < y || y * y == 49){
        println("at least one of the condition is true")
    } else if (x > y){
        println("x is greater than y")
    } else{
        println("x is equal to y")
    }
    println("value of the z is $z")

    println("---------------------------------")

    val string = "racecar"

    if (string == string.reversed())
        println("String $string is a palindrome")
    else
        println("string $string is not a palindrome")

}