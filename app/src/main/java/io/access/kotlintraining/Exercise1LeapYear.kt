package io.access.kotlintraining

fun isLeapYear(i: Int): Boolean {
    if (i % 4 == 0) {
        if (i % 100 == 0 && i % 400 != 0) {
            return false
        }
        return true
    }
    return false
}