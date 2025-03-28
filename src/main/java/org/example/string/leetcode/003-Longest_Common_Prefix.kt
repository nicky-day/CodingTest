package org.example.string.leetcode

class Longest_Common_Prefix_Kotlin {
    /**
     * 1. prefix를 첫 번째 문자열로 초기화한다.
     * 2. 배열을 돌면서, 현재 prefix가 다음 문자열의 접두사인지 확인한다. (indexOf(prefix) != 0)
     * 3. 아니라면 prefix를 한 글자씩 줄여가며 접두사를 찾는다.
     * 4. 접두사가 빈 문자열이 되면 반복을 멈추고 바로 반환한다.
     */
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefix = strs[0]

        for (i in 1 until strs.size) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix.isEmpty()) return ""
            }
        }

        return prefix
    }
}

fun main() {
    var solution = Longest_Common_Prefix_Kotlin()
    println(solution.longestCommonPrefix(arrayOf("flower", "flow", "flight"))) // "fl"
}
