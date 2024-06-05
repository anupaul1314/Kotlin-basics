fun main(){
    val mustang = Car("mustang", "petrl", 100) //Objects
    val nexon = Car("Nexon","Disel", 200)

    println(mustang.name)
    println(nexon.type)

    mustang.driveCar() // To call methods
    nexon.applyBrake()
}

class Car(val name:String, val type: String, var kmRan: Int)  // Properties
{
    fun driveCar(){          //Methods
        println( "$name Car is driving")
    }
    fun applyBrake(){
        println("Applied Brakes")
    }
}