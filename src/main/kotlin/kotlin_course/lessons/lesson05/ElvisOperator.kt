package ru.stimmax.kotlin_course.lessons.lesson05

fun main() {
    // Задача 1
    val intensity: Double = 100.0
    val attenuation: Double? = null
    val result1 = intensity * (attenuation ?: 0.5)
    println("Интенсивность звука после затухания: $result1")

    // Задача 2
    val cargoCost: Double? = null
    val cost = cargoCost ?: 50.0
    val insurance = cost * 0.005
    val result2 = cost + insurance
    println("Полная стоимость доставки: $result2")

    // Задача 3
    val pressure: Double? = null
    if (pressure == null) {
        println("Ошибка: отсутствуют показания атмосферного давления")
    } else {
        println("Атмосферное давление: $pressure")
    }
}
