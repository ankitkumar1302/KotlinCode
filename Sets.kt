fun main() {

//Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
    val readOnlyFruits = setOf("banana", "apple", "cherry", "banana")
    // Cant use Index because it is unordered
    println(readOnlyFruits)

    val fruits: MutableSet<String> = mutableSetOf("apple", "orange", "kiwi")
    println(fruits)
//  To prevent unwanted modifications, obtain read-only views of mutable sets by casting them to Set:
//    val fruitLocked: Set<String> = fruits

    // Use of .count function
//    println("The count of fruits is ${fruits.count()} count")
//    println("The count of fruits is ${readOnlyFruits.count()} count")

    // use of add() & remove()
//    fruits.add("dragon fruit")
//    println(fruits)
//    fruits.remove("apple")
//    println(fruits)

    // Use of in operator
//    println("banana" in readOnlyFruits) //true
//    println("kiwi" in fruits)
}