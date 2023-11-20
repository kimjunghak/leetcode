package easy

fun climbStairs(n: Int): Int {
    if(n == 1) return 1
    if(n == 2) return 2

    val arr = Array(n+1){0}
    arr[0] = 1
    arr[1] = 2

    for (i in 2..n) {
        arr[i] = arr[i-1] + arr[i-2]
    }

    return arr[n-1]
}

fun main() {
    val solution = climbStairs(3)
    println(solution)
}