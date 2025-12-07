package ru.stimmax.kotlin_course.lessons.lesson24.homework

import ru.stimmax.kotlin_course.lessons.lesson26.homework.Employee
import ru.stimmax.kotlin_course.lessons.lesson26.homework.Person

// Task 6

fun Person?.toEmployee(position: String, depart: String): Employee? {
    return this?.let {
        Employee(it.name, it.age, position).apply {
            email = it.email
            department = depart
        }
    }
}