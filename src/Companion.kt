fun main() {
    //MyClass.MyObject.f()
    MyClass.f()  //We don't have to write Myobject
    MyClass.AnotherObject.g()
}

class MyClass{
    companion object MyObject {
        @JvmStatic        // ye method hamara static method kaam krega in java
        fun f(){
            println("Hello Everyone")
        }
    }
    object AnotherObject{
        fun g(){
            println("Hello Everbody")
        }
    }
}


