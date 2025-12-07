package ru.stimmax.kotlin_course.lessons.lesson24.homework

// Task 1
fun ex1(arg: Boolean, fnc: (String) -> Unit): Int {
    return 0
}

// Task 2
fun Int.ex2(fnc: Int.(String) -> List<String>): List<String> {
    return fnc("")
}

// Task 3
fun <T, R> T.ex3(fnc: T.() -> R): R {
    return fnc()
}
// Task 4
fun ex4(arg: String): () -> String {
    val fnc: () -> String = { arg }
    return fnc
}
// Task 5
fun <U> U.ex5(): (String) -> U {
    val fnc: (String) -> U = { this }
    return fnc
}