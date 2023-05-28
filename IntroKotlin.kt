fun main() {
    // Variables
    var a = 5;
    var b = 9
    a + b;
    println(a + b)

// Constants
    val c = 10;
    a = 10;
    a + c;
    println(a + c)

    // String
    val msg = "Hello World!"
    print(msg)
    println("I am ${a + c} year old")

    /* Collection */
    val hobbies = listOf<String>("Coding", "Music", "Football")
    println(hobbies)

    // Loops
    for (hobby in hobbies) {
        println("In free time,I would like to do ${hobby}")
    }
    //While
    var user: Boolean = true
    while (user) {
        println("Auth")
        user = false
    }

    // Functions
    fun showInfo(name: String, age: Int) {
        print("My name is ${name} and I am ${age} years old\n")
    }

    showInfo("Sai", 20)
    showInfo(name = "Meng", 35)

    fun addFive(number: Int): Int {
        return number + 5
    }

    addFive(20)
    addFive(-80)
    print("5 + 5 is ${addFive(number = 5)}\n")

}
