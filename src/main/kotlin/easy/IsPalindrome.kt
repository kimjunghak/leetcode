package easy

class IsPalindrome {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()

        if(str[0] == '-') return false

        for (i in 0..<str.length / 2) {
            if (str[i] != str[(str.length - 1) - i]) {
                return false
            }
        }

        return true
    }
}

fun main() {
    val solution = IsPalindrome().isPalindrome(121)
    println(solution)
}