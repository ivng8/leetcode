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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver = 0;
        ListNode ans = new ListNode();
        ListNode iterator = ans;
        while (l1 != null || l2 != null || carryOver == 1) {
            int sum = carryOver;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum > 9) {
                carryOver = 1;
                sum -= 10;
            } else {
                carryOver = 0;
            }
            iterator.next = new ListNode(sum);
            iterator = iterator.next;
        }
        return ans.next;
    }
}
