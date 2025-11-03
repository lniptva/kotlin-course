package ru.stimmax.kotlin_course.lessons.lesson16.homework.logger

// Класс логгера

class Logger {
    // Простой лог — по умолчанию INFO
    fun log(message: String) {
        println("INFO: $message")
    }

    // Лог с указанием уровня
    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("WARNING: $message")
            "ERROR" -> println("ERROR: $message")
            "DEBUG" -> println("DEBUG: $message")
            else -> log(message)
        }
    }

    // Лог списка сообщений
    fun log(messages: List<String>) {
        for (msg in messages) {
            log(msg)
        }
    }

    // Лог исключения (ошибки)
    fun log(exception: Exception) {
        println("ERROR: ${exception.message}")
    }
}

// Проверяем работу логгера
fun main() {
    val logger = Logger()

    logger.log("System started")
    logger.log("WARNING", "Low battery")
    logger.log("ERROR", "File not found")
    logger.log("DEBUG", "Variable x = 42")

    logger.log(listOf("Initialization complete", "User logged in", "Data loaded"))

    logger.log(Exception("Unexpected null value"))
}
