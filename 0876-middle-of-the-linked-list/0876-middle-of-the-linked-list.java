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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        int value=0;
        while (temp!= null){
            count++;
            temp = temp.next;
        }
        value = count/2;
        temp = head;
       for (int i = 0;i<= value;i++){
        if (i == value ){
            return temp;
        }
        temp = temp.next;
       }
       return null;
        
    }
}