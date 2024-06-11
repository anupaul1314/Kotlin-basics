import kotlin.math.pow

fun main() {
    var fn: (a:Double,b:Double) ->Double =::sum
    println(fn(2.0,4.0))
}
fun sum(a:Double,b:Double):Double {
    return a+b
}
fun power1(a:Double,b:Double):Double {
    return a.pow(b)
}
fun hello(a:Int):Unit{

}