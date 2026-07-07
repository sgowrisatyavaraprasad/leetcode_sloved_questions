class Solution:
    def sumAndMultiply(self, n: int) -> int:
        if n == 0:
            return 0
        woz = ''
        s = 0
        while n != 0:
            num = n % 10
            s += num
            if num > 0:
                woz  = woz + str(num)
            n = n // 10
        a = woz[::-1]
        print(s)
        return int(a) * s