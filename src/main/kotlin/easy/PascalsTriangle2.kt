package easy

fun getRow(rowIndex: Int): List<Int> {
    if(rowIndex == 0) return listOf(1)

    val col = mutableListOf<List<Int>>()
    for (i in 0..rowIndex) {
        val row = mutableListOf<Int>()
        for (j in 0..i) {
            if(j == 0 || j == i) row.add(1)
            else row.add(col[i - 1][j - 1] + col[i - 1][j])
        }
        col.add(row.toList())
    }

    return col[rowIndex].toList()
}

fun main() {
    val solution = getRow(3)
    println(solution)
}