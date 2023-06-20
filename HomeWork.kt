import kotlin.math.pow

fun main() {
    power()
}

/*
fun name(){
    println("Enter your name: " )
    val name = readlnOrNull()
    println("Enter your age: ")
    val age = readlnOrNull()
    println("Your name is $name\n your age is : $age")}

fun arithmetic() {
    val x: Double = 305.22
    println("x: $x")
    val y: Int = 4
    println("x+y: ${x + y.toDouble()}")
    val z: Int = 5
    println("x+y+z: ${x + y.toDouble() + z.toDouble()}")
}
fun volume(){
    val pi = 3.14
    val radius = 5.5 * 5.5 * 5.5
    println("The volume of the sphere with the radius 5.5 is ${4/3*3.14*5.5*5.5*5.5}")
}

fun string(
    name: String
) {
    println("Name is :{${name.uppercase().reversed()}}")
}

fun simpleExpression() {
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    println(simpleExpression)
}
fun hardExpression() {
     val bool = true
    val x = 9y
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
                          // True && True || False  && (true)
                            // True || False
                                // OR
                                // TRUE
    println(hardExpression)
}
fun condition() {
    println("Enter the value/name to check is palindrome:")
    val name = readlnOrNull()
    if (name!!.reversed().toLowerCase() == name) {
        println("The $name is palindrome")
    } else
        println("The $name is not palindrome")
}

// 0-17 not an adult kid
//18-65 you are adult
//65> you are really, ancient

fun check() {
    println("Enter your age:")
    val age = readlnOrNull()?.toInt()
    if (age != null) {
        if (age >= 0 && age < 18) {
            println("You are not a adult")
        } else if (age >= 18 && age <= 65) {
            println("You are adult")
        } else {
            println("You are really really old")
        }
    }
}

fun array() {
    val myArray = arrayOf("hello", "ankit", "length")
    val myArrayLength = myArray.size
    var i = 0
    while (i < myArrayLength) {
        println(myArray[i])
        i++
    }
}

fun while_Function() {
    var x = 3
    while (x > 2) {
        println("hello")
        x--
    }
}
*/
//fun number() {
//
//    println("Enter the number: ")
//    var num = readlnOrNull()?.toInt()
//    println("Lets count from $num to 0:")
//    while (num!! >= 0) {
//        println(num)
//        num--
//    }
//}

fun power() {
    println("Enter number 1: ")
    val f = readlnOrNull()?.toDouble()!!
    println("Enter number 2: ")
    val s = readlnOrNull()?.toDouble()!!

    val result = f.pow(s)






    println("$f to the power $s is $result")
    println("$f to the power $s is $result")
    println("$f to the power $s is $result")
    println("$f to the power $s is $result")
    println("$f to the power $s is $result")

}