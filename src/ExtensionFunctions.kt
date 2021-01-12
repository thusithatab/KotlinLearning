

fun main(){

//    println("Please enter a number: ")
//    val input = readLine()?.toInt()
//
//    if (input != null) if(input.isPrime()) println("$input is a prime number") else println("$input is not a prime number")

    val list = listOf(1,2,3,4,5,6)
    println("The product of $list is ${list.calculateProduct()}")

}


fun Int.isPrime(): Boolean{

    for (i in 2 until this){

        if (this % i == 0){
            return false
        }
    }
    return true
}
//Homework

private fun List<Int>.calculateProduct(): Int {

    var product = 1
    for (i in this){
        product *= i
    }

    return product
}