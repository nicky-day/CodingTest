package org.example.recursion_tree.leetcode

class Minimum_Depth_of_Binary_Tree_Kotlin {
    /**
     * 1. 재귀 함수를 사용하여 트리를 순회합니다.
     * 2. 현재 노드가 null이면 Int.MAX_VALUE를 반환합니다.
     * 3. 현재 노드가 리프 노드(왼쪽과 오른쪽 자식이 모두 null)인 경우 1을 반환합니다.
     * 4. 왼쪽과 오른쪽 서브트리의 최소 깊이를 재귀적으로 구합니다.
     * 5. 현재 노드의 깊이는 왼쪽과 오른쪽 서브트리 깊이 중 작은 값에 1을 더한 값입니다.
     * 6. 시간 복잡도는 O(N)이며, N은 트리의 노드 수입니다.
     * 7. 공간 복잡도는 O(H)이며, H는 트리의 높이입니다.
     * 재귀를 사용하는 이유 : 트리 구조는 자연스럽게 재귀적으로 탐색할 수 있기 때문에,
     * 각 노드에서 왼쪽과 오른쪽 서브트리를 재귀적으로 호출하여 최소 깊이를 계산합니다.
     */
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        // 왼쪽 자식이 null인 경우 오른쪽 자식의 깊이를 계산
        if (root.left == null) return minDepth(root.right) + 1

        // 오른쪽 자식이 null인 경우 왼쪽 자식의 깊이를 계산
        if (root.right == null) return minDepth(root.left) + 1

        // 왼쪽과 오른쪽 자식이 모두 존재하는 경우, 최소 깊이를 비교
        val leftDepth = minDepth(root.left)
        val rightDepth = minDepth(root.right)

        return Math.min(leftDepth, rightDepth) + 1
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}


fun main() {
    val minimumDepthOfBinaryTreeKotlin = Minimum_Depth_of_Binary_Tree_Kotlin()

    // Example usage
    val root = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(3)
    root.left = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(9)
    root.right = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(20)
    root.right!!.left = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(15)
    root.right!!.right = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(7)

    val depth = minimumDepthOfBinaryTreeKotlin.minDepth(root)
    println(depth) // Output: 2

    val root2 = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(2)
    root2.right = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(3)
    root2.right!!.right = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(4)
    root2.right!!.right!!.right = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(5)
    root2.right!!.right!!.right!!.right = Minimum_Depth_of_Binary_Tree_Kotlin.TreeNode(6)

    val depth2 = minimumDepthOfBinaryTreeKotlin.minDepth(root2)
    println(depth2) // Output: 5

}
