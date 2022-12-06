/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode oddStart = head;
        ListNode odd = head;
        ListNode evenStart = head.next;
        ListNode even = head.next;

        head = head.next.next;
        while (head != null && head.next != null) {
            odd.next = head;
            odd = odd.next;
            even.next = head.next;
            even = even.next;
            head = head.next.next;
        }

        if (head != null) {
            odd.next = head;
            odd = odd.next;
        }
        odd.next = evenStart;
        even.next = null;
        return oddStart;
    }
}