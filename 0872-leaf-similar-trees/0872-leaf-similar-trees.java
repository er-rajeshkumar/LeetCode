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
    public static List<Integer> leafNodes(TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        leafNodes(root.left, list);
        leafNodes(root.right, list);
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list1 = leafNodes(root1, list1);
        list2 = leafNodes(root2, list2);
        if(list1.equals(list2)){
            return true;
        }else{
            return false;
        }
    }
}