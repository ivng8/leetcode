class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        book = {}
        for i in range(len(nums)):
            if target - nums[i] in book:
                return [book[target - nums[i]], i]
            else:
                book[nums[i]] = i
        
