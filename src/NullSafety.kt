fun main() {
    val gender:String = "Male"
    val gender2 :String? = null
    val isAdult :Boolean? = null

    if (gender2 != null) {
        println(gender2.toUpperCase())
    }
    println(gender2?.toUpperCase()) //To check the value of object is null or not
    gender2.let {
        println("Line 1")
        println("line2 $gender2")
        println("Line 3 $it") //it gender2 ko point ke rha h
    }
      var selectedValue = gender2 ?: "NA" //elvis operator
     var Value = gender2!!.toUpperCase() //elvis operator

 }
