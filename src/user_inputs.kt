

fun main() {
    //   val userInput = readLine()// readLine() method is nullable
    //   println("You entered ${userInput?.toUpperCase()}") // ? after user input is to check for the nullable value. if it is null the print null. else print the value

    //   if (userInput != null)
    //   println(userInput.toInt() - 5) // In this scenario even the question mark after the userInput will not work. Because if it is null it cant subtract it.Therefore has to do the null check manually.

    //-----------------------------------------------------------
    print("Please enter your age: ")
    val age = readLine()
    if (age != null){
        if (age.toInt() < 18)
            println("You are not an adult yet")
        else if (age.toInt() <= 65)
            println("You are an adult")
        else
            print("You are really really old")
}
}