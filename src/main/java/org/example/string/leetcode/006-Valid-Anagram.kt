package org.example.string.leetcode

class Valid_Anagram_Kotlin {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val charCount = IntArray(26) // Assuming only lowercase letters a-z

        // Count occurrences of each character in s
        for (c in s) {
            charCount[c - 'a']++
        }

        // Decrease the count for each character in t
        for (c in t) {
            charCount[c - 'a']--
            if (charCount[c - 'a'] < 0) return false
        }

        return true
    }
}

fun main() {
    val valid_Anagram_Kotlin = Valid_Anagram_Kotlin()

    val s = "anagram"
    val t = "nagaram"
    println(valid_Anagram_Kotlin.isAnagram(s, t)) // true

    val s2 = "rat"
    val t2 = "car"
    println(valid_Anagram_Kotlin.isAnagram(s2, t2)) // false
}
