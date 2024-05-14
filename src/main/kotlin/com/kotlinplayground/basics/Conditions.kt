package org.example.com.kotlinplayground.basics

fun main() {
//    val name = "Alex"
    var name = "Alex"
    name = "Carla"
    val result = if ( name.length == 4 ) {
        println("$name is 4 characters")
        name.length
    } else {
        println("$name is not 4 characters")
        name.length
    }
    println("result: $result")

    // -------------------------------------
    // -------------------------------------
    // -------------------------------------

    val position = (1..5).random()
    println("position: $position")

    var medal = if (position == 1) {
        "GOLD"
    } else if  (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }
    println(medal)

    // -------------------------------------

    medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal)
}