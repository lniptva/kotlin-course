package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 6. Validator
interface Validator<T> {
    fun validate(element: T): Boolean
}