package module2


/*Task 1:


Write a function that does the following task.


Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.


You may assume that each input would have exactly one solution, and you may not use the same element twice.


You can return the answer in any order.


Also, mention the Time and Space Complexity of your solution


Use of C++ or JavaScript is preferred.


Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
*/

fun main(){
    val nums = intArrayOf(-1, -2, -3, -4, -5)
    val target = -7
    val result = TwoSum().twoSumSolution2(nums, target)
    println(result.toList())

    //More TestCases Can be Found under src/test/kotlin/module2/TwoSumTest.kt
}

class TwoSum {

    //Time complexity = O(n)
    //Space complexity = O(n)
    fun twoSumSolution1(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for(i in nums.indices){
            val complement = target - nums[i]
            if(map.containsKey(complement)){
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }


    //Time complexity = O(n^2)
    //Space complexity = O(1)
    fun twoSumSolution2(nums: IntArray, target: Int) : IntArray{

        for(i in nums.indices){
            for(j in i+1..<nums.size){
                if(nums[i]+nums[j]==target)
                    return intArrayOf(i,j)
            }
        }

        return intArrayOf()

    }

}