fun main() {
    println("Введите двузначное число:")
    val twoDigitNumber = readLine()!!.toInt()
    val firstDigit = twoDigitNumber / 10
    val secondDigit = twoDigitNumber % 10
    // Сравнение цифр
    if (firstDigit > secondDigit) {
        println("Первая цифра ($firstDigit) больше второй ($secondDigit).")
    } else if (firstDigit < secondDigit) {
        println("Вторая цифра ($secondDigit) больше первой ($firstDigit).")
    } else {
        println("Цифры одинаковы: $firstDigit и $secondDigit.")
    }
}