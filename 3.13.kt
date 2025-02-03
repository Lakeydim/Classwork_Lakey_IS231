fun main() {
    println("Введите четырехзначное число:")
    val fourDigitNumber = readLine()!!.toInt()
    val firstDigit = fourDigitNumber / 1000
    val secondDigit = (fourDigitNumber / 100) % 10
    val thirdDigit = (fourDigitNumber / 10) % 10
    val fourthDigit = fourDigitNumber % 10
    // а) Сравнение сумм первых и последних двух цифр
    val sumFirstTwo = firstDigit + secondDigit
    val sumLastTwo = thirdDigit + fourthDigit
    println("Сумма двух первых цифр равна сумме двух последних: ${sumFirstTwo == sumLastTwo}")
    // б) Кратность суммы цифр трем
    val totalSum = firstDigit + secondDigit + thirdDigit + fourthDigit
    println("Сумма цифр кратна трём: ${totalSum % 3 == 0}")
    // в) Кратность произведения цифр четырем
    val productOfDigits = firstDigit * secondDigit * thirdDigit * fourthDigit
    println("Произведение цифр кратно четырем: ${productOfDigits % 4 == 0}")
    // г) Кратность произведения цифр числу a
    println("Введите число a:")
    val a = readLine()!!.toInt()
    println("Произведение цифр кратно числу $a: ${productOfDigits % a == 0}")
}