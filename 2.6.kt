fun main() {
    val X = false  // Ложь
    val Y = false  // Ложь
    val Z = true   // Истина
    val resultA = X || (Y && !Z)            // X или (Y и не Z)
    val resultB = !X && !Y                  // не X и не Y
    val resultC = X && !Y || Z              // X и не Y или Z
    val resultD = X && (!Y || Z)            // X и (не Y или Z)
    val resultE = !(X && Z) || Y             // не (X и Z) или Y
    val resultF = X || !(Y || Z)            // X или (не (Y или Z))
    println("а) X или (Y и не Z): $resultA")
    println("б) не X и не Y: $resultB")
    println("г) X и не Y или Z: $resultC")
    println("д) X и (не Y или Z): $resultD")
    println("в) не (X и Z) или Y: $resultE")
    println("е) X или (не (Y или Z)): $resultF") 
}