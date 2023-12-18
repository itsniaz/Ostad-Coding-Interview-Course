package module3


/*
* Task 2:


Write a function that does the following task.


Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


Also, mention the Time and Space Complexity of your solution


Constraints:
1 <= haystack.length, needle.length <= 10^4
haystack and needle consist of only lowercase English characters.


Example 1:


Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.


Example 2:


Input: haystack = "codemama", needle = "ostad"
Output: -1
Explanation: "ostad" did not occur in "codemama", so we return -1.

* */

fun main(){
    val haystack = "sadbutsad"
    val needle = "sad"
    val result = Task2().solution(haystack, needle)
    println(result)
    //More TestCases Can be Found under src/test/kotlin/module3/Task2Test.kt
}

class Task2 {

    //Time complexity = O(n^2)
    //Space complexity = O(1)
    fun solution(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        if (haystack.isEmpty()) return -1
        if (needle.length > haystack.length) return -1

        for (i in haystack.indices) {
            if (haystack[i] == needle[0]) {
                var j = 0
                while (j < needle.length && i + j < haystack.length && haystack[i + j] == needle[j]) {
                    j++
                }
                if (j == needle.length) return i
            }
        }
        return -1
    }

}