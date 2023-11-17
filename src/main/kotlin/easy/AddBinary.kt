package easy

fun addBinary(a: String, b: String): String {
    var i = a.length - 1
    var j = b.length - 1

    val sb = StringBuilder()
    var carry = 0
    while (i >= 0 || j >= 0) {
        var sum = 0
        if (i >= 0) {
            sum += a[i].digitToInt()
            i--
        }
        if (j >= 0) {
            sum += b[j].digitToInt()
            j--
        }
        sum += carry

        carry = if(sum / 2 > 0) 1 else 0
        sum %= 2

        sb.append(sum)
    }

    if (carry == 1) {
        sb.append(1)
    }

    return sb.toString().reversed()

//     return (BigInteger(a, 2) + BigInteger(b, 2)).toString(2)
}

fun main() {
    val solution = addBinary("11", "1")
    println(solution)
}