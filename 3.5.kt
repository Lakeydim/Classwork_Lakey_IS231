fun main() {
    println("Введите длины трех сторон треугольника:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()
    if (a + b > c && a + c > b && b + c > a) {
        println("Треугольник с такими сторонами существует.")
    } else {
        println("Треугольник с такими сторонами не существует.")
    }
}