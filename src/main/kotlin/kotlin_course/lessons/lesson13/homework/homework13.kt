package ru.stimmax.kotlin_course.lessons.lesson13.homework

fun main() {

    // Создадим тестовые словари для примеров
    //1.
    val testTimes = mapOf("LoginTest" to 12.4, "RegistrationTest" to 8.5, "SearchTest" to 15.2)
    //2.
    val testMetadata = mapOf("testLogin" to "UI, regression", "testRegister" to "API, smoke", "testSearch" to "UI, performance")
    //3-4.
    val testResults = mutableMapOf("Test1" to "passed", "Test2" to "failed", "Test3" to "passed", "Test4" to "skipped")
    //5.
    val bugTracker = mutableMapOf("BUG-101" to "fixed", "BUG-102" to "in progress", "BUG-103" to "open")
    //6.
    val webResults = mapOf("index.html" to 200, "login.html" to 404, "about.html" to 200)
    //7.
    val responseTimes = mapOf("authService" to 320, "userService" to 180, "paymentService" to 500)
    //8.
    val apiStatuses = mapOf("getUser" to "OK", "updateUser" to "Failed", "deleteUser" to "Skipped")
    //9.
    val config = mapOf("os" to "Windows", "browserType" to "Chrome", "resolution" to "1920x1080")
    //10.
    val versions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    //11.
    val deviceSettings = mapOf("Samsung S21" to "Android 13", "iPhone 14" to "iOS 17")
    //12.
    val testErrors = mapOf(404 to "Page not found", 500 to "Internal error", 403 to "Forbidden")
    //13.
    val testScenarios = mapOf("TestA_v1" to "Passed", "TestB_v2" to "Failed", "TestC_v2" to "Skipped")
    //14.
    val moduleResults = mapOf("Auth" to "Passed", "Payments" to "Failed", "Profile" to "Passed")
    //15.
    val envSettings = mutableMapOf("os" to "Windows", "browser" to "Chrome")
   //16.
    val bugsA = mapOf("BUG-1" to "fixed", "BUG-2" to "open")
    val bugsB = mapOf("BUG-3" to "in review")
    //17.
    val tempData = mutableMapOf("session1" to "done", "session2" to "done")
    //18.
    val reportData = mapOf("TestLogin" to "passed", "TestLogout" to "skipped", "TestSearch" to "failed")
    //19-21.
    val configCopy = mapOf("os" to "Windows", "browser" to "Chrome", "resolution" to "FullHD")
    //22.
    val testExecution = mapOf(1 to 12.5, 2 to 8.3, 3 to 15.7)
    //23.
    val perfResults = mapOf("v1.0" to 120.5, "v2.0" to 98.3)
    //24.
    val compileErrors = emptyMap<Int, String>()
    //25-27.
    val loadResults = mapOf("Test1" to "passed", "Test2" to "failed", "Test3" to "passed")
    //28.
    val serviceResults = mapOf("optionalTest1" to "failed", "mainTest" to "passed", "optionalTest2" to "skipped")

    // 1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
    // Определите среднее время выполнения теста.
    val averageTime = testTimes.values.average()
    println("Среднее время выполнения теста: $averageTime")

    // 2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов, а значения - строка с метаданными.
    // Выведите список всех тестовых методов.
    println("Методы тестов: ${testMetadata.keys}")

    // 3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    testResults["Test5"] = "passed"
    println("Добавлен новый тест: $testResults")

    // 4. Посчитайте количество успешных тестов в словаре с результатами
    // (ключ - название, значение - результат из passed, failed, skipped).
    val passedCount = testResults.count { it.value == "passed" }
    println("Количество успешных тестов: $passedCount")

    // 5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен
    // (ключ - название, значение - статус исправления).
    bugTracker.remove("BUG-101")
    println("После удаления исправленного бага: $bugTracker")

    // 6. Для словаря с результатами тестирования веб-страниц
    // (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    webResults.forEach { (page, status) -> println("Страница $page вернула статус $status") }

    // 7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val slowServices = responseTimes.filterValues { it > 250 }
    println("Медленные сервисы: $slowServices")

    // 8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
    // Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val endpoint = "createUser"
    val status = apiStatuses.getOrElse(endpoint) { "Not tested" }
    println("Статус $endpoint: $status")

    // 9. Из словаря, содержащего конфигурации тестового окружения
    // (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType".
    // Ответ не может быть null.
    val browser = config.getValue("browserType")
    println("Тип браузера: $browser")

    // 10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val newVersions = versions + ("v1.2" to "alpha")
    println("Словарь версий: $newVersions")

    // 11. Используя словарь с настройками тестирования для различных мобильных устройств
    // (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val model = "Pixel 7"
    val settings = deviceSettings.getOrDefault(model, "Default settings")
    println("Настройки для $model: $settings")

    // 12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val has404 = testErrors.containsKey(404)
    println("Есть ли ошибка 404: $has404")

    // 13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    // Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val version2Tests = testScenarios.filterKeys { it.contains("v2") }
    println("Сценарии v2: $version2Tests")

    // 14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
    // Проверьте, есть ли модули с неудачным тестированием.
    val hasFailedModules = moduleResults.any { it.value == "Failed" }
    println("Есть ли провальные модули: $hasFailedModules")

    // 15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    envSettings.putAll(mapOf("resolution" to "4K", "network" to "5G"))
    println("Обновленные настройки среды: $envSettings")

    // 16. Объедините два неизменяемых словаря с данными о багах.
    val allBugs = bugsA + bugsB
    println("Объединенные баги: $allBugs")

    // 17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    tempData.clear()
    println("После очистки: $tempData")

    // 18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”).
    // Ключи - название теста, значения - статус.
    val withoutSkipped = reportData.filterNot { it.value == "skipped" }
    println("Без пропущенных тестов: $withoutSkipped")

    // 19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val reducedConfig = configCopy - listOf("resolution", "browser")
    println("Копия без некоторых настроек: $reducedConfig")

    // 20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
    // (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testReport = reportData.map { "Test ID: ${it.key}, Result: ${it.value}" }
    println("Отчет:\n$testReport")

    // 21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val immutableResults = testResults.toMap()
    println("Неизменяемая копия: $immutableResults")

    // 22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val stringIdMap = testExecution.mapKeys { it.key.toString() }
    println("Ключи как строки: $stringIdMap")

    // 23. Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val updatedPerf = perfResults.mapValues { it.value * 1.1 }
    println("Увеличенные оценки: $updatedPerf")

    // 24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
    println("Ошибки компиляции пусты: ${compileErrors.isEmpty()}")

    // 25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    println("Результаты нагрузочного тестирования не пусты: ${loadResults.isNotEmpty()}")

    // 26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val allPassed = loadResults.all { it.value == "passed" }
    println("Все тесты успешны: $allPassed")

    // 27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val anyFailed = loadResults.any { it.value == "failed" }
    println("Есть ли ошибки: $anyFailed")

    // 28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val optionalFailed = serviceResults.filter { it.key.contains("optional") && it.value != "passed" }
    println("Неудачные optional-тесты: $optionalFailed")
}
