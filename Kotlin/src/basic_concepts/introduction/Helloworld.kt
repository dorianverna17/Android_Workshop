fun main() {
    println("Hello, World!");

    // The difference with var is that variables declared using val cannot be changed
    var num: Int = 42
    println(num)

    val course: String = "Kotlin"
    println(course)

    // type inference
    val name = "James"
    var num_aux = 42

    var num1 = 8
    var num2 = 34

    println(num1+num2)
    println(num2-num1)
    println(num1*num2)
    println(num2/num1)
    println(num2%num1)

    // The + operator can also be used to add together two strings
    var n1 = 4
    n1 *= 5
    println(n1)

    var n2 = 8
    n2++
    println(n2)

    /*
     * we can also have multiline comments
     */

    // reading input
    var age = readLine()
    println("You entered " + age)

    // readLine returns input as a string
    // !! - not-null assertion operator
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println(a + b)
}