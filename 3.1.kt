fun main() {
    println("Введите три числа:")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    val maxNum = maxOf(num1, num2, num3)
    println("Максимальное число: $maxNum")
}