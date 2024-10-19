package basic_type

fun main() {

    val name :String = "Vishal Parmar"

    //get character at particular position
    println(name[2])

    /*
    * not possible in string
    * string is immutable
    *  you have to reassign or reference the new string for it means,
    * all operation on string return new string value
    * str[2] = "d"
    */

    //String Format function
    /*
    * Format Specifier
    * %d - integer
    * %s - string
    * %f - float
    * */
    val age:Int = 30

    println(String.format("My name is %s and my age is %d",name,age))


}