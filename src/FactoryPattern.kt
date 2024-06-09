fun main() {

}
class Pizza(val type: String, val toppings : String){
    object Factory{
        fun create(pizzaType: String) : Pizza{
            return when (pizzaType){
                "Tomato" -> Pizza("Tomato","Tomato Cheese")
                "Paneer" -> Pizza("Paneer Farm","Tomato,Paneer, Cheese")
                else -> Pizza("Basic ","Onion")
            }
        }
    }
}