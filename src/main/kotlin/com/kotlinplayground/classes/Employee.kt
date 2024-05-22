package org.example.com.kotlinplayground.classes

data class Employee(
    val id: Int,
    val name: String
)

fun main() {
    val employee = Employee(1, "Pedro")
    println(employee)
    val employee2 = Employee(2, "Jose")
    println(employee == employee2)
    val employee3 = employee.copy(id=3)
    println(employee3)
}