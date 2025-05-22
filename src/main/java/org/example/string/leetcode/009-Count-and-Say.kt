package org.example.string.leetcode

class Count_and_Say {
    fun countAndSay(n: Int): String {
        if (n == 1) return "1"

        val previous = countAndSay(n - 1)
        val result = StringBuilder()
        var count = 1

        for (i in 1 until previous.length) {
            if (previous[i] == previous[i - 1]) {
                count++
            } else {
                result.append(count).append(previous[i - 1])
                count = 1
            }
        }
        result.append(count).append(previous[previous.length - 1])

        return result.toString()
    }
}

fun main() {
    val count_and_Say = Count_and_Say()

    val n = 1
    println(count_and_Say.countAndSay(n)) // "1"

    val n2 = 4
    println(count_and_Say.countAndSay(n2)) // "1211"

    val n3 = 5
    println(count_and_Say.countAndSay(n3)) // "111221"
}
