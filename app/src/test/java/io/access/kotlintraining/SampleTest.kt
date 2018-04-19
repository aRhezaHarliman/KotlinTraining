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
        // FizzBuzz test
        val fizzBuzz = fizzBuzz(90)
        val expected = "FizzBuzz!"
        assertEquals(expected, fizzBuzz, "FizzBuzz test [want] $expected [got] $fizzBuzz")

        // Fizz test
        val fizz = fizzBuzz(9)
        val expectedFizz = "Fizz!"
        assertEquals(expectedFizz, fizz, "Fizz test [want] $expectedFizz [got] $fizz")

        // Buzz test
        val buzz = fizzBuzz(10)
        val expectedBuzz = "Buzz!"
        assertEquals(expectedBuzz, buzz, "Buzz test [want] $expectedBuzz [got] $buzz")

        // other
        val other = fizzBuzz(11)
        val expectedOther = "11"
        assertEquals(expectedOther, other, "Other test [want] $expectedOther [got] $other")
    }

    @Test
    fun testWhenFizzBuzz() {
        // FizzBuzz test
        val fizzBuzz = whenFizzBuzz(90)
        val expected = "FizzBuzz!"
        assertEquals(expected, fizzBuzz, "FizzBuzz test [want] $expected [got] $fizzBuzz")

        // Fizz test
        val fizz = whenFizzBuzz(9)
        val expectedFizz = "Fizz!"
        assertEquals(expectedFizz, fizz, "Fizz test [want] $expectedFizz [got] $fizz")

        // Buzz test
        val buzz = whenFizzBuzz(10)
        val expectedBuzz = "Buzz!"
        assertEquals(expectedBuzz, buzz, "Buzz test [want] $expectedBuzz [got] $buzz")

        // other
        val other = whenFizzBuzz(11)
        val expectedOther = "11"
        assertEquals(expectedOther, other, "Other test [want] $expectedOther [got] $other")
    }

    @Test
    fun testIsEven() {
        var even = 10
        var isEven = useClassEven(even)
        assertEquals(true, isEven, "Even true [want] true [got] $isEven")

        var notEven = 11
        isEven = useClassEven(notEven)
        assertEquals(false, isEven, "Even true [want] true [got] $isEven")
    }

    @Test
    fun testIsOdd() {
        var odd = 7
        var isOdd = useClassOdd(odd)
        assertEquals(true, isOdd, "Even true [want] true [got] $isOdd")

        var notOdd = 10
        isOdd = useClassOdd(notOdd)
        assertEquals(false, isOdd, "Even true [want] true [got] $isOdd")

    }

    @Test
    fun testRollDice() {
        var rollNumber = 16
        rollingDice(rollNumber)
    }
}