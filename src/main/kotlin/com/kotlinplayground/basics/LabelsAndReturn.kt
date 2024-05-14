package org.example.com.kotlinplayground.basics

import kotlin.system.exitProcess

fun main() {

    for(i in 1..5){
       println("i is $i")
       if (i==3) break
    }

    label()

    for(i in 1..5){
        println("i return $i")
        if (i==3) return
    }

    println("Fin")
}

fun label() {

    loop@ for(i in 1..5){
        println("i in label is $i")
        //if (i==3) break@loop
        innerloop@ for( j in 1..5){
            println("j in label is $j")
//            if(j==2) break@innerloop
            if(j==2) continue@loop
        }
    }

}
