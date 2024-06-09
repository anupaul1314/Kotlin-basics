fun main() {
    val p1 = Person4(1,"John")
    val p2 = Person4(1,"John")

    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)
}


data class Person4(val id :Int, val name:String)
{

}