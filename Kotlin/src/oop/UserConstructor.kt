package oop

open class UserConstructor {
    var name = ""

    private var age = 0
        get() = field + 0

        set(value) {
            field = value + 10
        }

    constructor(nm: String) {
        name = nm
    }

    constructor(nm: String, a: Int) {
        name = nm
        age = a
    }

    fun login() {
        println("Login from user $name")
    }
}

class Admin(name: String, age: Int): UserConstructor(name, age) {
}

class Moderator(name: String, age: Int, var country: String): UserConstructor(name, age) {
}

fun main(args: Array<String>) {
    var u = UserConstructor("James", 42)
    u.login()
}