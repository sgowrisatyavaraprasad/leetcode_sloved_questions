class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        a = sum(nums)
        c = 0
        while a % k != 0:
            a -= 1
            c += 1
        return c