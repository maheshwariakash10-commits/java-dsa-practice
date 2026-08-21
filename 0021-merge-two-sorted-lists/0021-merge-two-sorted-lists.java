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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1== null) return list2;
        if(list2 == null) return list1;
        ListNode temp1= list1;
        ListNode temp2= list2;

        ListNode ans= new ListNode(0);
        ListNode dummy= ans;

        while(temp1!= null || temp2!= null   ){
while (temp1 != null && temp2 != null) {
            // Pehle null check karo, fir .val access karo
            if (temp1.val <= temp2.val) {
                dummy.next = new ListNode(temp1.val);
                temp1 = temp1.next;
            } else {
                dummy.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            dummy = dummy.next;
        }
        
        // Agar koi list bach gayi ho, toh use direct attach kar do
        if (temp1 != null) {
            dummy.next = temp1;
        } else if (temp2 != null) {
            dummy.next = temp2;
        }
        
        return ans.next;
        }
        return ans.next;
        
    }
}