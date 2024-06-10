fun main() {
    val circle2 = Circle2(4.0)
    println(circle2.area())
    circle2.display()
}
abstract class Shape2 {
    var name : String = ""
    abstract fun area() :Double
    abstract fun display()
}
class Circle2(val radius :Double) : Shape(){
    override fun area():Double = Math.PI*radius*radius
    override fun display(){
        println("Circle is displayed")
    }
}
