class Solution:
    def isPalindrome(self, s: str) -> bool:
        sl1 = [i.lower() for i in s if i.isalnum()]
        sl2 = sl1[::-1]
        
        return sl1 == sl2
       
        


        
    
        