fun main() {
    val A = true  // Истина
    val B = false // Ложь
    val C = false // Ложь
    val result1 = !A && B   // не A и B
    val result2 = A || !B   // A или не B
    val result3 = A && B || C // A и B или C
    println("не A и B: $result1")
    println("A или не B: $result2")
    println("A и B или C: $result3")    
}