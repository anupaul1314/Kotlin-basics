fun main() {
    var obChild = Child()
    obChild.myMethod()
    obChild.myMethod2()
}
open class Parent
{
    val name:String = ""

    fun myMethod(){
        println("I am in Parent")
    }
}

class  Child : Parent()
{
    val name2:String = ""

    fun  myMethod2(){
        println("I am in Child")
    }
}