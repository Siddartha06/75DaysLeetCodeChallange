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
    public void fla(TreeNode root,ArrayList<TreeNode> li){
        if(root == null){
            return;
        }
        li.add(root);
        fla(root.left,li);
        fla(root.right,li);


    }
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        ArrayList<TreeNode>li = new ArrayList<>();
         fla(root,li);
         for(int i = 0;i<li.size()-1;i++){
            TreeNode a = li.get(i);
            TreeNode b = li.get(i+1);
            a.right = b;
            a.left = null;
         }
         TreeNode last = li.get(li.size()-1);
         last.right = null;
         last.left = null;
    }
}