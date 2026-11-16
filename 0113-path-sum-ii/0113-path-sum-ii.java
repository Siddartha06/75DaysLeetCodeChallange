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
    int add = 0;
    public void print(int targetSum, TreeNode root, List<List<Integer>> li,ArrayList<Integer>al){
        if(root == null){
            return;
        }
        al.add(root.val);
        add+= root.val;
        if(add== targetSum && (root.left == null && root.right == null) ){
            li.add(new ArrayList<Integer>(al));
        }
        print(targetSum,root.left,li,al);
        print(targetSum,root.right,li,al);
          al.remove(al.size()-1);
          add-=root.val;
        
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<List<Integer>> li = new ArrayList<>();
       ArrayList<Integer> al = new ArrayList<>();
       if(root == null){
        return li;
       }
       
       print(targetSum,root,li,al);
       return li;
    }
}