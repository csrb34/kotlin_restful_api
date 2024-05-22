package org.example.com.kotlinplayground.classes

class Item() {
    var name: String = ""
    var price: Double = 0.0
//    get() = field
    get() {
        println("Inside getter")
        return field
    }

    set(value) {
        println("Inside setter")
        if (value >= 0.0){
            field = value
        }else{
            throw IllegalArgumentException("Negative price is not allowed")
        }
    }

    constructor(_name: String): this(){ // Secondary constructor
        name = _name
    }
}

fun main() {

    val item = Item( _name="Phone")
//    println(item.name)
//    item.name = "Phone case"
//    println(item.name)
    println(item.price)
    item.price = 10.0
//    item.price = -10.0
    println(item.price)

}