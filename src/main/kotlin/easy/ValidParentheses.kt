package easy

import java.util.*

fun isValid(s: String): Boolean {
    if (s.isEmpty() || s.length == 1) return false

    val stack = Stack<Char>()

    for (c in s) {
        when (c) {
            '(', '{', '[' -> stack.push(c)
            ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
            '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
            ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
        }
    }

    return stack.isEmpty()
}


fun main() {
    val solution = isValid("(])")
    println(solution)
}