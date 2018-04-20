package io.access.kotlintraining

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

fun nabeatsuConverter(i: Int) {
    val nabeAtsu = NabeAtsu()
    for (n in 1..i) {
        println(nabeAtsu.next())
    }
}