class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        nl = []
        if k > 0:
            for i in range(0 , len(code)):
                a = i + 1
                count = 0
                s = 0
                while(count < k):
                    if(a >= len(code)):
                        a = 0
                        s += code[a]
                        a += 1
                        count += 1
                    else:
                        s += code[a]
                        a += 1
                        count += 1
                nl.append(s)
                s = 0
            print(nl)
        elif k < 0:
            for i in range(0 , len(code)):
                a = i - 1
                count = 0
                s = 0
                while(count < abs(k)):
                    if(a < 0):
                        a = len(code) - 1
                        s += code[a]
                        a -= 1
                        count += 1
                    else:
                        s += code[a]
                        a -= 1
                        count += 1
                nl.append(s)
                s = 0
            print(nl)
        else:
            for i in range(0 , len(code)):
                nl.append(0)
            print(nl)

        return nl