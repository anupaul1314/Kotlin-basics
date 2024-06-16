fun main(){
    printMessage(count = 3)  //Arguments
    printMessage()
}
fun printMessage(count :Int = 2){   //count parameter
    for (i in 1..count)
    println("Hello $i")
}
fun add(num1 : Int, num2 : Int)  =num1+num2

fun evenOrOdd(num1 :Int) :Unit{
    val result = if (num1 % 2 == 0) "Even" else "Odd"
    println(result)
}

