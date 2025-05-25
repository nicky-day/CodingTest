package org.example.list.leetcode

class Delete_Node_in_a_Linked_List_Kotlin {
    /**
     * 1. 현재 노드의 다음 노드 값을 현재 노드에 복사한다.
     * 2. 현재 노드의 다음 노드를 현재 노드의 다음 노드의 다음 노드로 변경한다.
     */
    fun deleteNode(node: ListNode?) {
        if (node?.next == null) return
        node.`val` = node.next!!.`val`
        node.next = node.next!!.next
    }
}

fun main() {
    val delete_Node_in_a_Linked_List_Kotlin = Delete_Node_in_a_Linked_List_Kotlin()

    // Example usage
    val head = ListNode(4)
    head.next = ListNode(5)
    head.next!!.next = ListNode(1)
    head.next!!.next!!.next = ListNode(9)

    println("Before deletion: ${head.next?.`val`}") // 5
    delete_Node_in_a_Linked_List_Kotlin.deleteNode(head.next) // Delete node with value 5
    println("After deletion: ${head.next?.`val`}") // 1
}
