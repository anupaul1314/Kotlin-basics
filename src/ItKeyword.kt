fun main() {
    val milkShakeVariable1 = chooseItem1 {
        "I took $it scoops of Ice cream"
    }
    milkShakeVariable1()
}

fun chooseItem1(scoops1:(Int) -> String) : () -> Unit{
    println(scoops1(2))
    return milkShake
}