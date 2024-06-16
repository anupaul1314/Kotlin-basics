import kotlin.math.pow

fun main() {
    var fn: (a:Double,b:Double) ->Double =::sum1
    println(fn(2.0,4.0))
    calculator6(5.0,5.0,::sum1)
}
fun sum1(a:Double,b:Double):Double {
    return a+b
}
fun power2(a:Double,b:Double):Double {
    return a.pow(b)
}
fun calculator6(a:Double,b:Double, gn :(Double,Double) ->Double)
{
    val result :Double = gn(a,b)
    println(result)
}