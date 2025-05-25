package org.example.list.leetcode


class Reverse_Linked_List_Kotlin {
    /**
        1. 두 개의 포인터를 사용하여 리스트를 순회합니다.
        2. 현재 노드의 다음 노드를 이전 노드로 설정하여 링크를 뒤집습니다.
        3. 이전 노드를 현재 노드로 이동하고, 현재 노드를 다음 노드로 이동합니다.
        4. 리스트의 끝에 도달할 때까지 반복합니다.
        5. 마지막으로 이전 노드를 새로운 헤드로 반환합니다.
        6. 시간 복잡도는 O(L)이며, L은 리스트의 길이입니다.
        7. 공간 복잡도는 O(1)입니다.

        투 포인터를 쓰는 이유 : 연결 리스트는 뒤에서 시작하는 것이 어렵기 때문에,
        두 개의 포인터를 사용하여 링크를 뒤집습니다.
     */
    fun reverseList(head: ListNode?): ListNode? {
        var previous: ListNode? = null
        var current = head

        while (current != null) {
            val nextNode = current.next // 다음 노드를 저장
            current.next = previous      // 현재 노드의 다음을 이전 노드로 설정
            previous = current           // 이전 노드를 현재 노드로 이동
            current = nextNode           // 현재 노드를 다음 노드로 이동
        }

        return previous // 마지막에 이전 노드가 새로운 헤드가 됩니다.
    }
}

fun main() {
    val reverseLinkedListKotlin = Reverse_Linked_List_Kotlin()

    // Example usage
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next!!.next = ListNode(3)
    head.next!!.next!!.next = ListNode(4)
    head.next!!.next!!.next!!.next = ListNode(5)

    println("Before reversal: ${head.`val`}")
    val reversedHead = reverseLinkedListKotlin.reverseList(head)
    println("After reversal: ${reversedHead?.`val`}")
}
