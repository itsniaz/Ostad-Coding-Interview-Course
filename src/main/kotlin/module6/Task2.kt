package module6

import java.util.*

/*
* Write a function that does the following task.


You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.


We repeatedly make duplicate removals on s until we no longer can.


Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.


Also, mention the Time and Space Complexity of your solution.


Constraints:


1 <= s.length <= 10^5
s consists of lowercase English letters.



Example 1:


Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".


Example 2:


Input: s = "azxxzy"
Output: "ay"
Explanation:
For example, in "azxxzy" we could remove "xx" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "azzy", of which only "zz" is possible, so the final string is "ay".

* */

fun main(){
    val s = "abbaca"
    val task2 = Task2()
    val result = task2.removeDuplicates(s)
    println(result)
    //More TestCases Can be Found under src/test/kotlin/module6/Task2Test.kt
}
class Task2 {

        //Time complexity = O(n)
        //Space complexity = O(n)
        fun removeDuplicates(s: String): String {
            val stack = Stack<Char>()
            for (c in s.toCharArray()) {
                if (stack.isEmpty() || stack.peek() != c) {
                    stack.push(c)
                } else {
                    stack.pop()
                }
            }
            val sb = StringBuilder()
            for (c in stack) {
                sb.append(c)
            }
            return sb.toString()
        }
}