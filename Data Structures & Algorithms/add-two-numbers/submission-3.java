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
// 15
// 15/10 = 1;
// 15 % 10 = 5
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        ListNode dummy = new ListNode();
        ListNode curr3 = dummy;
        while(curr1 != null && curr2 != null){
            int sum = curr1.val + curr2.val + carry;
            if(sum >= 10){
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            ListNode newNode = new ListNode(sum);
            curr3.next = newNode;
            curr1 = curr1.next;
            curr2 = curr2.next;
            curr3 = curr3.next;
        }
        while(curr1 != null){
            System.out.println("Curr1 is not null: " + curr1.val +" and carry: " + carry);
            int sum = curr1.val + carry;
            if(sum >= 10){
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            ListNode newNode = new ListNode(sum);
            curr3.next = newNode;
            curr1 = curr1.next;
            curr3 = curr3.next;
        }
        while(curr2 != null){
             int sum = curr2.val + carry;
            if(sum >= 10){
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            ListNode newNode = new ListNode(sum);
            curr3.next = newNode;
            curr2 = curr2.next;
            curr3 = curr3.next;
        }
        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            curr3.next = newNode;
        }
        return dummy.next;
    }
}
