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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode p = head;
        int count = 0;
        while(p!=null){
            count++;
            p=p.next;
        }
        int run = 0;
        if(count%2==0){
            run=count/2 -1;
        }
        else{
            run=count/2-1;
        }
        ListNode p2=head;

        for(int i=0;i<run;i++){
            p2=p2.next;
        }
        p2.next=p2.next.next;

        return head;
    }
}