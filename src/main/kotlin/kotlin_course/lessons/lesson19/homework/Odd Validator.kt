package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 8. Odd Validator
class OddValidator : Validator<Int> {

    override fun validate(element: Int): Boolean {
        return element % 2 == 0
    }
}
