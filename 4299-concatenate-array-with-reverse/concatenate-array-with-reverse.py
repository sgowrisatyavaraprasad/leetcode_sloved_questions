class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        a = nums
        for i in range(len(nums) - 1 ,  -1, -1):
            a.append(nums[i])
        return a