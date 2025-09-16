# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        s = []
        temp = head
        while temp is not None:
            s.append(temp.val)
            temp=temp.next
        
        curr = head
        while curr is not None :
            if curr.val != s.pop():
                return False
            
            curr =curr.next
        
        return True


            
        