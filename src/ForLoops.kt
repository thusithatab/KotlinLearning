

fun main(){
//    val myArray = arrayOf(1, 2, 5)
    println("------------------------------------------------")
    for (i in 1..5){
        println(i)
    }
    println("------------------------------------------------")
    for (i in 10 downTo 5){
        println(i)
    }
    println("------------------------------------------------")
    for (i in 10 downTo 2 step 2){
        println(i)
    }
    println("------------------------------------------------")
    for (i in 'a'..'z'){
        println(i)
    }
    println("------------------------------------------------")
    val myArray = arrayOf(4,5,3,7,9,8)
    var max = myArray[0]
    for (item in myArray){
        if (item > max){
            max = item
        }
    }
    println("Max of the array is $max")

    println("------------------------------------------------")
//    Homework 1

    val sumArray = arrayOf(2,4,6,4,7)
    var sum = 0

    for (item in sumArray){
        sum += item
    }

    println("Sum of the array is $sum")

    println("------------------------------------------------")
//    Homework 2
    println("Enter 5 numbers: ")
    var total = 0

    for (i in 1..5){
        val value = readLine()?.toInt()
        if (value != null){
            total += value
        }
    }

    println("The average value is ${total/5.0}")
}