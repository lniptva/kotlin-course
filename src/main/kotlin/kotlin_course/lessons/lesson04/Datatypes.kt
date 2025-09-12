
// Часть 1.

val v1: Int = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"

// Ошибка: должно быть true/false с маленькой буквы
// val v6 = FALSE
val v6: Boolean = false

val v7: Char = 'c'
val v8: Int = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
val v13: String = "true"
val v14: List<Int> = listOf(3, 14)
val v15: Char = '9'
val v16: Int = 2048
val v17: Long = 10000000000L
val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f

// Ошибка: имя переменной не может начинаться с числа,
// и внутри бэктиков должны быть валидные идентификаторы
// val v20 = `1.414`
val v20: Double = 1.414

val v21: String = "Artificial Intelligence"

// Ошибка: элементы массива должны быть одного типа (Char != String)
// val v22 = arrayOf('x', "A")
val v22: Array<String> = arrayOf("x", "A")

val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Int = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"

// Ошибка: должно быть true/false
// val v30 = FALSE
val v30: Boolean = false

val v31: Double = 0.007

// Ошибка: используются «ёлочки» вместо обычных кавычек
// val v32 = “🤯”
val v32: String = "🤯"

val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)

// Ошибка: используются неправильные кавычки для Char и слишком длинное значение
// val v34 = ‘65535’
val v34: String = "65535"

val v35: Long = 72057594037927935L
val v36: Float = 2.71828f
val v37: Double = 101.0101
val v38: String = "Quantum Computing"
val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Int = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f

// Ошибка: должно быть true
// val v44 = TRUE
val v44: Boolean = true

// Часть 2.
// Буква на спиритическом сеансе – это Char
// Количество ложек сахара – это Int
// Список расходов на доставку еды – это List<Double>
// Длина очереди до миллиардной доли см – это Double
// Факт, закрыт ли баг – это Boolean
// Количество свистков чайника – это Int
// Количество нажатий котом на клавиатуру – это Long
// Количество попыток пересчитать звёзды – это ULong
// Масса воздуха в долях грамма – это Double
// Словарь «стартап – потери» – это Map<String, Double>
// Строка «починилось само» – это String
// Список ненужных тем для митингов – это List<String>