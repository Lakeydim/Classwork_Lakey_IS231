fun main() {
    // Задаем значения логических величин
    val a = true   // Истина
    val b = false  // Ложь
    val c = false  // Ложь
    val resultA = a || !(a && b) || c          // A или не (A и B) или C
    val resultB = !a || (a && (b || c))       // не A или A и (B или C)
    val resultC = (a || (b && !c)) && c       // (A или (B и не C)) и C
    println("а) A или не (A и B) или C: $resultA")
    println("б) не A или A и (B или C): $resultB")
    println("в) (A или (B и не C)) и C: $resultC")
}