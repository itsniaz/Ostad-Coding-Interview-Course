package module2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MaxProfitTest {

    @Test
    fun maxProfit() {
        val maxProfit = MaxProfit()
        assertEquals(5, maxProfit.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, maxProfit.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
        assertEquals(0, maxProfit.maxProfit(intArrayOf(1)))
        assertEquals(0, maxProfit.maxProfit(intArrayOf(1, 1)))
    }

    @Test
    fun maxProfitBruteForce() {
        val maxProfit = MaxProfit()
        assertEquals(5, maxProfit.maxProfitBruteForce(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, maxProfit.maxProfitBruteForce(intArrayOf(7, 6, 4, 3, 1)))
        assertEquals(0, maxProfit.maxProfitBruteForce(intArrayOf(1)))
        assertEquals(0, maxProfit.maxProfitBruteForce(intArrayOf(1, 1)))
    }
}