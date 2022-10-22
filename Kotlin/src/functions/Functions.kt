package functions

fun welcome() {
    println("Hey there")
}

fun welcome(name:String) {
    println("Hello, $name")
}

fun sum(x: Int, y: Int) {
    println(x + y)
}

fun cost(amount: Double, international: Boolean): Double {
    var cost: Double
    var fee: Double
    if (international) {
        fee = (15 / 100.toDouble()) * amount
        if (fee > 50) {
            cost = 50.toDouble()
        } else {
            cost = fee
        }
    } else {
        if (amount >= 75) {
            cost = 0.toDouble()
        } else {
            cost = (10 / 100.toDouble()) * amount
        }
    }
    return cost
}

fun main() {
    welcome()
    welcome("Amy")
    sum(8, 5)

    val f: (Int, Int) -> Int = {a, b -> a+b}
    var result = f(8, 42)
    println(result)

    var arr = arrayOf(1, 3, 5)
    arr.forEach {
        item -> println(item * 4)
    }

    // high-order functions are functions
    // that take other functions as arguments
    val arr1 = arrayOf(42, 3, 10, 4, 6, 1)
    val res = arr1.filter { it > 5 }
    println(res)
}