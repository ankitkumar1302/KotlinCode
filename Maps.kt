fun main() {

    /*
    * Maps store items as key-value pairs.
    * You access the value by referencing the key.
    * You can imagine a map like a food menu. You can find the price (value),
    * by finding the food (key) you want to eat.
    * Maps are useful if you want to look up a value without using a numbered index, like in a list.
    * */

    val readOnlyMap = mapOf("orange" to 52, "apple" to 22, "banana" to 69)
    println(readOnlyMap)

    val juice: MutableMap<String, Int> = mutableMapOf("orange" to 22, "kiwi" to 44, "grapes" to 88)
    println(juice)
//    val juiceLocked: Map<String, Int> = juice

//    println("In Map the value of apple is ${readOnlyMap["apple"]}")
//    println("In Map the value of orange is ${readOnlyMap["orange"]}")

    // .count function
//    println("The map has ${readOnlyMap.count()} pairs")

    // use of .put() & .remove()
//    juice.put("coconut", 75)
//    println(juice)
//
//    juice.remove("coconut")
//    println(juice)

    //.containsKey() function check the specific key is included in a map or not then return a boolean value
//    println("The constraint key of the fruit is ${readOnlyMap.containsKey("orange")}") // true

    // To obtain a collection of the keys or values of a map,
    // use the keys and values properties respectively:
//    println(readOnlyMap.keys)
//    println(readOnlyMap.values)

    // check the key or value is in the map or return thr true/false
//    println("orange" in readOnlyMap) // true
}




