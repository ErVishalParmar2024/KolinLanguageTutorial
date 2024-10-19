package kotlin_collections

fun main(){
    val aList = mutableListOf(1,2,3,4,5)
//    println(aList.joinToString(separator = ","))

    val iterator = aList.listIterator()

    //there is a remove function in mutable iterator for removing
    //element from list while iterating
    //iterator.remove()

    //there is add() and set() functions for insert and replace element
    iterator.next()
    iterator.add(3)
    println(aList.joinToString())

    iterator.next()
    iterator.set(8)
    println(aList.joinToString())

    while (iterator.hasNext()){
        println("${iterator.nextIndex()} - ${iterator.next()}")
    }

    //use itertor again
    println("reverse iterator")

    while (iterator.hasPrevious()){
        println("${iterator.previousIndex()} - ${iterator.previous()}")
    }
}