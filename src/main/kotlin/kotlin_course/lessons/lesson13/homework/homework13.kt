package ru.stimmax.kotlin_course.lessons.lesson13.homework

fun main() {

    // Создадим тестовые словари для примеров
    val testTimes = mapOf("LoginTest" to 12.4, "RegistrationTest" to 8.5, "SearchTest" to 15.2)
    val testMetadata = mapOf("testLogin" to "UI, regression", "testRegister" to "API, smoke", "testSearch" to "UI, performance")
    val testResults = mutableMapOf("Test1" to "passed", "Test2" to "failed", "Test3" to "passed", "Test4" to "skipped")
    val bugTracker = mutableMapOf("BUG-101" to "fixed", "BUG-102" to "in progress", "BUG-103" to "open")
    val webResults = mapOf("index.html" to 200, "login.html" to 404, "about.html" to 200)
    val responseTimes = mapOf("authService" to 320, "userService" to 180, "paymentService" to 500)
    val apiStatuses = mapOf("getUser" to "OK", "updateUser" to "Failed", "deleteUser" to "Skipped")
    val config = mapOf("os" to "Windows", "browserType" to "Chrome", "resolution" to "1920x1080")
    val versions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val deviceSettings = mapOf("Samsung S21" to "Android 13", "iPhone 14" to "iOS 17")
    val testErrors = mapOf(404 to "Page not found", 500 to "Internal error", 403 to "Forbidden")
    val testScenarios = mapOf("TestA_v1" to "Passed", "TestB_v2" to "Failed", "TestC_v2" to "Skipped")
    val moduleResults = mapOf("Auth" to "Passed", "Payments" to "Failed", "Profile" to "Passed")
    val envSettings = mutableMapOf("os" to "Windows", "browser" to "Chrome")
    val bugsA = mapOf("BUG-1" to "fixed", "BUG-2" to "open")
    val bugsB = mapOf("BUG-3" to "in review")
    val tempData = mutableMapOf("session1" to "done", "session2" to "done")
    val reportData = mapOf("TestLogin" to "passed", "TestLogout" to "skipped", "TestSearch" to "failed")
    val configCopy = mapOf("os" to "Windows", "browser" to "Chrome", "resolution" to "FullHD")
    val testExecution = mapOf(1 to 12.5, 2 to 8.3, 3 to 15.7)
    val perfResults = mapOf("v1.0" to 120.5, "v2.0" to 98.3)
    val compileErrors = emptyMap<Int, String>()
    val loadResults = mapOf("Test1" to "passed", "Test2" to "failed", "Test3" to "passed")
    val serviceResults = mapOf("optionalTest1" to "failed", "mainTest" to "passed", "optionalTest2" to "skipped")

    // 1. Определите среднее время выполнения теста
    val averageTime = testTimes.values.average()
    println("Среднее время выполнения теста: $averageTime")

    // 2. Выведите список всех тестовых методов
    println("Методы тестов: ${testMetadata.keys}")

    // 3. Добавьте новый тест и его результат
    testResults["Test5"] = "passed"
    println("Добавлен новый тест: $testResults")

    // 4. Посчитайте количество успешных тестов
    val passedCount = testResults.count { it.value == "passed" }
    println("Количество успешных тестов: $passedCount")

    // 5. Удалите исправленный баг
    bugTracker.remove("BUG-101")
    println("После удаления исправленного бага: $bugTracker")

    // 6. Сообщение о странице и статусе проверки
    webResults.forEach { (page, status) -> println("Страница $page вернула статус $status") }

    // 7. Найдите сервисы с временем ответа выше порога
    val slowServices = responseTimes.filterValues { it > 250 }
    println("Медленные сервисы: $slowServices")

    // 8. Найдите статус endpoint или сообщение по умолчанию
    val endpoint = "createUser"
    val status = apiStatuses.getOrElse(endpoint) { "Not tested" }
    println("Статус $endpoint: $status")

    // 9. Получите значение для browserType (не может быть null)
    val browser = config.getValue("browserType")
    println("Тип браузера: $browser")

    // 10. Копия словаря с добавлением новой версии
    val newVersions = versions + ("v1.2" to "alpha")
    println("Словарь версий: $newVersions")

    // 11. Получите настройки устройства или дефолтные
    val model = "Pixel 7"
    val settings = deviceSettings.getOrDefault(model, "Default settings")
    println("Настройки для $model: $settings")

    // 12. Проверка, содержит ли словарь код ошибки
    val has404 = testErrors.containsKey(404)
    println("Есть ли ошибка 404: $has404")

    // 13. Отфильтруйте сценарии по версии v2
    val version2Tests = testScenarios.filterKeys { it.contains("v2") }
    println("Сценарии v2: $version2Tests")

    // 14. Проверка наличия неудачных тестов
    val hasFailedModules = moduleResults.any { it.value == "Failed" }
    println("Есть ли провальные модули: $hasFailedModules")

    // 15. Добавление настроек из другого словаря
    envSettings.putAll(mapOf("resolution" to "4K", "network" to "5G"))
    println("Обновленные настройки среды: $envSettings")

    // 16. Объедините два словаря с багами
    val allBugs = bugsA + bugsB
    println("Объединенные баги: $allBugs")

    // 17. Очистите словарь
    tempData.clear()
    println("После очистки: $tempData")

    // 18. Исключите пропущенные тесты
    val withoutSkipped = reportData.filterNot { it.value == "skipped" }
    println("Без пропущенных тестов: $withoutSkipped")

    // 19. Копия конфигураций без некоторых настроек
    val reducedConfig = configCopy - listOf("resolution", "browser")
    println("Копия без некоторых настроек: $reducedConfig")

    // 20. Создайте отчет в виде списка строк
    val testReport = reportData.map { "Test ID: ${it.key}, Result: ${it.value}" }
    println("Отчет:\n$testReport")

    // 21. Преобразуйте изменяемый словарь в неизменяемый
    val immutableResults = testResults.toMap()
    println("Неизменяемая копия: $immutableResults")

    // 22. Преобразуйте ключи чисел в строки
    val stringIdMap = testExecution.mapKeys { it.key.toString() }
    println("Ключи как строки: $stringIdMap")

    // 23. Увеличьте оценки на 10%
    val updatedPerf = perfResults.mapValues { it.value * 1.1 }
    println("Увеличенные оценки: $updatedPerf")

    // 24. Проверка, пуст ли словарь с ошибками компиляции
    println("Ошибки компиляции пусты: ${compileErrors.isEmpty()}")

    // 25. Проверка, что словарь не пуст
    println("Результаты нагрузочного тестирования не пусты: ${loadResults.isNotEmpty()}")

    // 26. Проверка, прошли ли все тесты успешно
    val allPassed = loadResults.all { it.value == "passed" }
    println("Все тесты успешны: $allPassed")

    // 27. Проверка, есть ли тесты с ошибками
    val anyFailed = loadResults.any { it.value == "failed" }
    println("Есть ли ошибки: $anyFailed")

    // 28. Фильтрация по условию: не прошли и содержат 'optional'
    val optionalFailed = serviceResults.filter { it.key.contains("optional") && it.value != "passed" }
    println("Неудачные optional-тесты: $optionalFailed")
}
