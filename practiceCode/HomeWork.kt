package practiceCode

fun main() {
    val list = listOf(3, 2, 1, 5, 24, 6)
    println("The list look like the following: $list")
    println("Search for this number:")
    val input = readlnOrNull()?.toInt()
    if (input != null) {
        println("The index of $input is ${indexOf(list, input)}")
    }
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
fun number() {

    println("Enter the number: ")
    var num = readlnOrNull()?.toInt()
    println("Lets count from $num to 0:")
    while (num!! >= 0) {
        println(num)
        num--
    }
fun power() {
    println("Enter number 1: ")
    val f = readlnOrNull()?.toDouble()!!
    println("Enter number 2: ")
    val s = readlnOrNull()?.toDouble()!!

    val result = f.pow(s)
    println("$f to the power $s is $result")
}

fun arrayHW() {
    val myArray = arrayOf(2, 5, 1)
    var sum = 0
    for (item in myArray) {
        sum += item
    }
    println("The sum of the array element is: $sum ")
}

fun array2() {
    println("Enter the 5 number: ")
    var avg = 0.0
    for (i in 1..5) {
        val input = readlnOrNull()?.toInt()
        if (input != null) {
            avg += input / 5
        }
    }
    println("The average value is $avg")
}

 Enter the 5 number in a list and then reverse it.

fun list1() {
    println("Enter 5 numbers :")
    val numbers = mutableListOf<Int>()
    for (i in 1..5) {
        val number = readlnOrNull()!!.toInt()
        numbers.add(number)
    }
    numbers.reversed()
    println("The reversed number is $numbers")
}

 Create a List/function that calculate the user defined fibonachi series

fun fibonachi() {
    val list = mutableListOf(0, 1)
    println("Enter the number n>1: ")
    val n = readlnOrNull()?.toInt()
    if (n != null) {
        listOf(0, 1, 1, 2, 3, 5)
        for (i in 2..n - 1) {
            list.add(list[i - 2] + list[i - 1])
        }
    }
}
*/
/*
 Create a function that take user input and give the sum with the previous numbers like :-
 User input 5
 1+2+3+4+5 = 15

fun calculate(n: Int) {
    println("Enter the number:")
    var result = 0
    for (i in 1..n) {
        result += i
    }
    println(
        "The sum of the value is" +
                " 1 to $n is $result"
    )
}
*/
/*
 In fun main(){
val array = intArrayOf(10, 20, 35)
    val max = getMax(1, 2, *array, 15, 23, 35, 24)
    println("The maximum is $max")
 }
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}
 */

fun indexOf(list: List<Int>, value: Int): Int {
    for (i in 0 until list.size - 1) {
        if (list[i] == value) {
            return i
        }
    }
    return -1
}

// Create a function which has alternating sum
// fun main()
// {
// val sum = alternatingSum(2,3,5,4,8,6,5)
// println("The alternating sum is $sum")
// }
// 2-3+5-4+8-6+5





// Create an Extension function which gives the output
// of [1,2,3,4,5,6] is 720




