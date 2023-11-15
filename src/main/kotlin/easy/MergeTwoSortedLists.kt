package easy

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if(l1 == null) return l2
    if(l2 == null) return l1

    val result = ListNode(-1)
    var resultIter = result
    var l1Iter = l1
    var l2Iter = l2

    while (l1Iter != null && l2Iter != null) {
        if (l1Iter.`val` < l2Iter.`val`) {
            resultIter.next = l1Iter
            l1Iter = l1Iter.next
        } else {
            resultIter.next = l2Iter
            l2Iter = l2Iter.next
        }

        resultIter = resultIter.next!!
    }

    l1Iter?.let { resultIter.next = it }
    l2Iter?.let { resultIter.next = it }

    return result.next
}

private fun makeListNode(list: List<Int>): ListNode? {
    if (list.isEmpty()) return null

    val head = ListNode(-1)
    var iter = head
    list.forEach{
        iter.next = ListNode(it)
        iter = iter.next!!
    }
    return head.next
}


fun main() {
    val solution = mergeTwoLists(makeListNode(listOf(1,2,4)), makeListNode(listOf(1,3,4)))
    println(solution)
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
