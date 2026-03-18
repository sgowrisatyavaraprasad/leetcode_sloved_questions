class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        n = len(nums)
        nums.insert(0 , 0)
        s = 0
        for i in range(1 , len(nums)):
            if n % i == 0:
                a = (nums[i] * nums[i])
                s += a
        return s