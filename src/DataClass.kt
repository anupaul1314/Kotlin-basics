fun main() {
    val p1 = Person4(1,"John")
    val p2 = Person4(1,"John")
    val p3:Person4 = p1.copy(id = 3)
    println(p3)

    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)
    val (id,name) = p1
    println(id)
    println(name)
    println(p1.component1()) //we can use component1 instead of id

}


data class Person4(val id :Int, val name:String)
