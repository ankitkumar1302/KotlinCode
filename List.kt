fun main(){
    list()
}
fun list() {
    val array = arrayOf(1, 2, 2)
    val list = mutableListOf(1, 2, 2)

    list.add(3)
    list.remove(2)
    println(list)
}

fun mutList() {
    val list = mutableListOf<Int>()
    for (i in 1..10) {
        val x = readlnOrNull()?.toInt()
        if (x != null) {
            list.add(x)
        }
    }
    println(list)
}