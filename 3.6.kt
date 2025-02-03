fun main() {
    println("Введите год:")
    val year = readLine()!!.toInt()
    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    if (isLeapYear) {
        println("$year - високосный год. В этом году 366 дней.")
    } else {
        println("$year - невисокосный год. В этом году 365 дней.")
    }
}
