package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 2. List Holder
class `List Holder`<T> {

    private val list = mutableListOf<T>()

    fun add(element: T) {
        list.add(element)
    }

    fun get(): List<T> {
        return list.toList()
    }
}