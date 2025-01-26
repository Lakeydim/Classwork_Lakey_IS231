fun main() {
    println("Введите трехзначное число:")
    val number = readLine()?.toIntOrNull()
    if (number != null && number in 100..999) {
        val hundreds = number / 100
        val tens = (number / 10) % 10
        val units = number % 10
        val sum = hundreds + tens + units
        val product = hundreds * tens * units
        println("Число единиц: $units")
        println("Число десятков: $tens")
        println("Сумма цифр: $sum")
        println("Произведение цифр: $product")
    } else {
        println("Ошибка: введено не трехзначное число.")
    }
}