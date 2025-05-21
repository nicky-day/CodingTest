package org.example.array.leetcode

class Plus_One_Kotlin {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        for (i in digits.size - 1 downTo 0) {
            val sum = digits[i] + carry
            digits[i] = sum % 10
            carry = sum / 10
        }
        return if (carry == 0) {
            digits
        } else {
            // 자릿수가 늘어나는 경우
            IntArray(digits.size + 1).apply {
                // 인덱스 0에 carry를 넣고 나머지 자릿수는 digits의 값으로 채운다.
                this[0] = carry
                System.arraycopy(digits, 0, this, 1, digits.size)
            }
        }
    }
}

fun main() {
    val solution = Plus_One_Kotlin()
    println(solution.plusOne(intArrayOf(1, 2, 3)).joinToString(", ")) // [1, 2, 4]
    println(solution.plusOne(intArrayOf(9)).joinToString(", ")) // [1, 0]
    println(solution.plusOne(intArrayOf(4, 3, 2, 1)).joinToString(", ")) // [4, 3, 2, 2]
}
