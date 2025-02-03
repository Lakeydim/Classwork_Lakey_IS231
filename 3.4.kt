fun main() {
    println("Введите большее число:")
    val greaterNum = readLine()!!.toInt()
    println("Введите меньшее число:")
    val lesserNum = readLine()!!.toInt()
    if (greaterNum % lesserNum == 0) {
        println("$greaterNum кратно $lesserNum.")
    } else {
        val remainder = greaterNum % lesserNum
        println("$greaterNum не кратно $lesserNum. Остаток от деления: $remainder")
    }
}