package ru.stimmax.kotlin_course.lessons.lesson15.homework

// Домашнее задание по теме "Наследование"

// Задание 1: Геометрические фигуры
open class GeometricFigure(val name: String) {
    open fun describe() {
        println("Это геометрическая фигура: $name")
    }
}

open class Polygon(name: String, val sides: Int) : GeometricFigure(name) {
    override fun describe() {
        println("Это многоугольник с $sides сторонами.")
    }
}

class Triangle : Polygon("Треугольник", 3) {
    fun area(base: Double, height: Double): Double {
        return 0.5 * base * height
    }
}

class Quadrilateral : Polygon("Четырехугольник", 4) {
    fun perimeter(a: Double, b: Double, c: Double, d: Double): Double {
        return a + b + c + d
    }
}

class Circle(val radius: Double) : GeometricFigure("Круг") {
    fun circumference(): Double {
        return 2 * Math.PI * radius
    }
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

// Задание 2: Учебные заведения
open class EducationalInstitution(val name: String, val city: String) {
    open fun info() {
        println("Учебное заведение: $name, город: $city")
    }
}

class School(name: String, city: String, val gradeLevels: Int) : EducationalInstitution(name, city) {
    override fun info() {
        println("Школа \"$name\" в городе $city. Количество классов: $gradeLevels")
    }
}

open class University(name: String, city: String, val faculties: Int) : EducationalInstitution(name, city) {
    override fun info() {
        println("Университет \"$name\" в городе $city. Количество факультетов: $faculties")
    }
}

class TechnicalUniversity(name: String, city: String, faculties: Int, val labs: Int) :
    University(name, city, faculties) {
    fun showDetails() {
        println("Технический университет \"$name\": факультетов $faculties, лабораторий $labs.")
    }
}

// Задание 3: Иерархия мебели
open class Furniture(val name: String, val material: String) {
    open fun describe() {
        println("Мебель: $name, материал: $material")
    }
}

open class SeatingFurniture(name: String, material: String, val capacity: Int) :
    Furniture(name, material) {
    override fun describe() {
        println("Сиденье: $name, материал: $material, количество мест: $capacity")
    }
}

class Chair(material: String) : SeatingFurniture("Стул", material, 1) {
    fun sit() {
        println("Вы сели на стул.")
    }
}

class Sofa(material: String, capacity: Int) : SeatingFurniture("Диван", material, capacity) {
    fun lieDown() {
        println("Вы легли на диван.")
    }
}

class Table(material: String, val shape: String) : Furniture("Стол", material) {
    fun placeItem(item: String) {
        println("На стол положен предмет: $item")
    }
}

// Задание 4: Классы контейнеров материалов
abstract class Materials {
    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }

    protected fun getList(): MutableList<String> = materials
}

// Класс 1: вставка строки на дно контейнера (в начало списка)
class BottomInsertContainer : Materials() {
    fun addAtBottom(material: String) {
        val list = getList()
        list.add(0, material)
    }
}

// Класс 2: вставка списка строк в начало поочередно
class AlternateInsertContainer : Materials() {
    fun addAlternating(materialsToAdd: List<String>) {
        val list = getList().toMutableList()
        val result = mutableListOf<String>()
        var indexExisting = 0
        var indexNew = 0
        while (indexExisting < list.size || indexNew < materialsToAdd.size) {
            if (indexNew < materialsToAdd.size) {
                result.add(materialsToAdd[indexNew])
                indexNew++
            }
            if (indexExisting < list.size) {
                result.add(list[indexExisting])
                indexExisting++
            }
        }
        getList().clear()
        getList().addAll(result)
    }
}

// Класс 3: добавление строки с сортировкой по алфавиту
class SortedInsertContainer : Materials() {
    fun addAndSort(material: String) {
        val list = getList()
        list.add(material)
        list.sort()
    }
}

// Класс 4: добавление пар ключ-значение (ключи в начало, значения в конец)
class KeyValueContainer : Materials() {
    fun addKeyValuePairs(map: Map<String, String>) {
        val list = getList()
        val keys = map.keys.reversed()
        val values = map.values
        val updated = mutableListOf<String>()
        updated.addAll(keys)
        updated.addAll(list)
        updated.addAll(values)
        list.clear()
        list.addAll(updated)
    }
}

// Точка входа
fun main() {
    // Задание 1
    println("===== 1. Геометрические фигуры =====")
    val triangle = Triangle()
    triangle.describe()
    println("Площадь треугольника: ${triangle.area(5.0, 4.0)}")

    val circle = Circle(3.0)
    circle.describe()
    println("Площадь круга: ${circle.area()}")

    val quadrilateral = Quadrilateral()
    quadrilateral.describe()
    println("Периметр четырехугольника: ${quadrilateral.perimeter(2.0, 3.0, 4.0, 5.0)}")

    // Задание 2
    println("\n===== 2. Учебные заведения =====")
    val school = School("Гимназия №5", "Москва", 11)
    school.info()

    val university = University("МГУ", "Москва", 12)
    university.info()

    val techUni = TechnicalUniversity("МГТУ им. Баумана", "Москва", 8, 25)
    techUni.showDetails()

    // Задание 3
    println("\n===== 3. Иерархия мебели =====")
    val chair = Chair("Дерево")
    chair.describe()
    chair.sit()

    val sofa = Sofa("Ткань", 3)
    sofa.describe()
    sofa.lieDown()

    val table = Table("Металл", "Круглый")
    table.describe()
    table.placeItem("Книга")

    // Задание 4
    println("\n===== 4. Контейнеры материалов =====")
    val bottomContainer = BottomInsertContainer()
    bottomContainer.addMaterial("Glass")
    bottomContainer.addMaterial("Wood")
    bottomContainer.addAtBottom("Metal")
    println("Контейнер 1 (добавление вниз):")
    bottomContainer.printContainer()

    val altContainer = AlternateInsertContainer()
    altContainer.addMaterial("Iron")
    altContainer.addMaterial("Plastic")
    altContainer.addAlternating(listOf("Stone", "Fabric", "Leather"))
    println("\nКонтейнер 2 (чередующее добавление):")
    altContainer.printContainer()

    val sortedContainer = SortedInsertContainer()
    sortedContainer.addMaterial("Wood")
    sortedContainer.addMaterial("Glass")
    sortedContainer.addAndSort("Metal")
    println("\nКонтейнер 3 (сортировка):")
    sortedContainer.printContainer()

    val keyValueContainer = KeyValueContainer()
    keyValueContainer.addMaterial("Fabric")
    keyValueContainer.addKeyValuePairs(mapOf("Key1" to "Value1", "Key2" to "Value2"))
    println("\nКонтейнер 4 (ключи и значения):")
    keyValueContainer.printContainer()
}
