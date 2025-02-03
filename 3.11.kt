fun main() {
    println("Введите натуральное число:")
    val number = readLine()!!.toInt()
    // Проверка на четность
    val isEven = number % 2 == 0
    println("Число $number является четным: $isEven")
    // Проверка, заканчивается ли число на 7
    val endsWithSeven = number % 10 == 7
    println("Число $number заканчивается на 7: $endsWithSeven")
}