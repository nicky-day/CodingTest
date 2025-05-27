package org.example.list.leetcode

class Palindrome_Linked_List_Kotlin {
    /**
     * 1. 두 개의 포인터를 사용하여 리스트의 중간을 찾습니다.
     * 2. 중간 노드를 기준으로 리스트를 두 부분으로 나눕니다.
     * 3. 두 번째 부분을 역순으로 뒤집습니다.
     * 4. 첫 번째 부분과 두 번째 부분을 비교하여 회문인지 확인합니다.
     * 5. 두 번째 부분을 원래대로 되돌립니다.
     * 6. 시간 복잡도는 O(N)이며, N은 리스트의 길이입니다.
     * 7. 공간 복잡도는 O(1)입니다.
     * 8. 투 포인터를 사용하는 이유 : 리스트의 중간을 찾고, 두 부분을 비교하기 위해 두 개의 포인터를 사용합니다.

     */
    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null || head.next == null) return true

        // 1. 중간 지점 찾기 : slow는 한 칸씩, fast는 두 칸씩 이동하여 fast가 끝에 도달하면 slow는 중간에 위치하게 됩니다.
        var slow = head
        var fast = head
        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        // 2. 후반부 뒤집기
        var secondHalfStart = reverseList(slow?.next)

        // 3. 앞과 뒤 비교
        var p1 = head
        var p2 = secondHalfStart
        while (p2 != null) {
            if (p1?.`val` != p2.`val`) return false
            p1 = p1.next
            p2 = p2.next
        }

        return true
    }

    private fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null      // 이전 노드를 저장(초기값은 null)
        var curr = head                 // 현재 노드를 저장(초기값은 head)

        while (curr != null) {
            val nextTemp = curr.next    // 다음 노드를 임시로 저장
            curr.next = prev            // 현재 노드의 next를 이전 노드로 설정
            prev = curr                 // 이전 노드를 현재 노드로 업데이트
            curr = nextTemp             // 현재 노드를 다음 노드로 업데이트
        }

        return prev
    }
}

fun main() {
    val palindromeLinkedListKotlin = Palindrome_Linked_List_Kotlin()

    // Example usage
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next!!.next = ListNode(2)
    head.next!!.next!!.next = ListNode(1)

    val isPalindrome = palindromeLinkedListKotlin.isPalindrome(head)
    println(isPalindrome) // Output: true
}
