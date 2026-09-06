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
    public boolean isPalindrome(ListNode head) {
        String s="";
        String h="";
        while(head!=null){
            //Integer.toString(head.val);
            s+= Integer.toString(head.val);
            h=Integer.toString(head.val)+h;
           head=head.next;
        }
        if(s.equals(h))return true;
        return false;
    }
}