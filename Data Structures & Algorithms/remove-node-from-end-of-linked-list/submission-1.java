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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode i = dummy;
        ListNode j = head;
        
        int count = 0;
        while(count < n){
            j = j.next;
            count++;
        }

        while(j != null){
            i = i.next;
            j = j.next;
        }
        i.next = i.next.next;
        
        return dummy.next;

    }
}
