fun main() {
    println("Введите первое вещественное число:")
    val firstNumber = readLine()!!.toDouble()
    println("Введите второе вещественное число:")
    val secondNumber = readLine()!!.toDouble()
    if (firstNumber > secondNumber) {
        println("$firstNumber больше $secondNumber")
        println("$secondNumber меньше $firstNumber")
    } else {
        println("$secondNumber больше $firstNumber")
        println("$firstNumber меньше $secondNumber")
    }
}