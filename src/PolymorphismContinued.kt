fun main() {
    var circle1 =  Circle1(4.0)
    println(circle1.toString())
}

open class Shape1 {
    open fun area() : Double = 0.0
    override fun toString(): String {
        return "I am Shape"
    }
}
class Circle1(val radius : Double) :Shape(){
    override fun area():Double = Math.PI*radius*radius
}