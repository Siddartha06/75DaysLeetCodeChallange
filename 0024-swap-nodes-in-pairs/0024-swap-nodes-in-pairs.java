/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode newH = fast;
        while(fast!= null){
            ListNode prev = fast.next;
            fast.next = slow;
            slow.next = prev;
            if(temp!= null){
                temp.next = fast;
            }
            temp = slow;
            slow = prev;

            if (slow == null){
                break;
            }
            fast = slow.next;
            if (fast== null){
                temp.next = slow;
                break;
            }

         
            
        }
        return newH;
    }
}