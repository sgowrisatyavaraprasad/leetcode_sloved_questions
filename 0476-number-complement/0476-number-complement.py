class Solution:
    def findComplement(self, num: int) -> int:
        a = bin(num)
        res = ''
        for i in range(2 , len(a)):
            if a[i] == '1':
                res += '0'
            if a[i] == '0':
                res += '1'
        b = int(res , 2)
        return b
