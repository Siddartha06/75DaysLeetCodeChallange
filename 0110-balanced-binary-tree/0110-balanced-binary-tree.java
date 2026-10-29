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
    boolean check = true;
    int count = 0;
    int max = 0;
   public int is(TreeNode temp){
    if(temp == null){
         return 0;
    }
    count++;
    max =Math.max(max,count);
    is( temp.left);
    is( temp.right);
    count--;
    
    return max;
   }
    public boolean isBalanced(TreeNode root) {
       if(root == null){
        return true;
       } 
         count = 0;
         max = 0;
         int left = is(root.left);
         count = 0;
         max = 0;

         int rigth = is(root.right);
         if(Math.abs(left- rigth)> 1){
            check = false;
         }

        isBalanced( root.left);
        isBalanced( root.right);

            return check;
    }
}