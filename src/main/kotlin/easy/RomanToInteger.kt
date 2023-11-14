package easy

class RomanToInteger {
    fun romanToInt(s: String): Int {
        var sum = 0
        for (i in 0..<s.length - 1) {
            val cur = values(s[i])
            val next = values(s[i+1])

            if (cur >= next) {
                sum += cur
            } else {
                sum -= cur
            }
        }
        val last = values(s[s.length-1])
        sum += last

        return sum
    }

    private fun values(c: Char): Int {
        return when (c) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}

fun main() {
    val solution = RomanToInteger().romanToInt("MCMXCIV")
    println(solution)
}