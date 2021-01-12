

    fun main(){
        val myCircle =  Circle(5.0)
        myCircle.changeName("Peter")
        println(myCircle.name)

        val myTriangle = Triangle(3.0 , 4.0 , 5.0)
        myTriangle.changeName("Tan")
        println("Name of the triangle is ${myTriangle.name}")
    }
