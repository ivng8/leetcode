# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        carryover = 0
        ans = iterator = ListNode(0)
        while l1 or l2 or carryover:
            if l1 is not None:
                carryover += l1.val
                l1 = l1.next
            if l2 is not None:
                carryover += l2.val
                l2 = l2.next
            carryover, sum = divmod(carryover, 10)
            iterator.next = iterator = ListNode(sum)
        return ans.next
