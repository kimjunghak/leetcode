package easy

import easy.common.ListNode
import easy.common.makeListNode

fun deleteDuplicates(head: ListNode?): ListNode? {
    if(head == null) return null

    val result = ListNode(0)
    var resultIter = result

    var iter = head
    var curVal = -1000
    while (iter != null) {
        if (curVal != iter.`val`) {
            resultIter.next = ListNode(iter.`val`)
            resultIter = resultIter.next!!
            curVal = iter.`val`
        }
        iter = iter.next
    }

    return result.next
}

fun main() {
    val solution = deleteDuplicates(makeListNode(listOf(1,1,2,3,3)))
    var iter = solution
    while (iter != null) {
        print(iter.`val`)
        iter = iter.next
    }

}

