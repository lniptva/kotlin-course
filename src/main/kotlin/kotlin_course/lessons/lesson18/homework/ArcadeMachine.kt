package ru.stimmax.kotlin_course.lessons.lesson18.homework

// Класс описывает игровой автомат.
// Инкапсуляция используется для того, чтобы скрыть внутренние данные и разрешить только осмысленные действия через публичные методы.
class ArcadeMachine(
    val color: String,
    val model: String,
    private val owner: String,
    private val supportPhone: String,
    private val pinCode: Int,
) {

    private var isPoweredOn: Boolean = false
    private var osLoaded: Boolean = false
    private var hasJoystick: Boolean = true
    private var games: MutableList<String> = mutableListOf("Pac-Man", "Tetris", "Street Fighter", "Mortal Kombat")
    private var balance: Double = 0.0
    private var sessionPaid: Boolean = false
    private val sessionCost: Double = 2.50

    // Публичный метод: включить автомат
    fun powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true
            println("Автомат $model включён.")
        } else println("Автомат уже включён.")
    }

    // Публичный метод: выключить автомат
    fun powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false
            osLoaded = false
            println("Автомат $model выключен.")
        } else println("Автомат уже выключен.")
    }

    // Публичный метод: загрузить ОС
    fun loadOS() {
        if (isPoweredOn && !osLoaded) {
            osLoaded = true
            println("ОС игрового автомата загружена.")
        } else if (!isPoweredOn) {
            println("Ошибка: автомат не включён.")
        } else {
            println("ОС уже загружена.")
        }
    }

    // Публичный метод: завершить работу ОС
    fun shutdownOS() {
        if (osLoaded) {
            osLoaded = false
            println("ОС игрового автомата завершила работу.")
        } else println("ОС не была загружена.")
    }

    // Публичный метод: показать список игр
    fun showGames() {
        println("Доступные игры: ${games.joinToString(", ")}")
    }

    // Публичный метод: включить игру
    fun startGame(gameName: String) {
        if (!osLoaded) {
            println("Ошибка: ОС не загружена.")
            return
        }
        if (!sessionPaid) {
            println("Ошибка: игровой сеанс не оплачен.")
            return
        }
        if (gameName !in games) {
            println("Игра $gameName не найдена.")
            return
        }
        println("Игра $gameName запущена! Приятной игры!")
        sessionPaid = false
    }

    // Публичный метод: оплатить игровой сеанс
    fun paySession(amount: Double) {
        if (amount >= sessionCost) {
            balance += sessionCost
            sessionPaid = true
            println("Сеанс оплачен. Можете играть!")
        } else {
            println("Недостаточно средств. Стоимость сеанса $sessionCost.")
        }
    }

    // Публичный метод: получить баланс (только чтение)
    fun getBalance(): Double {
        return balance
    }

    // Публичный метод: попытка снять выручку с пин-кодом
    fun withdrawCash(inputPin: Int) {
        if (inputPin == pinCode) {
            openSafe()
        } else {
            println("Ошибка: неверный пин-код.")
        }
    }

    // Приватный метод: открыть сейф и выдать наличные
    private fun openSafe() {
        println("Сейф открыт владельцем $owner. Выдано: $balance рублей.")
        balance = 0.0
    }
}

fun main() {
    val machine = ArcadeMachine("Красный", "NeoGame-3000", "ООО «ИгроМир»", "+7-800-123-45-67", 4321)

    machine.powerOn()
    machine.loadOS()
    machine.showGames()
    machine.paySession(2.5)
    machine.startGame("Tetris")
    println("Баланс автомата: ${machine.getBalance()}")
    machine.withdrawCash(4321)
    machine.powerOff()
}
