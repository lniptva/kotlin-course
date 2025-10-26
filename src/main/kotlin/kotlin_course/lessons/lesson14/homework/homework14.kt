package ru.stimmax.kotlin_course.lessons.lesson14.homework

// Домашнее задание по ООП

// Задание 1: Событие — Вечеринка
class Party(val location: String, val attendees: Int) {
    fun details() {
        println("The party is at $location with $attendees attendees.")
    }
}

// Задание 2: Эмоция
class Emotion(val type: String, val intensity: Int) {
    fun express() {
        val description = when (intensity) {
            in 1..3 -> "slightly"
            in 4..6 -> "moderately"
            in 7..10 -> "very strongly"
            else -> "in an unknown way"
        }
        println("You feel $description $type.")
    }
}

// Задание 3: Природное явление — Луна
object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("The Moon is visible. Current phase: $phase.")
        } else {
            println("The Moon is not visible right now.")
        }
    }
}

// Задание 4: Покупка — Продукт
data class Product(val name: String, val price: Double, val quantity: Int)

// Задание 5: Мероприятие — Концерт
class Concert(
    val band: String,
    val venue: String,
    val ticketPrice: Double,
    val capacity: Int
) {
    private var ticketsSold: Int = 0

    fun showInfo() {
        println("Concert of $band at $venue")
        println("Ticket price: \$${ticketPrice}, Capacity: $capacity, Tickets sold: $ticketsSold")
    }

    fun buyTicket(): Boolean {
        return if (ticketsSold < capacity) {
            ticketsSold++
            println("Ticket purchased! Total sold: $ticketsSold")
            true
        } else {
            println("No tickets left.")
            false
        }
    }
}

// Задание 6: Стеллаж и полки

// Класс Shelf (Полка)
class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    private fun currentLoad(): Int = items.sumOf { it.length }

    fun canAccommodate(item: String): Boolean = currentLoad() + item.length <= capacity

    fun addItem(item: String): Boolean {
        return if (canAccommodate(item)) {
            items.add(item)
            true
        } else false
    }

    fun removeItem(item: String): Boolean = items.remove(item)

    fun containsItem(item: String): Boolean = item in items

    fun getItems(): List<String> = items.toList()

    fun remainingCapacity(): Int = capacity - currentLoad()
}

// Класс Rack (Стеллаж)
class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves || shelf in shelves) return false
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        return if (index in shelves.indices) {
            val removedShelf = shelves.removeAt(index)
            removedShelf.getItems()
        } else emptyList()
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) return true
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) return true
        }
        return false
    }

    fun containsItem(item: String): Boolean = shelves.any { it.containsItem(item) }

    fun getShelves(): List<Shelf> = shelves.toList()

    fun printContents() {
        println("Rack contents:")
        shelves.forEachIndexed { index, shelf ->
            println("Shelf #$index:")
            println("  Capacity: ${shelf.capacity}")
            println("  Remaining capacity: ${shelf.remainingCapacity()}")
            println("  Items: ${shelf.getItems().joinToString(", ").ifEmpty { "empty" }}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        val shelfToRemove = shelves[index]
        val itemsToRedistribute = shelfToRemove.getItems().sortedByDescending { it.length }
        val failedItems = mutableListOf<String>()

        for (item in itemsToRedistribute) {
            var placed = false
            for ((i, shelf) in shelves.withIndex()) {
                if (i == index) continue
                if (shelf.addItem(item)) {
                    placed = true
                    break
                }
            }
            if (!placed) failedItems.add(item)
        }

        shelves.removeAt(index)
        return failedItems.toList()
    }
}

// Точка входа
fun main() {
    // Задание 1
    println("===== 1. Вечеринка =====")
    val party = Party("Downtown Club", 50)
    party.details()

    // Задание 2
    println("\n===== 2. Эмоция =====")
    val emotion = Emotion("happiness", 8)
    emotion.express()

    // Задание 3
    println("\n===== 3. Луна =====")
    Moon.showPhase()

    // Задание 4
    println("\n===== 4. Продукт =====")
    val apple = Product("Apple", 0.99, 10)
    println("Product: ${apple.name}, Price: \$${apple.price}, Quantity: ${apple.quantity}")

    // Задание 5
    println("\n===== 5. Концерт =====")
    val concert = Concert("Imagine Dragons", "City Hall", 75.0, 3)
    concert.showInfo()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()

    // Задание 6
    println("\n===== 6. Стеллаж и полки =====")
    val rack = Rack(3)
    val shelf1 = Shelf(20)
    val shelf2 = Shelf(15)
    val shelf3 = Shelf(10)

    rack.addShelf(shelf1)
    rack.addShelf(shelf2)
    rack.addShelf(shelf3)

    rack.addItem("Book")
    rack.addItem("Vase")
    rack.addItem("Cup")
    rack.addItem("Laptop")
    rack.addItem("Pen")

    rack.printContents()

    println("\nRemoving shelf #1 with redistribution:")
    val failed = rack.advancedRemoveShelf(1)
    println("Items that couldn’t be placed: ${failed.joinToString(", ").ifEmpty { "none" }}")

    println("\nAfter removal:")
    rack.printContents()
}
