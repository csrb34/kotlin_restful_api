package org.example.com.kotlinplayground.classes

class Person(
    val name: String = "", // Primary constructor
    val age: Int = 0
) {

    var email: String = ""
    var nameLength: Int = 0

    init {
//        println("Inside init block")
        nameLength = name.length
    }

    constructor(_email: String,
                _name: String = "",
                _age: Int = 0): this(_name, _age){
        email = _email
    }

    fun action(){
        println("Person walks")
    }
}

fun main() {
//    val person = Person("Carla", 32)
//    person.action()
//    println("Name: ${person.name} and age: ${person.age}")
//
//    val person2 = Person()
//    println("Name: ${person2.name} and age: ${person2.age}")
//
//    val person3 = Person(_email = "abc@email.com")
//    println("Name: ${person3.name}, age: ${person3.age} and email: ${person3.email}")

    val person4 = Person(_email = "abc@email.com", "Carla", 32)
    println("Name: ${person4.name}, age: ${person4.age}, name length: ${person4.nameLength} and email: ${person4.email}")

}