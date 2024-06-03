fun main(){
    for (i in 1..5 step 2){
        println(i)
    }
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    val number = 2
    for (i in 1..10){
        println(number.toString() + "X" + i + "=" + {number*i})
        // string tempting
        println("$number X $i = ${number*i}")
    }
}
