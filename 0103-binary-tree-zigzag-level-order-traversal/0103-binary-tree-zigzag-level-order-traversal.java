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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>li  = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null){
            q.add(root);
        }
        int j =0;
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode temp = q.poll();

                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }

                
                al.add(temp.val);

            }
             if(j%2 != 0){
                    Collections.reverse(al);
                }
            li.add(al);
            j++;
        }
        return li;
    


    }
}