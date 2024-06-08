fun main() {
    println(A1.num)
    AB.test()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementfbLikes()
    SharingWidget.display()

}
object A1{
    val num: Int = 10
}
object AB{
    val p: Int = 10
    fun test(){
        println("")
    }
}
//Singleton Object(Class ka bs ek hi object bnaye)
object SharingWidget{
    private var twitterLikes = 0
    private var fbLikes = 0
    fun incrementTwitterLikes() = twitterLikes++
    fun incrementfbLikes() = fbLikes++
    fun display(){
        println("Facebook - $fbLikes, Twitter - $twitterLikes")
    }
}
