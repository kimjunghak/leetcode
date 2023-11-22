package easy

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m-1
    var j = n-1
    var k = m+n-1

    while (i >= 0 && j >= 0) {
        val left = nums1[i]
        val right = nums2[j]
        if (left > right) {
            nums1[k] = left
            i--
        } else {
            nums1[k] = right
            j--
        }
        k--
    }

    while (j >= 0) {
        nums1[k] = nums2[j]
        j--
        k--
    }
}

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    merge(nums1, 3, nums2, 3)

    for (element in nums1) {
        print(element)
    }
}