package org.example.math.leetcode

class Roman_to_Integer_Kotlin {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var result = 0
        var prevValue = 0

        // 로마 숫자는 작은 숫자가 큰 숫자 앞에 오는 경우 빼기를 의미
        for (char in s.reversed()) {
            val value = romanMap[char] ?: 0
            if (value < prevValue) {
                result -= value
            } else {
                result += value
                prevValue = value
            }
        }

        return result
    }
}

fun main() {
    val roman_to_integer_kotlin = Roman_to_Integer_Kotlin()
    println(roman_to_integer_kotlin.romanToInt("III")) // 3
    println(roman_to_integer_kotlin.romanToInt("IV")) // 4
    println(roman_to_integer_kotlin.romanToInt("IX")) // 9
    println(roman_to_integer_kotlin.romanToInt("LVIII")) // 58
}
