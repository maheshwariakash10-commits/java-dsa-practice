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
    public ListNode mergeKLists(ListNode[] lists) {  
        ListNode[] ckm= lists;
        ArrayList<Integer> li = new ArrayList<Integer>();
        // ListNode[] temp = lists;

        for (int i = 0; i < lists.length; i++) {

            ListNode temp = lists[i];

            // Us linked list ke nodes traverse karo
            while (temp != null) {
                li.add(temp.val);
                temp = temp.next;
            }
        }


        Collections.sort(li);

        ListNode dummy= new ListNode(0);
        ListNode res= dummy;

        for(int i=0 ; i< li.size() ;i++){
            ListNode temp= new ListNode(li.get(i));
            res.next= temp;
            res= res.next;
        }

        return dummy.next;
    }
}