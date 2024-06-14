fun main() {
    var str = "I am Human"

    var length = str.length
    println(length)

    var charAtIndex = str.get(5)
    println(charAtIndex)

    var subString = str.substring(5,10)
    println(subString)

    var uppercase = str.uppercase()
    var lowercase = str.lowercase()
    println("Uppercase - $uppercase,Lowercase - $lowercase")

    var strWithSpace = "           Hello World         "
    val trim = strWithSpace.trim()
    println(trim)

    var containsString = str.contains("am")
    println(containsString)

    var replaceStr = str.replace('a','2')
    println(replaceStr)

    var splitsStr = str.split(" ")
    println(splitsStr)
}