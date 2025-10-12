package ru.stimmax.kotlin_course.lessons.lesson11.homework

fun main() {

    /*
1. Не принимает аргументов и не возвращает значения.
*/
    fun noArgsNoReturn() {
        println("Функция без аргументов и без возвращаемого значения")
    }

    /*
2. Принимает два целых числа и возвращает их сумму.
*/
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /*
3. Принимает строку и ничего не возвращает.
*/
    fun printString(text: String) {
        println(text)
    }

    /*
4. Принимает список целых чисел и возвращает среднее значение типа Double.
*/
    fun average(numbers: List<Int>): Double {
        if (numbers.isEmpty()) return 0.0
        return numbers.average()
    }
}

/*
5. Принимает nullable строку и возвращает её длину в виде nullable целого числа
   и доступна только в текущем файле.
*/
private fun nullableStringLength(str: String?): Int? {
    return str?.length
}

/*
6. Не принимает аргументов и возвращает nullable вещественное число.
*/
fun getNullableDouble(): Double? {
    return null
}

/*
7. Принимает nullable список целых чисел, не возвращает значения
   и доступна только в текущем файле.
*/
private fun processNullableList(numbers: List<Int?>?) {
    if (numbers == null) {
        println("Список null")
        return
    }
    for (n in numbers) {
        println(n)
    }
}

/*
8. Принимает целое число и возвращает nullable строку.
*/
fun intToNullableString(num: Int): String? {
    return num.toString()
}

/*
9. Не принимает аргументов и возвращает список nullable строк.
*/
fun getNullableStringList(): List<String?> {
    return listOf("a", null, "b")
}

/*
10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
*/
fun compareNullableValues(str: String?, num: Int?): Boolean? {
    if (str == null || num == null) return null
    return str.length == num
}


// ===============================
// ЗАДАЧИ НА НАПИСАНИЕ КОДА
// ===============================

/*
1. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
*/
fun multiplyByTwo(n: Int): Int {
    return n * 2
}

/*
2. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
*/
fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

/*
3. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
   Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
*/
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

/*
4. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
   Если отрицательных чисел нет, функция должна вернуть null.
*/
fun findFirstNegative(numbers: List<Int>): Int? {
    for (num in numbers) {
        if (num < 0) return num
    }
    return null
}

/*
5. Напишите функцию processList, которая принимает список строк.
   Функция должна проходить по списку и выводить каждую строку.
   Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
*/
fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) {
            println("Встречен null, прекращение выполнения")
            return
        }
        println(str)
    }
}

