class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        n = len(nums)

        freq = Counter(nums)

        for count in freq.values():
            if count > 1 :
                return True
        
        return False
            
        