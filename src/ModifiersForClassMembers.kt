fun main() {
    val obA = Z()
    val obB = X()

}
open class Z{
    public var p =10
    public var q =10
    internal var r =10
    protected var s =10
}

class X :Z(){
    fun test (){
        println(p)
        println(q)
        println(r)
        println(s)
    }
}