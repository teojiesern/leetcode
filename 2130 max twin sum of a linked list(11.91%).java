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
    public int pairSum(ListNode head) {
        int maxSum = 0, count = 0, left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(head != null){
            map.put(count, head.val);
            head = head.next;
            count++;
        }
        while(left < count){
            Integer temp = map.get(left) + map.get(count - 1);
            maxSum = maxSum > temp ? maxSum : temp;
            left++;
            count--;
        }
        return maxSum;
    }
}