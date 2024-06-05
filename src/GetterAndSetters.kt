fun main() {
    var p1 = PersonH("abhi",51)
    println(p1.age)
    p1.age = 43
    p1.age = -21
    println(p1.name)
}

class PersonH (nameParam :String,ageParam: Int){
    var name:String = nameParam
        get() {
            return field.toUpperCase()
        }
    var age:Int = ageParam
        set(value){
            if (value>0){
                field = value
            }
            else{
                println("Age cannot be negative")
            }
        }
    //Default Getter and Setter
    var email:String = ""
        get() = field
        set(value) {
            field = value
        }
}