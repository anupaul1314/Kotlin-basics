fun main() {
    println("Welcome to the Number Reversal Program!")
    println("Please enter a number to reverse:")

    val input = readLine()?.toIntOrNull()
    if (input != null) {
        val reversed = reverseNumber(input)
        println("The reversed number is: $reversed")
    } else {
        println("Invalid input! Please enter a valid integer.")
    }

    println("Thank you for using the Number Reversal Program!")

}
fun reverseNumber(number: Int): Int {
    var num = number
    var reversed = 0
    val isNegative = num < 0
    num = Math.abs(num)

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    return if (isNegative) -reversed else reversed
}
