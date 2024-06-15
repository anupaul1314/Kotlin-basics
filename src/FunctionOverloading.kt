import kotlin.math.pow

fun main(){
    var fn: (a: Double, b: Double) -> Double = ::addition
    println( fn(1.1,2.1))
    fn = ::addition
    println(fn(2.2,2.1))

   println( addition(a = 2, b = 3))
   println( addition(a = 2.3, b = 4.5))
}
fun addition(a : Int, b : Int) :Int{
    return a+b
}
fun addition(a: Double, b: Double) :Double
{
    return a+b
}
fun power(a: Double, b: Double) :Double
{
    return a.pow(b)
}
