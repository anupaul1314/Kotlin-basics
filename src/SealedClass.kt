fun main() {
    val tile  = Red("Mushroom",25)
    val tile2 = Red("Fire",30)
    println("${tile.points} - ${tile.type}")

    val tile1:Tile =Red("Dark Red",40)
    val points:Int = when(tile1){
        is Red -> tile.points * 2
        is Blue -> tile.points * 5
    }
    println(points)

}

sealed class Tile
class Red(val type :String, val points :Int) :Tile()
class Blue( val points:Int) :Tile()

