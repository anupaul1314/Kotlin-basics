fun main(){
    var arr = arrayOf<String>("One","Two", "Three",4.toString())// we define type explicitly
    var arr1 = arrayOf(1,2,3)
    for (i in arr)
    {
        println(i)
    }
    for ((i,e) in arr.withIndex()) // with Indexes
    {
        println("$i - $e")
        println(arr[0])
        println(arr.get(0))
        arr.set(1,"Hello")  // To set new value
        println(arr[1])
        println(arr.size)  // To get the size of array
    }

}