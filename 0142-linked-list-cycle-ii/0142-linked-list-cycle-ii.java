/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fastptr = head;
        ListNode slowptr = head;
        
        while(fastptr != null && fastptr.next  != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
          

            if(slowptr == fastptr){
                ListNode entry = head;
                while(entry != slowptr){
                    entry = entry.next;
                    slowptr = slowptr.next;
                    
                }
                return entry;
            }
            
        }

    return null;
    }
}