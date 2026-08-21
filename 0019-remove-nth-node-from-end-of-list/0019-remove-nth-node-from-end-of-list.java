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
        // Ek dummy node create karein jo head ko point kare
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Fast pointer ko n + 1 steps aage badhayein
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Dono pointers ko tab tak chalayein jab tak fast end par na pahunch jaye
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // nth node ko delete kar dein
        slow.next = slow.next.next;

        return dummy.next;
    }
}