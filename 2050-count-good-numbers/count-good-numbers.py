class Solution:
    def countGoodNumbers(self, n: int) -> int:
        
        mod = 10** 9 + 7 

        oddpos = (n) // 2
        evenpos = (n + 1 ) // 2

        odd = pow(4  , oddpos , mod) 
        even = pow(5 , evenpos , mod)

        return (even * odd) % mod