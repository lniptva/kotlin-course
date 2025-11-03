package ru.stimmax.kotlin_course.lessons.lesson16.homework.printers

// Абстрактный класс принтера
abstract class Printer {
    abstract fun print(text: String)
}

// Лазерный принтер
class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            println(word)
        }
    }
}

// Струйный принтер
class InkjetPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            println(word)
        }
    }
}

// Проверяем работу принтеров
fun main() {
    val laser = LaserPrinter()
    val inkjet = InkjetPrinter()

    println("Лазерный принтер:")
    laser.print("This is a simple text for the laser printer")

    println("\nСтруйный принтер:")
    inkjet.print("This is an example of an inkjet printer output")
}
