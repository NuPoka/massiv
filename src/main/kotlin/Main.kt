import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Запрашиваем количество строк и столбцов
    print("Введите количество строк: ")
    val rows = scanner.nextInt()
    print("Введите количество столбцов: ")
    val cols = scanner.nextInt()

    // Создаем двумерный массив заданного размера
    val array = Array(rows) { IntArray(cols) }

    // Заполняем массив введенными числами
    println("Введите ${rows * cols} трехзначных чисел:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = scanner.nextInt()
        }
    }

    // Создаем множество для хранения уникальных цифр
    val digits = mutableSetOf<Int>()

    // Считаем количество различных цифр в массиве
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            var number = array[i][j]
            while (number > 0) {
                digits.add(number % 10)
                number /= 10
            }
        }
    }

    // Выводим массив и количество различных цифр
    println("Двумерный массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${array[i][j]} ")
        }
        println()
    }
    println("В массиве использовано ${digits.size} различных цифр")
}