package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        hello()
    }

    @Test
    fun testFizzBuzzLoop() {
        fizzBuzzLoop()
    }

    @Test
    fun testFizzBuzz() {
        val fizzBuzz = fizzBuzz(90)
        val expected = "FizzBuzz!"
        assertEquals(expected, fizzBuzz, "[want] $expected [got] $fizzBuzz")
    }

    @Test
    fun testWhenFizzBuzz() {
        val fizzBuzz = whenFizzBuzz(90)
        val expected = "FizzBuzz!"
        assertEquals(expected, fizzBuzz, "[want] $expected [got] $fizzBuzz")
    }
}