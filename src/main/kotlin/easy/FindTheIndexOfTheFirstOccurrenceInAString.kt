package easy

fun strStr(haystack: String, needle: String): Int {
    val haystackLen = haystack.length
    val needlLen = needle.length

    for (i in 0..<haystackLen - needlLen + 1) {
        if (haystack.substring(i, i + needlLen) == needle)
            return i
    }

    return -1
}

fun main() {
    val solution = strStr("mississippi", "issip")
    println(solution)
}