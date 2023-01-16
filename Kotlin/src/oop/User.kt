package oop

class User(var name:String, var age:Int) {
}

fun main() {
    val u1 = User("James", 42)
    u1.name = "James"
    u1.age = 42

    println(u1.name)
    println(u1.age)

    val u = User("James", 42)
    println(u.name)
}