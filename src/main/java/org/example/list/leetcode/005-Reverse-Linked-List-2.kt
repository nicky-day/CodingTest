package org.example.list.leetcode

class Reverse_Linked_List_2_Kotlin {
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

        8. 이 문제는 부분적으로 리스트를 뒤집는 것이므로, 시작과 끝 인덱스를 지정하여 해당 구간만 뒤집습니다.
     */
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (head == null || left == right) return head

        val dummy = ListNode(0)
        dummy.next = head
        var prev: ListNode? = dummy

        // 1. prev를 left - 1 위치로 이동
        for (i in 1 until left) {
            prev = prev?.next
        }

        // 2. reverse를 시작할 첫 노드 (left번째 노드)
        val reverseStart = prev?.next
        var current = reverseStart
        var next: ListNode?

        // 3. 노드를 역순으로 연결 (right - left 만큼 반복)
        var prevReverse: ListNode? = null
        for (i in 0 until right - left + 1) {
            next = current?.next
            current?.next = prevReverse
            prevReverse = current
            current = next
        }

        // 4. 역순된 구간의 앞뒤 연결
        prev?.next = prevReverse        // prev가 역순된 구간의 앞쪽을 가리킴
        reverseStart?.next = current    // 역순된 마지막 노드가 나머지 리스트와 연결됨

        return dummy.next
    }

}

fun main() {
    val reverseLinkedList2Kotlin = Reverse_Linked_List_2_Kotlin()

    // Example usage
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next!!.next = ListNode(3)
    head.next!!.next!!.next = ListNode(4)
    head.next!!.next!!.next!!.next = ListNode(5)

    println("Before reversal: ${head.`val`}")
    val reversedHead = reverseLinkedList2Kotlin.reverseBetween(head, 2, 4)
    println("After reversal: ${reversedHead?.`val`}")
}
