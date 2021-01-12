


fun main(){

//    val list = listOf(1,2,3) // lists are immutable. Which means we cannot change the values during the run time
//
//    //list[0] = 3
//
//    val mutableList = mutableListOf(1,2,3)
//    mutableList[0] = 5
//
//    println(mutableList)
//    mutableList.add(10)
//    println(mutableList)
//    mutableList.remove(2) // remove() method remove the matching value
//    println(mutableList)
//    mutableList.removeAt(1)
//    println(mutableList) // removeAt() method remove the given index of the list

//    println("-------------------------------------------------------")
//
//    val list = mutableListOf<Int>() // Since this is an emplty list, must specify the data type
//
//    for (i in 1..10){
//        val x = readLine()?.toInt()
//        if (x !=null) {
//            list.add(x)
//        }
//    }
//    println(list)

//    println("-------------------------------------------------------")
////    Homework 1
//    val list = mutableListOf<Int>()
//    println("Please enter 5 numbers: ")
//    for (i in 1..5){
//        val x = readLine()?.toInt()
//        if (x != null) {
//            list.add(x)
//        }
//    }
//    list.reverse()
//    for (i in list){
//        println(i)
//    }

    println("-------------------------------------------------------")
    //    Homework 2

    val list = mutableListOf<Int>()
    println("Enter a number n > 1: ")

    val x = readLine()?.toInt()
    if (x != null) {
        for (i in 0..(x-1)){
            if (list.isNullOrEmpty()) {
                list.add(i)
            }else if (list.size ==1){
                list.add(1)
            }
            else {
                list.add(list[i-2]+ list[i-1])
            }
        }
    }
    println(list)
}