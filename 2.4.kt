fun main() {
    val X = true   // Истина
    val Y = true   // Истина
    val Z = false  // Ложь
    val resultA = !X && Y          // не X и Y
    val resultB = X || !Y          // X или не Y
    val resultC = X || (Y && Z)    // X или (Y и Z)
    println("не X и Y: $resultA")
    println("X или не Y: $resultB")
    println("X или (Y и Z): $resultC")
}