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
        ListNode p = head;
        int count=0;

        while(p!=null){
            count++;
            p=p.next;
        }

        int size = count-n;
        if(size==0){
            return head.next;
        }

        ListNode p1 = head;
        
        for(int i=1;i<size;i++){
            p1=p1.next;
        }
        p1.next = p1.next.next;

        return head;
    }
}