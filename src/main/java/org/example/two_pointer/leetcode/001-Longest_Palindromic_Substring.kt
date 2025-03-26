package org.example.two_pointer.leetcode

class Longest_Palindromic_Substring_Kotlin {
    fun longestPalindrome(s: String): String {
        if (s.length < 2) return s

        var start = 0
        var end = 0

        for (i in s.indices) {
            val len1 = expandFromCenter(s, i, i)             // 홀수 길이 팰린드롬
            val len2 = expandFromCenter(s, i, i + 1)   // 짝수 길이 팰린드롬
            val len = maxOf(len1, len2)

            if (len > end - start) {                         // 현재 팰린드롬 길이가 이전 팰린드롬 길이보다 길다면
                start = i - (len - 1) / 2                    // (len - 1) / 2 = 중심에서 왼쪽으로 이동한 거리
                end = i + len / 2                            // len / 2 = 중심에서 오른쪽으로 이동한 거리
            }
        }
        return s.substring(start, end + 1)
    }

    fun expandFromCenter(s: String, left: Int, right: Int): Int {
        var l = left
        var r = right

        while (l >= 0 && r < s.length && s[l] == s[r]) {
            l--
            r++
        }

        return r - l - 1   // while문을 빠져나올 때 l과 r이 한 칸씩 더 이동되기 때문에 -1을 해줘야 한다.
    }
}

fun main() {
    val solution = Longest_Palindromic_Substring_Kotlin()
    println(solution.longestPalindrome("babad")) // "bab" or "aba"
    println(solution.longestPalindrome("cbbd")) // "bb"
    println(solution.longestPalindrome("a")) // "a"
    println(solution.longestPalindrome("ac")) // "a"
}
