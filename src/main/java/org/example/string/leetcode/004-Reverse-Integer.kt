package org.example.string.leetcode

class Reverse_Integer_Kotlin {
    fun reverse(x: Int): Int {
        var num = x
        var reversedNum = 0

        while (num != 0) {
            val digit = num % 10
            num /= 10

            // Check for overflow
            if (reversedNum > Int.MAX_VALUE / 10 || (reversedNum == Int.MAX_VALUE / 10 && digit > 7)) return 0
            if (reversedNum < Int.MIN_VALUE / 10 || (reversedNum == Int.MIN_VALUE / 10 && digit < -8)) return 0

            reversedNum = reversedNum * 10 + digit
        }

        return reversedNum
    }
}

fun main() {
    val reverse_Integer_Kotlin = Reverse_Integer_Kotlin()

    val x = 123
    println(reverse_Integer_Kotlin.reverse(x)) // 321

    val x2 = -123
    println(reverse_Integer_Kotlin.reverse(x2)) // -321

    val x3 = 120
    println(reverse_Integer_Kotlin.reverse(x3)) // 21

    val x4 = 1534236469
    println(reverse_Integer_Kotlin.reverse(x4)) // 0 (overflow)
}
