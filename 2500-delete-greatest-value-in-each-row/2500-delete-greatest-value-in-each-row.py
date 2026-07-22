class Solution:
    def deleteGreatestValue(self, grid: List[List[int]]) -> int:
        j = 0
        res = 0
        while(j < len(grid[0])):
            nl = []
            for i in grid:
                a = max(i)
                b = i.index(a)
                i[b] = 0
                nl.append(a)
            res = res + max(nl)
            j += 1
        return res