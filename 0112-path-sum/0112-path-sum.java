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
    boolean found = false;
    public void path(TreeNode root, int sum,int targetSum){
        if(root == null){
            return;
        }
        sum+= root.val;
        path(root.left,sum,targetSum);
        if(sum == targetSum && root.right== null ){
            if(root.left==null){
                 found = true;
            }
        }
        path(root.right,sum,targetSum);
        sum -= root.val;

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
            path(root,0,targetSum);
        return found;
        
    }
}