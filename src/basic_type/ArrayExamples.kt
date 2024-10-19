package basic_type

fun main(){

    //create array with arrayOf function

    //val array = arrayOf("Nile","Amazon")
    var array = arrayOf("Nile","Amazon")

    println(array.joinToString()) //joinToString is used for formated output

    array += "Narmada" // with this you can create new array with new values
    println(array.joinToString())

    //arrayOfNulls create array with given size with nulls initial values
    val nullArray = arrayOfNulls<Int>(3)
    println(nullArray.joinToString())

    //emptyArray<T>() used to create empty array
    val emptyArray = emptyArray<Int>()
    println(emptyArray)


}