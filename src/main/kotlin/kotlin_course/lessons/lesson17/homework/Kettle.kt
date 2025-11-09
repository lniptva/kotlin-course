package ru.stimmax.kotlin_course.lessons.lesson17.homework

// Электрочайник — пример устройства без программ, но с включением и выключением.
class Kettle(
    brand: String,
    serialNumber: String
) : HouseholdAppliance(brand) {

    override val applianceType: String = "Электрочайник"
    override val deviceId: String = serialNumber

    override fun operate() {
        if (isPoweredOn) {
            println("Чайник $brand кипятит воду.")
            performMaintenance()
        } else {
            println("Чайник $brand выключен.")
        }
    }

    override fun performMaintenance() {
        super.performMaintenance()
        println("Удаление накипи в чайнике $brand завершено.")
    }
}
