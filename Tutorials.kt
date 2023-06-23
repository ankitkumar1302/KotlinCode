fun main() {
    when1()
}
// variable // variable name // Added colon to set the type(:)
//    var myVariable: Int = 5
//    println(myVariable)
//    myVariable = 4
//    println("My variable value is : $myVariable")

// Boolean
//    var myVariable: Boolean = true
//    println(myVariable)
//    myVariable = false
//    println(myVariable)

// Arithmetic operators

//    val x = 12
//    val u = 33
//    val result = x + u
//    println(result)

// For loop
//fun forLoop() {
//    val myArray = arrayOf(1,2,3)
//        for (i in myArray){
//            println(i)
//        }
//    for (i in 1..3)
//        println(i)

//    for (i in 10 downTo 5 step 2) {
//        println(i)
//    }

//    for (i in 'a'..'z'){
//        println(i)
//    }

//    val myArray = arrayOf(4, 5, 2, 3, 6, 10, 55, 22, 30)
//    var max = myArray[0]
//    for (item in myArray) {
//        if (item > max) {
//            max = item
//        }
//    }
//    println(max)
//}


//fun list() {
//    val array = arrayOf(1, 2, 2)
//    val list = mutableListOf(1, 2, 2)
//
//    list.add(3)
//    list.remove(2)
//    println(list)
//
//}
//
//fun mutList() {
//    val list = mutableListOf<Int>()
//    for (i in 1..10) {
//        val x = readlnOrNull()?.toInt()
//        if (x != null) {
//            list.add(x)
//        }
//    }
//    println(list)
//}
//

fun when1() {
    val age = readlnOrNull()?.toInt()
    when (age) {
        in 0..5 -> println("You are a kid")
        in 6..17 -> println("your a teen")
        18 -> println("Finally you are 18")
        19, 20 -> println("You are a young adult")
        in 21..65 -> println("You are a adult")
        else -> println("You're really old")
    }

}
