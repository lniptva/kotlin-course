package ru.stimmax.kotlin_course.lessons.lesson19.homework

// Task 1. Middle Element
fun <M> getMiddleElement(list: List<M>): M? {
    if (list.size % 2 == 0) {
        return null
    }
    return list[list.size / 2]
}