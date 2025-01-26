fun main() {
    val X = false // Ложь
    val Y = true  // Истина
    val Z = false // Ложь
    val resultA = X || Z // X или Z
    val resultB = X && Y // X и Y
    val resultC = X && Z // X и Z
    println("X или Z: $resultA")
    println("X и Y: $resultB")
    println("X и Z: $resultC")
}