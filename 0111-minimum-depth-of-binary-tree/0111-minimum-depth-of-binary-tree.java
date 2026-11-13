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
    int count = 0;
    int min = Integer.MAX_VALUE;
    public void dep(TreeNode root){
        
        if(root == null){
            return;
        }
         count++;
        if (root.left == null && root.right == null) {
            min = Math.min(min, count);
        }
        dep(root.left);
        dep(root.right);
        count--;

    }
    public int minDepth(TreeNode root) {
        count = 0;
        min = Integer.MAX_VALUE;
        if(root == null){
            return 0;
        }
        dep(root);
        return min;
    }
}