package org.example.list.leetcode

class Merge_Two_Sorted_Lists_Kotlin {
    /**
        1. 두 개의 포인터를 사용하여 두 리스트를 순회합니다.
        2. 두 리스트의 현재 노드를 비교하여 작은 값을 새로운 리스트에 추가합니다.
        3. 작은 값을 가진 노드의 포인터를 다음 노드로 이동합니다.
        4. 두 리스트 중 하나가 끝날 때까지 반복합니다.
        5. 남은 노드가 있다면, 그 노드를 새로운 리스트에 추가합니다.
        6. 시간 복잡도는 O(N + M)이며, N과 M은 각각 두 리스트의 길이입니다.
        7. 공간 복잡도는 O(1)입니다.

        투 포인터를 쓰는 이유 : 두 개의 정렬된 리스트를 병합하기 위해 각 리스트의 현재 노드를 비교하여 작은 값을 선택합니다.
     */
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var current: ListNode? = dummy
        var list1 = l1
        var list2 = l2

        while (list1 != null && list2 != null) {
            if (list1.`val` <= list2.`val`) {
                current?.next = list1
                list1 = list1.next
            } else {
                current?.next = list2
                list2 = list2.next
            }
            current = current?.next
        }

        // 남은 노드가 있다면 연결
        if (list1 != null) {
            current?.next = list1
        } else if (list2 != null) {
            current?.next = list2
        }

        return dummy.next
    }
}

fun main() {
    val mergeTwoSortedListsKotlin = Merge_Two_Sorted_Lists_Kotlin()

    // Example usage
    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next!!.next = ListNode(4)

    val list2 = ListNode(1)
    list2.next = ListNode(3)
    list2.next!!.next = ListNode(4)

    val mergedList = mergeTwoSortedListsKotlin.mergeTwoLists(list1, list2)

    for (node in generateSequence(mergedList) { it.next }) {
        print("${node.`val`} -> ")      // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    }
}
