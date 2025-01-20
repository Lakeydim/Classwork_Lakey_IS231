fun main() {
    println("Введите число:")
    val input = readLine()
    if (input != null && input.isNotEmpty()) {
        val number = input.toIntOrNull()
        if (number != null) {
            println("$number — вот какое число Вы ввели")
        } else {
            println("Ошибка: введено не число.")
        }
    } else {
        println("Ошибка: не было введено ни одного значения.")
    }
}