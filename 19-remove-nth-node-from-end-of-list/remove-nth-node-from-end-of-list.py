# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length = 0
        temp = head 
        while temp:
            length +=1
            temp = temp.next
        
        pos = length-n
        if n == length:
            return head.next
        
        tail = head 
        count = 0
        while tail:
            if count == pos-1:
                tail.next = tail.next.next
                break
            tail= tail.next
            count +=1

            
        return head
            

        