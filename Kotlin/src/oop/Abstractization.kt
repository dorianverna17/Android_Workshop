package oop

abstract class User1(var name: String, var age: Int) {
    abstract fun display()
}

class Admin1(name: String, age: Int): User1(name, age) {
    override fun display() {
        println("$name is $age years old")
    }
}

class Moderator1(name: String, age: Int, var country: String): User1(name, age) {
    override fun display() {
        println("$name is from $country")
    }
}

fun main(args: Array<String>) {
    val a = Moderator1("James", 42, "USA")
    a.display()

    val b = Admin1("Amy", 19)
    b.display()
}