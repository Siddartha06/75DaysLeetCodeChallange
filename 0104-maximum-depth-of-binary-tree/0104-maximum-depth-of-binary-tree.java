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
    int max = 0;
    public void  maxd(TreeNode root){
        if(root == null){
            return ;
        }
        count++;
        max = Math.max(max,count);
        maxDepth( root.left);
        maxDepth( root.right);
        count--;
    }
    public int maxDepth(TreeNode root) {
       maxd( root);
       return max;
    }
}