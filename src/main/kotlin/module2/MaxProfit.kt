package module2


/*Task 2:
Write a function that does the following task.


You are given an array prices where prices[i] is the price of a given stock on the ith day.


You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.


Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Also, mention the Time and Space Complexity of your solution


Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104


Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.



Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/

fun main(){
    val prices = intArrayOf(7,1,5,3,6,4)
    val result = MaxProfit().maxProfit(prices)
    println(result)
    //More TestCases Can be Found under src/test/kotlin/module2/BestTimeToBuyAndSellStockTest.kt
}
class MaxProfit {

    //Time complexity = O(n)
    //Space complexity = O(1)
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0
        for (i in prices.indices) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice
            }
        }
        return maxProfit
    }

    //Time complexity = O(n^2)
    //Space complexity = O(1)
    fun maxProfitBruteForce(prices: IntArray): Int {
        var maxProfit = 0
        for (i in prices.indices) {
            for (j in i + 1..<prices.size) {
                val profit = prices[j] - prices[i]
                if (profit > maxProfit) {
                    maxProfit = profit
                }
            }
        }
        return maxProfit
    }
}