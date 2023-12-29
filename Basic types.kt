fun main() {

    val readonlyShapes = listOf("Triangle", "Square", "Circle")
    println(readonlyShapes)
    //println(readonlyShapes)
    //println("In the 0th Index the name of the shape is ${readonlyShapes[0]}")

    //.first() and .last() functions are examples of extension functions.
//    println("In the first Index the name of the shape is ${readonlyShapes.first()}")
//    println("In the first Index the name of the shape is ${readonlyShapes.last()}")

    //To get the number of items in a list, use the .count() function:
//    println("The list has ${readonlyShapes.count()} + items")

    //To check that an item is in a list, use the in operator:
//    println("Circle" in readonlyShapes) // true


    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("Triangle", "Square", "Circle")
//    println(shapes)
    /*
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked: List<String> = shapes

    This is also called casting.

     */

    //To add or remove items from a mutable list, use .add() and .remove() functions respectively:

    shapes.add("Rectangle")
    println("The Updated List is $shapes")
    shapes.remove("Rectangle")
    println("The Updated List is $shapes")





}