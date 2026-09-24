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
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head == null || head.next == null){
//             return head;
//         }

//         ListNode p1 = head;
//         ListNode p2 = head;

//         while(p2!=null){
//             if(p1.val == p2.val){
//                 p2=p2.next;
//             }
//             else{
//                 p1.next = p2;
//                 p1 = p2;
//                 p2=p2.next;
//             }
//         }
//         p1.next = null;
//         return head;
//     }
// }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;

        ListNode ptr = head.next;
        while(ptr!=null){
            if(ptr.val != dummy.val){
                ListNode temp = new ListNode(ptr.val);
                dummy.next = temp;
                dummy = dummy.next;

                ptr = ptr.next;
            }
            else{
                ptr = ptr.next;
            }

        }
        return ans;
    }
}