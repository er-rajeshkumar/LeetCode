/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxLength = 0;

    public void dfs(TreeNode root, int left, int right) {

        if (root == null) {
            return;
        }

        // Update maximum ZigZag length
        maxLength = Math.max(maxLength, Math.max(left, right));

        // If we move left, next move must be right
        if (root.left != null) {
            dfs(root.left, right + 1, 0);
        }

        // If we move right, next move must be left
        if (root.right != null) {
            dfs(root.right, 0, left + 1);
        }
    }

    public int longestZigZag(TreeNode root) {
        dfs(root, 0, 0);
        return maxLength;
    }
}