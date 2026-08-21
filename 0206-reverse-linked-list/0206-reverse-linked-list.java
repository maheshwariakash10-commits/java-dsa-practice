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
    public ListNode reverseList(ListNode head) {
        ListNode ckm = null;

        ListNode guu=  head;
        while(guu!= null){

            ListNode temp =new ListNode(guu.val);
            temp.next= ckm;
            ckm= temp;
            guu= guu.next;

        }

        return ckm;

    }
}