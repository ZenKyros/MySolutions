class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        freq = Counter(nums)
        n = len(nums)
        for num ,  count in freq.items():
            if(count > n//2):
                return num
