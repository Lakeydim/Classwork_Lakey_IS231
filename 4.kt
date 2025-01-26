fun main() {
    println("Введите число:")
    val number = readLine()?.toDoubleOrNull()
    println("Введите степень:")
    val exponent = readLine()?.toIntOrNull()
    if (number != null && exponent != null) {
        val result = Math.pow(number, exponent.toDouble())
        println("$number в степени $exponent равно $result")
    } else {
        println("Ошибка: Введены некорректные значения.")
    }
}