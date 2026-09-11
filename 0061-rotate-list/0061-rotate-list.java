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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
         return head;
          }
        ListNode temp = head;
        ListNode prev = null;
        int count = 0;
        while(temp != null){
           count++;
           temp = temp.next;
        }
      
        k = k % count;
        while (k>0){
            temp = head;
            prev = null;
        while(temp.next!= null){
            prev = temp;
            temp = temp.next;
        }
    
        temp.next = head;
        prev.next = null;
        head = temp;

        k--;

    }
    return head;
    }
}