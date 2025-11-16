package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 9. List validator
class ListValidator<W : Number> : Validator<List<W?>> {

    override fun validate(element: List<W?>): Boolean {
        return element.all { it != null && it.toDouble() != 0.0 }
    }
}