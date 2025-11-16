package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 4. Phrases
class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun map(element: String): List<String> {
        return element.split(" ")
    }

    override fun map(elements: List<String>): List<List<String>> {
        return elements.map { it.split(" ") }
    }
}
