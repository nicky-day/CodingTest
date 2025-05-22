package org.example.string.leetcode

class First_Unique_Character_in_a_String_Kotlin {
    fun firstUniqChar(s: String): Int {
        val charCount = IntArray(26) // Assuming only lowercase letters a-z

        // Count occurrences of each character
        for (c in s) {
            charCount[c - 'a']++
        }

        // Find the first unique character
        for (i in s.indices) {
            if (charCount[s[i] - 'a'] == 1) {
                return i
            }
        }

        return -1 // No unique character found
    }
}

fun main() {
    val first_Unique_Character_in_a_String_Kotlin = First_Unique_Character_in_a_String_Kotlin()

    val s = "leetcode"
    println(first_Unique_Character_in_a_String_Kotlin.firstUniqChar(s)) // 0

    val s2 = "loveleetcode"
    println(first_Unique_Character_in_a_String_Kotlin.firstUniqChar(s2)) // 2

    val s3 = "aabb"
    println(first_Unique_Character_in_a_String_Kotlin.firstUniqChar(s3)) // -1
}
