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
    public boolean sym (TreeNode temp1, TreeNode temp2){
       if(temp1== null && temp2 == null){
        return true;
       }
       if(temp1== null || temp2== null){
        return false;
       }
       if(temp1.val!= temp2.val){
        return false;
       }
       return sym(temp1.left, temp2.right) && sym(temp1.right, temp2.left);



    }
    public boolean isSymmetric(TreeNode root) {

         return sym(root.left,root.right);
 
        
    }
}