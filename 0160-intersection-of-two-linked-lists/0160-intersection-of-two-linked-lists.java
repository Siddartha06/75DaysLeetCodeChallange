/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode curr = headB;
        ArrayList<ListNode> hs = new ArrayList<>();
        ArrayList<ListNode> ks = new ArrayList<>();
       if(headA == null || headB == null){
        return null;
       }
        
        while(temp!= null){
           hs.add(temp);
           temp = temp.next;
        }
        
        while(curr!= null){
           ks.add(curr);
           curr = curr.next;
        }

        int i = hs.size()-1;
        int j = ks.size()-1;
        ListNode ans = null;
        while (i >=0 && j >=0) {

            if (hs.get(i) == ks.get(j)) {
                ans = hs.get(i);
                i--;
                j--;
            } else {
                break;
            }
        }
        return ans;


    }
}