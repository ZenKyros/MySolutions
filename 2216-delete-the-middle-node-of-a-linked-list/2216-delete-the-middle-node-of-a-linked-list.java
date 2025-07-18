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
     ListNode temp = head;
     int n = 0;
     if(head == null || head.next == null) return null;
     while(temp != null){
        n++;
        temp = temp.next;

     }
     int pos = n/2;

int count =0;
     ListNode temp1  = head;
    while(temp1 != null){
        if(count == pos-1){
            temp1.next = temp1.next.next;
            count++;

        }
        else {
            temp1 = temp1.next;
            count++;
        }
    }
    return head;
        
    }
}