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

    println("\n" +
            "\n----------- Mutable List-------------\n\n\n")










}