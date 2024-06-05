fun main() {
    var ob = Calculator()
    println(ob.add(4,5))
    println(ob.multiplty(4,0))

}
class Calculator(){
    fun add(a:Int,b:Int) :Int{
        return a+b
    }

    fun multiplty(a: Int,b: Int) :Int{
        return a*b
    }

}