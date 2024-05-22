package org.example.com.kotlinplayground.classes

open class User(val name: String){

    open val isLoggedIn: Boolean = false

    open fun login(){
        println("Inside user login")
    }
}

class Student(name: String) : User(name) {

    override var isLoggedIn: Boolean = false

    override fun login(){
        println("Inside student login")
        isLoggedIn = true
    }

}
class Instructor(name: String) : User(name) {

    override var isLoggedIn: Boolean = false

    override fun login(){
        super.login()

        println("Inside student login")
        isLoggedIn = true
    }
}

fun main() {
    val student = Student("Maria")
    println(student.name)
    student.login()
    println(student.isLoggedIn)

    val instructor = Instructor("Eva")
    println(instructor.name)
    instructor.login()
    println(instructor.isLoggedIn)
}