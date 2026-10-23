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
    long max1 = Long.MAX_VALUE;
    long max2 = Long.MAX_VALUE;
    public void find(TreeNode root){
         if(root == null){
            return;
         }
        if(root.val  < max1 ){
             max2 = max1;
             max1 = root.val;
        }
        else if(root.val < max2 && root.val != max1){
            max2 = root.val;
        }
        find( root.left);
        find( root.right);



    }
    public int findSecondMinimumValue(TreeNode root) {
        find( root);
        if(max2 == Long.MAX_VALUE ){
            return -1;
        }
        return (int)max2;
    }
}