package module5


/*
*
Write a function that does the following task.


Given the head of a singly linked list, reverse the list, and return the reversed list.


(You must create the linked list and pass the head to the function you created.)


Also, mention the Time and Space Complexity of your solution.


Constraints:
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000


Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]


Explanation:
Given linked list: head -> 1 -> 2 -> 3 -> 4 -> 5
Output linked list: head -> 5 -> 4 -> 3 -> 2 -> 1


Example 2:
Input: head = [1,2]
Output: [2,1]


Explanation:
Given linked list: head -> 1 -> 2
Output linked list: head ->2 -> 1


Example 3:
Input: head = []
Output: []
* */


fun main(){
    val arr1 = intArrayOf(1, 2, 4,5,6,7,8,9,10)
    val task1 = Task1()
    val regularList = task1.createLinkedList(arr1)
    val reversedList = task1.reverseList(regularList)
    task1.printLinkedList(reversedList)
}

class Task1 {

    //Time complexity = O(n)
    //Space complexity = O(1)
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val nextTemp = curr.next
            curr.next = prev
            prev = curr
            curr = nextTemp
        }
        return prev
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun createLinkedList(arr: IntArray): ListNode? {
        var head: ListNode? = null
        var temp: ListNode? = null
        for (i in arr.indices) {
            val node = ListNode(arr[i])
            if (head == null) {
                head = node
                temp = head
            } else {
                temp!!.next = node
                temp = temp.next
            }
        }
        return head
    }

    fun printLinkedList(head: ListNode?) {
        var temp = head
        while (temp != null) {
            print(temp.`val`.toString() + " ")
            temp = temp.next
        }
        println()
    }


}