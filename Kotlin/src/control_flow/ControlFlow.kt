package control_flow

fun main() {
    var age = 24
    if (age >= 18) {
        println("welcome")
    } else {
        println("Not allowed")
    }

    val num = -7
    if (num > 0) {
        println("Positive");
    } else if (num < 0) {
        println("Negative");
    } else {
        println("Zero");
    }

    // example of conditional expression
    val n = -7
    val result = if (n > 0) "Positive" else "Negative"
    println(result)

    // when -- just like a switch
    val n1 = -7
    val r1 = when {
        n1 > 0 -> "Positive"
        n1 < 0 -> "Negative"
        else -> "Zero"
    }
    println(r1)

    var name = "John"
    if (name == "Jon" || name == "John") {
        println("Hi there")
    }

    // while loop
    var i = 1
    while (i <= 5) {
        println("Hello")
        i++
    }

    // break statement
    i = 1
    var sum = 0
    while (i <= 100) {
        sum += i
        i++
        if (sum > 1000) {
            break
        }
    }
    println(sum)

    sum = 0
    i = 1
    while (i <= 100) {
        i++
        if (i % 2 != 0) {
            continue
        }
        sum += i
    }
    println(sum)

    // arrays
    var contacts = arrayOf("John", "James", "Amy")
    println(contacts[2])
    contacts[1] = "Dave"
    println(contacts[1])

    // loops
    var nums = arrayOf(2, 4, 6)
    for (x in nums) {
        println(x)
    }

    // iterate over the characters of a string
    val name1 = "James"
    for (x in name1) {
        println(x)
    }

    // creating ranges of events
    for (j in 2..5) {
        println(j)
    }

    for (i in 'a'..'e') {
        println(i)
    }

    // check if an element is in a list/range
    val x = 42
    if (x in 15..100) {
        println("Yes")
    }

    val xArr = arrayOf(8, 9, 42, 111)
    if (42 in xArr) {
        println("Yes")
    }
}