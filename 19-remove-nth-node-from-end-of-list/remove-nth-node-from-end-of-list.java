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
        ListNode d = new ListNode(-1,head);
        ListNode l1 = d, l2 = d;
        for(int i=0;i<=n;i++){l2 = l2.next;}
        while(l2!=null){
            l1 = l1.next;
            l2 = l2.next;
        }
        l1.next = l1.next.next;
        return d.next;
    }
}