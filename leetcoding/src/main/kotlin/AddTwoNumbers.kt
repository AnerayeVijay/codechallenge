/**
 * https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Example:

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
 */
class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val result = ListNode(0)
        var cur = result
        var carry = 0

        var n1 = l1
        var n2 = l2
        while (n1 != null || n2 != null || carry != 0) {
            val sum = (n1?.value ?: 0) + (n2?.value ?: 0) + carry
            cur.next = ListNode(sum % 10)
            cur = cur.next!!
            carry = sum / 10

            n1 = n1?.next
            n2 = n2?.next
        }
        return result.next
    }
}

class ListNode(val value: Int = 0 ) {
    var next: ListNode? = null
}

fun main(args: Array<String>) {
    println(7%10)
    println(12%10)
    println(25%10)
    println(7/10)
    println(131/10)
    println(30/10)
}
