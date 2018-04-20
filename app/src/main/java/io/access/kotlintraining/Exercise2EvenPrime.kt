package io.access.kotlintraining

class Number (n: Int){
    var number: Int = n

    init {
        require(number > 0)
    }

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
