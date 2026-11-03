class Solution:
    def minMoves(self, nums: List[int]) -> int:
        a = max(nums)
        c = 0
        for i in nums:
            c += abs(i - a)
        return c