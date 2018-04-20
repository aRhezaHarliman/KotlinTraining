package io.access.kotlintraining

import java.lang.Exception
import java.util.Random

class Dice constructor(n: Int) {
    private val rollNumber: Int = n

    fun roll(): Int {
        val random = Random()
        val n = random.nextInt(this.rollNumber)
        return (n + 1)
    }
}

fun rollingDice(i: Int, count: Int): MutableList<Int> {
    val dice = Dice(i)
    val list: MutableList<Int> = mutableListOf()
    var counter = 0
    println("count=$count")
    for (n in 1..count) {
        if (counter == 100) {
            Exception("I was broken")
            println("I was broken")
            val newList = rollingDice(i, (count - counter))
            list.addAll(newList)
            return list
        }
        val result = dice.roll()
        list.add(result)
        println(result)
        counter ++
    }
    return list
}