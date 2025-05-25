package org.example.list.leetcode

class Remove_Nth_Node_From_End_Of_List_Kotlin {
    /**
        1. 두 개의 포인터를 사용하여 리스트를 순회합니다.
        2. 첫 번째 포인터는 n개의 노드를 먼저 이동하고, 두 번째 포인터는 첫 번째 포인터와 함께 이동합니다.
        3. 첫 번째 포인터가 리스트의 끝에 도달하면, 두 번째 포인터는 제거할 노드의 바로 이전 노드를 가리키게 됩니다.
        4. 두 번째 포인터의 다음 노드를 제거합니다.
        5. 리스트의 헤드가 제거된 경우, 새로운 헤드를 반환합니다.
        6. 시간 복잡도는 O(L)이며, L은 리스트의 길이입니다.
        7. 공간 복잡도는 O(1)입니다.

        투 포인터를 쓰는 이유 : 연결 리스트는 뒤에서 시작하는 것이 어렵기 때문에,
        두 개의 포인터를 사용하여 한 포인터가 n만큼 앞서가게 하고, 두 포인터가 동시에 이동하여 제거할 노드를 찾습니다.
     */
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        // 빈 리스트일 경우 제거할 게 없으므로 바로 null 반환
        if (head == null) return null

        var first: ListNode? = head
        var second: ListNode? = head

        // first 포인터를 n만큼 이동시켜서 두 포인터 간의 거리를 n으로 설정
        for (i in 0 until n) {
            first = first?.next
        }

        // first 포인터가 null인 경우는 리스트 길이가 n과 같다는 의미이므로, head를 제거해야 한다.
        if (first == null) {
            return head.next
        }

        // first 포인터가 리스트의 끝에 도달할 때까지 두 포인터를 이동
        // first 포인터는 n만큼 앞서 있고, second 포인터는 제거할 노드의 바로 이전 노드를 가리키게 됩니다.
        // 초기 fist.index : n
        // 제거해야 할 노드의 index : L - n
        while (first?.next != null) {
            first = first.next         // 최종 first.index : L - 1
                                     // fist, second의 이동 거리 : L - 1 - n
            second = second?.next    // second.index : 1 + (L - 1 - n) = L - n
        }

        // second 포인터의 다음 노드를 제거
        second?.next = second?.next?.next

        return head
    }
}

fun main() {
    val removeNthNodeFromEndOfListKotlin = Remove_Nth_Node_From_End_Of_List_Kotlin()

    // Example usage
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next!!.next = ListNode(3)
    head.next!!.next!!.next = ListNode(4)
    head.next!!.next!!.next!!.next = ListNode(5)

    println("Before removal: ${head.`val`}")
    removeNthNodeFromEndOfListKotlin.removeNthFromEnd(head, 2) // Remove the 2nd node from the end
    println("After removal: ${head.`val`}")

    for (node in generateSequence(head) { it.next }) {
        print("${node.`val`} ")
    }
}
