class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        d = [2**31-1] * (amount + 1)
        d[0] = 0
        for coin in coins:
            for i in range(coin, amount+1):
                d[i] = min(d[i], d[i - coin] + 1)
        
        if d[amount] == (2**31 - 1):
            return -1
        return d[amount]