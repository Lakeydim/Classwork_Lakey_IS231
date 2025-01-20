fun main() {
    val intVar: Int = 42
    val doubleVar: Double = 3.14
    val stringVar: String = "Привет, мир!"
    val booleanVar: Boolean = true
    val charVar: Char = 'K'
    val floatVar: Float = 2.5f
    val longVar: Long = 123456789L
    val shortVar: Short = 1000
    val byteVar: Byte = 127

    val info = """
        |===============================
        | Информация о типах данных в Kotlin
        |===============================
        | Целочисленные типы:
        | - Int: $intVar
        | - Long: $longVar
        | - Short: $shortVar
        | - Byte: $byteVar
        | Вещественные типы:
        | - Double: $doubleVar
        | - Float: $floatVar
        | Символьный тип:
        | - Char: $charVar
        | Логический тип:
        | - Boolean: $booleanVar
        | Строковый тип:
        | - String: "$stringVar"
        |===============================
    """.trimMargin()

    println(info)
}