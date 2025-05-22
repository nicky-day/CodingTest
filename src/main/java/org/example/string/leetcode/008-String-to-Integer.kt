package org.example.string.leetcode

class String_to_Integer_Kotlin {
    fun myAtoi(s: String): Int {
        var index = 0
        val n = s.length
        var sign = 1
        var result = 0

        // Skip leading whitespace
        while (index < n && s[index] == ' ') {
            index++
        }

        // Check for sign
        if (index < n && (s[index] == '+' || s[index] == '-')) {
            sign = if (s[index] == '-') -1 else 1
            index++
        }

        // Convert digits to integer
        while (index < n && s[index].isDigit()) {
            val digit = s[index] - '0'
            // Check for overflow and underflow
            if (result > (Int.MAX_VALUE - digit) / 10) {
                return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            }
            result = result * 10 + digit
            index++
        }

        return result * sign
    }
}

fun main() {
    val string_to_Integer_Kotlin = String_to_Integer_Kotlin()

    val s = "42"
    println(string_to_Integer_Kotlin.myAtoi(s)) // 42

    val s2 = " -042"
    println(string_to_Integer_Kotlin.myAtoi(s2)) // -42

    val s3 = "1337c0d3"
    println(string_to_Integer_Kotlin.myAtoi(s3)) // 1337

    val s4 = "0-1"
    println(string_to_Integer_Kotlin.myAtoi(s4)) // 0

    val s5 = "words and 987"
    println(string_to_Integer_Kotlin.myAtoi(s5)) // 0
}
