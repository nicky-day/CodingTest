package org.example.list.leetcode

class Linked_List_Cycle_Kotlin {
    /**
     * 1. 두 개의 포인터를 사용하여 리스트를 순회합니다.
     * 2. 하나는 한 칸씩, 다른 하나는 두 칸씩 이동합니다.
     * 3. 만약 두 포인터가 만나면, 리스트에 사이클이 존재합니다.
     * 4. 만약 두 포인터가 null에 도달하면, 리스트에 사이클이 없습니다.
     * 5. 시간 복잡도는 O(N)이며, N은 리스트의 길이입니다.
     * 6. 공간 복잡도는 O(1)입니다.
     * 7. 투 포인터를 사용하는 이유 : 두 포인터를 사용하여 사이클을 효율적으로 탐지할 수 있습니다.
     *
     * 사이클이 있다면 while 루프가 계속 실행되며, 두 포인터가 결국 만나게 됩니다.
     * 그리고 두 포인터가 만나는 순간 while 루프가 종료되고 true를 반환합니다.
     * 만약 사이클이 없다면, fast 포인터가 null에 도달하게 되어 while 루프가 종료됩니다.
     */
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false

        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next!!.next

            if (slow == fast) {
                return true // 사이클이 존재함
            }
        }

        return false // 사이클이 없음
    }
}

fun main() {
    val linkedListCycleKotlin = Linked_List_Cycle_Kotlin()

    // Example usage
    // Create a linked list with a cycle for testing
    val head = ListNode(3)
    head.next = ListNode(2)
    head.next!!.next = ListNode(0)
    head.next!!.next!!.next = ListNode(-4)
    head.next!!.next!!.next!!.next = head.next // Creates a cycle

    val hasCycle = linkedListCycleKotlin.hasCycle(head)
    println(hasCycle) // Output: true
}
