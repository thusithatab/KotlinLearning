
//When condition can be used when there is only one variable to compare
fun main(){
//    println("Enter the age: ")
//    val age = readLine()?.toInt()
//
//    when(age){
//        in 0..5 -> println("You are a young kid")
//        in 6..17 -> println("You are a teenager")
//        18 -> println("Finally you are 18!")
//        19,20 -> println("You are a young adult")
//        in 21..65 -> println("You are an adult")
//        else -> println("You are really old")
//    }

    println("Where are you from? ")
    val country = readLine()

    when(country){
        "India" -> println("Namaste")
        "Sri Lanka" -> println("Ayubowan")
        "US","UK" -> println("Hello")
        "Italy" -> println("Ciao")
        "Australia" -> println("G'day")
        else -> println("I dont know that")
    }

}