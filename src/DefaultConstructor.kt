fun main() {
    var ob = Calculator()
    println(ob.add(4,5))
    println(ob.multiply(4,0))

}
class Calculator(){
    fun add(a:Int,b:Int) :Int{
        return a+b
    }

    fun multiply(a: Int,b: Int) :Int{
        return a*b
    }

}