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
    public void reorderList(ListNode head) {
        ListNode newHead = head;
        ListNode prevTail = null;
        reorder(newHead, prevTail);
    }

    private void reorder(ListNode newHead, ListNode prevTail){
        if (newHead == null){
            return;
        }

        ListNode curr = newHead;
        ListNode tail = new ListNode();
        
        while(curr != prevTail){
            tail = curr;
            curr = curr.next;
        }


        ListNode nextHead = newHead.next;
        newHead.next = tail;
        tail.next = nextHead;
        prevTail = tail;

        if(newHead == tail){
            newHead.next = null;
            return;
        }

        
        reorder(nextHead, prevTail);
    }
}
