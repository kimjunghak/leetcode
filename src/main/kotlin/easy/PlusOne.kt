package easy

fun plusOne(digits: IntArray): IntArray {

    var carry = 0
    for (i in digits.size - 1 downTo 0) {
        if(i == digits.size-1) carry = 1
        digits[i] += carry
        carry = if (digits[i] / 10 > 0)  1  else 0
        digits[i] %= 10
    }

    var result = digits
    if(carry == 1) {
        result = insertFirst(carry, digits)
    }

    return result
}

private fun insertFirst(carry: Int, digits: IntArray): IntArray {
    val result = IntArray(digits.size+1)
    result[0] = carry
    for (i in digits.indices) {
        result[i+1] = digits[i]
    }

    return result
}

fun main() {
    val solution = plusOne(intArrayOf(1,9,9))

    for (value in solution) {
        print(value)
    }
}