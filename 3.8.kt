fun main() {
    println("Введите расстояние в километрах:")
    val kilometers = readLine()!!.toDouble()
    println("Введите расстояние в футах:")
    val feet = readLine()!!.toDouble()
    // Переводим футы в километры (1 фут = 0.000305 км)
    val feetInKilometers = feet * 0.000305
    if (kilometers < feetInKilometers) {
        println("Расстояние в километрах меньше расстояния в футах.")
    } else if (kilometers > feetInKilometers) {
        println("Расстояние в километрах больше расстояния в футах.")
    } else {
        println("Расстояния равны.")
    }
}