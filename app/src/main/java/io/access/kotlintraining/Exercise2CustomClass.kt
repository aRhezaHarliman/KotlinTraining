package io.access.kotlintraining

import java.util.Random

class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter = 0
        set(value) {
            this.counter ++
        }
}

fun customSet(number: Int): Int {
    val p = MyCustomClass()
    val random = Random()
    for (n in 1..number){
        p.propertyWithCounter = random.nextInt(1000)
    }
//    p.propertyWithCounter = 123
//    p.propertyWithCounter = 456
//    p.propertyWithCounter = 789
//    p.propertyWithCounter = 789
    println(p.counter) // 3

    return p.counter
}