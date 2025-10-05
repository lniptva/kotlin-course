package ru.stimmax.kotlin_course.lessons.lesson09.homework

fun main() {

// Работа с массивами Array

    // 1. Массив из 5 целых чисел от 1 до 5
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers.joinToString())

    // 2. Пустой массив строк размером 10
    val emptyStrings = Array(10) { "" }
    println(emptyStrings.joinToString())

    // 3. Массив Double, каждый элемент = удвоенный индекс
    val doubles = Array(5) { i -> i * 2.0 }
    println(doubles.joinToString())

    // 4. Массив Int, каждый элемент = индекс * 3
    val intArray = Array(5) { i -> i * 3 }
    println(intArray.joinToString())

    // 5. Массив nullable строк
    val nullableStrings: Array<String?> = arrayOf(null, "Kotlin", "Java")
    println(nullableStrings.joinToString())

    // 6. Копирование массива в новый через цикл
    val original = arrayOf(10, 20, 30, 40, 50)
    val copy = Array(original.size) { 0 }
    for (i in original.indices) {
        copy[i] = original[i]
    }
    println(copy.joinToString())

    // 7. Вычитание двух массивов
    val arr1 = arrayOf(5, 10, 15)
    val arr2 = arrayOf(2, 7, 3)
    val arrDiff = Array(arr1.size) { 0 }
    for (i in arr1.indices) {
        arrDiff[i] = arr1[i] - arr2[i]
    }
    println(arrDiff.joinToString())

    // 8. Найти индекс элемента со значением 5
    val arrFind = arrayOf(1, 3, 5, 7)
    var idx = 0
    var foundIndex = -1
    while (idx < arrFind.size) {
        if (arrFind[idx] == 5) {
            foundIndex = idx
            break
        }
        idx++
    }
    println("Индекс 5: $foundIndex")

    // 9. Перебор массива с отметкой чет/нечет
    val arrEvenOdd = arrayOf(1, 2, 3, 4, 5)
    for (num in arrEvenOdd) {
        if (num % 2 == 0) {
            println("$num - четное")
        } else {
            println("$num - нечётное")
        }
    }

    // 10. Функция поиска строки в массиве
    fun findString(arr: Array<String>, search: String) {
        for (item in arr) {
            if (item.contains(search)) {
                println(item)
            }
        }
    }
    val words = arrayOf("Kotlin", "Java", "Scala")
    findString(words, "tli") // выведет Kotlin


  // Работа со списками List

    // 1. Пустой неизменяемый список
    val emptyList: List<Int> = listOf()
    println(emptyList)

    // 2. Неизменяемый список строк
    val readOnlyList = listOf("Hello", "World", "Kotlin")
    println(readOnlyList)

    // 3. Изменяемый список Int от 1 до 5
    val mutableNumbers = mutableListOf(1, 2, 3, 4, 5)
    println(mutableNumbers)

    // 4. Добавление элементов 6,7,8
    mutableNumbers.add(6)
    mutableNumbers.add(7)
    mutableNumbers.add(8)
    println(mutableNumbers)

    // 5. Удаление элемента "World" из изменяемого списка строк
    val mutableStrings = mutableListOf("Hello", "World", "Kotlin")
    mutableStrings.remove("World")
    println(mutableStrings)

    // 6. Вывод элементов списка целых чисел
    val intList = listOf(10, 20, 30, 40)
    for (num in intList) {
        println(num)
    }

    // 7. Получение второго элемента списка строк
    val strList = listOf("a", "b", "c")
    println("Второй элемент: " + strList[1])

    // 8. Изменение значения в изменяемом списке
    val modifiableList = mutableListOf(5, 10, 15)
    modifiableList[2] = 100
    println(modifiableList)

    // 9. Объединение двух списков строк
    val list1 = listOf("A", "B")
    val list2 = listOf("C", "D")
    val combined = mutableListOf<String>()
    for (item in list1) combined.add(item)
    for (item in list2) combined.add(item)
    println(combined)

    // 10. Минимальный и максимальный элемент списка
    val numbersList = listOf(5, 10, 3, 8)
    var min = numbersList[0]
    var max = numbersList[0]
    for (num in numbersList) {
        if (num < min) min = num
        if (num > max) max = num
    }
    println("Min: $min, Max: $max")

    // 11. Новый список с только четными числами
    val evenNumbers = mutableListOf<Int>()
    for (num in numbersList) {
        if (num % 2 == 0) evenNumbers.add(num)
    }
    println(evenNumbers)


// Работа с множествами Set

    // 1. Пустое неизменяемое множество
    val emptySet: Set<Int> = emptySet()
    println(emptySet)

    // 2. Неизменяемое множество с 3 элементами
    val fixedSet = setOf(1, 2, 3)
    println(fixedSet)

    // 3. Изменяемое множество строк
    val mutableSet = mutableSetOf("Kotlin", "Java", "Scala")
    println(mutableSet)

    // 4. Добавление новых элементов в mutableSet
    mutableSet.add("Swift")
    mutableSet.add("Go")
    println(mutableSet)

    // 5. Удаление элемента из изменяемого множества
    val intMutableSet = mutableSetOf(1, 2, 3)
    intMutableSet.remove(2)
    println(intMutableSet)

    // 6. Вывод элементов множества
    for (num in fixedSet) {
        println(num)
    }

    // 7. Функция проверки наличия строки в множестве
    fun containsString(set: Set<String>, str: String): Boolean {
        for (s in set) {
            if (s == str) return true
        }
        return false
    }
    println(containsString(mutableSet, "Kotlin")) // true
    println(containsString(mutableSet, "Python")) // false

    // 8. Конвертация множества в список
    val setToList = mutableListOf<String>()
    for (item in mutableSet) {
        setToList.add(item)
    }
    println(setToList)
}
