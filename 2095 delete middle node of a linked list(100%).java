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
        ListNode p2 = head;
        ListNode prev = new ListNode();
        prev.next = head;
        if(head.next == null) return null;
        while(p2 != null && p2.next != null){
            prev = prev.next;
            p2 = p2.next.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}