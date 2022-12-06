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
    public ListNode middleNode(ListNode head) {
        ListNode node =  head;
        int n = 1;
        while(node.next!=null){
            node=node.next;
            n++;
        }
        n=n/2;
        while(n>0){
            head=head.next;
            n--;
        }
        return head;
    }
}