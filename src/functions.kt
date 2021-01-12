

fun main(){

//    printThreeLines()
//     printPower(2,3)
   // printSum(5)
//    val pow = printPower(3,5)
//    println("3 to the power 5 is $pow")

    val list = listOf(3,2,5,1,5,6,7)
    println("The list looks like the following : $list")
    println("Search for this number: ")
    val number = readLine()?.toInt()
    if (number != null)
    println("The index of $number is ${printNumberInTheList(list, number)}")
}

fun printPower(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
   // println("$base to the power of $exponent is $result")

    return result;
}

fun printThreeLines(){
    println("First")
    println("Second")
    println("Third")
}

//Homework
fun printSum(num : Int){

    var result = 0

    for (i in 1..num){
        result+=i
    }
    println(result)
}

// Homework for function with return

fun printNumberInTheList(list: List<Int>, number: Int) = list.indexOf(number)
