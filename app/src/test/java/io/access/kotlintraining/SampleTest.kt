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
    fun testLeapYear() {
        val nonLeapYear = 1900
        var isLeap = isLeapYear(nonLeapYear)
        assertEquals(false, isLeap, "Test leap year non leap [want] false [got] $isLeap")

        val leapYear = 2012
        isLeap = isLeapYear(leapYear)
        assertEquals(true, isLeap, "Test leap year leap [want] true [got] $isLeap")

        val leapYear2000 = 2000
        isLeap = isLeapYear(leapYear2000)
        assertEquals(true, isLeap, "Test leap year leap [want] true [got] $isLeap")
    }

    @Test
    fun testMathPower() {
        var result = power(10, 2)
        var expected = 100
        assertEquals(expected.toLong(), result, "test Math OK [want] $expected [got] $result")

        var resultLambda = powerLambda(3, 3)
        var expectedLambda = 27
        assertEquals(expectedLambda.toLong(), resultLambda, "test Math power Lambda OK [want] $expected [got] $result")

        result = power(-1, -2)
        expected = 0
        assertEquals(expected.toLong(), result, "test Math minus [want] $expected [got] $result")
    }

    @Test
    fun testIsEven() {
        var even = 10
        var isEven = useClassEven(even)
        assertEquals(true, isEven, "Even true [want] true [got] $isEven")

        var notEven = 11
        isEven = useClassEven(notEven)
        assertEquals(false, isEven, "Even true [want] true [got] $isEven")

        isEven = useExtensionEven(even)
        assertEquals(true, isEven, "Even extension true [want] true [got] $isEven")

        isEven = useExtensionEven(notEven)
        assertEquals(false, isEven, "Even extension true [want] true [got] $isEven")
    }

    @Test
    fun testIsOdd() {
        var odd = 7
        var isOdd = useClassOdd(odd)
        assertEquals(true, isOdd, "Odd true [want] true [got] $isOdd")

        var notOdd = 10
        isOdd = useClassOdd(notOdd)
        assertEquals(false, isOdd, "Odd true [want] true [got] $isOdd")

        isOdd = useExtensionOdd(odd)
        assertEquals(true, isOdd, "Odd extension true [want] true [got] $isOdd")

        isOdd = useExtensionOdd(notOdd)
        assertEquals(false, isOdd, "Odd extension true [want] true [got] $isOdd")
    }

    @Test
    fun testRollDice() {
        var rollNumber = 16
        var list = rollingDice(rollNumber)
        for (item in list) {
            var actual = (rollNumber in 1..16)
            assertEquals(true, actual, "Test roll dice below 16 [want] true [got] $actual")
        }
    }

    @Test
    fun testCustomSet() {
        val n = 5
        val result = customSet(n)
        assertEquals(n, result, "Even true [want] $n [got] $result")
    }

    @Test
    fun testNabeAtsu() {
        nabeatsuConverter(100)
    }
}
