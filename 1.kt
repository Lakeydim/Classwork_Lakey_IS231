fun main() {
    println("Введите двузначное число:")
    val number = readLine()?.toIntOrNull()
    if (number != null && number in 10..99) {
        val tens = number / 10
        val units = number % 10
        val sum = tens + units
        val product = tens * units
        println("Число десятков: $tens")
        println("Число единиц: $units")
        println("Сумма цифр: $sum")
        println("Произведение цифр: $product")
    } else {
        println("Ошибка: введено не двузначное число.")
    }
}