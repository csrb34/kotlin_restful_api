package org.example.com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(1, "Restful API with Kotlin", "Pepe")
//    println(course)
    val course1 = Course(1, "Restful API with Kotlin", "Pepe")
    val course2 = Course(2, "Restful API with Kotlin", "Pepe")

    println(course == course1)
    println(course == course2)

    val course3 = course1.copy(id=3)
    println(course3)
}