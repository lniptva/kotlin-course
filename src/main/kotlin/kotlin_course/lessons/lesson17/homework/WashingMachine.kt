package ru.stimmax.kotlin_course.lessons.lesson17.homework

// Стиральная машина – пример ещё одного абстрактного устройства с программами.
class WashingMachine(
    brand: String,
    serialNumber: String
) : HouseholdAppliance(brand), Programmable {

    override val applianceType: String = "Стиральная машина"
    override val deviceId: String = serialNumber

    private val programs = mapOf(
        1 to "Быстрая стирка (30 мин)",
        2 to "Стирка хлопка (60 мин)",
        3 to "Деликатная стирка (40 мин)"
    )

    private var selectedProgram = 1

    override fun operate() {
        if (!isPoweredOn) {
            println("Стиральная машина $brand выключена. Включите её перед стиркой.")
            return
        }
        println("Начата программа: ${programs[selectedProgram]}")
        performMaintenance()
    }

    override fun selectProgram(preset: Int) {
        if (programs.containsKey(preset)) {
            selectedProgram = preset
            println("Выбрана программа: ${programs[preset]}")
        } else {
            println("Ошибка: программа не найдена.")
        }
    }

    override fun performMaintenance() {
        super.performMaintenance()
        println("Проверка фильтра и барабана у стиральной машины $brand завершена.")
    }
}
