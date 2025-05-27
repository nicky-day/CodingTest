package org.example.list.leetcode

class Linked_List_Cycle_2_Kotlin {
    /**
     * 1. 두 개의 포인터를 사용하여 리스트를 순회합니다.
     * 2. 하나는 한 칸씩, 다른 하나는 두 칸씩 이동합니다.
     * 3. 만약 두 포인터가 만나면, 리스트에 사이클이 존재합니다.
     * 4. 만약 두 포인터가 null에 도달하면, 리스트에 사이클이 없습니다.
     * 5. 사이클의 시작 노드를 찾기 위해, 한 포인터를 시작 노드로 이동시키고,
     *    다른 포인터는 만난 지점에서 계속 이동합니다.
     * 6. 두 포인터가 다시 만나는 지점이 사이클의 시작 노드입니다.
     * 7. 시간 복잡도는 O(N)이며, N은 리스트의 길이입니다.
     * 8. 공간 복잡도는 O(1)입니다.
     * 9. 투 포인터를 사용하는 이유 : 두 포인터를 사용하여 사이클을 효율적으로 탐지하고,
     *    사이클의 시작 노드를 찾을 수 있습니다.
     *
     * L : head에서 사이클의 시작점까지의 거리
     * x : 사이클의 시작점에서 두 포인터가 만나는 지점까지의 거리
     * C : 사이클의 길이
     * n : fast 포인터가 사이클을 몇 바퀴 도는지
     *
     * slow 포인터는 L + x 거리를 이동하고, fast 포인터는 2 * (L + x) 거리를 이동합니다.
     * 2 * (L + x) = L + x + n * C -> L + x = n * C -> L = n * C - x
     * 다시 정리하면
     * slow가 만난 지점에서 사이클 시작점까지의 거리 = C - x
     * head -> 사이클 시작점까지의 거리 = L = C - X
     * 즉, head에서 출발한 포인터와 만남 지점에서 출발한 포인터가 같은 거리 L = C - X를
     * 1칸씩 이동하면 사이클의 시작점에 도달하게 됩니다.
     */
    fun detectCycle(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        // Step 1: 사이클 존재 여부
        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow == fast) {
                // Step 2: 만난 지점에서 slow를 head로 옮김
                var finder = head
                // Step 3: 사이클의 시작 노드 찾기 : slow와 finder가 만날 때까지 이동
                while (finder != slow) {
                    finder = finder?.next
                    slow = slow?.next
                }
                return finder // 사이클의 시작점
            }
        }

        return null // 사이클 없음
    }
}

fun main() {
    val linkedListCycle2Kotlin = Linked_List_Cycle_2_Kotlin()

    // Example usage
    // Create a linked list with a cycle for testing
    val head = ListNode(3)
    head.next = ListNode(2)
    head.next!!.next = ListNode(0)
    head.next!!.next!!.next = ListNode(-4)
    head.next!!.next!!.next!!.next = head.next // Creates a cycle

    val cycleStartNode = linkedListCycle2Kotlin.detectCycle(head)
    println(cycleStartNode?.`val`) // Output: 2
}
