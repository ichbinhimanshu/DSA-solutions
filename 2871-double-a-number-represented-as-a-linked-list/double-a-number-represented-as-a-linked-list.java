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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        ListNode p = head;

        while(p!=null){
            st.push(p.val);
            p = p.next;
        }

        int carry = 0;

        while(st.size()>0){
            int val = st.pop();

            int sum = val*2 + carry;
            int d = sum%10;
            carry = sum/10;

            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;
            
        }
        if(carry>0){
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
            dummy = dummy.next;
        }
        
        return reverse(ans.next);
    }


    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}