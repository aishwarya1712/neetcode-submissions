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
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is at mid point
        ListNode head2 = slow.next;
        slow.next = null;

        head2 = reverseList(head2);

        ListNode curr1 = head;
        ListNode curr2 = head2;

        while(curr1 != null && curr2 != null){
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;

            curr1.next = curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;
        }

    
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

    /* Solution 1 */
    // public void reorderList(ListNode head) {
    //     ListNode newHead = head;
    //     ListNode prevTail = null;
    //     reorder(newHead, prevTail);
    // }

    // private void reorder(ListNode newHead, ListNode prevTail){
    //     if (newHead == null){
    //         return;
    //     }

    //     ListNode curr = newHead;
    //     ListNode tail = new ListNode();
        
    //     while(curr != prevTail){
    //         tail = curr;
    //         curr = curr.next;
    //     }


    //     ListNode nextHead = newHead.next;
    //     newHead.next = tail;
    //     tail.next = nextHead;
    //     prevTail = tail;

    //     if(newHead == tail){
    //         newHead.next = null;
    //         return;
    //     }

        
    //     reorder(nextHead, prevTail);
    // }
}
