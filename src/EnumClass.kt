fun main() {
    val day = Day.Sunday
    day.printFormatedDay()
    println(day)
    println(day.number)

    for (i in Day.values()){
        println(i)
    }


}
enum class Day(val number:Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    //We can define Method in enum class
    fun printFormatedDay(){
        println("Day is $this")
    }

}