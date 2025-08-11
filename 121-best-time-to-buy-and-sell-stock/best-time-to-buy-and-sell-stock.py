class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        min_price = float('inf')
        n = len(prices)
        
        for price in prices[0:]:
            if price < min_price:
                min_price = price 
            else:

                profit = max(profit , price - min_price )
        return profit



        