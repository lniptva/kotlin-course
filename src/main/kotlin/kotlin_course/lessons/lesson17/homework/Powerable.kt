package ru.stimmax.kotlin_course.lessons.lesson17.homework

// Интерфейс определяет, что устройство можно включить и выключить.
// Абстракция отвечает на вопрос "что" делает объект.
interface Powerable {
    fun turnOn()
    fun turnOff()
}
