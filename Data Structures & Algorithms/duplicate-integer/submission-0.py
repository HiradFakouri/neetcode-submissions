class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        occurences = {}

        for i in nums:
            if i not in occurences:
                occurences[i] = 1
            else:
                return True
        
        return False
        

        