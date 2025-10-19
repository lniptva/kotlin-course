package ru.stimmax.kotlin_course.lessons.lesson12.homework

fun main() {

    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    // Задания на приведение коллекции к значению

    // 1. Проверить, что размер коллекции больше 5 элементов
    println("1. Размер больше 5: ${numbers.size > 5}") // true

    // 2. Проверить, что коллекция пустая
    println("2. Коллекция пустая: ${numbers.isEmpty()}") // false

    // 3. Проверить, что коллекция не пустая
    println("3. Коллекция не пустая: ${numbers.isNotEmpty()}") // true

    // 4. Взять элемент по индексу или создать значение если индекса не существует
    println("4. Элемент по индексу 10 или -1: ${numbers.getOrElse(10) { -1 }}") // -1

    // 5. Собрать коллекцию в строку
    println("5. Коллекция в строку: ${numbers.joinToString(", ")}") // "-1, 2, -3, 4, -5, 8, 264"

    // 6. Посчитать сумму всех значений
    println("6. Сумма: ${numbers.sum()}") // 269

    // 7. Посчитать среднее
    println("7. Среднее: ${numbers.average()}") // 38.42857142857143

    // 8. Взять максимальное число
    println("8. Максимум: ${numbers.maxOrNull()}") // 264

    // 9. Взять минимальное число
    println("9. Минимум: ${numbers.minOrNull()}") // -5

    // 10. Взять первое число или null
    println("10. Первое или null: ${numbers.firstOrNull()}") // -1

    // 11. Проверить что коллекция содержит элемент (например, 42)
    println("11. Содержит 42: ${numbers.contains(42)}") // false


    // Задания на обработку коллекций

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val words = listOf("яблоко", null, "банан", "вишня", null, "арбуз", "груша")

    // 1. Отфильтровать коллекцию по диапазону 18–30
    println("1. Диапазон 18-30: ${list.filter { it in 18..30 }}") // [23, 18]

    // 2. Выбрать числа, которые не делятся на 2 и 3 одновременно
    println("2. Не делятся на 2 и 3 одновременно: ${list.filterNot { it % 2 == 0 && it % 3 == 0 }}") // [8, 56, 23, 87, 11]

    // 3. Очистить текстовую коллекцию от null элементов
    println("3. Без null: ${words.filterNotNull()}") // [яблоко, банан, вишня, арбуз, груша]

    // 4. Преобразовать текстовую коллекцию в коллекцию длин слов
    println("4. Длины слов: ${words.filterNotNull().map { it.length }}") // [6, 5, 6, 5, 5]

    // 5. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    println("5. Мапа перевёрнутых слов: ${words.filterNotNull().associate { it.reversed() to it.length }}")

    // 6. Отсортировать список в алфавитном порядке
    println("6. Сортировка по алфавиту: ${words.filterNotNull().sorted()}")

    // 7. Взять первые 3 элемента списка
    println("7. Первые 3 слова: ${words.filterNotNull().take(3)}")

    // 8. Распечатать квадраты элементов списка
    println("8. Квадраты чисел:")
    list.forEach { println(it * it) }

    // 9. Группировать список по первой букве слов
    println("9. Группировка по первой букве: ${words.filterNotNull().groupBy { it.first() }}")

    // 10. Очистить список от дублей
    val dupes = listOf(1, 2, 2, 3, 3, 3, 4)
    println("10. Без дублей: ${dupes.distinct()}")

    // 11. Отсортировать список по убыванию
    println("11. По убыванию: ${list.sortedDescending()}")

    // 12. Взять последние 3 элемента списка
    println("12. Последние 3: ${list.takeLast(3)}")


    // Задание 24. Характеристика числовой коллекции
    fun describeCollection(collection: List<Int>): String {
        return when {
            collection.isEmpty() -> "Пусто"
            collection.size < 5 -> "Короткая"
            collection.firstOrNull() == 0 -> "Стартовая"
            collection.sum() > 10000 -> "Массивная"
            collection.average() == 10.0 -> "Сбалансированная"
            collection.joinToString("").length == 20 -> "Клейкая"
            collection.maxOrNull() ?: 0 < -10 -> "Отрицательная"
            collection.minOrNull() ?: 0 > 1000 -> "Положительная"
            3 in collection && 14 in collection -> "Пи***тая"
            else -> "Уникальная"
        }
    }

    println("Задание 24:")
    println(describeCollection(listOf())) // Пусто
    println(describeCollection(listOf(1, 2, 3))) // Короткая
    println(describeCollection(listOf(0, 5, 6))) // Стартовая
    println(describeCollection(listOf(9999, 100, 2))) // Массивная
    println(describeCollection(listOf(5, 10, 15))) // Уникальная
    println(describeCollection(listOf(3, 14))) // Пи***тая


    // Задание 25. Анализ учебных оценок
    fun analyzeGrades(grades: List<Int>): List<Int> {
        return grades
            .filter { it >= 60 }
            .sorted()
            .take(3)
    }

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println("Задание 25: ${analyzeGrades(grades)}") // [67, 74, 85]


    // Задание 26. Создание каталога по первой букве
    fun createCatalog(list: List<String>): Map<Char, List<String>> {
        return list
            .map { it.lowercase() }
            .groupBy { it.first() }
    }

    val furniture = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы",
        "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга",
        "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор",
        "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра",
        "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница",
        "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник",
        "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )

    println("Задание 26:")
    println(createCatalog(furniture))


    // Задание 27. Подсчёт средней длины слов в списке
    fun averageWordLength(list: List<String>): String {
        val avg = list.map { it.length }.average()
        return "Средняя длина слова: %.2f".format(avg)
    }

    println("Задание 27: ${averageWordLength(furniture.map { it.lowercase() })}")


    // Задание 28. Категоризация чисел
    fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
        return numbers
            .distinct()
            .sortedDescending()
            .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
    }

    val nums = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println("Задание 28: ${categorizeNumbers(nums)}")


    // Задание 29. Поиск первого подходящего элемента
    fun findFirstGreaterThan(ages: List<Int?>, limit: Int): Int? {
        return ages.filterNotNull().firstOrNull { it > limit }
    }

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println("Задание 29: ${findFirstGreaterThan(ages, 18)}") // 22
}
