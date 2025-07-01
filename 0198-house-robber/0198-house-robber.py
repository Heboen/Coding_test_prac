class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [0]*(n+1)
        if n == 1:
            return nums[0]
        prev2, prev1 = 0,0

        for num in nums:
            prev1, prev2 = max(prev2+num, prev1),prev1
        return prev1