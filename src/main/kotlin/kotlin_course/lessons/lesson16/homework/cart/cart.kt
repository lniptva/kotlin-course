package ru.stimmax.kotlin_course.lessons.lesson16.homework.cart

// Класс корзины товаров
class Cart {
    private val items = mutableMapOf<Int, Int>()

    // Добавляем один товар
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    // Добавляем товар с количеством
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    // Добавляем несколько товаров из словаря
    fun addToCart(itemMap: Map<Int, Int>) {
        for ((id, qty) in itemMap) {
            items[id] = items.getOrDefault(id, 0) + qty
        }
    }

    // Добавляем товары из списка (по одной штуке каждого)
    fun addToCart(itemList: List<Int>) {
        for (id in itemList) {
            addToCart(id)
        }
    }

    // Переопределяем toString() для красивого вывода
    override fun toString(): String {
        val builder = StringBuilder()
        var totalItems = 0
        var totalQuantity = 0
        builder.appendLine("ID товара | Количество")
        builder.appendLine("----------------------")
        for ((id, qty) in items) {
            builder.appendLine("$id        | $qty")
            totalItems++
            totalQuantity += qty
        }
        builder.appendLine("----------------------")
        builder.appendLine("Всего артикулов: $totalItems, всего товаров: $totalQuantity")
        return builder.toString()
    }
}

// Проверка корзины
fun main() {
    val cart = Cart()
    cart.addToCart(101)
    cart.addToCart(102, 3)
    cart.addToCart(mapOf(103 to 2, 104 to 5))
    cart.addToCart(listOf(101, 105, 106))
    println(cart)
}
