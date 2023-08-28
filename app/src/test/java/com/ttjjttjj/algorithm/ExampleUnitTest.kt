package com.ttjjttjj.algorithm

import com.ttjjttjj.algorithm.StackToQueen.DoubleStackQueen
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testQueue() {
        val queen = DoubleStackQueen()
        queen.add(1)
        queen.add(2)
        queen.add(3)
        queen.add(4)
        queen.add(5)
        queen.add(6)
        queen.add(7)
        println(queen.poll())
        queen.add(8)
        println(queen.poll())
        println(queen.poll())
        println(queen.poll())
        println(queen.poll())
        println(queen.poll())
        println(queen.poll())
        println(queen.poll())
    }



}