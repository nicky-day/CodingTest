package org.example.list.leetcode

class ListNode(val `val`: Int) {
    var next: ListNode? = null
}

class Add_Two_Numbers_Kotlin {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummyHead = ListNode(0)
        var current = dummyHead
        var carry = 0
        var p = l1
        var q = l2

        while (p != null || q != null || carry != 0) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            val sum = x + y + carry
            carry = sum / 10

            current.next = ListNode(sum % 10)
            current = current.next!!

            p = p?.next
            q = q?.next
        }

        return dummyHead.next
    }
}

fun main() {
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next?.next = ListNode(3)

    val l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next?.next = ListNode(4)

    val add_Two_Numbers_Kotlin = Add_Two_Numbers_Kotlin()
    val result = add_Two_Numbers_Kotlin.addTwoNumbers(l1, l2)

    var current = result
    while (current != null) {
        print("${current.`val`}")
        if (current.next != null) {
            print(" -> ")
        }
        current = current.next
    }
    println()
}
