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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        head=head.next;
        ListNode p = head;
        int sum = 0;

        while(p!=null){
            if(p.val!=0){
                sum+=p.val;
                p=p.next;
            }
            else{
                ListNode temp = new ListNode(sum);
                dummy.next = temp;
                dummy=dummy.next;
                sum=0;
                p=p.next;
            }
        }
    return ans.next;
    }
}