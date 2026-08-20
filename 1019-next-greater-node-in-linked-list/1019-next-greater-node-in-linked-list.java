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
    public int[] nextLargerNodes(ListNode head) {

        ListNode temp = head;
        ArrayList<Integer> list= new ArrayList<Integer>();

        while(temp!= null){
            int ele= nextGreater( temp.val , temp);
            list.add(ele);
           temp= temp.next;
        }

        int arr[]= new int[list.size()];
        int i=0 ;
        for(int ele: list){
            arr[i]= ele;
            i++;
        }
        return arr;

    }

     public int nextGreater( int val , ListNode temp){

        while( temp!= null){
            if(temp.val > val) return  temp.val;
            temp= temp.next;
        }

        return 0;
     }

}