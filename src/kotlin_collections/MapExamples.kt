package kotlin_collections

fun main(){

    /*
    * Read-Only Map - not inherits from collection interface
    * duplicate key remove - take last key value
    * */
    val map = mapOf(1 to "black", 2 to "red", 3 to "brown",2 to "yellow")
    println(map)

    //map.put(4 to "pink") //not supported for read only set

    println("get element by key: ${map[2]}")

    //create empty map
    val emptyMap = emptyMap<Int,String>()

    /*
    * Mutable map
    * */
    val mMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    println(mMap)

    //add value by put()
    mMap.put(4,"Four")
    println("4 added: $mMap")

    mMap.putAll(mapOf(5 to "Five",6 to "Six"))
    println("multiple added: $mMap")

    mMap[7] = "Seven"
    println(mMap)

    //create set using builder function
    val bMap = buildMap<Int,String> {
        put(1 ,"Rahul")
        put(2 ,"Ramesh")
        put(1 ,"Paresh")
        put(1 ,"Raju")
    }

    println("Map using builder function: $bMap")



}