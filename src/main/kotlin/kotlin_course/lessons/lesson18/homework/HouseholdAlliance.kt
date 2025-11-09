package ru.stimmax.kotlin_course.lessons.lesson17.homework

// Абстрактный класс описывает общие характеристики бытовых приборов.
// Он реализует интерфейс Device, но не конкретизирует детали работы.
abstract class HouseholdAppliance(
    val brand: String
) : Device {

    abstract val applianceType: String

    var isPoweredOn: Boolean = false
        private set

    abstract fun operate()

    override fun turnOn() {
        isPoweredOn = true
        showState()
    }

    override fun turnOff() {
        isPoweredOn = false
        showState()
    }

    private fun showState() {
        val state = if (isPoweredOn) "включено" else "выключено"
        println("$applianceType $brand $state.")
    }

    protected open fun performMaintenance() {
        println("*** Выполняется обслуживание устройства $brand ***")
    }
}
