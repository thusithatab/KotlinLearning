

fun main(){

//    var x = 3
//
//    while (x > 0) {
//       println("Value of the x is: $x" )
//        x--
//    }
//    println("Came out of while loop")

//----------------------------------------------------------
//    val myArray = arrayOf("hello", "guys", "Whats up?")
//    val arraySize = myArray.size
//    var count = 0
//    while (arraySize > count){
//        println(myArray[count])
//        count++
//    }
//----------------------------------------------------------
//    Homework 1
//    println("Enter a number: ")
//    var input = readLine()?.toInt()
//
//    if (input != null) {
//        println("Lets count from $input to 0:")
//        while (input >= 0){
//            println(input)
//            input--
//        }
//    }
//    -------------------------------------------------------
//    Homework 2
    println("Enter number 1: ")
    var number1 = readLine()?.toInt()
    println("Enter number 2: ")
    var number2 = readLine()?.toInt()

    var count = 1
    var result = number1

    if (number1 != null && number2 != null){

        while (number2 > count){
            count++
            if (result != null) {
                result *= number1
            }
        }
    }

    print("$number1 to the power of $number2 is $result")
}