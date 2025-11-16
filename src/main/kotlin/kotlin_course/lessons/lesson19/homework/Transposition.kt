package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 5. Transposition
fun <I, D> transposition(map: Map<I, D>): Map<D, I> {
    return map.map { it }.associate { it.value to it.key }
}
