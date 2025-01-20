fun main() {
    println("Введите число:")
    val input = readLine()
        if (input != null) {
        println("Вы ввели число: $input")
    } else {
        println("Ошибка: не было введено число.")
    }
}