package ru.stimmax.kotlin_course.lessons.lesson17.homework

fun main() {
    val microwave = Microwave("Samsung", "MW-908X")
    val washer = WashingMachine("LG", "WM-220Q")
    val kettle = Kettle("Bosch", "KT-10L")

    println("=== Проверка устройств ===")

    println("\nМикроволновка:")
    microwave.selectProgram(2)
    microwave.turnOn()
    microwave.operate()
    microwave.restart()
    microwave.operate()
    microwave.turnOff()

    println("\nСтиральная машина:")
    washer.selectProgram(3)
    washer.turnOn()
    washer.operate()
    washer.turnOff()

    println("\nЧайник:")
    kettle.turnOn()
    kettle.operate()
    kettle.turnOff()
}
