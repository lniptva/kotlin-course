package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 7. String Validator
class StringValidator : Validator<String?> {

    override fun validate(element: String?): Boolean {
        return element?.isNotBlank() ?: false
    }
}