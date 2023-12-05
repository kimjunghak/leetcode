package easy

fun generate(numRows: Int): List<List<Int>> {
    if(numRows == 1) return listOf(listOf(1))

    val col = mutableListOf<List<Int>>()
    for (i in 0..<numRows) {
        val row = mutableListOf<Int>()
        for (j in 0..i) {
            if(j == 0 || j == i) row.add(1)
            else row.add(col[i - 1][j - 1] + col[i - 1][j])
        }
        col.add(row.toList())
    }

    return col.toList()
}

fun main() {
    val solution = generate(5)
    println(solution)
}