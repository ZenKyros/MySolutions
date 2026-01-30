# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        dum1 = headA
        dum2 = headB

        while dum1 != dum2:
            if dum1 is not None:
                dum1 = dum1.next
            else:
                dum1 = headB

            if dum2 is not None:
                dum2 = dum2.next
            else:
                dum2 = headA
        return dum1 