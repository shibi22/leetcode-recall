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
    public ListNode partition(ListNode head, int x) {
        ListNode lesserNode = new ListNode(0);
        ListNode greaterNode = new ListNode(0);

        ListNode lNode = lesserNode , gNode = greaterNode;

        while(head!=null){

                if(head.val < x){
                    lNode.next = head;
                    lNode = lNode.next;

                }else{
                    gNode.next = head;
                    gNode = gNode.next;
                }

            head = head.next;
        }

        gNode.next = null;
        lNode.next = greaterNode.next;

        return lesserNode.next;

    }
}