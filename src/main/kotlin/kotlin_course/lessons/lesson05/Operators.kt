Задачи с простыми операторами
fun main() {
    println("=== Задачи с простыми операторами ===")
    println((14 - 4 <= 10) || (6 / 2 != 3))
    println((9 + 1 == 10) && (8 % 2 == 0))
    println((7 - 2 < 5) || (4 * 3 != 12))
    println((18 / 6 >= 3) && (5 + 5 == 10))
    println((11 % 3 != 2) || (9 - 3 == 6))
    println((5 * 2 < 11) && (14 / 2 == 7))
    println((8 + 2 <= 10) || (7 % 2 != 1))
    println((16 / 4 > 3) && (3 + 4 == 7))
    println((10 % 2 == 0) || (5 - 3 != 1))

    println("\n=== Задачи с приоритетом операторов ===")
    println(7 - 2 * (2 + 3) / 5 + 3 * 2)
    println(7 - 2 * 2 + 3 / 3 + 5 * 2)
    println(((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1))
    println((((14 - 5) > 8) || (9 / 3 == 3)) && !(7 + 0 != 7))
    println(((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0))

    println("\n=== Задачи с инкрементом и декрементом ===")
    var f = 6
    println((--f >= 5) || ((3 * 2 == 6) && (9 - 4 != 5)))

    var g = 0
    println((g++ != 0) && !((4 + 2 == 6) || (5 / 1 == 5)))

    var h = 7
    println(!(h-- > 6) || (8 + 1 == 9) && (3 % 2 != 1))

    var i = 5
    println(((i++ == 5) || (2 * 2 != 4)) && (10 / 2 == 5))

    var j = 4
    println(((j-- < 4) && (6 + 0 == 6)) || !(5 % 2 != 1))
}


Elvis Operator part

fun main() {
    // Задача 1
    val intensity: Double = 100.0
    val attenuation: Double? = null
    val result1 = intensity * (attenuation ?: 0.5)
    println("Интенсивность звука после затухания: $result1")

    // Задача 2
    val cargoCost: Double? = null
    val cost = cargoCost ?: 50.0
    val insurance = cost * 0.005
    val result2 = cost + insurance
    println("Полная стоимость доставки: $result2")

    // Задача 3
    val pressure: Double? = null
    if (pressure == null) {
        println("Ошибка: отсутствуют показания атмосферного давления")
    } else {
        println("Атмосферное давление: $pressure")
    }
}

