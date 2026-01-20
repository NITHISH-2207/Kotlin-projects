class Calculator {

    fun add(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
    fun multiply(a: Int, b: Int): Int = a * b
    fun divide(a: Int, b: Int): Int = a / b
}

fun main() {
    val calc = Calculator()

    print("Enter first number: ")
    val num1 = readLine()!!.toInt()

    print("Enter second number: ")
    val num2 = readLine()!!.toInt()

    println("Choose Operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")

    print("Enter your choice (1-4): ")
    val choice = readLine()!!.toInt()

    when (choice) {
        1 -> println("Result: ${calc.add(num1, num2)}")
        2 -> println("Result: ${calc.subtract(num1, num2)}")
        3 -> println("Result: ${calc.multiply(num1, num2)}")
        4 -> {
            if (num2 != 0)
                println("Result: ${calc.divide(num1, num2)}")
            else
                println("Division by zero is not allowed")
        }
        else -> println("Invalid choice")
    }
}
