package io.access.kotlintraining

import java.util.Random
import java.lang.Math

class Number (n: Int){
    var number: Int = n

    fun isEven(): Boolean {
        if (this.number % 2 == 0) {
            return true
        }
        return false
    }

    fun isOdd(): Boolean {
        if (this.number % 2 == 0) {
            return false
        }
        return true
    }
}

class Dice constructor(n: Int) {
    var rollNumber: Int = n

    fun roll(): Int {
        val random = Random()
        val n = random.nextInt(this.rollNumber)
        return (n + 1)
    }
}

fun welcome() {
    println("welcome to ACCESS!")
}

fun hello() {
    println("Hello World!")
}

fun fizzBuzz(i:Int): String {
    if (i % 3 == 0 && i % 5 == 0) {
        return "FizzBuzz!"
    } else if (i % 3 == 0) {
        return "Fizz!"
    } else if (i % 5 == 0){
        return "Buzz!"
    } else {
        return i.toString()
    }
}

fun fizzBuzzLoop() {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}

fun whenFizzBuzz(i: Int): String {
    when {
        i % 3 == 0 && i % 5 == 0 -> return "FizzBuzz!"
        i % 3 == 0 -> return "Fizz!"
        i % 5 == 0 -> return "Buzz!"
    }
    return i.toString()
}

fun isLeapYear(i: Int): Boolean {
    if (i % 4 == 0) {
        if (i % 100 == 0 && i % 400 != 0) {
            return false
        }
        return true
    }
    return false
}

fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }
    return Math.pow(a.toDouble(), n.toDouble()).toLong()
}

fun useClassOdd(i: Int): Boolean {
    var number = Number(i)
    return number.isOdd()
}

fun useClassEven(i: Int): Boolean {
    var number = Number(i)
    return number.isEven()
}

fun rollingDice(i: Int): MutableList<Int> {
    var dice = Dice(i)
    var list: MutableList<Int> = mutableListOf()
    for (i in 1..100) {
        var result = dice.roll()
        list.add(result)
        println(result)
    }
    return list
}


