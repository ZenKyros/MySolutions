# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        dummy1 = headA
        dummy2 = headB
        if not headA or not headB:
            return None


        while dummy1 != dummy2:
            dummy1 = dummy1.next if dummy1 else headB
            dummy2 = dummy2.next if dummy2 else headA

        return dummy1



        