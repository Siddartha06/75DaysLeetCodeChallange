/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode temp = head;
        if (head == null){
            return false;
        } 
        while (temp != null){
           if (hs.contains(temp)){
            return true;
           } 
           else {
            hs.add(temp);
           }
           temp = temp.next;
        } 
        return false;
        
    }
}