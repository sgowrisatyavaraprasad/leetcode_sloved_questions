class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l = 0
        r = len(numbers) - 1
        nl = []
        while(l < r):
            a = target
            target = target - numbers[l]
            target = target - numbers[r]
            if target == 0:
                nl.append(l + 1)
                nl.append(r + 1)
                break
            elif target < 0:
                target = a
                r -= 1
            elif target > 0:
                target = a
                l += 1
        return nl