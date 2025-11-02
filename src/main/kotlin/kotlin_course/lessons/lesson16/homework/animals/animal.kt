package ru.stimmax.kotlin_course.lessons.lesson16.homework.animals


open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

//Собака
class Dog : Animal() {
    override fun makeSound() {
        println("Bark")
    }
}

//Кошка
class Cat : Animal() {
    override fun makeSound() {
        println("Meow")
    }
}

//Птицы
class Bird: Animal() {
    override fun makeSound() {
        println("Tweet")
    }
}

fun main() {
    val animals = listOf(Animal(), Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }
}