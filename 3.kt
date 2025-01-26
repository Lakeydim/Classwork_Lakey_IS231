fun main() {
    println("Введите первое число (делимое):")
    val dividend = readLine()?.toDoubleOrNull()
    println("Введите второе число (делитель):")
    val divisor = readLine()?.toDoubleOrNull()
    if (dividend != null && divisor != null) {
        // Проверка на деление на ноль
        if (divisor != 0.0) {
            val result = dividend / divisor
            println("Результат деления $dividend на $divisor равен $result")
        } else {
            println("Ошибка: Деление на ноль невозможно.")
        }
    } else {
        println("Ошибка: Введены некорректные числа.")
    }
}