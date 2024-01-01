package module5


/*
* Write a function that does the following task.


You are given the heads of two sorted linked lists list1 and list2.


Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.


Return the head of the merged linked list.


(You must create the linked lists and pass the head to the function you created.)


Also, mention the Time and Space Complexity of your solution


Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.



Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]


Explanation:
Given linked lists
list1: head -> 1 -> 2 -> 4
list2: head -> 1 -> 3 -> 4
Output linked list: head -> 1 -> 1 -> 2 -> 3 -> 4 -> 4


Example 2:
Input: list1 = [], list2 = []
Output: []


Example 3:
Input: list1 = [], list2 = [0]
Output: [0]


Explanation:
Given linked lists
list1: head ->
list2: head -> 0
Output linked list: head -> 0
* */

fun main(){
    val arr1 = intArrayOf(1, 2, 4)
    val arr2 = intArrayOf(1, 3, 4)

    val task2 = Task2()

    val head1 = task2.createLinkedList(arr1)
    val head2 = task2.createLinkedList(arr2)
    task2.printLinkedList(head1)
    task2.printLinkedList(head2)
    val mergedHead = Task2().mergeTwoLists(head1, head2)
    task2.printLinkedList(mergedHead)
}

class Task2 {

    //Time complexity = O(n)
    //Space complexity = O(1)

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        var head: ListNode? = null
        var tail: ListNode? = null
        var l1 = list1
        var l2 = list2
        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                if (head == null) {
                    head = l1
                    tail = l1
                } else {
                    tail!!.next = l1
                    tail = tail.next
                }
                l1 = l1.next
            } else {
                if (head == null) {
                    head = l2
                    tail = l2
                } else {
                    tail!!.next = l2
                    tail = tail.next
                }
                l2 = l2.next
            }
        }
        if (l1 != null) tail!!.next = l1
        if (l2 != null) tail!!.next = l2
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


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}