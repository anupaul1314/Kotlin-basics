fun main() {
    val students = mutableMapOf <Int, String>()
    students.put(1,"Ryan")
    students.put(2,"pyan")
    students.put(3,"cyan")

    println(students.get(1))
    println(students.get(11))

    for (i in students ){
        println(i)
    }

    for ((Key,Value) in students){
        println("$Key = $Value")
    }

    students[8] = "Jones"
    println(students[8])

    val map :Map<Int,String> = mapOf<Int,String>(1 to "Hello" , 2 to "World")
    println(map)

}