import kotlin.math.sqrt
fun main() {
    println("Введите число, для которого хотите найти квадратный корень:")
    val input = readLine()
    if (input != null) {
        try {
            val number = input.toDouble() // Преобразование строки в число
            if (number < 0) {
                println("Квадратный корень из отрицательного числа не существует.")
            } else {
                val squareRoot = sqrt(number)
                println("Квадратный корень из $number равен $squareRoot")
            }
        } catch (e: NumberFormatException) {
            println("Ошибка: введено не число.")
        }
    } else {
        println("Ошибка: пустой ввод.")
    }
}