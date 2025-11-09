package ru.stimmax.kotlin_course.lessons.lesson17.homework

// Интерфейс описывает общие свойства и поведение всех устройств.
interface Device : Powerable {

    companion object {
        const val TYPE = "Device"
    }

    val deviceId: String

    fun restart() {
        turnOff()
        logAction("Устройство $deviceId выключено для перезагрузки.")
        turnOn()
        logAction("Устройство $deviceId включено после перезагрузки.")
    }

    private fun logAction(action: String) {
        println("* Лог: $action *")
    }
}
