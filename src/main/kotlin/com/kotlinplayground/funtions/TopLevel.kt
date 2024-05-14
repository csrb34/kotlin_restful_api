package org.example.com.kotlinplayground.funtions

const val courseName = "Kotlin programming"
//val courseName = "Kotlin programming"

fun topLevelFunction() : Int {
    return (1..100).random()
}

fun main() {
    val  num = topLevelFunction()
    println("Num is $num")
}