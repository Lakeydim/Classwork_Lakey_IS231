fun main() {
    println("Введите два числа с разной четностью:")
    val firstNum = readLine()!!.toInt()
    val secondNum = readLine()!!.toInt()
    if ((firstNum % 2 != 0 && secondNum % 2 == 0) || (firstNum % 2 == 0 && secondNum % 2 != 0)) {
        val oddNum = if (firstNum % 2 != 0) firstNum else secondNum
        println("Нечетное число: $oddNum")
    } else {
        println("Ошибка: числа должны быть с разной четностью.")
    }
}