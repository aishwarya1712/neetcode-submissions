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
        System.out.print("newHead.val: " + newHead.val);
        // if(prevTail != null){
        //     System.out.print(" Prev tail: " + prevTail.val);
        // } else {
        //     System.out.print(" Prev tail: null");
        // }
        System.out.println();
        if (newHead == null){
            return;
        }

        ListNode curr = newHead;
        ListNode tail = new ListNode();
        
        while(curr != prevTail){
            tail = curr;
            curr = curr.next;
        }
       
        System.out.print("tail.val: " + tail.val);
         
        System.out.println();

        ListNode nextHead = newHead.next;
        newHead.next = tail;
        tail.next = nextHead;
        // System.out.println("Forming new bond " + newHead.val +" -> " + tail.val);
        prevTail = tail;

        if(newHead == tail){
            newHead.next = null;
            return;
        }

        
        reorder(nextHead, prevTail);
    }
}
