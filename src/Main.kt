// simple version below
/*fun main() {
    val consoles = arrayOf("Playstation 5", "Xbox Series X", "Nintendo Switch", "VR", "PC")
    consoles.forEach { println(it) }
}*/
// complex version below
fun printArray(array: Array<String>) {
    for (item in array) {
        println(item)
    }
}
fun main() {
    val consoles = arrayOf("Playstation 5", "Xbox Series X", "Nintendo Switch", "VR", "PC")

    printArray(consoles)
}