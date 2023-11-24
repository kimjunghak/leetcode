package easy.common

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun makeTreeNode(list: List<Int?>): TreeNode? {
    if (list.isEmpty()) return null

    val root = TreeNode(list[0]!!)
    val queue = mutableListOf<TreeNode?>()
    queue.add(root)
    var i = 1
    while (i < list.size) {
        val node = queue.removeAt(0)
        if (node != null) {
            node.left = if (list[i] != null) TreeNode(list[i]!!) else null
            queue.add(node.left)
            i++
            if (i < list.size) {
                node.right = if (list[i] != null) TreeNode(list[i]!!) else null
                queue.add(node.right)
                i++
            }
        }
    }
    return root
}