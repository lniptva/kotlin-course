package ru.stimmax.kotlin_course.lessons.lesson06.homework

// Задание 1: "Определение сезона"
// Напишите функцию, которая на основе номера месяца распечатывает сезон года.
// Номера месяцев начинаются с единицы.
fun seasonByMonth(month: Int) {
    if (month !in 1..12) {
        println("Ошибка: номер месяца должен быть от 1 до 12")
        return
    }
    val season = when (month) {
        12, 1, 2 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> "Неизвестно"
    }
    println("Месяц $month — это $season")
}

// Задание 2: "Расчет возраста питомца"
// До 2 лет каждый год собаки равен 10.5 человеческим годам,
// после — каждый год равен 4 человеческим годам.
fun dogAgeToHumanYears(age: Int) {
    if (age < 0) {
        println("Ошибка: возраст не может быть отрицательным")
        return
    }
    val humanAge = if (age <= 2) age * 10.5 else 2 * 10.5 + (age - 2) * 4
    println("Возраст собаки $age лет = $humanAge человеческих лет")
}

// Задание 3: "Определение способа перемещения"
// До 1 км — пешком, до 5 км — велосипед, иначе — автотранспорт.
fun transportByDistance(distance: Int) {
    if (distance < 0) {
        println("Ошибка: расстояние не может быть отрицательным")
        return
    }
    val transport = when {
        distance <= 1 -> "пешком"
        distance <= 5 -> "велосипед"
        else -> "автотранспорт"
    }
    println("Маршрут $distance км — лучше идти $transport")
}

// Задание 4: "Расчет бонусных баллов"
// 2 балла за каждые 100 рублей при сумме покупки до 1000,
// 3 балла — при сумме свыше этого.
fun bonusPoints(purchase: Int) {
    if (purchase < 0) {
        println("Ошибка: сумма не может быть отрицательной")
        return
    }
    val points = if (purchase <= 1000) {
        purchase / 100 * 2
    } else {
        purchase / 100 * 3
    }
    println("Сумма покупки: $purchase руб. — начислено $points баллов")
}

// Задание 5: "Определение типа документа"
// На основе расширения файла определить его тип.
fun documentType(extension: String) {
    val type = when (extension.lowercase()) {
        "txt", "doc", "docx" -> "Текстовый документ"
        "jpg", "png", "gif" -> "Изображение"
        "xls", "xlsx" -> "Таблица"
        else -> "Неизвестный тип"
    }
    println("Файл с расширением .$extension — $type")
}

// Задание 6: "Конвертация температуры"
// Конвертировать из C в F и наоборот, в зависимости от второго аргумента.
fun convertTemperature(value: Double, unit: Char) {
    when (unit) {
        'C', 'c' -> {
            val fahrenheit = value * 9 / 5 + 32
            print("$value°C = $fahrenheit")
            println("F")
        }
        'F', 'f' -> {
            val celsius = (value - 32) * 5 / 9
            print("$value°F = $celsius")
            println("C")
        }
        else -> println("Ошибка: единица измерения должна быть 'C' или 'F'")
    }
}

// Задание 7: "Подбор одежды по погоде"
// < -30 или > +35 — не выходить,
// < +10 — куртка и шапка,
// 10..18 — ветровка,
// > 18 — футболка и шорты.
fun clothingByWeather(temp: Int) {
    val recommendation = when {
        temp < -30 || temp > 35 -> "Рекомендуется не выходить из дома"
        temp < 10 -> "Куртка и шапка"
        temp in 10..18 -> "Ветровка"
        else -> "Футболка и шорты"
    }
    println("Температура $temp°C — рекомендация: $recommendation")
}

// Задание 8: "Выбор фильма по возрасту"
// 0..9 — детские,
// 10..18 — подростковые,
// иначе — 18+.
fun movieByAge(age: Int) {
    if (age < 0) {
        println("Ошибка: возраст не может быть отрицательным")
        return
    }
    val category = when (age) {
        in 0..9 -> "детские"
        in 10..18 -> "подростковые"
        else -> "18+"
    }
    println("Возраст $age лет — доступны фильмы категории: $category")
}

// main для проверки всех функций
fun main() {
    seasonByMonth(4)
    dogAgeToHumanYears(5)
    transportByDistance(3)
    bonusPoints(1450)
    documentType("png")
    convertTemperature(25.0, 'C')
    clothingByWeather(12)
    movieByAge(16)
}

