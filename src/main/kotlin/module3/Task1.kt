package module3


/*
* Task 1:
Write a function that does the following task.


You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string. Return the shuffled string.


Also, mention the Time and Space Complexity of your solution


Constraints:
s.length == indices.length == n
1 <= n <= 100
s consists of only lowercase English letters.
0 <= indices[i] < n
All values of indices are unique.


Example 1:


Input: s = "mamacode", indices = [4,5,6,7,0,1,2,3]
Output: "codemama"
Explanation: As shown, "mamacode" becomes "codemama" after shuffling.
 */

fun main(){
    val s = "mamacode"
    val indices = intArrayOf(4,5,6,7,0,1,2,3)
    val result = Task1().makeStringAccordingToIndices(s, indices)
    println(result)
    //More TestCases Can be Found under src/test/kotlin/module3/Task1Test.kt
}
class Task1 {

    //Time complexity = O(n)
    //Space complexity = O(n)
    fun makeStringAccordingToIndices(s: String, indices: IntArray): String {
        if (s.isEmpty() || s.length == 1) return s

        val resArray = CharArray(indices.size)

        for (i in indices.indices) {
            resArray[indices[i]] = s[i]
        }

        return String(resArray)
    }


}