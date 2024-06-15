import kotlin.random.Random
const val ANSI_PURPLE = "\u001B[35m"
const val ANSI_RESET = "\u001B[0m"
fun main()
{
    println("Enter your name")
    var playername = readln()
    println("${ANSI_PURPLE}Welcome $playername!${ANSI_RESET}")
    println("Rolling the dice...")
    Thread.sleep(1000)
    val diceResult = Random.nextInt(1, 6)
    println("The dice rolled: $diceResult")
    println("Thank you for playing DiceRun, $playername!")
    
}
