fun main() {
    val coldCoffeVariable = coldCoffe
    coldCoffeVariable()
    val milkShakeVariable = chooseItem(scoops)
    milkShakeVariable()
}
val coldCoffe: () -> Unit ={
    println("I took a coffee")
}
val milkShake: () -> Unit ={
    println("I took a MilkShake")
}
val scoops :(Int) -> String ={ numberofScoops ->
    "I took $numberofScoops scoops of Ice cream"
}
fun chooseItem(scoops:(Int) -> String) : () -> Unit{
    println(scoops(2))
    return milkShake
}