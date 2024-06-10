fun main() {
    createUserList(5)
    createUserList(-1)
}
fun createUserList(count :Int){
    if(count<0){
        throw IllegalArgumentException("Count must be graeter than Zero")
    }
    else{
        println("User list created containing $count users")
    }
}
