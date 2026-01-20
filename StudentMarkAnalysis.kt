class Student(
    var name: String,
    var rollNo: Int
) {

    fun analyzeMarks(
        m1: Int,
        m2: Int,
        m3: Int,
        passMark: Int = 40
    ) {
        val total = m1 + m2 + m3
        val average = total / 3

        println("Student Name: $name")
        println("Roll No: $rollNo")
        println("Total Marks: $total")
        println("Average: $average")

        if (m1 >= passMark && m2 >= passMark && m3 >= passMark) {
            println("Result: PASS")
        } else {
            println("Result: FAIL")
        }
    }
}

fun main() {
    val student1 = Student("NITHISH", 101)

    student1.analyzeMarks(
        m1 = 75,
        m2 = 68,
        m3 = 80
    )
}
