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
    public static int countGood(TreeNode root, int max){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.val >= max){
            count++;
            max = root.val;
        }
        int left = countGood(root.left, max);
        int right = countGood(root.right, max);
        return count+ left + right;
    }
    public int goodNodes(TreeNode root) {
        return countGood(root, root.val);
    }
}