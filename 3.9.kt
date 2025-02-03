fun main() {
    println("Введите целое число m:")
    val m = readLine()!!.toInt()
    println("Введите целое число n:")
    val n = readLine()!!.toInt()
    if (n != 0) {
        if (m % n == 0) {
            val quotient = m / n
            println("Частное от деления m на n: $quotient")
        } else {
            println("m на n нацело не делится.")
        }
    } else {
        println("Деление на ноль невозможно.")
    }
}