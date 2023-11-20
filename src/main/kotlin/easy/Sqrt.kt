package easy

fun mySqrt(x: Int): Int {
    if(x == 0) return 0

    for (i in 1..<Int.MAX_VALUE-1) {
        if((x / i) < i) return i-1
    }
    return -1
}

fun main() {
    val solution = mySqrt(2)
    println(solution)
}