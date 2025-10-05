package ru.stimmax.kotlin_course.lessons.lesson08

fun main() {
example1("Ошибка в системе вызвала панику!")
    example1(arg = "Для завершения проекта важно")
}
fun example1(arg: String) {
    val result = when {
        arg.startsWith("Ошибка") -> arg.replace(
            "Ошибка", "Небольшое недоразумение"
        )

        arg.endsWith("Важно", true) -> "$arg ..., но не критично."
        else -> arg
    }
println(result)
}