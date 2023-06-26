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
        int count = 1;
        ListNode current = head;
        while(current != null && current.next != null){
            count ++;
            current = current.next;
        }
        if(count == 1) return null;
        if(count == 2){
            head.next = null;
            return head;
        }
        int iteration = count/2;
        ListNode temp = head;
        for(int i=0; i<iteration - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}