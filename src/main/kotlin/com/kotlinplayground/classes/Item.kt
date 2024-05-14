package org.example.com.kotlinplayground.classes

class Item() {
    var name: String = ""

    constructor(_name: String): this(){ // Secondary constructor
        name = _name
    }
}

fun main() {

    val item = Item( _name="Phone")
    println(item.name)
    item.name = "Phone case"
    println(item.name)
}