class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = defaultdict(list)
        for words in strs:
            sorted_key = ''.join(sorted(words))
            
            groups[sorted_key].append(words)
        return list(groups.values())


        