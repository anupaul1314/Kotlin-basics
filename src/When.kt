fun main() {
    //When AS EXPRESSION
    val animal = "Dog"
    val result = when(animal) {
       "Horse" -> "Animal is Horse"
       "Cat" -> "Animal is Cat"
       "Dog" -> "Animal is Dog"
       else -> "Animal Not Found"
   }
    println(result)
}
fun info(){
    //When
    val animal = "Dog"
    when(animal) {
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("Animal not Found")
    }
}

