package kotlin_collections

fun main(){

    //this is a immutable list
    //val list = listOf(11,45,78,65,32,14,21)
    var list = listOf(11,45,78,65,32,14,21)
    println(list)

    //this is not allowed for immutable list
    //list[3] = 63
    //list.add(15)

    //you have to assign list as var for this
    list += 63 //this create a new list
    println(list)

    //other functionality
    println("size: ${list.size}")
    println("element at 3rd pos: ${list[3]}")
    println("1st element: ${list.first()}")
    println("last element: ${list.last()}")


    //create empty list
    val emptyList = emptyList<Int>()

    //create list using constructor function
    val cList = List(3,{it*3})
//    val cList = List(3) { it * 3 }//or like this
    println("list using constructor fun: $cList")


    /*
    * Read only collection is covariant means you can
    * assign list of child to list of parent objects, like below
    * */

    open class Shape
    class Rectangle : Shape()

    val arrayRect : List<Rectangle> = listOf(Rectangle(),Rectangle(),Rectangle())
    val shapeArray : List<Shape> = arrayRect //this totally fine


    println("\n\n ----------- Mutable List-------------\n\n\n")

    val mutableList = mutableListOf("Black","White","Red","Brown")
    println(mutableList)

    mutableList.add("Yellow")
    mutableList.add(3,"Pink")
    println("Add yellow and pink at 3: $mutableList")

    mutableList.remove("Pink")
    println("remove pink: $mutableList")
    mutableList.removeLast()
    println("remove last element: $mutableList")
    mutableList.removeAt(2)
    println("remove at 2 position: $mutableList")

    //create list using builder function
    val bList = buildList<Int> {
        add(1)
        add(2)
        add(3)
    }

    println("list using builder function: $bList")


    /*
    * Mapping in list
    * return result map after applying given operation
    * */
   val mapping = mutableList.map { "${it.length} - $it" }
    println("Map after mapping: $mapping")
    val mappingIndexed = mutableList.mapIndexed{idx,value -> "$idx - $value"}
    println("Map after mappingIndex: $mappingIndexed")

    //you can pass destination map to mapTo() for mapping
//    val dMap :List<String> = mutableListOf()
//    mutableList.mapTo(dMap,{ "${it.length} - $it"})


    /*
    * Association
    * */
    val aMap = mutableList.associateWith { it.length }
    println("Map after Association: $aMap")



}