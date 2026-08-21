/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast= head;
       HashSet<ListNode> set= new HashSet<ListNode>();

        while(fast!= null&& fast.next!=null){
           if(set.contains(fast)) return true;
            set.add(fast);
            fast= fast.next;
        }
        return false;
    }
}