package easy.common

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun makeListNode(list: List<Int>): ListNode? {
    if (list.isEmpty()) return null

    val head = ListNode(-1)
    var iter = head
    list.forEach{
        iter.next = ListNode(it)
        iter = iter.next!!
    }
    return head.next
}