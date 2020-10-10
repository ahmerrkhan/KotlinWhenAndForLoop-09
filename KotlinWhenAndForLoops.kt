
//Kotin When Statement and For Loop
fun main(args : Array<String>){
    //1. When statement is used in kotlin as a switch in c, c++, java
    /*val a :Int  = 1
    when(a)
    {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("None of these")
    }*/
    // using multiple statements
    /*
    var _a = 6
    when(_a)
    {
        1->
        {
            println("Hello Sir!")
            println("You enetered One 1")
        }
        2->
        {
            println("Hello Madam!")
            println("You entered Two 2")
        }
        else ->
        {
            println("Invalid Choice!")
        }
    } */
    //For Loop
    for(i in 1..5)
    {
        println(i)
    }
    println();
    for(i in 5 downTo 1)
    {
        println(i)
    }

    var a1 : IntArray = intArrayOf(20,30,40,50)
    for(i in a1.indices)
    {
        println("[$i] :"+a1[i])
        //println(i)

    }

}