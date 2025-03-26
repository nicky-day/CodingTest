package org.example.math.leetcode

class Reverse_Integer_Kotlin {
    fun reverse(x: Int): Int {
        var num = x
        var result = 0

        while (num != 0) {
            val digit = num % 10
            num /= 10

            // Overflow 체크
            if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && digit > 7)) return 0   // 2^31 - 1 = 2147483647
            if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && digit < -8)) return 0  // -2^31 = -2147483648

            result = result * 10 + digit
        }

        return result
    }
}

fun main() {
    val reverse_Integer_Kotlin = Reverse_Integer_Kotlin()
    println(reverse_Integer_Kotlin.reverse(123)) // 321
    println(reverse_Integer_Kotlin.reverse(-123)) // -321
    println(reverse_Integer_Kotlin.reverse(120)) // 21
    println(reverse_Integer_Kotlin.reverse(0)) // 0
    println(reverse_Integer_Kotlin.reverse(1534236469)) // 0
    println(reverse_Integer_Kotlin.reverse(-2147483648)) // 0
}
