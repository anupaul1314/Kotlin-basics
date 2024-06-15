fun main(){
    var car = Automobile("Nexon","Petrol")
   // var person = Insaan("A",2)
    //println(person.name)
    //println(person.age)
}

class Automobile(val name: String, var seating:Int, val engineType:String){    //Primary Constructor
    init {   //To print set of statement
        println("$name is Created")
    }
    //Secondary Constructor
    constructor(nameParam: String,engineParam :String):
            this(nameParam,4,engineParam)
}


class Insaan (nameParam: String,ageParam:Int)
{
    var name:String = nameParam
    var age:Int = ageParam
}

