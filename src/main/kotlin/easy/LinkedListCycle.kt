package easy

import easy.common.ListNode
import easy.common.makeListNode

fun hasCycle(head: ListNode?): Boolean {
    if(head?.next == null) return false

    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next

        if (slow == fast) {
            return true
        }
    }
    return false
}

fun main() {
    val solution = hasCycle(makeListNode(listOf(1,2,3,4,5)))
    println(solution)
}