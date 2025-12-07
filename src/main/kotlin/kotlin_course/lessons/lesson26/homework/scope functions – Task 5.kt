package ru.stimmax.kotlin_course.lessons.lesson26.homework

// Task 5

fun main() {
    val person = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee = person.run {
        Employee(name, age, "Front dev").also {
            it.email = email
            it.department = "dep2"
        }
    }
}
