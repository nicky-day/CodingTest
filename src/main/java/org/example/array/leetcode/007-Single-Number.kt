package org.example.array.leetcode

class Single_Number_Kotlin {
    /**
        1. XOR 연산을 사용하여 모든 숫자를 XOR합니다.
        2. XOR 연산의 성질에 따라 같은 숫자는 서로 취소되고, 남은 숫자가 유일한 숫자입니다.
        3. 시간 복잡도는 O(n)이고, 공간 복잡도는 O(1)입니다.
     */
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }
}

fun main() {
    val solution = Single_Number_Kotlin()
    println(solution.singleNumber(intArrayOf(2, 2, 1))) // 1
    println(solution.singleNumber(intArrayOf(4, 1, 2, 1, 2))) // 4
    println(solution.singleNumber(intArrayOf(1))) // 1
}
