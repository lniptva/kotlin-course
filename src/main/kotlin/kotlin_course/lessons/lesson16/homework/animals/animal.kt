package ru.stimmax.kotlin_course.lessons.lesson16.homework.animals


open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

//Собака
class Dog : Animal() {
    override fun makeSound() {
        println("\u001B[33mBark\u001B[0m")
    }
}

//Кошка
class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[35mMeow\u001B[0m")
    }
}

//Птицы
class Bird: Animal() {
    override fun makeSound() {
        println("\u001B[36mTweet\u001B[0m")
    }
}

fun main() {
    val animals = listOf(Animal(), Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }
}