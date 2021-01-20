abstract class Shape (
    var name: String
        ){
            init {
                println("I am the super class!")
            }

    abstract fun area(): Double // make abstract functions if you don't know the implementation

    abstract fun perimeter(): Double



    fun changeName(newName: String){
        name = newName
    }
}