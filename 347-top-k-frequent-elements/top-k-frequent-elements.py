class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        cnt = Counter(nums)
        comm = cnt.most_common(k)

        result = [element for element , count in comm]
        
        return result