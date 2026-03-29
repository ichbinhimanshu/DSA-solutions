class Solution(object):
    def isValid(self, s):
        d={
            ")":"(",
            "]":"[",
            "}":"{",
        }
        i=0
        result=[]
        while(i<len(s)):
            if s[i] in d.values():
                result.append(s[i])
            else:
                if result and result[-1]==d[s[i]]:
                    result.pop()
                else:
                    return False
            i+=1
        return len(result)==0