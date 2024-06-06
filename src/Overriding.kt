fun main() {
    var ob = OnePlus("SmartPhone")
    ob.display()
    ob.toString()
    println(ob.toString())
}
open class Mobile (val type:String){
    open val name: String = ""
    open val size: Int = 5

    fun makeCall()= println("Calling From Mobile")
    open fun display() = println("Simple Display")
    fun powerOff() = println("Shutting down")
}
 class OnePlus(typeParam:String) : Mobile (typeParam){
     override val name: String ="New String"
     override val size:Int = 6
     override fun display() {
         super.display() //To call parent function
     }
     override fun toString(): String {
         return "Name - $name Size - $size"
     }
 }