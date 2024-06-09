fun main() {
    var testObj = object {
        val x: Int = 10
        fun method(){
            println("I am object expression")
        }
    }
    var obj = object : Clonable{
        override fun Clone() {
            println("I am Clone")
        }
    }
    println(testObj.method())
    obj.Clone()
}
interface Clonable{
    fun Clone()
}
