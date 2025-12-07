package ru.stimmax.kotlin_course.lessons.lesson26.homework

// Task 3

fun printPerson(person: Person) {
    with(person) {
        println("""
           Name: $name
           Age: $age
           Email: $email
       """.trimIndent())
    }
}

fun main() {
    val person = Person("Anna", 26).also {
        it.email = "anna@gm.com"
        printPerson(it)
    }
}
