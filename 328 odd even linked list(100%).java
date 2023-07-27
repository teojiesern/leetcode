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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ans = head, secElement = head.next;
        int count = 0;
        while(head.next.next != null){
            ListNode temp = head.next;
            head.next = head.next.next;
            head = temp;
            count++;
        }

        // if count is odd, meaning that the length of this linked list is odd vice versa
        // if count is odd, meaning that the head stopped at last even value which the next value should be null, and then the next value should point to the current value of the head
        // if the count is even, meaning that the head stopped at last odd value which the next should point to the last even value which is the element in front of it
        if(count %2 != 0){
            head.next.next = secElement;
            head.next = null;
        }else{
            head.next = secElement;
        }
        return ans;
    }
}