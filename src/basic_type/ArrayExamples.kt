package basic_type

fun main(){

    /*
   * Create array using array functions
   * */

    //create array with arrayOf function
    //val array = arrayOf("Nile","Amazon")
    var array = arrayOf("Nile","Amazon") //use var for += operator

    println(array.joinToString()) //joinToString is used for formated output

    array += "Narmada" // with this you can create new array with new values
    println(array.joinToString())

    //arrayOfNulls create array with given size with nulls initial values
    val nullArray = arrayOfNulls<Int>(3)
    println(nullArray.joinToString())

    //emptyArray<T>() used to create empty array
    val emptyArray = emptyArray<Int>()
    println("emptyArray: ${emptyArray.joinToString()}")

    /*
    * Create array using array constructor
    * It takes array size and function that return value of array
    * */
    val initArray  = Array<Int>(3){it*2}
    println("initArray: ${initArray.joinToString()}")

    /*
    * Nested array
    * Used for create multi-dimention array
    * */
    val twoDimentionArray = Array(2){Array(2){0} }
    println("twoDimentionArray: ${twoDimentionArray.contentDeepToString()}")

    //vararg is used for passing the multiple argument in one function
    createAndPrintArray(1,2,3,4,5)

    //spread operator(*) used for pass array as argument of another array
    val spreadArray = arrayOf(1,3,5,*initArray)
    println("spreadArray: ${spreadArray.joinToString()}")

    /*
    * Compare array
    * */
    val array1 = arrayOf("sandeep","karan","rahul","karan")
    val array2 = arrayOf("sandeep","karan","rahul","karan",)

    if (array1.contentEquals(array2)){
        println("Both Arrays are equals")
    }
//    ==/!= operator is not used for comparison
//    if (array1==array2){
//        println("Both Arrays are equals")
//    }

    /*
    * Array transformation
    * */
    val toList = array1.toList()
    println("Array list transformation: ${toList.toString()}")

    val toSet = array1.toSet()
    println("Array set transformation: ${toSet.toString()}")

    val forMapArray = arrayOf(1 to "black", 2 to "red", 3 to "brown",2 to "yellow")
    println("forMap Array for map transformation: ${forMapArray.contentDeepToString()}")
    val toMap = forMapArray.toMap() // for duplicate key, its take second entry
    println("Array map transformation: ${toMap.toString()}")
    /*
    * Array function
    * */
    //sum() used for only int array
    println("sum of array: ${arrayOf(0,1,2,3,4,5,6).sum()}")

    //shuffle()
    val shuffleArray = arrayOf(0,1,2,3,4,5,6)
    shuffleArray.shuffle()
    println("shuffle of array: ${shuffleArray.contentDeepToString()}")


}

fun createAndPrintArray(vararg elements:Int){
    val array = arrayOf(elements)
    println(array.contentDeepToString())
}

