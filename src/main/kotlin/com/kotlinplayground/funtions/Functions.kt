package org.example.com.kotlinplayground.funtions

import java.time.LocalDate

fun main() {
    val unit = printName("CArla")
    println(unit)
    val result = addition(1,3)
    println("Result is $result")

    val result1 = addition_approach(1,3)
    println("Result1 is $result1")

    printPersonalDetails("Carla", "example@email.com", LocalDate.parse("1991-08-26"))
    printPersonalDetails("Carla")
    printPersonalDetails(name = "Ana", dob= LocalDate.parse("2001-01-01"))
    printPersonalDetails(dob= LocalDate.parse("2001-01-01"), name = "Ana", email = "example@mail.es")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun addition_approach(x: Int, y: Int) = x+y

fun printName(name: String): Unit {
    println("Name is $name")
}

fun printPersonalDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()){
    println("Name: $name; Email: $email; DoB: $dob")
}
