package ru.stimmax.kotlin_course.lessons.lesson16.homework.shapes

import kotlin.math.*

abstract class  Shape {
    open fun area(): Double {
        return 0.0
    }
}

// Класс круга
class Circle(private val radius: Double) : Shape() {
    override fun area() : Double {
        return PI * radius * radius
    }
}

// Класс квадрата
class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

// Класс треугольника
class Triangle(
    private val a: Double,
    private val b: Double,
    private val angleDegrees: Double
) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angleDegrees)
        return 0.5 * a * b * sin(angleRadians)
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, 90.0)
    )

    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }
}


