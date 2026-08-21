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
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node taaki head node ko bhi easily delete/modify kar sakein
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode temp = dummy;
        
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next; // Node ko bypass/modify kar diya
            } else {
                temp = temp.next;
            }
        }
        
        return dummy.next;
    }
}