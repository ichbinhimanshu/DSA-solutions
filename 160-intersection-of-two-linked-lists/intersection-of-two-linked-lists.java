/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getSize(ListNode x) {
        ListNode p = x;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int sizeA = getSize(headA);
        int sizeB = getSize(headB);

        int diff = sizeA - sizeB;
        ListNode pa = headA;
        ListNode pb = headB;

        if (diff > 0) {
            while (diff > 0) {
                pa = pa.next;
                diff--;
            }
        } else {
            while (diff < 0) {
                pb = pb.next;
                diff++;
            }
        }

        while (pa != null) {
            if (pa == pb) {
                return pa;
            }
            pa = pa.next;
            pb = pb.next;
        }
        return null;
    }
}