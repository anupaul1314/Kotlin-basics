fun main() {
    val textA = "Hello World"
    val textB = "How are you"
    val textC = "Have a great day"

    println(textA)
    println(textA.startsWith("Hello"))
    println(textB.startsWith("Hello"))
    println(textC.startsWith("Hello"))

    val randomNumber = (1..6).random()
    println(randomNumber)

    println("Please enter your name:") //Prompting user
    val name = readLine() //Storing value in variable
    println("Hello, $name! Welcome to our program.")
}