package module2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TwoSumTest {

    @Test
    fun twoSumSolution1() {
        val twoSum = TwoSum()
        assertEquals(intArrayOf(0, 1).toList(), twoSum.twoSumSolution1(intArrayOf(2, 7, 11, 15), 9).toList())
        assertEquals(intArrayOf(1, 2).toList(), twoSum.twoSumSolution1(intArrayOf(3, 2, 4), 6).toList())
        assertEquals(intArrayOf(0, 1).toList(), twoSum.twoSumSolution1(intArrayOf(3, 3), 6).toList())
        assertEquals(intArrayOf(0, 3).toList(), twoSum.twoSumSolution1(intArrayOf(0, 4, 3, 0), 0).toList())
        assertEquals(intArrayOf(2, 3).toList(), twoSum.twoSumSolution1(intArrayOf(-1, -2, -3, -4, -5), -7).toList())
        assertEquals(intArrayOf(0, 2).toList(), twoSum.twoSumSolution1(intArrayOf(-3, 4, 3, 90), 0).toList())
    }

    @Test
    fun twoSumSolution2() {
        val twoSum = TwoSum()
        assertEquals(intArrayOf(0, 1).toList(), twoSum.twoSumSolution2(intArrayOf(2, 7, 11, 15), 9).toList())
        assertEquals(intArrayOf(1, 2).toList(), twoSum.twoSumSolution2(intArrayOf(3, 2, 4), 6).toList())
        assertEquals(intArrayOf(0, 1).toList(), twoSum.twoSumSolution2(intArrayOf(3, 3), 6).toList())
        assertEquals(intArrayOf(0, 3).toList(), twoSum.twoSumSolution2(intArrayOf(0, 4, 3, 0), 0).toList())
        assertEquals(intArrayOf(1, 4).toList(), twoSum.twoSumSolution2(intArrayOf(-1, -2, -3, -4, -5), -7).toList())
        assertEquals(intArrayOf(0, 2).toList(), twoSum.twoSumSolution2(intArrayOf(-3, 4, 3, 90), 0).toList())
    }
}