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
        int length = 0;
        ListNode dummy = head;
        while(dummy != null){
            dummy = dummy.next;
            length++;
        }

        length = length - n ;

        if(length == 0){
            return head.next;
        }

        int count =0;
        ListNode result = head;
        while(head !=null){
            count++;
            if(count == length){
                head.next = head.next.next;
            }

            else{
                head = head.next;
            }
        }

        return result;
    }
}