class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        nl = sentence.split(' ')
        count = 0
        for i in range(0 , len(nl) - 1):
            a = nl[i][len(nl[i]) - 1]
            b = nl[i + 1][0]
            if a != b:
                count += 1
        if count >= 1:
            return False
        a = nl[len(nl) - 1][len(nl[len(nl) - 1]) - 1]
        b = nl[0][0]
        if count == 0 and a == b:
            return True
        return False
        