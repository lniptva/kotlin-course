package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 3. Mapper
interface Mapper<T, R> {
    fun map(element: T): R
    fun map(elements: List<T>): List<R>
}