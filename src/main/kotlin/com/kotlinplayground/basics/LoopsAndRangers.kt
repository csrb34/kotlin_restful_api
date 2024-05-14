package org.example.com.kotlinplayground.basics

fun main() {
    val rango = 1..10
    for (i in rango) {
        println("i: $i")
    }

    val rangoReverse = 10 downTo 1
    for (i in rangoReverse) {
        println("i reverse: $i")
    }

    for (i in rangoReverse step 2) {
        println("i with step: $i")
    }

    // -------------------------------------
    // -------------------------------------
    // -------------------------------------

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do{
      println("Value of i is $i")
        i++
    }while(i<5)
}

fun exploreWhile() {
    var x = 1
    while(x < 5) {
        println("Value of x is $x")
        x++
    }
}
