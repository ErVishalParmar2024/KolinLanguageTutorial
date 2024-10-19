package kotlin_collections

fun main(){

    /*
    * Read-Only Set
    * Set store unique values - null also unique
    * */
    val set = setOf(11,65,85,null,44,11,65,null,74)
    println(set)

    //set.add() //not supported for read only set

    //create empty set
    val emptySet = emptySet<Int>()

    /*
    * Mutable set
    * */
    val mSet = mutableSetOf("Black","White","Red","Brown")
    println(mSet)

    mSet.add("Pink")
    println("Pink added: $mSet")

    //create set using builder function
    val bSet = buildSet<Int> {
        add(11)
        add(12)
        add(11)
        add(13)
        add(12)
    }

    println("set using builder function: $bSet")



}