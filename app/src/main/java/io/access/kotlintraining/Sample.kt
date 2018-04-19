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

class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter = 0
        set(value) {
            this.counter ++
        }
}

class NabeAtsu (default: Int = 0) {
    private var counter: Int = default

    fun next(): String {
        counter += 1
        if (counter % 3 == 0) {
            return "aho"
        } else {
            val text = counter.toString()
            if (text.contains('3')) return "aho"
        }
        return counter.toString()
    }
}

fun welcome() {
    println("welcome to ACCESS!")
}

/*
* Exercise 1
* */

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

fun powerLambda(a: Int, n: Int): Long {
    val result: (Long) -> Long = { i: Long ->
        i * a
    }
    var temp = 1.toLong()
    for (i in 1..n) {
        temp = result(temp)
    }
    return temp
}

/*
* Exercise 2
* */

fun Int.isOdd(): Boolean {
    return (this % 2 != 0)
}

fun Int.isEven(): Boolean {
    return (this % 2 == 0)
}

fun useClassOdd(i: Int): Boolean {
    val number = Number(i)
    return number.isOdd()
}

fun useClassEven(i: Int): Boolean {
    val number = Number(i)
    return number.isEven()
}

fun useExtensionOdd(i: Int): Boolean {
    return i.isOdd()
}

fun useExtensionEven(i: Int): Boolean {
    return i.isEven()
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

fun nabeatsuConverter(i: Int) {
    val nabeAtsu = NabeAtsu()
    for (n in 1..i) {
        println(nabeAtsu.next())
    }
}

/*
* Exercise 3
* */

/*
* Java
*
*
* public void sendMessageToClient(
    @Nullable Client client,
    @Nullable String message,
    @NonNull Mailer mailer) {
    if (client == null || message == null) return;

    PersonalInfo personalInfo = client.getPersonalInfo();
    if (personalInfo == null) return;

    String email = personalInfo.getEmail();
    if (email == null) return;

    mailer.sendMessage(email, message);
}
* */

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    if (message == null) return
    val personalInfo = client?.personalInfo
    var email = personalInfo?.email?.let {
        mailer.sendMessage(it, message)
    }
}

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
