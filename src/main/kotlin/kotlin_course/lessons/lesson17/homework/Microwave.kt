package ru.stimmax.kotlin_course.lessons.lesson17.homework

// Микроволновая печь — конкретный класс, реализующий поведение.
// Отвечает на вопрос "что делает микроволновка", а не "как".
class Microwave(
    brand: String,
    serialNumber: String
) : HouseholdAppliance(brand), Programmable {

    override val applianceType: String = "Микроволновая печь"
    override val deviceId: String = serialNumber

    private val programs = mapOf(
        1 to "Разогрев супа",
        2 to "Разогрев хлеба",
        3 to "Разморозка продуктов"
    )

    private var selectedProgram = 1

    override fun operate() {
        if (!isPoweredOn) {
            println("Микроволновая печь $brand выключена. Включите её перед использованием.")
            return
        }
        println("Выполняется программа: ${programs[selectedProgram]}")
        performMaintenance()
    }

    override fun selectProgram(preset: Int) {
        if (programs.containsKey(preset)) {
            selectedProgram = preset
            println("Выбрана программа: ${programs[preset]}")
        } else {
            println("Такой программы нет.")
        }
    }

    override fun performMaintenance() {
        super.performMaintenance()
        println("Чистка внутренней камеры микроволновки $brand завершена.")
    }
}
