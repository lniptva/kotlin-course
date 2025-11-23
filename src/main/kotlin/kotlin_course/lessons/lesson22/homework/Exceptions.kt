package ru.stimmax.kotlin_course.lessons.lesson22.homework

// Task 1-8
fun main() {
    // 1
    try {
        null!!
    } catch (e: NullPointerException) {
        println("It is NullPointerException!")
    }

    // 2
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("It is IndexOutOfBoundsException!")
    }

    // 3
    try {
        "" as Int
    } catch (e: ClassCastException) {
        println("It is ClassCastException!")
    }

    // 4
    try {
        require(false)
    } catch (e: IllegalArgumentException) {
        println("It is IllegalArgumentException!")
    }

    // 5
    try {
        "".toInt()
    } catch (e: NumberFormatException) {
        println("It is NumberFormatException!")
    }

    // 6
    try {
        check(false)
    } catch (e: IllegalStateException) {
        println("It is IllegalStateException!")
    }

    // 7
    try {
        (0..Long.MAX_VALUE).map { Long.MAX_VALUE }
    } catch (e: OutOfMemoryError) {
        println("It is OutOfMemoryError!")
    }

    // 8
    try {
        a()
    } catch (e: StackOverflowError) {
        println("It is StackOverflowError!")
    }
}

fun a() {
    a()
}


// Task 10
fun catchable(arg: Any?) {
    try {
        arg!!
        arg as List<*>
        arg[2]
        require(arg[2] is String)
        check((arg[2] as String).toInt() == 3)
    } catch (e: Throwable) {
        val result = when (e) {
            is NullPointerException -> "It is NullPointerException"
            is ClassCastException -> "It is ClassCastException"
            is IndexOutOfBoundsException -> "It is IndexOutOfBoundsException"
            is NumberFormatException -> "It is NumberFormatException"
            is IllegalArgumentException -> "It is IllegalArgumentException"
            is IllegalStateException -> "It is IllegalStateException"
            else -> "It is unknown exception"
        }
        println(result)
        throw e
    }
    println("We have a fantastically good argument!")
}


// Task 11
class MyAssertionError(message: String) : AssertionError(message)

fun main11() {
    throw MyAssertionError("Алярм!!")
}


// Task 12
class MyRuntimeException(cause: IndexOutOfBoundsException) : RuntimeException(cause)

fun main12() {
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("Произошёл IndexOutOfBoundsException")
        throw MyRuntimeException(e)
    }
}
