package io.access.kotlintraining

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