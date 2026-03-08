class Solution:
    def minPartitions(self, n: str) -> int:
        nl = []
        for i in n:
            nl.append(int(i))
        return max(nl)