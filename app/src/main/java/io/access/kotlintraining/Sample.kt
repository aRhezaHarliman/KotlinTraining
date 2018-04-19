package io.access.kotlintraining


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

fun useClassOdd(i: Int): Boolean {
    var number = Number(i)
    return number.isOdd()
}

fun useClassEven(i: Int): Boolean {
    var number = Number(i)
    return number.isEven()
}
