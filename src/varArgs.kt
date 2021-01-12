

fun main(){

//    val array = intArrayOf(3,66,3)
//    val max = getMax(1,4,2,55,3,*array,1)
//    println("The maximum is $max")

//    searchFor("How to become a Kotlin programmer") // This will call the searchFor function with the default argument 'Google'
//    searchFor("How to become a kotlin programmer", "Yahoo")
//    searchFor(search = "How to become a Kotlin programmer", searchEngine = "Bing")

    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")

}

fun getMax(vararg numbers: Int): Int {

    var max = numbers[0]

    for(number in numbers){
        if (number > max){
            max = number
        }
    }
 return max
}

fun searchFor(search: String, searchEngine: String = "Google"){

    println("Searching for '$search' on $searchEngine")
}

fun alternatingSum(vararg numbers: Int): Int{

    var alternatingSum = 0
    var temp = 1

    for (number in numbers){
        if (temp % 2 == 1){
            alternatingSum += number
        }else{
            alternatingSum -= number
        }
        temp++
    }
    return  alternatingSum
}