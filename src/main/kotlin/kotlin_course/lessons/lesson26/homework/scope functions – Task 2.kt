package ru.stimmax.kotlin_course.lessons.lesson26.homework

// Task 2

fun main() {
    val em = Employee("Ivan", 23, "QA Engineer").apply {
        email = "ivan@gm.com"
        department = "dep1"
    }
}