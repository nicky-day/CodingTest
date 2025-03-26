package org.example.sliding_window.leetcode

class Longest_Substring_Without_Repeating_Characters_Kotlin {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        val charIndexMap = mutableMapOf<Char, Int>()
        var start = 0

        for (end in s.indices) {
            val currentChar = s[end]

            // 중복 문자가 있는 경우, start 위치를 갱신
            if (charIndexMap.containsKey(currentChar)) {
                start = maxOf(start, charIndexMap[currentChar]!! + 1)
            }

            // 현재 문자 위치 갱신
            charIndexMap[currentChar] = end

            // 최대 길이 갱신
            maxLength = maxOf(maxLength, end - start + 1)
        }

        return maxLength
    }
}

fun main() {
    val solution = Longest_Substring_Without_Repeating_Characters_Kotlin()
    println(solution.lengthOfLongestSubstring("abcabcbb")) // 출력: 3
    println(solution.lengthOfLongestSubstring("bbbbb"))    // 출력: 1
    println(solution.lengthOfLongestSubstring("pwwkew"))   // 출력: 3
}
