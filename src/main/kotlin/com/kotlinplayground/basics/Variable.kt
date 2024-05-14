package org.example.com.kotlinplayground.basics

import org.example.com.kotlinplayground.funtions.courseName
import org.example.com.kotlinplayground.funtions.topLevelFunction

fun main() {
    val name: String = "Pepe"
    println("Hello ${name}!")
//    name = "Nope" -> not allowed, val are immutable

    var age: Int = 33
    println("Age: $age")
    age = 35
    println("Age: $age")


    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course: $course")
    println("course: $course and the course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLineTriple = """
        ABC
        DEF
    """.trimIndent()
    println(multiLineTriple)


    val  num = topLevelFunction()
    println("Num is $num")
    println("course name is $courseName")

}