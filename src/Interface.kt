import java.util.Objects

fun main() {
    dragObjects(arrayOf(Circle3(4.0),Square3(4.0),Triangle(2.0,3.0)))
}

fun dragObjects(objects: Array<Shape3>){
    for (obj in objects){
        obj.drag()
    }
}

abstract class Shape3 {
    abstract fun area(): Double
    abstract fun drag()
}
class Circle3(val radius :Double):Shape3(){
    override fun area():Double = Math.PI*radius*radius
    override fun drag() = println("Circle3 is dragging")
}
class Square3(val side :Double) :Shape3(){
    override fun area():Double = side*side
    override fun drag() = println("Square3 is dragging")
}
class Triangle(val base:Double,val height :Double): Shape3(){
    override fun area():Double = 0.5*base*height
    override fun drag() = println("Triangle is dragging")
}