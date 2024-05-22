package org.example.com.kotlinplayground.classes

open class User(val name: String){
    fun login(){
        println("Inside user login")
    }
}

class Student(name: String) : User(name)
class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Maria")
    println(student.name)
    student.login()

    val instructor = Instructor("Eva")
    println(instructor.name)
    instructor.login()
}