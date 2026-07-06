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
         int size = 0;
        ListNode t = head;
       while (t != null) {
            size++;
            t = t.next;
        }
        if (n == size) {
            return head.next;
        }

        int m = size - n;
        t = head;

        for (int i = 1; i < m; i++) {
            t = t.next;
        }

        t.next = t.next.next;

        return head;
    }
}