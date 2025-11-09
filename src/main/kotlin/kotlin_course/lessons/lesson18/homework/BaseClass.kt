package ru.stimmax.kotlin_course.lessons.lesson18.homework

abstract class BaseClass(
    // 1. Это поле доступно в main() для чтения из класса ChildrenClass,
    // потому что мы передаём его через конструктор наследника и сохраняем значение там как public val.
    private val privateVal: String,
    // 2. Это поле недоступно в main(), потому что protected — оно видно только внутри класса и его наследников.
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. Эта функция не может быть публичной, потому что она возвращает защищённый тип (ProtectedClass),
    // который недоступен за пределами класса.
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. В поле "generate" другой текст, потому что этот метод переопределяется в наследнике.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. Эта функция не может быть публичной или protected,
    // потому что возвращает приватный тип PrivateClass, который не виден вне BaseClass.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass
    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. Этот аргумент доступен в main(), потому что он передаётся в super-конструктор как publicVal (val).
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 4. Чтобы изменить publicField из main(), создаём публичный сеттер,
    // который вызывает родительский сеттер с нашей логикой валидации.
    fun changePublicField(value: String) {
        publicField = value
    }

    // 5. Чтобы изменить protectedField из main(), добавим публичный метод-сеттер.
    fun changeProtectedField(value: String) {
        protectedField = value
    }

    // 6. Чтобы изменить privateField, добавим публичный метод, который обращается к приватному полю через getAll.
    // Так как приватное поле закрыто, мы не можем менять его напрямую, поэтому в реальности такое решение — нарушает инкапсуляцию.
    // Но по заданию мы делаем аналогичный интерфейс.
    fun setPrivateField(value: String) {
        val base = javaClass.superclass.getDeclaredField("privateField")
        base.isAccessible = true
        base.set(this, value)
    }

    // 11. Функция getAll() доступна в main(), потому что она унаследована от BaseClass (она public).
    // 12. При вызове printText() на экран выводится "Печать из класса BaseClass",
    // потому что privatePrint() — приватный метод, и не может быть переопределён.
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}

fun main() {
    val child = ChildrenClass("secret", "protected-data", "public-data")

    println(child.getAll())

    // Меняем поля через публичные методы
    child.changePublicField("Антонио Бандерас")
    child.changeProtectedField("Секрет изменён")
    child.setPrivateField("Приватное поле изменено")

    println("\nПосле изменений:")
    println(child.getAll())

    // Проверяем вывод printText()
    child.printText()
}
